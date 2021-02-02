fun main(args: Array<String>) {
    println("Hello World!")

    var a: Int = 1
    var b = 2
    var c: Int
    c = 3

    println(sum(a, b))
    println(sum2(a, b))
    printSum(a, b)
    printSumNoUnit(a, b)

}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a+ b}")
}

fun printSumNoUnit(a: Int, b: Int){
    println("sum of $a and $b is ${a + b}")
}

