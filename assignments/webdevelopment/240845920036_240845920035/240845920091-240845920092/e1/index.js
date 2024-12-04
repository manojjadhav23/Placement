import express from 'express';
const app=express();
app.get("/",(req,res)=>{
res.send("welcome to express app");
});
app.get("/login",(req,res)=>{
res.send("welcome to login");
});
app.get("/signup",(req,res)=>{
    res.send("welcome to Signup page ");
    });
app.listen(5200,()=>{

console.log("server has started")

});