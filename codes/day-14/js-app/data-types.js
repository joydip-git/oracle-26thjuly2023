var x = 100
console.log(typeof x)

var y = 12.34;
console.log(typeof y)

var isTrue = false
console.log(typeof isTrue)

//var personName = "anil"
var personName = 'anil'
console.log(typeof personName)

//object in JS: it is a collection of keys (properties) and values. it looks and behaves like an array
var anilPerson = null;
anilPerson = {
    //value properties
    name: "anil",
    id: 1,
    salary: 1000,
    //functional properties
    print: function () {
        return this.name + ' ' + this.id + " " + this.salary

    }
}
console.log(typeof anilPerson)
console.log(anilPerson.name)
console.log(anilPerson["salary"])
var info = anilPerson.print()
console.log(info)

var character = 'a'
console.log(typeof character)

var strValue = '123'
var num = parseInt(strValue)
console.log(num)

var floatValue = '123.456'

//to convert string type containing floating point value to floating point number
var floatNum = parseFloat(123.456)
console.log(floatNum)

//to convert string type containing Integer value to non-fractional number
var intNum = parseInt(floatValue)
console.log(intNum)

//any type of value can be converted to number type using Number() method, if possible
var num = Number(floatValue)
console.log(num)

var someValue
console.log(someValue)

var res = 12 + someValue
console.log(res)

if (anilPerson == null)
    console.log("NULL")


var divRes = 12 / 0;
console.log(divRes == Infinity ? "divisor should not be zero" : divRes)

var data = 123
data = 'joydip'
console.log(data.toExponential(2))