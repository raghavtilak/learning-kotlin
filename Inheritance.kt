fun main(args: Array<String>) {
    
    val st:Student=Student()
    val te:Teacher=Teacher()
    
}

//we use "open" keyword before class keyword
//to tell kt compiler that we can use this class for inheritance
//basically allowing the class to inherit
open class User(val name:String,val age:Int,val gender:String) {
    init{
        println("User created!!")
    }
}

class Student(val roll:Int,val avg:Double):User{
    init{
            println("Student created!!")
        }
}

class Teacher(val subject:String):User{
    init{
            println("Teacher created!!")
        }
}