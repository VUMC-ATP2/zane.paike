package classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] dayOfTheWeek = {1, 2, 3 , 4, 5, 6, 7};
        System.out.println(dayOfTheWeek.length); //atgriež masīva izmēru, kas ir 7
        //[0]=1
        //[1]=2
        //...[6]=7
        System.out.println(dayOfTheWeek[6]);
        System.out.println(dayOfTheWeek[7-1]);

        String[] nameOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Today is: " + nameOfTheWeek[0]);

        String[] fruits = new  String[6];
        System.out.println("123");
        fruits[0] ="apple";
        fruits[1] = "kiwi";
        fruits[2] = "banana";
        fruits[3] = "strawbery";
        fruits[4] = "cherry";
        fruits[5] = "puneapple";
        System.out.println("");

        fruits[0]= "pear";

        char[] myNameCharacter = {'z','a','n','e'};
        System.out.printf("%s %s\n", myNameCharacter[0], myNameCharacter[1]);

        Random random = new Random();
        System.out.println(random.nextInt(100));
        int[] randomNumbers = {random.nextInt(100), random.nextInt(100), random.nextInt(100)};
        System.out.println(Arrays.toString(randomNumbers));

        List<String> listOfFruit = new ArrayList<>();
        listOfFruit.add("apple");
        listOfFruit.add("kiwi");
        listOfFruit.add("cherry");
        System.out.println(listOfFruit);


    }
}
