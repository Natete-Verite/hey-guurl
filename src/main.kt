fun main () {

    var a = "akirachix"
    var result = (a[0].toString() + a[2] + a[3])
    println(result)

    println(state("Verite",24))

    println(c("bonne chance"))
    hey("Verite")

    }
    fun state(name:String, age:Int):String{
        var b = ("Hi, my name is $name an I am $age years old")
        return b
    }
fun c(word:String):Int{
    var myString = word.length
    return myString
}
fun hey(name: String):String {
    var name1 = "Verite"

    if (name == name1)
        println("That's me!")
    else
        println("I don't know who that is ")
    return name1
}