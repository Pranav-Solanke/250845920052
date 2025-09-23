//forEach() method for arrays
let array = [1,2,3,4,5];
array.forEach(display);
function display(element)
{
    console.log(element);
}

//or

array.forEach(function(element) 
{
    console.log(element);
});