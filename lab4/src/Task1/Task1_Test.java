package Task1;

public class Task1_Test {
    public static void main(String[] args){
        Shapes x;
        Cylinder c = new Cylinder(3,4);
        System.out.println("Cylinder : ");
        c.S_area();
        c.Volume();
        Sphere s = new Sphere(5);
        System.out.println("Sphere : ");
        s.S_area();
        s.Volume();
        Cube k = new Cube(5);
        System.out.println("Cube : ");
        k.S_area();
        k.Volume();
        Point p = new Point();
        System.out.println("POINT : ");
        p.S_area();
        p.Volume();
    }
}
