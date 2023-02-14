fun main(){
greeting("john")
    var remainder=remainder(100,80)
    println(remainder)
   var sum= sum(200,42,56,87)
    println(sum)
    aboutMe("Cooking bananas.")
}
fun greeting(name:String){
    println("Hello  $name")
}
fun remainder(num1:Int, num2:Int) : Int{
    var remainder=num1%num2
    return remainder
}
fun sum(num1:Int, num2:Int, num3:Int, num4:Int) : Int{
    var sum=num1+num2+num3+num4
    return sum
}
fun aboutMe(fact:String){
    println("I like $fact")
}



















