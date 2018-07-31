public class WhileLoop {

    public static void main (String[] args){
        String name = "Nataliya";
        PrintName(name);
    }

    public static void PrintName(String name){
        int i = 0;
        while (i <  name.length()){
            System.out.println(name.charAt(i));
            i++;
        }
    }
}
