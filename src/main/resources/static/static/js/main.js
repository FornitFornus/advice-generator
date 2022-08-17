const API_URL_ADVICE = "http://localhost:8080/advice";

const getApiData = async (url) => {
  const response = await fetch(url);
  const data = await response.json();

  return data;
};

const showAdvice = (data) => {
  const adviceId = data.id;
  const adviceText = data.advice;

  document.getElementById("adviceId").innerHTML = adviceId;
  document.getElementById("adviceText").innerHTML = adviceText;
};

const handleClickAdviceLink = async (event) => {
  event.preventDefault();
  const elAdviceLink = document.getElementById("adviceLink");

  if (elAdviceLink.classList.contains("dice-animating")) {
    return;
  }

  elAdviceLink.classList.add("dice-animating");

  const adviceData = await getApiData(API_URL_ADVICE);
  showAdvice(adviceData);
  elAdviceLink.classList.remove("dice-animating");
};

const initAdviceLink = () => {
  const elAdviceLink = document.getElementById("adviceLink");
  if (elAdviceLink) {
    elAdviceLink.addEventListener("click", handleClickAdviceLink);
  }
};

const bootstrapScripts = () => {
  initAdviceLink();
};

document.addEventListener("DOMContentLoaded", bootstrapScripts, false);
