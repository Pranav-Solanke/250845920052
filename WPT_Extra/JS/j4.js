//in stack 
let a = 10;     // number (primitive)
let b = a;      // copy of value

b = 20;
console.log(a); // 10
console.log(b); // 20
//Here a and b are stored in stack.
//  Changing b does not affect a 
// because primitives are copied by value.