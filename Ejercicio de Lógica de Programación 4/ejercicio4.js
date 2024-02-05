const numeroF = parseInt(prompt('Ingresa un numero'));

const fibonacci = function (numeroF) {
    if (numeroF <= 1) return numeroF;
    return fibonacci (numeroF - 1) + fibonacci (numeroF-2);
};

console.log('Este es la serie fibonacci' + fibonacci);