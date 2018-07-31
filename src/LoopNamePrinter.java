public class LoopNamePrinter {
    public static void main (String[] args){
        String myName = "Nataliya";
        PrintName(myName);
    }


    public static void PrintName(String name){
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}

