fun main() {
    fun part1(input: List<String>): Int {
        var anterior = 0
        var vecesMayor = -1 //guarda cuantas veces el numero es mayor que el anterior
        for (linea in input) {
            if (linea.toInt() > anterior){
                vecesMayor++
            }
            anterior = linea.toInt()
        }
        return vecesMayor
    }

    fun part2(input: List<String>): Int {
        var contador = 0; //guarda la posición que estoy leyendo
        var numeros = IntArray(input.size); //va a guardar los datos del fichero
        var resultado = 0;
        for (linea in input) {
            numeros[contador] = linea.toInt()
            if (contador > 2){
                if( numeros[contador - 3] < numeros[contador]){
                resultado++;
                }
            }
            contador++;
        }
        return resultado
    }

    val testInput = readInput("entradas/datos")
    println("solución al ejercicio1 parteA: " + part1(testInput))
    println("solución al ejercicio2 parteB: " + part2(testInput))

}
