//global scope
//function main(){
//operators

var x = 10;
console.log(x == 10 ? true : false)
//a==b and a != b (equality and not equallity)
//a===b (strict equalirty) and a !==b (strict nopt euqlity)
//in case of == and !=, JS just checks whether the value of the operands are same or not
//in case of === and !==, JS checks whether the value as well as the data type of the operands are same or not

//if(x !== undefined)
if (x) {

}

console.log(++x)
console.log(x++)
console.log(x)

if (x > 5)
    console.log('more')
else
    console.log('less')

switch (x) {
    case 12:
        console.log(--x)
        break;

    default:
        console.log(x)
        break;
}

while (x > 10) {
    console.log('current value of x: ' + x)
    x--
}
do {
    console.log('x in do...while: ' + x)
    x--
} while (x > 5)

//JS does not provide separate scoping of variables for oustide and inside control flow statments
var val = 10
console.log('before for loop: ' + val)
for (var i = 0; i < 2; i++) {
    var val = 20
    console.log('inside for loop: ' + val)
}
console.log('after for loop: ' + val)

//JS in its version 6 (2015) provided a new keyword to declare scoped variable: "let"
let newVal = 10
console.log('before for loop: ' + newVal)
for (let i = 0; i < 2; i++) {
    let newVal = 20
    console.log('inside for loop: ' + newVal)
}
console.log('after for loop: ' + newVal)

//JS in its version 6 (2015) provided a new keyword to declare a variable whopse value can't be changed once assigned: "const"
const constValue = 12
//constValue = 13
console.log(constValue)

let numValue = 13
numValue = 'joydip'
console.log(numValue)
//}()

var state
if (state) {
    console.log('has value')
} else {
    console.log('no value')
}

state = false
if (state)
    console.log('true')
else
    console.log('false')