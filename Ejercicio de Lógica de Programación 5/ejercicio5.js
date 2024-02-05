let number = parseInt (prompt("Adivina, adivinador, ingresa un numero del 1 al 100 "));
const numeroSecreto = Math.floor(Math.random() *10);
if (number <=100 ){
    if (numeroSecreto === number) {
        console.log('Muy bien, adivinaste');
    } else {
        console.log('Lastima Margarito es ' + numeroSecreto);
    };
} else {
    console.log('Oye, te dije del 1 al 100, recarga la página');
};




