package AccessModifiers
fun main(args: Array<String>) {
    val b:B=B()
    val c:C=C()
    b.print()
    c.print()
}

//internal keyword is similar to pacakge keyword in 
//java, all things(class,variables,functions) which are internal, cannot be access
//outside the module
internal class foo
internal var b:Int=20

private class Example
//protected keyword can't be used in top level declaration,
//used only within the class
// protected class B

open class A {

    public var a:Int=20
    private var b:Int=10
    internal var r:Int=8
    protected var q=9
    
}

open class B:A(){

    open fun print(){
    println(a)
    //below line give error because field declared private
    //println(b)
    
    println(r)
    println(q)
    }
}
class C:B(){
    
    override fun print(){
    println(a)
    println(r)
    println(q)
    }   
}
