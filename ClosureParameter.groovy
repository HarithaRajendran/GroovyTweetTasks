//implicit parameter
def foo = {
    println it
}

foo('dan')

 //Closure does not take any arg
 
 def noparam = { ->
     println "no params"
 }
 noparam()
 
 //Closure with 2 arg
 
  def coupleArg1 = { arg1, arg2 ->
 println "$arg1 $arg2"
 }
 
 coupleArg1(999,"ggg")
 
 def coupleArg = {String arg1, String arg2 ->
 println "$arg1 $arg2"
 }
 
 coupleArg("kkk","ggg")
 
 
 //default values
 
 def greet = { first,last ="welcome"->
     println "$last $first"
 }
 
 greet("Hari")
 greet("Preethi","Hai")
 
 //var-arg -> in case if user doesnt know how many arg to be passed we use
 
 def concat = { String... args ->
     args.join('')
 }
 
 println concat("fedfrrd ","wgf ","sfgs")
 
 //Closure as arg ex-Closure c
 
 def testM1(Closure c){
     println c.getMaximumNumberOfParameters()
     println c.getParameterTypes()
 }
 
 def closureTest = {a,b,v,k -> a+b}
 
 testM1(closureTest)