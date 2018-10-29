package Task3;

import java.util.Date;

public class Person implements Comparable{
    public String name;
    public Person(String name){
        this.name = name;
    }
    public String  toString(){
        return "Name : " + name;
    }
    public boolean equal(Object o){
        Person p = (Person) o;
        if(super.equals(o) && this.name == p.name)return true;
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class Employee extends Person{
    public double salary;
    public Date hireDate;
    public String insuranceNumber;

    public Employee(String name,double salary,Date h,String insuranceNumber) {
        super(name);
        this.salary=salary;
        hireDate = h;
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        if(this.salary==employee.salary){
            return 1;
        }
        return 0;
    }

    public boolean equal(Object object){
        Employee e =(Employee) object;
        if(super.equals(e) && this.salary == e.salary)
            return true;
        return false;
    }
    public String toString(){
        return "Name : " + name + "\ninsuranceNumber : " +insuranceNumber+"\nsalary : " + salary;
    }
}
class Manager extends Employee{
    public static int team=0;
    private int bonus;
    public Manager(String name,double salary, Date hireDate, String insuranceNumber,int bonus) {
        super(name, salary,hireDate, insuranceNumber);
        team++;
        this.bonus=bonus;
    }
    public String toString(){
        return  "Name : " + name +"\nDate : " + hireDate +"\nsalary : " + salary+"\nbonus : "+ bonus+"\nteam : " + team;
    }
    public boolean equal(Object obj){
        Manager g = (Manager) obj;
        if(super.equals(g) && this.bonus == g.bonus){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        Manager ma = (Manager) o;
        if(ma.bonus==this.bonus){
            return 0;
        }
        return 1;
    }
}
class Tester{
    public static void main(String[] args){
        Person p = new Person("Eldar");
        Person p1 = new Person("Islam");
        Date date = new Date();
        System.out.println(p.equal(p1));
        System.out.println(p.toString());
        System.out.println("-----------------------");
        Employee e = new Employee("Berik",500, date,"12sdfg");
        Employee e1 = new Employee("Asdf",2345,date,"12sdfg");
        System.out.println(e.equal(e1));
        System.out.println(e.toString());
        System.out.println("-----------------------");
        Manager m = new Manager("Alish",700,date,"17sdfgs",100);
        Manager m1 = new Manager("Erke",900,date,"17ghjk",100);
        System.out.println(m.equal(m1));
        System.out.println(m.toString());
        System.out.println("-----------------------");
    }
}
