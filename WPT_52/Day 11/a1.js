function factorial(n)
{
    let r = 1;
    for(let i=1; i<=n; i++)
    {
        r *= i;
    }
    return r;

}
const num = parseInt(process.argv[2]);
console.log("The factorial of " + num + " is " + factorial(num));
   