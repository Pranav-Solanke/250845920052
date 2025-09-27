//function to add and give odd number and max number
function calculate(...arr)
{
    let sum = arr.reduce((acc,val) => acc+val,0);
    console.log("sum = "+sum);

    let odd = arr.filter(val => val%2!=0)
    console.log("odd numbers = "+odd);

    let max = Math.max(...arr);
    console.log("Maximum number is:", max);
    
}

calculate(1,2,3,4,5);