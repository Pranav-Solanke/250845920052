//finding largest element using reduce()
console.log("reduce")
function largestElement(arr) {
    return arr.reduce((largest, current) =>
            (current > largest ? current : largest),
            arr[0]);
}

let num1 = [10, 15, 38, 20, 13];
console.log(largestElement(num1));