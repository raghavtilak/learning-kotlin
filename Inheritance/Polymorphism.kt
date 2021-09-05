fun main(args: Array<String>) {
    
    //POLYMORPHISM, SAYS THAT A PARENT CAN HOLD A REFERENCE TO ITS CHILD

    val circle:Shape=Circle(4.0)
    val square:Shape=Square(3.0)
    val triangle:Shape=Triangle(4.0,9.0)

    val shapes=arrayOf(Circle(4.0),Triangle(2.0,4.0),Square(4.0))
    printShapes(shapes)
}

fun printShapes(shapes:Array<Shape>){
    
    for (i in shapes) {
        println(i.area())
    }
}
open class Shape {
    open fun area(): Double {
        return 0.0
    }
}
class Circle(val radius:Double):Shape() {
    override fun area(): Double {
        return 3.14 * radius * radius;
    }
}
class Square(val length:Double):Shape() {
    override fun area(): Double {
        return length *length;
    }
}
class Triangle(val alt:Double,val base:Double):Shape() {
    override fun area(): Double {
        return 0.5 * alt * base;
    }
}