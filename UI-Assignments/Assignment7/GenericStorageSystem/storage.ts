class Storage<T> {
  private items: T[] = [];

  addItem(item: T): void {
    this.items.push(item);
  }

  getItem(index: number): T | undefined {
    return this.items[index];
  }

  updateItem(index: number, newItem: T): void {
    if (index >= 0 && index < this.items.length) {
      this.items[index] = newItem;
    } else {
      throw new Error("Index out of bounds");
    }
  }

  clearStorage(): void {
    this.items = [];
  }

  getAllItems(): T[] {
    return this.items;
  }
}

const storage = new Storage<string>();

const itemInput = document.getElementById('itemInput') as HTMLInputElement;
const addButton = document.getElementById('addButton') as HTMLButtonElement;
const clearButton = document.getElementById('clearButton') as HTMLButtonElement;
const itemsContainer = document.getElementById('itemsContainer') as HTMLDivElement;

function renderItems(): void {
  itemsContainer.innerHTML = '';
  storage.getAllItems().forEach((item, index) => {
    const div = document.createElement('div');
    div.className = 'item';
    div.innerHTML = `
      <span>${index}: ${item}</span>
      <button onclick="updateItem(${index})">Update</button>
    `;
    itemsContainer.appendChild(div);
  });
}

function updateItem(index: number): void {
  const newValue = prompt("Enter new value:");
  if (newValue !== null) {
    storage.updateItem(index, newValue);
    renderItems();
  }
}

(window as any).updateItem = updateItem;

addButton.addEventListener('click', () => {
  const value = itemInput.value.trim();
  if (value) {
    storage.addItem(value);
    itemInput.value = '';
    renderItems();
  }
});

clearButton.addEventListener('click', () => {
  storage.clearStorage();
  renderItems();
});

renderItems();
