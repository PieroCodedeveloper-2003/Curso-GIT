console.log("Hola Mundo, soy Piero");

// Solicitar datos al usuario
const nombre = prompt("¿Cuál es tu nombre?");
const edad = parseInt(prompt("¿Cuántos años tienes?"));
const peso = parseFloat(prompt("¿Cuál es tu peso en kilogramos?"));
const altura = parseFloat(prompt("¿Cuál es tu altura en metros?"));

// Calcular IMC
const imc = peso / (altura * altura);

// Mostrar resultado
console.log(`Hola ${nombre}, tienes ${edad} años.`);
console.log(`Tu IMC es: ${imc.toFixed(2)}`);

// Clasificación del IMC
if (imc < 18.5) {
  console.log("Estás en bajo peso.");
} else if (imc < 24.9) {
  console.log("Tienes un peso normal.");
} else if (imc < 29.9) {
  console.log("Tienes sobrepeso.");
} else {
  console.log("Tienes obesidad.");
}
