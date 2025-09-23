// ==========================
// Numbers in JavaScript
// ==========================

// Code 1 → Number Declaration
let a = 10;
let b = 12.5;
console.log("Numbers:", a, b);

// Code 2 → Infinity & NaN
console.log("1 / 0 =", 1 / 0);        // Infinity
console.log("-1 / 0 =", -1 / 0);      // -Infinity
console.log('"hello" * 5 =', "hello" * 5);  // NaN

// Code 3 → toString()
let num = 50;
console.log("num.toString() =", num.toString()); // "50"

// Code 4 → toFixed()
let pi = 3.14159;
console.log("pi.toFixed(2) =", pi.toFixed(2)); // "3.14"

// Code 5 → toPrecision()
let n = 123.4567;
console.log("n.toPrecision(5) =", n.toPrecision(5)); // "123.46"

// Code 6 → Number() conversion
console.log('Number("200") =', Number("200"));   // 200
console.log('Number("abc") =', Number("abc"));   // NaN

// Code 7 → parseInt() & parseFloat()
console.log('parseInt("123.45") =', parseInt("123.45"));     // 123
console.log('parseFloat("123.45") =', parseFloat("123.45")); // 123.45
