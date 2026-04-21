async function login() {
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    const response = await fetch('/api/users/login', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ username, password })
    });

    const role = await response.text();

    if (response.ok) {
        localStorage.setItem('role', role);
        localStorage.setItem('username', username);
        window.location.href = '/index.html';
    } else {
        document.getElementById('error').innerText = 'Invalid username or password';
    }
}