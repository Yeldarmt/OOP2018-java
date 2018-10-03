public class Test {
    public static void main(String[] args){
        Cylinder c = new Cylinder(5,6);
        System.out.println("Cylinder : \n "+"VOLUME = " + c.Volume() +
                " and " + "SurfaceArea = " + c.surfaceArea());
        Sphere s = new Sphere(5);
        System.out.println("Sphere : \n"+"VOLUME = " + s.Volume() +
                " and " + "SurfaceArea = " + s.surfaceArea());
        Cube d = new Cube(5);
        System.out.println("Cube : \n"+"VOLUME = " + d.Volume() +
                " and " + "SurfaceArea = " + d.surfaceArea());

    }
}
