const http = require('http');
const PORT = 4500;
const server = http.createServer((request, response) => {

    response.write("hi welcome to node js programing");
    response.end();//this function will terminate the processing of server
});
server.listen(PORT, () => {
    console.log(`SERVER IS LISTENING ON ${PORT}`);
});