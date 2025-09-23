//7) To Find max number from array write code in 3 ways as shown in lecture 

let arr = [10, 5, 20, 8, 15];
let max = arr[0];

for (let i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}

console.log("Max using for loop:", max);

//or

let arr3 = [10, 5, 20, 8, 15];
let max3 = arr3.reduce((acc, curr) => (curr > acc ? curr : acc), arr3[0]);
console.log("Max using reduce:", max3);

//or

let arr4 = [10, 5, 20, 8, 15];

// Sort the array in descending order and take the first element
let max4 = arr4.sort((a, b) => b - a)[0];

console.log("Max using sort:", max4);
