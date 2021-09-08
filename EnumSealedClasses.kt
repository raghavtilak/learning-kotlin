fun main(args: Array<String>) {
    
    val day:Day=Day.THRUSDAY
    println(day.formatDay())


    for(i in Day.values()){
        println(i.formatDay())
    }


    val tile:Tile=Red("Fire",25)

    val ponits:Int=when(tile){
        is Red -> tile.ponits * 2
        is Blue -> tile.ponits * 5
    }
    println(ponits)
}

enum class Day(val num:Int) {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THRUSDAY(5),
    FRIDAY(6),
    SATURDAY(7);
    /**NOTE**
        CAREFULLTOBSERVE THE SEMICOLON AT END ON ALL INSTANCES
        THIS TELLS COMPILER THAT FROM HERE ONWARDS WE ARE DECALRING 
        CLASS METHODS
     */
    fun formatDay(): String {
        return "Day is $this"
    }
}

//SEALED CLASSES
//IN SEALED CLASSES WE CAN CHANGE THE STATE OF THE INSTANCE
//UNLIKE ENUM,WHERE ONCE A INSTANCE IS MADE IT CAN'T BE CHANGED
sealed class Tile
class Red(val type:String, val ponits:Int) :Tile()
class Blue(val ponits:Int) :Tile()