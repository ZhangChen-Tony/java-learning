public class Methods{
    public static void main(String[] args){
        People ming = new People();
        ming.setNameAndAge("Xiaoming", 16);
        System.out.println(ming.GetAge());
    }
}

class People{
    private String name;
    private int age;
    public void setNameAndAge(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int GetAge(){
        return age;
    }

}