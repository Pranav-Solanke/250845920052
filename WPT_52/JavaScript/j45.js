//to stop setTimeout

let timeoutId = setTimeout(() => {
    console.log("This will not run");
}, 3000);

// Stop it before it executes
clearTimeout(timeoutId);
