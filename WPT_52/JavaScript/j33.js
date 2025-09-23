//finding largest using sort

function findLargest(arr)
{

    arr.sort((a, b) => a - b); // Sort the array in ascending order

    return arr[arr.length - 1]; // Return the last element
}

let arr = [10, 5, 20, 8];

// 5 10 20 8 
//5 10 8 20
// 5 8 10 20
console.log("Largest element in the array is:", findLargest(arr));