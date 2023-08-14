//basics of array in JS:
const numbers = [12, 13, 21, 34]
//numbers = [] <-- can not do that
//let numbers = new Array(12, 13, 21, 34)

//all the values are going to be added at the end of exitsing values
const newcount = numbers.push(33)
const newCountAgain = numbers.push(67, 56, 89, 87)

//all the values are going to be added at the beginning of the array
const newCountAfterUnshift = numbers.unshift(100, 102)

//removes the values and returns an array of deleted values
//numbers.splice(2, 2)

//replaces old values by new values and returns an array of deleted values
const deletedValues = numbers.splice(2, 2, 111, 222)
console.log(deletedValues)

console.log(numbers)

console.log('iteration of an array elements by for loop')
for (let i = 0; i < numbers.length; i++) {
    console.log(numbers[i])
}

console.log('iteration of an array elements by for..of loop')
for (let num of numbers) {
    console.log(num)
}

console.log('iteration of an array elements by for..in loop')
for (let index in numbers) {
    let arrVal = numbers[index]
    console.log(index + ":" + arrVal)
}