fun main() {
    
    //simple if-else
    var x=18
    if(x>=18){
        println("Can vote")
    }else{
        println("Can't vote")
    }

    // return values from if-else
    val y:Int = if(true){
        //perform action
        print("Inside if statement")
        //this last line indicates the return values
        15
    }else{
        print("Inside else statement")
        20
    }


    //when statement
    //when, similar to if-else canalso return values

    var check="rghv"
    val z:Int= when(check){
        "rghv"->{
           10 
        }
        "sujee"->{
            20
        }
        "jtn"->{
            30
        }
        else->{
            20
        }
    }

    println("Value from when: $z ")

    //using 'in'in if-else
    if(z !in 20..30){
        println("Not in 20 to 30")
    }else{
        println("In 20 to 30")
    }
}