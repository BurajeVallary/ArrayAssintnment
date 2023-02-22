fun main(){
    names()
    city()
    add()
    word("Jayden","Jane","Jack")
}
fun names(){
var create= arrayOf("Vallary","Lavin","Mike","John")
println(create.contentToString())
}

fun city(){
    var vallary= arrayOf("harare","mumbai","dodoma","jakarta")
    var gram= println(vallary.map { it.capitalize() })

}
fun add(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[2] + numbers[5]
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun word(val1:String,val2:String,val3:String):Array<String>{
    return arrayOf(val1,val2,val3)

}