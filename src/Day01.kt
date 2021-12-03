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
        return input.size
    }

    val testInput = readInput("datos")
    println("solución al ejercicio1 parteA: " + part1(testInput))
    println("solución al ejercicio2 parteB: " + part2(testInput))

    // val input = readInput("Day01")

    //println(part2(input))
}
