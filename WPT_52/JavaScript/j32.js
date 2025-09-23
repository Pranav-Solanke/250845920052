//find largest element using forEach()

const array = [10, 5, 20, 8, 15];
let largest=array[0];

array.forEach((element) =>
{
    if(element>largest)
    {
        largest=element;
    }
});

console.log(largest);

//what we do normally

// function largestElement(arr) {
//     let largestNum = arr[0];
//     for (let i = 1; i < arr.length; i++) {
//         if (arr[i] > largestNum) {
//             largestNum = arr[i];
//         }
//     }
//     return largestNum;
// }

// const num1 = [10, 15, 18, 20, 23];
// const result = largestElement(num1);

// console.log("The largest element in the array is:" + result);
