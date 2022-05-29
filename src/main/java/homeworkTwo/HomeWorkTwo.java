package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
 // 1.uzdevums
        int x = 3;
        System.out.println(x > 0);
        System.out.println(x < 0);

        x = 7;
        System.out.println(x > 5 && x <= 10);
        System.out.println(!(x <= 5) && x < 10);
        System.out.println(x == 0 || x == 10);
        System.out.println((x * x) > 10);

 // 2.uzdevums
        int numberofmonth = 2;
        switch (numberofmonth) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Inccorect number of the month!! Try again!");
        }

 // 3.uzdevums
        //Pirmais variants ar if else if else
        int o = 56, p = 66, r = 12;
        if (o >= p && o >= r) {
            System.out.println("The largest number is: " + o);
        } else if (p >= o && p >= r) {
            System.out.println("The largest number is: " + p);
        } else {
            System.out.println("The largest number is: " + r);
        }

        // Otrs variants, kur pašam ir iespēja ievadīt skaitļus.
        int a, b, c, largest, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        a = sc.nextInt();
        System.out.println("Please enter the second number:");
        b = sc.nextInt();
        System.out.println("Please enter the third number:");
        c = sc.nextInt();
        temp = a > b ? a : b;
        largest = c > temp ? c : temp;
        System.out.println("The largest number of all three is: " + "\n" + largest);

// 4.uzdevums
        Scanner ss = new Scanner(System.in);
        System.out.println("What color is the traffic light now??");
        String color = ss.nextLine();

        if(color.equals("green")) {
            System.out.println("You can cross the street!");
        } else if (color.equals("yellow")) {
            System.out.println("Please wait a moment!");
        } else if (color.equals("red")) {
            System.out.println("!!!STOP!!!");
        } else {
            System.out.println("Do not recognize the color! Traffic lights are Green, Yellow and Red!");
        }





// 5.uzdevuma izsaukšana
      printBusinessCard("print");
        printBusinessCard("print");
         printBusinessCard("print");

//6.uzdevuma izsaukšana
        printBusinessCardTwo("Līga", "Kalniņa","+371 12312313", "1965");
        printBusinessCardTwo("Juris", "Vītols", "+371 5142431", "1930");

//7.uzdevuma izsaukšana
        int summa = sum(4,10);
        System.out.println("\n"+ summa);

//8.uzdevuma izsaukšana
        System.out.println(average(10,2,4));

    }

// 5.uzdevums

      public static void printBusinessCard(String print){
        System.out.println("Business Card");
        System.out.println("##########");
        System.out.println("Name: Zane");
        System.out.println("Surname: Paike");
        System.out.println("Phone number: +371 2645987");
        System.out.println("Born in: 1991");
        System.out.println("##########" + "\n");
      }

// 6.uzdevums

    public static void printBusinessCardTwo(String name, String surname, String phone, String born) {
        System.out.println("Business Card");
        System.out.println("##########");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Phone number: " + phone);
        System.out.println("Born in: " + born);
        System.out.println("##########");
    }

// 7.uzdevums

    public static int sum(int x, int y) {
        return x + y;
    }

//8.uzdevums
    public static double average(double a, double b, double c){
        return (a+b+c)/3;
    }

}

