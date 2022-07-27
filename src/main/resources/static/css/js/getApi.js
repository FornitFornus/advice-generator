// api url
const api_url = "http://localhost:8080/advice";

// Defining async function
async function getApi(url) {

    // Storing response
    const response = await fetch(url);

    // Storing data in form JSON
    var data = await response.json();
    show(data);
}

function show(data) {

    var id = data.id;
    var advice = data.advice;

    document.getElementById("id").innerHTML = id;
    document.getElementById("advice").innerHTML = advice;

}