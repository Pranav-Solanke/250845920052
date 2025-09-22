let a =[1,2,3,4,5];
console.log(a);

a.pop();
console.log(a);

a.push(5);
console.log(a);

a.shift();
console.log(a);

a.unshift(1);
console.log(a);

a.splice(0,1,5);
console.log(a);

a.splice(0,1,1);
console.log(a);

let b=[];
b=a.slice(0,3);
console.log(b);