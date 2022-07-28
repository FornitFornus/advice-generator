// api url
const api_url = "http://localhost:8080/advice";

// Defining async function
async function getApiData(url) {

    // Storing response
    const response = await fetch(url);

    // Storing data in form JSON
    var data = await response.json();
    showData(data);
}

function showData(data) {

    const adviceId = data.id;
    const adviceText = data.advice;

    document.getElementById("adviceId").innerHTML = adviceId;
    document.getElementById("adviceText").innerHTML = adviceText;

}