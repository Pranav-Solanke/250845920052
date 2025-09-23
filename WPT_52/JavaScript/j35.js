//assigning the function reference to  another variable
function display()
{
    console.log(n);
}

let m = display; ////assigning the function reference to  another variable

m(10);//calling function using variable

//or

let m = function display(num)
{
    num=num+1;
    return num;
}

console.log(m(10));