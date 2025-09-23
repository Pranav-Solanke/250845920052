const http = require('http')
const url = require('url')
const PORT = 3000;
const todos = [
    { id: 1, task: 'Learn JavaScript', completed: 'INPROGRESS' },
    { id: 2, task: 'Build a REST API', completed: 'INPROGRESS' },
    { id: 3, task: 'Write tests', completed: true },
];
const server = http.createServer((req, res) => {
    const { method, url } = req
    const parsedUrl = new URL(url, `http://${req.headers.host}`)
    const pathname = parsedUrl.pathname
    if (method == 'GET' && pathname == '/todos') {
        res.writeHead(200, { 'content-type': 'application/json' })
        res.end(JSON.stringify(todos))

    }
})

server.listen(PORT, () => {
    console.log(`Server running at http://localhost:${PORT}`);

})


