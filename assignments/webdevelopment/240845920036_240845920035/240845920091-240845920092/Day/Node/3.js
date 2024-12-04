const http = require('http');
const PORT = 4600;
const server = http.createServer((request,response)=>{
    var x = 10;
    var y = 5;
    response.write(`Sum of ${x} and ${y} is ${x+y+parseInt(5)}`);
    response.end();
});

server.listen(PORT, ()=>{
    console.log(`Server is listening on ${PORT}`);
});