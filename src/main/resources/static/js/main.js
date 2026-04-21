const role = localStorage.getItem('role');
const username = localStorage.getItem('username');

if (!role) {
    window.location.href = '/login.html';
}

document.getElementById('username').innerText = username;

if (role === 'ADMIN') {
    document.getElementById('settings-link').style.display = 'inline';
}

function logout() {
    localStorage.removeItem('role');
    localStorage.removeItem('username');
    window.location.href = '/login.html';
}