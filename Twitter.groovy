@groovy.transform.ToString()
class Tweet{
    int id
    String name
    
    def lang = []
    
    void printTest(){
        println "$id $name $lang"
    }
}
    
  