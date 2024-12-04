const http = require('http');
const a = require('./even.js');
const PORT = 4700;
const server = http.createServer((request, response) => {
    var n = 20;
    if (a.even(n) == 1)
        response.write(`${n} is even number`);
    else
        response.write(`${n} is odd number`);
    response.end();
});

server.listen(PORT, () => {
    console.log(`SERVER IS LISTENING ON ${PORT}`);
});