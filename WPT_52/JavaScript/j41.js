//6) Write a function to divide two numbers and assign function to a variable


// Assign function to a variable
let divide = function(a, b) {
    if (b === 0) {
        return "Error: Division by zero not allowed!";
    }
    return a / b;
};

// ------------- Testing -------------
console.log("10 ÷ 2 =", divide(10, 2));
console.log("15 ÷ 3 =", divide(15, 3));
console.log("8 ÷ 0 =", divide(8, 0));
