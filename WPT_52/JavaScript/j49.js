//js objects print
const person = new Object(
    {
        firstName: "John",
        lastName: "Doe",
        age: 50,
        eyeColor: "blue",

        getData: function ()
        {
            return this.lastName;
        }
    });

console.log(person);

console.log(person.firstName);

console.log(person.getData());