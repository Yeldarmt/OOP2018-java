package Task2;

public class Person extends Abstractclass {
    public double gpa;
    public Person(String n,int a,double g){
        super(n,a);
        gpa =g;
    }

    @Override
    public void info() {
        System.out.println("Name : " + super.name +"\nAge : "+ super.age +"\nGPA : " +gpa);
    }
}
