def c = { }
println c
println c instanceof Closure

10.times{
    print '-'
}
println ""

def sayHello = { name ->
    println "Hello $name"
}
sayHello("Hari")

10.times{
    print '-'
}
println ""

List nums = [1,3,4,7,2]
nums.each({
    println it    //current variable nums --> it
})

10.times{
    print '-'
}
println ""

nums.each({ a->
    println a
})

10.times{
    print '-'
}
println ""





