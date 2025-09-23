//filter() method for array
let arr1=[1,2,3,4,5];
let even = arr1.filter((val) => 
{
    if(val % 2===0)
    {
        return true;
    }
    else
    {
        return false;
    }
});

console.log(even);
