/*
1. Describe a class (Animal), using access and non-access (if need) modifiers;
2. Create a few methods (methods should print some information at list):
	- method 'go' with enter parameter like amount of steps;
	- method 'say' with enter parameter what to say;
	- method 'print Information' with nothing to enter, but must print all information about abject;
3. Create an Object of class Animal
*/
public class Animal {

    public String speciesName;
    private int weight;
    protected String woolColour;

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.speciesName = "cat";
        animal.woolColour= "white";
        animal.weight = 5;

        animal.go( 20 ) ;
        animal.say("Maouw");
        animal.printInfo();
    }

    private void say(String speech) {
        System.out.println(speciesName + " say: '" + speech + " '");
    }

    private void go(int stepNumber) {
        System.out.println(speciesName + " make " + stepNumber + " steps");
    }

    private void printInfo() {
        System.out.println(toString());
    }
    public String toString() {
        return woolColour + " " + speciesName + " " + "weights " + weight + " kg";
    }
}
