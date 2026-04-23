async function loadShows() {
    const response = await fetch('/api/shows');
    const shows = await response.json();

    const container = document.getElementById('tvshows-container');

    if (shows.length === 0) {
        container.innerHTML = '<p>No TV shows found.</p>';
        return;
    }

    shows.forEach(show => {
        const card = document.createElement('div');
        card.innerHTML = `
            <img src="${show.coverUrl}" alt="${show.title}" width="80"/>
            <h2>${show.title}</h2>
            <p><strong>Length:</strong> ${show.length}</p>
            <p><strong>Release Date:</strong> ${show.releaseDate}</p>
            <hr/>
        `;
        container.appendChild(card);
    });
}

loadShows();