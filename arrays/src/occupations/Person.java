package occupations;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    public Person() {

    }

    public Person( String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.printf("Hi, my name is %s. I am %d. I am a %s.%n",
                name, age, gender);
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void printGoal() {
        System.out.println("My goal is to be happy in the future.");
    }

}

