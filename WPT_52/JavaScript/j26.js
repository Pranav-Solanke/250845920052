//Callback function m1
let n=10;

function result(num)
{
    console.log(num);
}

function increment(num,callback)
{
    num=num+1;
    callback(num);
}

increment(n,result);