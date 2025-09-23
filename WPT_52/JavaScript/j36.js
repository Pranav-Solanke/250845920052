// Factorial using loop
function Fact1(n)
{
    let result = 1;
    for (let i = 1; i <= n; i++)
    {
        result *= i;
    }
    return result;
}

// Factorial using recursion
function Fact2(n)
{
    if (n === 0 || n === 1)
    {
        return 1;
    }
    return n * Fact2(n - 1);
}

// Function to return factorial implementation
function getFactorialImpl(choice = "FORLOOP")
{
    if (choice === "RECUR")
    {
        return Fact2;
    } else
    {
        return Fact1;
    }
}

// -------------------- Testing --------------------
let rv = getFactorialImpl("RECUR");  
console.log(rv(3));  // recursion → 6

rv = getFactorialImpl();  
console.log(rv(5));  // default FORLOOP → 120
