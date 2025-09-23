let array = [1,2,3,4,5];

array.forEach(double);

function double(element)
{
    element=element*2;
    console.log(element);
}

//or
array.forEach(function(element) 
{
    element=element*2;
    console.log(element);
})