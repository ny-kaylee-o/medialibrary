async function loadVideogames() {
    const response = await fetch('/api/videogames');
    const games = await response.json();

    const container = document.getElementById('videogames-container');

    if (games.length === 0) {
        container.innerHTML = '<p>No videogames found.</p>';
        return;
    }

    games.forEach(game => {
        const card = document.createElement('div');
        card.innerHTML = `
            <img src="${game.iconUrl}" alt="${game.title}" width="80"/>
            <h2>${game.title}</h2>
            <p>${game.description}</p>
            <p><strong>Genre:</strong> ${game.genre}</p>
            <p><strong>Platform:</strong> ${game.platform}</p>
            <hr/>
        `;
        container.appendChild(card);
    });
}

loadVideogames();