/*
1) Create abstract class Human with variable name and method sleep(print I sleep)
2) Create class Men and inherit him from Human
3) Create interface iTalk with method talk(print I talk) and implement this interface in class Men
4) In main method create object aragorn (new Men()) and call method sleep and talk
5) Override method sleep in class Men(should print I sleep one more time) and run main method one more time.
*/


public abstract class Human {

    public String name = "Mark";


    public static void main(String[] args){
        Men men = new Men();
        men.sleep("I sleep");
        men.italk("I talk");
    }

   public void italk(String i_talk) {
        System.out.println(name + " says: '" + i_talk + "'" );
    }
    
    public void sleep(String speech)  {
        System.out.println(name + " says: '" + speech + "'");
    }


}
