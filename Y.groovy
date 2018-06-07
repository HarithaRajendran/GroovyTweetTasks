@groovy.transform.ToString()
class Tweet{
    int id
    String name
    
    def lang = []
    
    void printTest(){
        println "$id $name $lang"
    }
}
     Tweet t = new Tweet()
   t.setId(1)
   t.name = "Hari"
   
   t.lang << "JAVA"
   t.lang << "GROOVY"
   
  println "$t"
  