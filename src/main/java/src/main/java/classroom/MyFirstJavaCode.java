package classroom;

public class MyFirstJavaCode {
    public static void main(String[] args) {

        // One line comment

        /*
        Multi line comment
        Is realy good approach
        How to write a lot of comments
         */

        // byte data type
        byte floorCount = 7;
        System.out.println("My house has " + floorCount + " floors");
//        System.out.printf("My house has %d floors", floorCount);

        // %d - numbers
        // %s - text/string
        // %b - boolean

        short salaryInEur = 1000;
        System.out.println(salaryInEur);
        System.out.println(1000);

        System.out.printf("Average salary for Junior QA Engineer is: %d\n", salaryInEur);

        int chinaPopulation = 1449687399;
        long currentWorldPopulation = 794689788;
        System.out.printf("Current world population: %d people.\nIn meanwile china population: %d people", currentWorldPopulation, chinaPopulation);

        // Floating numbers
        float myCurrentWeight = 70.2f;
        System.out.println(myCurrentWeight);

        double gasPriceUnEur = 1.83445d;
        System.out.println(gasPriceUnEur);



        // Non-primitive String
        String myName = "Zane";
        System.out.println(myName);

        String mySentence = "Hello, my name is Zane. I am 30 years old.";
        String mySecoundSentence = "I live in Tukums";
        System.out.println(mySentence);
        System.out.println(mySentence + mySecoundSentence);
        System.out.println(mySentence + " " + mySecoundSentence);
        System.out.printf("%s %s\n", mySentence, mySecoundSentence);

        boolean isSummer = false;
        boolean isSpring = true;
        System.out.println(isSpring);
        System.out.println(isSummer);

        if(isSummer) {
            System.out.println("Yes, it is summer");
        } else {
            System.out.println("No, it is not summer");
        }


    }
}
