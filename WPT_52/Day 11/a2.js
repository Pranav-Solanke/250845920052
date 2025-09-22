// Write a Node program that prints all the numbers between 1 and 100, each on a separate line.
// A few caveats:
// o if the number is divisible by 3, print "foo"
// o if the number is divisible by 5, print "bar"
// o if the number is divisible by both 3 and 5, print "foobar"

function F()
{
    for(i=0; i<=100; i++)
        // console.log(i)
    
    if(i%3 === 0)
    {
        console.log("foo");
    }
    else if(i%5 === 0)
    {
        console.log("bar");
    }
    else if(i%3 ===0 && i%5 === 0)
    {
        console.log("foobar");
    }
    else
    {
        console.log(i)
    }
}

F();
