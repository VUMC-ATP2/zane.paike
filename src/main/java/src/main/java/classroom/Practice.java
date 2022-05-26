package classroom;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write number:");
        int inputResult = scanner.nextInt();
        if(inputResult > 0) {
            System.out.println("Number is > 0 witch is: " + inputResult);
        }

        System.out.println("Please enter number from 1-4:");
         switch (inputResult){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wendnesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Nepareiza diena!!");
        }
        
         }

    }


