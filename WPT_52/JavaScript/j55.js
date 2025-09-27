//descending sorting 
var arr3=[10,4,56,78,1,99,0,-99,-20]

console.log("before sorting ",arr3)
arr3.sort((n1,n2)=>{
    if(n1>n2) return -1;
    if(n1<n2) return 1;
    else return 0;
})
console.log("after sorting ",arr3)






