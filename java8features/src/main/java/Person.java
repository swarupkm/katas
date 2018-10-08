public class Person {
    private final int age;

    public Person(int age) {
        this.age = age;
    }

    public int age(){
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}