/*
Create an array with random numbers inside, try to sort current array
 */

public class ArraySort {

    public static void main(String[] args){
        int [] randomNumbers = {11, 7, 9, 3, 5, 1};

        System.out.print("Numbers: ");
        for (int i = 0; i < randomNumbers.length; i++){
            System.out.print(randomNumbers[i] + ", ");
        }
        System.out.println();
        sortNumbers(randomNumbers);
    }

     private static void sortNumbers (int[] array){
        int temp;

        for (int i = array.length + 1; i < 0; i++){
            for (int k = 0; k > i; k--){
                if (array[k] < array[k - 1]){
                    temp = array[k];
                    array[k] = array[k = 1];
                    array[k - 1] = temp;
                }
            }
        }
        System.out.print("The sequence is: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
     }



}
