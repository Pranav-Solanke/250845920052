console.log(Boolean(0));        // false
console.log(Boolean(""));       // false
console.log(Boolean("Hello"));  // true
console.log(Boolean(123));      // true

// Truthy & Falsy Values

// In JS, some values automatically become true or false when converted to Boolean.

// Falsy values → 0, "" (empty string), null, undefined, NaN, false.

// Everything else is Truthy.

// All Falsy values in JS are:

// false

// 0

// -0

// 0n (BigInt zero)

// "" (empty string)

// null

// undefined

// NaN