//or I should say method of creating :D Gouzaohanshu in Pinin
public class CreateMethods{
    public static void main(String[] args){
        Person xiaoming = new Person("Xiaoming",16);
        String name = xiaoming.getName();
        System.out.print(name);
    }
}


class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
}