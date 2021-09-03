fun main(args: Array<String>) {
    
    val e1:Example=Example()
    val p1:Person=Person("raghav",12)

    //calling setter
    p1.age=-12
    //calling getter
    p1.name
}

class Person(name:String,age:Int){

    //to declare a setter or a getter for any data member
    //create set() and get() just below(the next immediate line,
    //following the data member).

    //the setter and getter provides with a variable 'field' which point to the
    //data member for which we are creating a setter and getter

    var name:String=name
    get(){
        println("Name: $field")
        return field
    }
    var age:Int=age
    set(value){
        if(value<1) println("Age can't be negative")
        else field=value
    }
    fun canVote(): Boolean {
        if(age>18) return true
        else return false
    }

}

class Example{

    //**we can't create such 
    //**an object which do not have any initial value,in Kotlin
    //  var name:String

    /* 
        we use 'lateinit' keyword in case we want to use above case
        NOTE: 
            1. lateinit doesn't work on Int, float, Boolean
            2. lateinit variable should be var not val

    */

    lateinit var name:String
}