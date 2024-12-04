const http=require('http');
const myModule=require('./operation.js');
const PORT=4600;
const server=http.createServer((request,response)=>{

var x=15;
var y=5;
var z1=myModule.sum(x,y);
response.write(`Sum of ${x} and ${y} is ${z1}`);

var z2=myModule.sub(x,y);
response.write(`\nSubtraction of ${x} and ${y} is ${z2}`);

var z3=myModule.multiply(x,y);
response.write(`\nMultiplication of ${x} and ${y} is ${z3}`);

var z4=myModule.division(x,y);
response.write(`\nDivision of ${x} and ${y} is ${z4}`);

response.end();//this function will terminate the processing of server
});
server.listen(PORT,()=>{
console.log(`SERVER IS LISTENING ON ${PORT}`);
});