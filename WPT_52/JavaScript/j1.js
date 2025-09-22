//js object syntax
//const/let  obj = {property:value , property:value};

const obj = {firstname:"Pranav" , lastname:"solanke" , age:21};

const obj2 ={
             firstname:"krishna" ,
             lastname:"Yadav" ,
             age:22  
            };

const obj3 = {};
obj3.firstname="Radha";//add new property
obj3.lastname="Yadav";
obj3.age=22;

const obj4 = new Object({firstname:"Virat" , lastname:"Kohli" , age:18});

console.log(obj3.firstname + " " + obj.lastname + " age is " + obj.age);
//to access obj.property or obj["property"]
