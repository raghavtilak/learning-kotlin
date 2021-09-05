fun main(args: Array<String>) {
    val circle:Circle=Circle(5.0)
    circle.drag()

}
interface Draggable{
    val dragSpeed:Int
    fun drag()
}
interface Clonable{
    fun clone()
}

abstract class Shape: Draggable,Clonable {
    open fun area(): Double {
        return 0.0
    }
}
class Circle(val radius:Double):Shape() {
    override val dragSpeed=20

    override fun area(): Double {
        return 3.14 * radius * radius;
    }

    override fun drag(){
        println("Circle dragging at $dragSpeed !")
    }
    override fun clone(){
        println("Circle cloned!")
    }
}

