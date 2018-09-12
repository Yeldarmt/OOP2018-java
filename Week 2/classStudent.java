public class Student {
    public String name ;
    public int id;
    public int year;

    public Student(String name,int id , int year){
        this.name = name;
        this.id=id;
        this.year=year;
    }
    public Student(){
        name = "Zholdybai";
        id = 4321;
        year = 2;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getYear(){
        return year;
    }
    public String toString(){

        return ("Name : " + this.getName() +"\n" + "ID : "+this.getId()+"\n"+"YEAR : "+ this.getYear() + "\n" );
    }

    public static void main(String args[]){
        Student s1 = new Student("Yeldar",1234,2);
        Student s2 = new Student();
        System.out.println("The first student:");
        System.out.println(s1.toString());
        System.out.println("The second student:");
        System.out.println(s2.toString());
    }
}
