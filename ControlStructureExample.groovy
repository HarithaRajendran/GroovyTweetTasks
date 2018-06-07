class Account1{
    BigDecimal balance = 0.0
    
    def deposit(BigDecimal amt){
           if(amt <= 0){
              throw new Exception("amout should greater")
           }
           balance += amt
    }
    
    def deposit(List amt){
        for(amts in amt){
            deposit(amts)
        }
    }
}




Account1 checking = new Account1()
checking.deposit(10)
println checking.balance

try{
    checking.deposit(1)
}catch(Exception e){
    println e.message
}
