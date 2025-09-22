//object methods
const obj = {firstname:"Krishna" ,
             lastname:"Yadav" ,
             age:21 ,
             fullname : function()
                            {
                            return this.firstname + " " + this.lastname;
                            }
            };
console.log(obj.fullname());
