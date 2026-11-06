import org.AnimalKingdom;
import org.Diet;

public class Main {
    public static void main(String[] args) {

        // The Variables have already been initialized, finish by adding the correct value(s)
        // corresponding to the data type
                                                                            /*
                                                                            String: Hold plain-text values "ABC 123"
                                                                            int: Hold number values 123456
                                                                            boolean: Holds true or false values ONLY
                                                                            double: Holds floating point values
                                                                            float: Holds the same followed by lowercase "f"
                                                                            char: Holds single character values in singular quotation 'A'
                                                                            Lower case: Indicates the data type is primitive
                                                                            Upper case: Indicates the data type is an object
                                                                            */

        String fName;
        String lName;
        String[] colors;
        int number;
        int[] numberLine;
        double decimal;
        boolean trueOrFalse;
        float floatingPointDecimal;


//      For Loop: Complete the logic to iterate through the array. REMEMBER TO START WITH for KEYWORD
//      1. Initialize an int variable x to 0 (int x = 0).
//      2. Continue looping as long as x is less than the array's length (array.length).
//      3. Increase x by 1 after each iteration.

//        for(int x = 0; x < fruits.length; x++){}

        AnimalKingdom lion = new AnimalKingdom(
                Diet.CARNIVORE,
                "Lion",
                "Roar",
                4,
                2,
                0,
                30
        );

//        System.out.println(lion);


        /*
        * First instantiate a variable to store your first and last name. Call it "Full Name"
        * then instantiate x and y variables to contain number values
        * Next create a variable that Can print "True" or "False"
        * Create a variable to store your favorite fruits
        * Finally create a similar variable to store 5 numbers containing decimal points
        * */

        String fullName = "Netaliah Henry Lee";
        int x = 12;
        int y = 21;
        boolean isSexc = false;
        String [] fruits = {"Pomegranate", "Kiwi", "Raspberries", "Mango"};
        double [] numbasss = {3, 4.1, 7, 6.7, 9};


        /* Write a print statement that says "when 'your name' was" x (or) y "years old, it was [INSERT YEAR]" Make it grammatically correct
        * loop through your favorite fruit printing them all on one line
        * write a condition to loop through the numbers backwards starting from the last index to the first
        * Finally write an if else statement that prints (NOT OLD ENOUGH TO DRINK) and if the condition is met then print (OLD ENOUGH TO DRINK)*/

        System.out.println("When " + fullName + " was " + x + " years old, it was 2020" );

        for(int i = fruits.length -1; i >= 0 ; i--){
            System.out.print(fruits[i] + " ");
        }



    }
}
