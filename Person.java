
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;

    /**
     * Constructor for objects of class Person
     */
    public Person(String theName, int theAge )
    {
        name = theName;
        age = theAge;
    }
    
    public int setAge(int age) {
        return age;
    }
    
    public String getName(){
        return name;
    }
    
    public void printDetails(){
        System.out.println("The name of this person is " + name);
    }
}
