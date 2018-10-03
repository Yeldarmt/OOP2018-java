public class Person {
    public String name;
    public Person(String name){
        this.name = name;
    }
    public String  toString(){
        return "Name : " + name;
    }
    public boolean equal(Person p){
        if(this.name.equals(p.name))return true;
        return false;
    }
}

class Employee extends Person{
    public double salary;
    public int year;
    public String insuranceNumber;

    public Employee(String name,double salary,int year,String insuranceNumber) {
        super(name);
        this.salary=salary;
        this.year = year;
        this.insuranceNumber = insuranceNumber;
    }
    public boolean equal(Employee e){
        if(this.insuranceNumber.equals(e.insuranceNumber))
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
    public Manager(String name,double salary, int year, String insuranceNumber,int bonus) {
        super(name, salary,year, insuranceNumber);
        team++;
        this.bonus=bonus;
    }
    public String toString(){
       return  "Name : " + name +"\nsalary : " + salary+"\nbonus : "+ bonus+"\nteam : " + team;
    }
    public boolean equal(Object obj){
        Manager g = (Manager) obj;
        if(super.equals(g) && this.bonus == g.bonus){
            return true;
        }
        return false;
    }
}
class Tester{
    public static void main(String[] args){
        Person p = new Person("Eldar");
        Person p1 = new Person("Islam");
        System.out.println(p.equal(p1));
        System.out.println(p.toString());
        System.out.println("-----------------------");
        Employee e = new Employee("Berik",500,1, "12sdfg");
        Employee e1 = new Employee("Asdf",2345,3,"12sdfg");
        System.out.println(e.equal(e1));
        System.out.println(e.toString());
        System.out.println("-----------------------");
        Manager m = new Manager("Alish",700,2,"17sdfgs",100);
        Manager m1 = new Manager("Erke",900,3,"17ghjk",100);
        System.out.println(m.equal(m1));
        System.out.println(m.toString());
        System.out.println("-----------------------");
    }
}
