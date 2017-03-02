package yitian.study

class Hi {
    fun say(name: String = "yitian") {
        println("hi,${name}")
    }

}

fun main(args: Array<String>) {
    var hi = Hi()
    hi.say()
}

