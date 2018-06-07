enum Days{
   Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}

def daysRange = Days.Sunday..Days.Saturday

for(Day in daysRange){
    println Day
}

10.times{
print '-'
}
println ""
daysRange.each{day -> println day}
10.times{
print '-'
}
println daysRange

println daysRange.size
println daysRange.contains(daysRange.Wednesday)
println daysRange.from
println daysRange.to