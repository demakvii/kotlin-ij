fun main(args: Array<String>) {
    println(maxOf(2,3))
    println(maxOf1(4,5))
}


/* Using Conditional Expression */
fun maxOf( a : Int, b : Int) : Int {
    if( a > b )
        return a
    else
        return b
}

/* Using if as an expression */
fun maxOf1( a : Int, b : Int) = if ( a > b ) a else b

