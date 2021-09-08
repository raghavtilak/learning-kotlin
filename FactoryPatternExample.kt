fun main(args: Array<String>) {
    
    val p1:Pizza=Pizza.createPizza("Paneer")
    println(p1.toString())
    val p2:Pizza=Pizza.createPizza("sdfadf")
    println(p2.toString())
}

class Pizza private constructor(val type:String,val toppings:String) {

    companion object factory{
        fun createPizza(type: String): Pizza {
            return when(type){
                "Paneer" -> Pizza("Paneer","Corns")
                "Cheese" -> Pizza("Cheese","Tomato")
                else -> {
                    Pizza("Basic","None")
                }
            }
        }
    }
    override fun toString():String{
        return "**Pizza** \n Type:$type \nToppings:$toppings"
    }
}