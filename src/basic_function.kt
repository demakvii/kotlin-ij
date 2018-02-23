fun main(args: Array<String>) {
    println("Hello world")
    println("Sum 1 " + sum1(1,2))
    println("Sum 2 " + sum2(1,2))
    sum3(1,2)
    sum4(1,2)
    println(parseInt(""))
}

fun sum1(a : Int, b : Int) : Int {
    return a + b;
}

fun sum2(a : Int, b : Int) = a + b

fun sum3(a: Int, b: Int) : Unit {
    println("sum of $a and $b is ${a + b}")
}

fun sum4(a: Int, b: Int)  {
    println("sum of $a and $b is ${a + b}")
}

fun parseInt( s: String) : Int? {
        return s.toInt()
}

fun printProduct( arg1 : String, arg2 : String){
    val x =  parseInt( arg1 )
    val y = parseInt( arg2 )

    //Using x * y yield error because they may hold nulls
    if ( x != null && y != null ){
        // x and y are automatically cast to non-nullable after
        println(x*y)
    }else
       println("either $arg1 or $arg2 is not a number")
}

