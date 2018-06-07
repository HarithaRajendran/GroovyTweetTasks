// each & eachWithIndex 
List nums = [2,4,6,5,7]

//normal way loop
for(num in nums){
    println num
}

//each in closure
nums.each{ println it}

//normal way to loop to know the index as well
for(int i=0 ;i<nums.size();i++){
    println "$i : ${nums[i]}"
}

//eachWithIndex way to know the index as well
nums.eachWithIndex{num,idx -> 
    println "$idx : $num"
}


//FindAll 
List days = ["Sunday","Monday","Tuesday"]
List weekend = days.findAll {it.startsWith("S")}

println weekend

//collect-Demo

List numes = [1,2,3,4,3,6,7]


//normal way
List numsTimesTen = []
numes.each{num-> numsTimesTen << num * 10}

println numsTimesTen

//using collect closure
List newTimesTen = numes.collect{num -> num*10}
println newTimesTen