// server.js
const http = require('http');
const myModule = require('./fact.js');
const PORT = 4700;

const server = http.createServer((request, response) => {
    var x = 15;
    var f = myModule.fact(x);
    response.writeHead(200, { 'Content-Type': 'text/html' }); // Set the content type
    response.write(`Factorial of ${x} is ${f}`);
    response.end(); // This function will terminate the processing of server
});

server.listen(PORT, () => {
    console.log(`SERVER IS LISTENING ON ${PORT}`);
});
