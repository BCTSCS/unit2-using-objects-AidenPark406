import greenfoot.GreenfootSound;
public class Person  
{
    private int x = 0;
    private int y = 0;
    private int speed = 5;
    private String name = "Unknown";
    private boolean canTalk = false;
    private GreenfootSound sound = null;

    public Person()
    {
        
    }
    public Person(String namePerson)
    {
        name = namePerson;
    }
    public Person(String namePerson, int sp)
    {
        name = namePerson;
        speed = sp;
    }
    public String toString() {
        return "Person name=" + name + ", x=" + x + ", y=" + y + 
           ", speed=" + speed + ", canTalk=" + canTalk + ", sound= "
           + sound;
    }
    public void walk() {
        
    }      
    public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person("Alice");
    Person p3 = new Person("Bob", 5);
    
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
}
}
