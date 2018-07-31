public class NameService{

    public static void main (String[] args) {
        String name = "Nataliya ";
        String surname = "Bachurina";
        String fullName = name.concat(surname);
        PrintName(fullName);
    }

    public static void PrintName(String name)
    {
        System.out.println(name);
    }
}

