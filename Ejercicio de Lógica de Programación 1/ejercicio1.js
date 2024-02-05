
let n1= parseInt(prompt('Ingresa numero 1'));
let n2= parseInt(prompt('Ingresa número 2'));
let n3 = parseInt(prompt('Ingresa Numero 3'));


const ar = [n1, n2, n3];
if (n1=== n2 && n1=== n3 ) { 
    return console.log('Iguales')


} else {ar.sort (function(a, b){return a - b});
ar.sort(function(a,b){return b-a});};


console.log (ar);

