
let arr=[1,2,3,4,5];
arr.forEach((element,index,array)=>{
    array[index]=element+1;
})
console.log(arr);