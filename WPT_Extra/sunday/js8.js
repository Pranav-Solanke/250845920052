//Array in js
let arr1 = [10, 20, 30];          // array of numbers
let arr2 = ["apple", "banana"];   // array of strings
let arr3 = [10, "hello", true];   // mixed data types
let nums = [1, 2, 3, 4];
console.log(nums.length); // 4

let animals = ["dog", "cat"];
animals.push("tiger");
console.log(animals);
animals.pop();
console.log(animals);

let langs = ["C", "C++"];
langs.unshift("JavaScript");
console.log(langs);
langs.shift();
console.log(langs);

let items = ["pen", "pencil", "eraser"];
console.log(items.indexOf("pencil")); // 1
console.log(items.includes("scale")); // false // checks if array has that item
