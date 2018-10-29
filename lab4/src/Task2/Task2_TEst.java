package Task2;

import Task2.People;
import Task2.Person;

public class Task2_TEst {
    public static void main(String[] args){
        People p = new People("Eldar",2);
        System.out.println("Interface class output : ");
        p.print();
        Person t = new Person("Timur",19,4);
        System.out.println("Abstract class output : ");
        t.info();
    }
}
