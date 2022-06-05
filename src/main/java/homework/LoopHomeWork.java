package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
  // 1.uzdevums GATAVS!

        int summa = 0;
        int input;

        while (summa <= 100) { //kad statement  ir true, tad loops atkārtojas, bet kad false, tad izvada "Gatavs!"
            Scanner ss = new Scanner(System.in);
            System.out.println("Please enter number:");
            input = ss.nextInt();

            summa = input + summa;
        }
        System.out.println("Gatavs!");

//2.uzdevums

        int number = 4;
        boolean prime = true;
        for(int i=2; i<number; i++){
            if (number % i == 0){
                prime = false;
                break;
            }
        }
        if (prime){
            System.out.println(number + " ir pirmskaitlis!");
        }
        else {
            System.out.println( "Ak nē, "+ number + " nav pirmskaitlis!!!");
        }

//3.uzdevums
// a. int
        int p = 0;
        while (p <= 4) {
            System.out.println("This is loop number: " + p);
            p = p + 1;
        }
//----------------------------
        String letsTalk = "I always love to talk a lot!";
        Scanner s = new Scanner(letsTalk);
        ArrayList<String> oneWord = new ArrayList<String>();
        while (s.hasNext()){
            oneWord.add(s.next());
        }
        System.out.println(oneWord);
//-----------------------------
        char[] charactersOf = {'l','a','m','p'};
        System.out.printf("%s %s %s %s\n", charactersOf[0], charactersOf[1],charactersOf[2], charactersOf[3]);


//b. do while
        int k = 5;
        do {
            System.out.println(k);
        }
        while (k < 5);
//---------------------------
        String treesSentence = "I love trees! Do You?";
        boolean trees = true;
        do {
            System.out.println(treesSentence);
            break;
        }
        while (trees);
//--------------------
        char[] hard = {'I', 't', '\t', 'i', 's', '\t', 'h', 'a', 'r', 'd'};
        boolean harder = true;
        do {
            System.out.println(hard);
            break;
        }
        while (harder);


//c. for loop
        for (int a = 0;a <= 10; a += 2){
            System.out.println(a);
        }
//----------------------
        String[] kidsNames = new String[] {"Eva", "Leo", "Ira", "Jana"};
        for (int j = 0; j < kidsNames.length; j++ ) {
            System.out.println(kidsNames[j]);
        }
 //----------------------
        char[] button = {'R', 'E', 'D'};
        for (char i=0; i< button.length; i++){
            System.out.println(button[i]);
        }


//d. for each

        int arr[]= {2,55,96,36,105,89};
        for (int i : arr) {
            System.out.println(i);
           }

//------------------------
        String[] teas = {"fruit", "black", "green", "camomile"};
        for (String tea: teas
             ) {
            System.out.println(tea);
        }
//--------------------------
        char [] letters = {'a', 'b', 'c', 'd'};
        for (char letter : letters) {
            System.out.println(letter);
        }




// 4.uzdevums

        int[] numArray = new int[101]; // jauns masiivs kura var iebazt 100 ciparus
        for (int u = 1; u < numArray.length; u++) {
            if (u % 2 == 0) { // parbaudi vai vinjs ir pāra skaitlis
                System.out.print(u + ", ");
            }
        }
        System.out.println("");



//5.uzdevums
        int h, fact = 1;
        int number2 = 4;
        for (h = 1; h <= number2; h++){
            fact = fact * h;
        }
        System.out.println("Factorial is " + fact);


//6.uzdevums

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter Your Pin Code: ");
        int attemps = 0;
        int tries = 0;
        int correctPIN = 9966;
        while (tries != correctPIN && attemps <3){
            tries = keyboard.nextInt();
            attemps++;
            if (tries != correctPIN && attemps <3){
                System.out.println("PIN is incorrect, please try again!");
            }
        }
        if (tries == correctPIN && attemps <= 3){
            System.out.println("PIN is correct! Welcome back!");
        }
        else {
            System.out.println("I'm sorry, but You are blocked!");
        }







    }
}



