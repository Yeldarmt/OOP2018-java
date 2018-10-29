package Task1;

public class Cylinder implements Shapes {
    public double radius;
    public double height;
    public Cylinder(){}

    public Cylinder(double r,double h){
        radius = r;
        height = h;
    }
    public void Volume(){
        System.out.println("The Volume of Cylinder equal : "+ Math.PI*radius*radius*height);
    }
    public void S_area(){
        System.out.println("The Surface Area of Cylinder equal : " + Math.PI*2*radius*height);
    }
}
