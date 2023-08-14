const numbers = [1, 4, 3, 5, 2, 8, 6, 0, 7, 9]
//sort(), filter() etc. methods were introduced in ES6
let sortedFilteredConvertedNumbers =
    numbers
        .sort((a, b) => a - b)
        .filter((a) => a % 2 === 0)
        .map((a) => a + ":" + (a * 5))
console.log(sortedFilteredConvertedNumbers)

const numbersAgain = [1, 4, 3, 5, 2, 8, 6, 0, 7, 9]
const found = numbersAgain.find((a) => a === 4)
console.log(found)
const foundIndex = numbersAgain.findIndex((a) => a === 4)
console.log(foundIndex)

let personName = "Joydip"
console.log(personName.toLocaleLowerCase())
console.log(personName.toLocaleUpperCase())
console.log(personName.toLocaleLowerCase().includes("j"))
console.log(personName.toLocaleLowerCase().indexOf("d") === -1 ? 'absent' : personName.toLocaleLowerCase().indexOf("d"))

console.log("joydip".localeCompare("Joydip") === 0 ? 'same' : "joydip".localeCompare("Joydip") > 0 ? 'greater' : 'lesser');