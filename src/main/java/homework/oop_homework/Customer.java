package homework.oop_homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Customer {

    @Getter
    protected String name;
    @Getter @Setter
    protected Boolean member = false;
    @Getter @Setter
    protected String memberType;

    public Customer(String name) {
        this.name = name;
    }
}
