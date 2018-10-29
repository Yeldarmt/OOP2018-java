package Task4;

public class Animal implements Move {
    private String name;
    public Animal(String n ){
        name =n;
    }
    @Override
    public void canMove() {
        System.out.println("Name : " + name +"\nSpeed : " + speed);
    }
}
class Tester{
    public static void main(String[] args){
        Animal a = new Animal("Tuzik");
        a.canMove();
    }
}
