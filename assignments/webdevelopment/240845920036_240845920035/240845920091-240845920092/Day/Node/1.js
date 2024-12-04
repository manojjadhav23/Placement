const http = require('http');
const server = http.createServer((request,response)=>{
    response.write("Hello node js");
    response.end();
});
server.listen(4600);