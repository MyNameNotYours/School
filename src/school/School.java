
package school;

public class School {

    public static void main(String[] args) {
        Person Alex = Person.addPerson(Person.Gender.Female, "Alex", 80);
        Person Jack = Person.addPerson(Person.Gender.Male, "Jack", 120);
        Person Olivia = Person.addPerson(Person.Gender.Female, "Olivia", 90);
        Person Lauren = Person.addPerson(Person.Gender.Female, "Lauren", 80);
        Jack.SetName("Jason");
        Person.printNames();
        
        Person.printNames(Person.Gender.Female);
        
        System.out.println(Olivia.getWeight());
        System.out.println(Alex);
        System.out.println(Jack);
    }
}
