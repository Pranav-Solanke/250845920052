console.log(a); // 
console.log(b); // ?
console.log(c); // ?

var a = 10;
let b = 20;
const c = 30;

function test() {
    console.log(a); // ?
    console.log(b); // ?
    console.log(c); // ?

    var a = 40;
    let b = 50;
    const c = 60;

    console.log(a); // ?
    console.log(b); // ?
    console.log(c); // ?
}

test();

// Outside the function

// console.log(a) → undefined (var hoisted)

// console.log(b) → ReferenceError (let TDZ)

// console.log(c) → ReferenceError (const TDZ)

// Inside the function

// Function has local variables (a, b, c) declared later → local var a is hoisted inside function, local let b & const c in TDZ.

// Before declarations:

// console.log(a) → undefined (local var a hoisted)

// console.log(b) → ReferenceError

// console.log(c) → ReferenceError

// After local declarations inside function

// console.log(a) → 40

// console.log(b) → 50

// console.log(c) → 60
