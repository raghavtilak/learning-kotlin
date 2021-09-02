fun main(args: Array<String>) {
    
    println("2 + 3 = ${sum(2,3)}")
    println("2 x 3 = ${mul(2,3)}")

    //with parameter 
    message()
    //without parameter
    message("Night")

    //named params function call
    //in such function call we can mention the param name, we need not to 
    //follow the order in which the params were added in function definition
    name(last="Jain",first="Tanmay")

    //we pass an lambda function 
    // "a,b ->" means we are passing a and b as an arguement in that lambda function
    // this lmda function is actually the operate() function
    val sum=operation(10,24,{ a,b ->
        //do anything in this function

        print("Adding $a and $b : ")

        //the last line means return statement, so noneed to explicitly write
        // 'return'
        a+b
    })
    println(sum)
}

//DECLARING FUNCTIONS
// fun(keyword) function_name(parameters) : return_type {}
// The params are by default 'val'

//Normal Life
fun sum(a: Int,b:Int) : Int{
    return a+b;
}

//Mentos life
fun mul(a:Int, b:Int) : Int = a*b

//default parameters like py/c++
fun message(greet:String="Morning") {
    println("Hello, Good $greet")
}

//named params
fun name(first: String = "Raghav", last: String = "Sharma"){
    println("$first $last")
}

//HIGH ORDER FUNCTIONS
//functions which can take functions as an i/p or o/p

//in Kotlin 'Unit' datatype is equivalent to 'void' datatype in Java

//taking  a function as an arguement
// '->' means the return type of the passed function
fun operation(a:Int,b:Int,operate : (Int,Int)->Int) :Int {
    return operate(a,b)
}