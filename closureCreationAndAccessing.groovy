//closures are objects & last param

def timesmul(num,closure){     /***  closure creation*/
    closure(num*2)
}

timesmul(2,{println it})      /***    closure calling or using**/

timesmul(10){
    println it                  /*** closure calling in another type**/
}


import java.util.Random
Random rand = new Random()

3.times{
    println rand.nextInt()
}