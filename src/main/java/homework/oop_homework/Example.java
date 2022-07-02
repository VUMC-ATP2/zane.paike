package homework.oop_homework;

import java.util.Date;

public class Example {

    public static void main(String[] args) {
        String name = "Zane";
        Date date = new Date();
        Visit visit = new Visit(name, date);// visit bus klases mainiigais, mainiiga veids no konkreetas klases, otrs ir mainiigā nosaukums
                                          //definēju jaunu objektu(new visit) no klases(visit), tad padodu tos parametrus,
                                          // kas tam visit klases konstruktorā jau bija noteikti.
        visit.customer.setMember(true);
        visit.customer.setMemberType("premium");

        visit.setServiceExpense(5);
        visit.setProductExpence(6);
        System.out.println(visit.getTotalExpence());

    }
}
