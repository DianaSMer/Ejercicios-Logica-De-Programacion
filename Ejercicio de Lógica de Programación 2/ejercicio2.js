
let temp1 = parseInt(prompt('Ingresa temperatura en Celsius'));

function cambioF (temp1) {
    let farenheit = (temp1 * 1.8) +32;
    return farenheit;
    
};

function conversionK (temp1) {
    let Kelvin = temp1 + 273.15;
    return Kelvin;
}

console.log ('La temperatura en Farenheit es : ' + cambioF + 'La temperatura en Kelvin es:' + conversionK );