package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(1949, 9, 24);
        Person person = new Person("Blasito", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + 
                            " años");
    }
}
