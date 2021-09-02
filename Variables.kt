fun main() {
    // var/val variable_name: datatype= value

    //var is mutable,its valuecan be changed
    //val is immutable,its value can't be changed once assigned

    var x:Int=5;
    val y: String="raghav"
    x=10
    println("Value is $x");
    
    //toUpperCase is deprecated
    print("Name is ${y.toUpperCase()}")

//also there isno need of defining data types
    var x1=5;
    val y1="raghav"

//assigning a null value to variable

// '?' represents that the data is of type null
    var nullVariable:String?=null;
}