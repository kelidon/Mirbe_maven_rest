function logSubmit(event) {
    document.getElementById('log').textContent = `Form Submitted! Time stamp: ${event.timeStamp}`;
    event.preventDefault();
}