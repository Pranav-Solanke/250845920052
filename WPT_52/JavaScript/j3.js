// Constructor Function for Person objects
function Person(first, last, age, eye)
{
  this.firstName = first;
  this.lastName = last;
  this.age = age;
  this.eyeColor = eye;
}

// Create a Person object
const myFather = new Person("Mohan", "Solanke", 50, "blue");
const myMother = new Person("Priti", "Solanke", 48, "green");

console.log(myFather.firstName+ " " + myFather.lastName);