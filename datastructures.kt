fun main() {
    
    //arrays
    var names=arrayOf("raghav","jatin","sujeesh","rishi")
    for (name in names) {
        println(name)
    }

    //list
    var cities=listOf("udaipur","jaipur","delhi","kota")
    for (city in cities) {
        println(city)
    }

    //forEach is an inline function, 'it' is the returned iterator
    cities.forEach{
        println(it)
    }

    //the listOf method by deafult returns immutable list
    //i.e you can't change the values inside that list

    //in order to change values we need to create mutable list
    var states=mutableListOf("Delhi","Rajasthan","Jammu")
    states[0]="Madhya Pradesh"
    println(states[0])

    //list can contains any data type objects
    var anyList=listOf("raghav",1,2.323,true)
    anyList.forEach{
        println(it)
    }

    //explicitly define a datatype of list,using generics

    var onlyStrings=listOf<String>("raghav","21")
    onlyStrings.forEach{
        println(it)
    }
}