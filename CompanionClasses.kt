fun main(args: Array<String>) {

    //OBSERVE THE CALLING IN BOTH THE CASES
    A.MyObject.f()
    B.g()    

    /***NOTE***
        Companion is not same as static in Java, it only mimics static, but
        behind the scenes it actually create an object unlike Java.

        Now, java and kotlin are interoperable, so in order to call Kotlin 
        companion object same as in kotlin, in java we use @JVMStatic annotation
        to tell JVM that we have to call it like Java's static.
    */
}

//THERE CAN ONLY BE ONE COMPANION OBJECT IN A CLASS

//CLASS CONTAINING SINGELTON CLASS
class A {
    object MyObject{
        fun f(){
            println("Print 'f'")
        }
    }
}
//CLASS WITH A COMPANION OBJECT
class B {
    companion object MyObject{
        fun g(){
            println("Print 'g'")
        }
    }
}

class C {

    @JVMStatic
    companion object MyObject{
        fun m(){
            println("Print 'm'")
        }
    }
}