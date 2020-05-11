import java.util.*;

public class ControlFlowProject {
    public static void main(String args[]) {
        //test Hello World
        System.out.println("Hello World");
        //calling method to print ascii code for numbers
        printNumbers();
        //blank line to separate 
        System.out.println();
        //method to print ascii code for lower case letters
        printLowerCase();
        //blank line to separate
        System.out.println();
        //method to print ascii code for upper case letters
        printUpperCase(); 

        Scanner question = new Scanner(System.in);
    
        System.out.print("Please enter your first name: "); 
        String nameInput = question.next();

        System.out.println("Will you answer a few questions? (yes or no)");
        String yayOrNay = question.next();

        if (yayOrNay.equalsIgnoreCase("yes")){
            System.out.println("Awesome! Here we go!");
        } else{
            System.out.println("Maybe next time.");
            System.exit(-1);
        }

        String repeat;
        
            String petName;
            int petAge;
            int luckyNumber;
            int jerseyNumber;
            int carYear;
            int enteredNum;
            String actName;
        do {
        System.out.println("What is your favorite pet's name?");
        petName = question.next();

        System.out.println("How old is " + petName + "?");
        petAge = question.nextInt();

        System.out.println("What is your lucky number?");
        luckyNumber = question.nextInt();

        System.out.println("What is your favorite athlete's jersey number?");
        jerseyNumber = question.nextInt();

        System.out.println("What is the two-digit model year of your car? (For a 2000 year model, enter 00)");
        carYear = question.nextInt();

        System.out.println("Please enter a number between 1 and 50");
        enteredNum = question.nextInt();

        System.out.println("What is your favorite actor/actress's first name?");
        actName = question.next();
        System.out.println();

        System.out.println("Would you like to repeat the questions?(yes or no)");
        repeat = question.next();
        } while (repeat.equalsIgnoreCase("yes"));

        Random randNumGenerator = new Random();

        int random1 = randNumGenerator.nextInt(75);
        int random2 = randNumGenerator.nextInt(65);

        int magicNumber = random1 * jerseyNumber;

        int lottery1 = carYear + luckyNumber;
        int lottery2 = 42;
        int lottery3 = jerseyNumber + petAge + luckyNumber;
        while (lottery3 > 65) {
            lottery3 -= 65;
        }
        int lottery4 = petName.charAt(2);
        int lottery5 = actName.charAt(0);

        while (magicNumber > 75) {
            magicNumber -= 75;
        }

        System.out.println("Lottery Numbers: " + lottery1 + " " + lottery2 + " " + lottery3 + " " + lottery4 + " "
                + lottery5 + " " + "Magic Ball: " + magicNumber);

        question.close();
    
}

    

        
    

    public static void printNumbers() {
        for (int i = 48; i <= 57; i++) {
            System.out.println("The Ascii value of " + (char) i + " = " + i);
        }
    }

    public static void printLowerCase() {
        for (int i = 97; i <= 122; i++) {
            System.out.println("The Ascii value of " + (char) i + " = " + i);
        }
    }

    public static void printUpperCase() {
        for (int i = 65; i <= 90; i++) {
            System.out.println("The Ascii value of " + (char) i + " = " + i);
        }
    }

    /*public static void listOfQuestions() {
        Scanner question = new Scanner(System.in);

        System.out.println("What is your favorite pet's name?"); 
        String petName = question.nextLine();

        System.out.println("How old is " + petName +"?"); 
        int petAge = question.nextInt();

        System.out.println("What is your lucky number?"); 
        int luckyNumber = question.nextInt();

        System.out.println("What is your favorite athlete's jersey number?"); 
        int jerseyNumber = question.nextInt();

        System.out.println("What is the two-digit model year of your car? (For a 2000 year model, enter 00"); 
        int carYear = question.nextInt();

        System.out.println("What is your favorite actor/actress's first name?");
        String actName = question.nextLine();

        System.out.println("Please enter a number between 1 and 50");
        int enteredNum = question.nextInt();

        System.out.println("Would you like to repeat the questions?(yes or no)");
        String repeat = question.nextLine();
        
        question.close();
    }*/
}


