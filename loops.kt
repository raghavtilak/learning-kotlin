fun main() {
    
    //while, d0-while are exactly same as java
    //for
    //'in' keyword is similar to 'in' in python
    for(x in 4..10){
        print("$x ")
    }
    println("")

    //step means jump twice in the range
    for(x in 4..10 step 2){
        print("$x ")
    }
    println("")

    for(x in 10 downTo 2){
        print("$x ")
    }

}