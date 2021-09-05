fun main(args: Array<String>) {
    
    //CAN'T CREATE AN INSTANCE OF ABSTARCT CLASS
    //BUT CAN USE PARENT'S REFERENCE TO INSTANTIATE CHILD OBJECT
    val circle:Circle=Circle(5.0)
    val shape:Shape=Circle(5.0)

    println(circle.area())
    println(shape.area())

}

abstract class Shape {
    abstract fun area(): Double;
}

class Circle(val radius:Double):Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius;
    }
}
class Square(val length:Double):Shape() {
    override fun area(): Double {
        return length *length;
    }
}