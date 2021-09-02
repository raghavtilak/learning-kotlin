fun main(args: Array<String>) {
    
    val obj1=Empty()
    val obj2 = Person("Raghav")
    println(obj2.name)

    val obj3 = Animal("Tommy","Dog",2)
    val obj4 = Animal("Lucy","Cat",4)
    val obj5 = Animal("Tommy","Dog",2)
    //toString method implemented internally
    println(obj3)

    //kotlin has '=='  and '===', similar to Javascript
    // '==' checks if data inside obj is same
    // '===' checks the hashCode of the objects
    val y:String = if(obj3==obj5){
        "true"
    }else{
        "false"
    }
    println(y)

    //example of lazy initialization
    Singleton.changeNum(5)

    println("Sinngle value: ${Singleton.num}")
}

//normal class
//this is an empty class
class Empty

//class with data and constructor
//the parenthesis after classname indicates its constructor
//when we put val with the params, that param becomes the
//data member of that particular class
class Person(val name:String)

//creating a Model Class, which have getters,setters,hashCode etc
// simply add 'data' keyword to make a class a Model Class
data class Animal(val name:String, val type:String, val age:Int)

//singleton classesin Kotlin
//use Object Keyword to create a single type class in KT
object Singleton{
    var num:Int=95
    //init is basically a type of ctor
    //executes everytime an instance of class is created
    init{
        println("Singleton class invoked")
    }

    fun changeNum(n:Int){
        num =n
    }
}


