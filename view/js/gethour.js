const viewDate = document.querySelector(".date");
const viewTime = document.querySelector(".time");
const viewDateNumber = document.querySelector(".date_number");

const fullDate = new Date();
const day = fullDate.toLocaleString("pt-BR", { weekday: "long" });
const formatedDay = day.charAt(0).toUpperCase() + day.slice(1);

const hours = String(fullDate.getHours()).padStart(2, "0");
const minutes = String(fullDate.getMinutes()).padStart(2, "0");
const seconds = String(fullDate.getSeconds()).padStart(2, "0");
const fullTime = `${hours}:${minutes}:${seconds}`;

const format_options = {day: 'numeric', month: '2-digit', year: 'numeric'};
const date_formated = fullDate.toLocaleDateString("pt-BR", format_options);

viewDateNumber.textContent = date_formated;
viewDate.textContent = formatedDay;
viewTime.textContent = fullTime;