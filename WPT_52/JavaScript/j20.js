//reduce to get largest element
let arr1=[1,2,3,4,5];
let largest = arr1.reduce((acc,val)=>val > acc ? val : acc);

console.log(largest);