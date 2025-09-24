const express= require('express');
const data = require('./MOCK_DATA.json');
const port = 3000;
const app = express();

// app.get('/',(req,res)=>{
// res.send("Hello From Express");
// });

 app.get('/users', (req,res)=> {
    res.json(data);
});

app.get('/users/:id', (req,res) => {
    const id =Number(req.params.id);
   
   console.log(id);
   
    const user =data.find(
        user => user.id ===id
    )
    
   console.log(user.id);
    
    return res.json(user);
       

});

app.get('/users/:id/:email', (req,res) => {
    const id =Number(req.params.id);
   const em =String(req.params.email);
   console.log(id);
   
    const user =data.find(
        user => user.id ===id
    )
    const user1 =data.find(
        user1 => user.email ===em
    )
   console.log(user.id);
    
    return res.json(user);
        return res.json(user1);

});


//req param    string 
app.delete('/users/:id', (req, res) => {
    const id = Number(req.params.id);  // 15
     console.log(id);
    const userIndex = data.findIndex(
        user => user.id === id
    )
    if (userIndex === -1)
        return res.status(404).send('Data not found');

    const deletedItem = data.splice(userIndex, 1)[0];
    //return res.json("Kile");
    return res.json({ 
        message: 'User deleted successfully',
        deletedUser: deletedItem   
    });
});
 

    app.listen(port)
    console.log("from start script");
