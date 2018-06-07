def days = [1:"Sunday",2:"Monday",3:"Tuesday",4:"Wednesday",5:"Thursday",6:"Friday",7:"Saturday"]

println days
println days.getClass().getName()
println days.size()

for(day in days.values()){
    println day
}