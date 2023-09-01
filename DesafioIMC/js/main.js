function calcularIMC(){
    valor1=parseFloat(document.getElementById("altura").value)/100
    valor2=parseFloat(document.getElementById("peso").value)
    var resultado=valor2/(valor1*valor1)
    document.getElementById("resultado").value=resultado.toFixed(2)
    if (resultado >= 0 && resultado < 18.5) {
        document.getElementById("resultado").style="background-color: rgb(0,58,186); color:white;"// Bajo peso (azul)
    } else if (resultado >= 18.5 && resultado < 25) {
        document.getElementById("resultado").style="background-color: green; color:white;" // Peso normal (verde)
    } else if (resultado >= 25 && resultado < 30) {
        document.getElementById("resultado").style="background-color: rgb(112,191,2); color:white;" // Sobrepeso (verde claro)
    } else if (resultado >= 30 && resultado < 35) {
        document.getElementById("resultado").style="background-color: rgb(254,218,36); color:white;" // Obesidad I (amarrillo)
    } else if (resultado >= 35 && resultado < 39) {
        document.getElementById("resultado").style="background-color: rgb(255,152,27); color:white;" // Obesidad II (naranja)
    } else if (resultado > 40) {
        document.getElementById("resultado").style="background-color: rgb(237,28,36); color:white;" // Obesidad III (rojo)
    }
}