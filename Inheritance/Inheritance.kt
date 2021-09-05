fun main(args: Array<String>) {
    
    val st:Student=Student(name="Raghav",age=20,gender="Male",roll=73,avg=96.3)
    val te:Teacher=Teacher(name="Shalini",age=40,gender="Female",subject="Maths")
    
    st.printUser();
    te.printUser();
}


//EVERY CLASS INHERITS 'ANY' CLASS BY DEFAULT
//LIKE WEHAE OBJECT CLASS IN JAVA

//OBJECT CLASS : JAVA
//ANY CLASS : KOTLIN


//we use "open" keyword before class keyword
//to tell kt compiler that we can use this class for inheritance
//basically allowing the class to inherit
open class User(val name:String,val age:Int,val gender:String) {
    init{
        println("User created!!")
    }
    open fun printUser()=println("Name: $name\nAge: $age\nGender: $gender")
}

class Student(val roll:Int,val avg:Double, name:String, age:Int, gender:String):User(name,age,gender){
    init{
            println("Student created!!")
        }

    override fun printUser()=println("Name: $name\nAge: $age\nGender: $gender\nRoll: $roll\nAverage: $avg")

}

class Teacher(val subject:String,name:String, age:Int, gender:String):User(name,age,gender){
    init{
            println("Teacher created!!")
        }

    override fun printUser(){
        super.printUser();
        println("Name: $name\nAge: $age\nGender: $gender\nSubject: $subject")
    }

}