//USING callback function and forEach() method to print all elements
//m1: creating new function as callbk
let arr = [12, 34, 56, 78, 99, 21, 32, 1, 5, 10]

function callbk(x) {
    console.log("SEE THIS ", x)
}
arr.forEach(callbk);