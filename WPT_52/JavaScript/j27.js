// Define the main function that takes a name and a callback
function greet(name, callback) {
    console.log("Hello " + name + "!");

    // Call the callback function
    callback();
}

// Call 'greet' and pass an anonymous function as a callback
greet("Pranav", function() {
    console.log("This is an anonymous callback.");
});
