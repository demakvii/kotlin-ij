fun main(args: Array<String>) {
    val a : Int = 1 //immediate assignment
    val b = 2 // 'Int' type is inferred
    val c : Int // Type required when no initializer is provided
    c = 3 //deferred assignment

    /*Mutable variable*/
    var x = 5 //'Int' type is inferred
    x   += 1

    /*Using String templates*/
    var a1 = 1
    //simple name in template
    val s1 = "a is $a1"

    a1 = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is","was")}, but now is $a1"
    println(s2)

    
}