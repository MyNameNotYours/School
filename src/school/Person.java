
package school;
import java.util.ArrayList;
public class Person {
//    public static int numPeople = 10;
//    public static int currentPeopleIndex = 0;
//    private static Person people[] = new Person[numPeople];
    private static ArrayList<Person> people = new ArrayList<Person>();
    
    enum Gender {
        Male,Female
    }
    
    private Gender gender;
    private String name;
    private int weight;
    
    Person()
    {
        gender = Gender.Female;
        name = "No Name";
        weight = 100;
    }
    
    Person(Gender _gender, String _name, int _weight)
    {
        gender = _gender;
        name = _name;
        weight = _weight;
    }
    
    public static Person addPerson(Gender _gender, String _name, int _weight)
    {
        Person temp = new Person(_gender, _name, _weight);
//        people[currentPeopleIndex++] = temp;
        people.add(temp);
        return(temp);
    }
    
    public Gender getGender()
    {
        return (gender);
    }
    public void SetGender(Gender _gender)
    {
        gender = _gender;
    }    
    
    public String getName()
    {
        return (name);
    }
    public void SetName(String _name)
    {
        name = _name;
    }     
        
    public int getWeight()
    {
        return (weight);
    }
    public void SetWeight(int _weight)
    {
        weight = _weight;
    }
    public static void printNames()
    {
        System.out.println("=====PrintNames====");
//        for(int i = 0; i < people.length; i++)
//        {
//            if(people[i] != null)
//            System.out.println(people[i].getName());
//        }
//    }
        for(Person temp : people)
        {
            System.out.println(temp.getName());
        }
    }
    public static void printNames(Gender _gender)
    {
        System.out.println("=====PrintNames====");
        for(Person temp : people)
        {
            if(temp.getGender() == _gender)
            System.out.println(temp.getName());
        }
    }
    public String toString()
    {
        return(name + " " + gender + " " + weight);
    }
}
