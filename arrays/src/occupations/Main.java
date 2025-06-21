package occupations;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        List<Chef> chefs = new ArrayList<>();

        persons.add(new Person("Aliz", 25, Gender.WOMAN));
        persons.add(new Person("Béla", 30, Gender.MAN));
        persons.add(new Person("Cecus", 35, Gender.WOMAN));
        persons.add(new Person("Danika", 40, Gender.UNDEFINED));
        persons.add(new Person("Erika", 28, Gender.WOMAN));

        for (int i = 0; i < 5; i++) {
            persons.add(new Person());
        }

        chefs.add(new Chef("Feri", 45, Gender.MAN));
        chefs.add(new Chef("Gizike", 38, Gender.WOMAN));
        chefs.add(new Chef("Huba", 32, Gender.MAN));
        chefs.add(new Chef("Irén", 29, Gender.WOMAN));
        chefs.add(new Chef("Józsi", 50, Gender.MAN));

        for (int i = 0; i < 5; i++) {
            chefs.add(new Chef());
        }

        for (Person person : persons){
            person.introduce();
            person.printGoal();
        }
        for(Chef chef : chefs){
            System.out.println(chef.cook("broccoli"));
        }

    }
}