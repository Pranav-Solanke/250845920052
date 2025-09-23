//Callback function m2 : anonymous function

let n=10;

function increment(num,callback)
{
    num=num+1;
    callback(num);
}

increment(n,function(result) // anonymous function passed directly
{
    console.log(result);
});
