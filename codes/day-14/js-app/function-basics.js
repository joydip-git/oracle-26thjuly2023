//functions in JS
//no return type
//no data type of parameters
//use function keyword

//function declaration
function add(a, b) {
    console.log(a + b)
}
function subtract(a, b) {
    return a - b
}

//function expression
let multiply = function (a, b) {
    return a * b
}

//function expression through "arrow function" (ES6-2015)
// let divide = (a, b) => {
//     return a / b
// }
let divide = (a, b) => a / b

add(10, 20)
console.log(subtract(10, 4))
console.log(multiply(12, 3))
console.log(divide(12, 3))

