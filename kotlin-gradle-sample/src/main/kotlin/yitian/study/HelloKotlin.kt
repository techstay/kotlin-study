package yitian.study

class HelloKotlin {
    fun helloKotlin(name: String = "Kotlin") {
        println("hello ${name}!")
    }
}

fun main(args: Array<String>) {
    val hello = HelloKotlin()
    hello.helloKotlin()
}