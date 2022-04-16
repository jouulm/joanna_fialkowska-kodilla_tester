class Person
{
    public String name;
    public double age;
    public double height;

    public Person(String name, double age, double height)
    {
        this.name = name;
        this.age = age;
        this.height = height ;
    }
}
class Application
{
    public static void main(String[] args)
    {
        Person adam = new Person("Adam", 40.5, 178);
        if(adam.age > 30 && height > 160)
        if(name != null) {
            if(age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");

            }
        }
    }
}
