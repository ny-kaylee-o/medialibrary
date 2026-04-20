async function testBackend() {
    const response = await fetch('/api/v1/shows/hello');
    const text = await response.text();
    document.getElementById('result').innerText = text;
}