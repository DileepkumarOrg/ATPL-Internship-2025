var Storage = /** @class */ (function () {
    function Storage() {
        this.items = [];
    }
    Storage.prototype.addItem = function (item) {
        this.items.push(item);
    };
    Storage.prototype.getItem = function (index) {
        return this.items[index];
    };
    Storage.prototype.updateItem = function (index, newItem) {
        if (index >= 0 && index < this.items.length) {
            this.items[index] = newItem;
        }
        else {
            throw new Error("Index out of bounds");
        }
    };
    Storage.prototype.clearStorage = function () {
        this.items = [];
    };
    Storage.prototype.getAllItems = function () {
        return this.items;
    };
    return Storage;
}());
// DOM Logic
var storage = new Storage();
var itemInput = document.getElementById('itemInput');
var addButton = document.getElementById('addButton');
var clearButton = document.getElementById('clearButton');
var itemsContainer = document.getElementById('itemsContainer');
function renderItems() {
    itemsContainer.innerHTML = '';
    storage.getAllItems().forEach(function (item, index) {
        var div = document.createElement('div');
        div.className = 'item';
        div.innerHTML = "\n      <span>".concat(index, ": ").concat(item, "</span>\n      <button onclick=\"updateItem(").concat(index, ")\">Update</button>\n    ");
        itemsContainer.appendChild(div);
    });
}
function updateItem(index) {
    var newValue = prompt("Enter new value:");
    if (newValue !== null) {
        storage.updateItem(index, newValue);
        renderItems();
    }
}
// @ts-ignore: expose function to global for inline onclick
window.updateItem = updateItem;
addButton.addEventListener('click', function () {
    var value = itemInput.value.trim();
    if (value) {
        storage.addItem(value);
        itemInput.value = '';
        renderItems();
    }
});
clearButton.addEventListener('click', function () {
    storage.clearStorage();
    renderItems();
});
renderItems();
