//using map to print square of numbers
let arr1=[1,2,3,4,5];

let arr2= arr1.map(myfunc)

function myfunc(val)
{
    return val*val;
}

console.log(arr2);
