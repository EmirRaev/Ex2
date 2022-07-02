import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();
        Person p1 = new Person("Bob", "Bob", "Bob");
        Person p2 = new Person("Bo", "Bob", "Bob");
        addPerson(p1, people);
        addPerson(p2, people);

    }

    public static void addPerson(Person person, LinkedList<Person> people) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName().equals(person.getName())
                    && people.get(i).getPatronymic().equals(person.getPatronymic()) &&
                    people.get(i).getSurname().equals(person.getSurname())) {
                throw new RuntimeException();
            }
        }
        people.add(person);
        System.out.println("Человек добалвен!");
    }
}
