package occupations;

public class Chef extends Person {
    public Chef() {
    }

    public Chef(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public void introduce() {
        System.out.printf("Hi, my name is %s. I am %d. I am a %s and a chef. %n",
                getName(), getAge(), getGender());
    }

    public String cook(String food) {

        return String.format("%s has cooked some %s.",
                getName(), food);
    }
}