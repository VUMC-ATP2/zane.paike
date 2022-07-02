package classroom;

import java.util.Arrays;

public class LoopsPractice {
    public static void main(String[] args) {
        // 0 - 4;

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i = i + 1; // or i++;
        }

        i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        /*
        i = 0;
        while (i<5) {
            System.out.println(i);
        }
*/
        // Print out array values using while
        int[] arr = {2, 11, 45, 9};
        int number = 0;
        while (number < 4) { // var arii (number < arr.length), jo arr.length ir 4.
            System.out.println(arr[number]); // arr[0] arr[1]
            number++; // 0+1; 1+1;
        }

        //Print out even numbers from 0 to 10;
        // i % 2 == 0;
        number = 0;
        System.out.println("While START");
        while (number <= 10) { // ja true, tad ejam tālāk. Bet tālāk par 10 viņš neies.
            if (number % 2 == 0) { // vai ir pāra skaitlis
                System.out.println(number);
            }
            number++;
        }
        System.out.println("While END");

        // 18 -65
        int age = 18;
        do {
            System.out.println(age + ", ");
            age++;
        } while (age <= 65);

        // Print out even numbers(pāra skaitļus) from 0 to 10: use do-while
        int number2 = 0;
        do {
            if (number2 % 2 == 0) { // parbaudi vai vinjs ir pāra skaitlis
                System.out.println(number2); // ja para skaitlis tad izprintee
            }
            number2++;
        } while (number2 <= 10);// un dari to tik ilgi kamēr number ir <= 10


        for (int x = 1; x <= 10; x++) {
            System.out.print(x + ", ");

        }
        System.out.println("");

        // Print in one line numbers from 20 to 0

        int a;
        for (a = 20; a >=0; a--){
            System.out.print(a + ", ");
        }
        System.out.println("");

        for ( int y = 20; y >= 0; y--){ // gribi ciparus no 20 liidz 0
            if (y % 2 == 0){
                System.out.print(y + ", ");
            }
        }
        System.out.println("");

        //for e
        String[] coutries = new String[] {"Latvia", "Canada", "USA", "Estonia"};
        for (int j = 0; j < coutries.length; j++ ){
            System.out.println(coutries[j]);
            //countries[0] - Latvija
        }

        //for each
        for (String country : coutries){
            System.out.println(country); // izprintes katru elementu, kamer beigsies rindaa elementi
        }

        //Create int[] array with numbers from 0 to 100;
        //Print numbers that are > than 50;

        int[] numArray = new int[101]; // jauns masiivs kura var iebazt 100 ciparus
        for (int y = 0; y < numArray.length; y++) {
            numArray[y] = y;
        }
        for (int x = 0; x<numArray.length; x++){ // jaunu ciklu taisam
            if (numArray[x]>=50){
                System.out.println(numArray[x]);
            }
        }
        System.out.println("======================");
        for (int j = 0; j < coutries.length; j++) {
            if (coutries[j].equals("USA")){
                System.out.println("I found USA! Breaking the loop!");
                break;
            }

        }
        // For loop 1-10;
        // If value of i ir between 4 un 9
        //countinue

        for (int j = 1; j <= 10 ; j++) {
            if (j > 4 && j < 9){ //ja izpildas, tad vinjs peiskaita +1 un pārbauda nakamo skaitli, ja neizpildas, tad izprintee.
                continue;
            }
            System.out.println(j); //izprinteejas visi cipari kas neatbilst nosaciijumiem j>4 un j<9, tātad false!!


        }



    }
}
