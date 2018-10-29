package Task2;

public class People implements Interclass {
    public String name;
    public int year;
    public People(String name, int year){
        this.name =name;
        this.year=year;
    }
    @Override
    public String info() {
        return "Name : " + name ;
    }

    @Override
    public void print() {
        System.out.println(info()+"\nYear : " + year);
    }
}
