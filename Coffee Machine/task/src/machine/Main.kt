package machine

fun main() {
    println(
        "Starting to make a coffee\n" +
        "Grinding coffee beans\n" +
        "Boiling water\n" +
        "Mixing boiled water with crushed coffee beans\n" +
        "Pouring coffee into the cup\n" +
        "Pouring some milk into the cup\n" +
        "Coffee is ready!"
        
    )
    println("Write how many cups of coffee you will need:")
    val cupsNum = readln().toInt()
    println("For $cupsNum cups of coffee you will need:")
    val water = 200
    val milk = 50
    val coffee = 15

    println("${water * cupsNum} ml of water")
    println("${milk * cupsNum} ml of milk")
    println("${coffee * cupsNum} g of coffee beans")
}

