function removeDuplicates(arr: number[]): number[] {
    return Array.from(new Set(arr));
}

console.log(removeDuplicates([1, 2, 2, 3, 4, 4, 5])); 
