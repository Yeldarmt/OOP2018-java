package Task3Package;

public class Test_Task3 {
    public static void main(String[] args){
        Circle c = new Circle("BLack",true,5);
        System.out.println("Perimetr" + c.getPerimetr());
        System.out.println(c.getArea());
        Rectangle r = new Rectangle(3,4,"blue",false);
        System.out.println("Perimetr : " +r.getPerimetr() +r.toString());
    }
}
