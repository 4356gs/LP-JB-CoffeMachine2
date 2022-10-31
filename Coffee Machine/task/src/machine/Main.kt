package machine

fun main() {
    var money = 550
    var water = 400
    var milk = 540
    var coffee = 120
    var disposable = 9
    printMenu(water, milk, coffee, disposable, money)
    println("Write acction (buy, fill, take):")
    val action = readln()
    when (action) {
        "buy" -> {buy(water, milk, coffee, disposable, money)}
        "fill" -> {fill(water, milk, coffee, disposable, money)}
        "take" -> {take(water, milk, coffee, disposable, money)}
    }

}

fun buy(water: Int,milk: Int,coffee: Int, disposable: Int, money: Int ) {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
    val op = readln().toInt()
    var water = water
    var milk = milk
    var coffee = coffee
    var disposable = disposable
    var money = money
    when (op) {
        1 ->{
            water -= 250
            coffee -= 16
            disposable -= 1
            money += 4

        }
        2 ->{
            water -= 350
            milk -= 75
            coffee -= 20
            disposable -= 1
            money += 7

        }
        3 ->{
            water -= 200
            milk -= 100
            coffee -= 12
            disposable -= 1
            money += 6

        }
    }
    printMenu(water, milk, coffee, disposable, money)
}
fun fill(water: Int,milk: Int,coffee: Int, disposable: Int, money: Int ) {
    println("Write how many ml of water you want to add: ")
    var water = water + readln().toInt()
    println("Write how many ml of milk you want to add: ")
    var milk = milk + readln().toInt()
    println("Write how many grams of coffee beans you want to add: ")
    var coffee = coffee + readln().toInt()
    println("Write how many disposable cups you want to add: ")
    var disposable = disposable + readln().toInt()

    printMenu(water, milk, coffee, disposable, money)
}
fun take(water: Int,milk: Int,coffee: Int, disposable: Int, money: Int ) {
    var water = water
    var milk = milk
    var coffee = coffee
    var disposable = disposable
    println("I gave you $money")
    println()
    var money = 0
    printMenu(water, milk, coffee, disposable, money)
}
fun printMenu(water: Int,milk: Int,coffee: Int, disposable: Int, money: Int ) {
    println("The coffe machine has:\n" +
            "$water ml of water\n" +
            "$milk ml of milk\n" +
            "$coffee ml of coffee beans\n" +
            "$disposable disponsable cups\n" +
            "$$money of money")
}


