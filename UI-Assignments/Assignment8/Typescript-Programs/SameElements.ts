function arraysEqual(firstArray: number[], secondArray: number[]): boolean {
    if (firstArray.length !== secondArray.length) {
        return false;
    }

    const sortedFirst = [...firstArray].sort((a, b) => a - b);
    const sortedSecond = [...secondArray].sort((a, b) => a - b);

    for (let i = 0; i < sortedFirst.length; i++) {
        if (sortedFirst[i] !== sortedSecond[i]) {
            return false;
        }
    }

    return true;
}

console.log(arraysEqual([1, 2, 3], [3, 2, 1])); 

