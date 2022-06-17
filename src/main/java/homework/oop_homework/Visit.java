package homework.oop_homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
@AllArgsConstructor
public class Visit {

    Customer customer;
    Date date;
    @Getter @Setter
    public double serviceExpense;
    @Getter @Setter
    public double productExpence;

    public String getCustomer() {     // Getteris, kas atgriež klienta vārdu no Customer klases
        return customer.getName();
    }

    public double getTotalExpence () {
        String memberType = this.customer.getMemberType();  //nolasa kāda tipa memberis ir šis klients Šim objektam tiek panjemts no customer klases tieši get Type metode.
        double serviceDiscount = DiscountRate.getServiceDiscountRate(memberType); // pasaka kura atlaide būs īstā
        double productDiscount = DiscountRate.getProductDiscountRate(memberType);

        return this.productExpence * (1 - productDiscount) + this.serviceExpense * (1 - serviceDiscount);
    }

    public Visit(String name, Date date) { //kad definēs jaunu viziiti tad tur bus klienta vārds un datums..
        this.customer = new Customer(name); // nodefinēju klienta objektu
        this.date = date;
    }


}
