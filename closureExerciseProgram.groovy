def m1(Closure c){
     println "abc"
   //  println c.getMaximumNumberOfParameters()
}

def closure1 = { a,b -> println a+b}

m1(closure1)

//Creating list

def myList = [1,2,3,4,5,6,7,8]
myList.each { println it }

//creating map for iterating

def myMap = [1:"One",2:"Two",3:"Three"]
myMap.each {k,v -> println "$k = $v" }

