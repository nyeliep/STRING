fun main(args: Array<String>) {
    val letter= "akirachix"
    println(letter[0] + "" + letter[2] + "" + letter[3])



    myName("Tek",17)
    findlength("Norther lights")
    me("Nyeliep Giel")


}



fun myName( name : String, age:Int):String {
    val result = ("Hi my name is $name and I am $age old.")
    println(result)
    return result
}

    fun findlength(wordlength: String): Int {
        val length = wordlength.length
        return length
    }


    fun me(text: String) {
        var me = "Nyeliep Giel"
        if (me.equals("Nyeliep Giel"))
            println("That's me")
        else {
            println("I don't know who that is")
        }
    }





























