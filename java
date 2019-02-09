console.log('this is a testing page');

var name="April";
console.log(name);
//jason momoa is fine AF
const allstates= 50;
console.log(allstates);
var val= 5 + 4;
console.log(val);
//making comments in these lines
function sayHello() {
    return alert("hello world")
}
function checkage(name, age) {

    if (age < 21) {
        return "sorry " + name + ", you aren't old enough to view this page";
    } else (age >=21)
    {
        return 'welcome ' + name + '!';
    }
}
var output = checkage('charles', 19);
console.log(output);
var output = checkage('abby', 21);
console.log(output);
var output = checkage('james', 17);
console.log(output);
var output = checkage('john', 27);
console.log(output);
let veggie = ['potato', 'carrot', 'squash'];
for (let i=0; i < veggie.length; i++) {
console.log(veggie[i]);
}
    let friends = [
        {
        name: 'babe',
        age: 19
    },
    {
        name: 'tina',
        age: 21
    },
    {
        name: 'lily',
        age: 16
    },
    {
        name: 'billie',
        age: 34
    },
    {
        name: 'sara',
        age: 41
    },
    ];
    for (var i = 0; i < friends.length; i++) {
        checkage(friends[i].name, friends[i].age);
    }
function getlength(string){
    return string.length;
}
letlength = getlength("hello world");
if (length % 2 === 0) {
    console.log("The world is nice and even!");
} else {
    console.log("The world is an odd place!");
}
