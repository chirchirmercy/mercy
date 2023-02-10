fun main (args: Array<String>){
    greetperson("mercy")
    remainder(34,5)
    var sum=addition(num1 = 34, num2 =56, num3 = 57, num4 = 60)
    println(sum)
    var String=("am honest")
    println(String)
}


fun greetperson(name: String){
    println("Hello $name" )
}
fun remainder(num1:Int, num2:Int):Int{
    var remainder=num1%num2
    println(remainder)
    return(remainder)
}
fun addition(num1:Int, num2:Int, num3:Int, num4:Int):Int{
    var sum= num1+num2+num3+num4
    return(sum)
}
fun statement(Mercy:String):String{
    return(Mercy)
}





















