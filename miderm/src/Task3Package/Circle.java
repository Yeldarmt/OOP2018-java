package Task3Package;

public class Circle extends Shape {
    private double radius;
    public Circle(){

    };
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(String col, Boolean fill,double radius){
        super(col,fill);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;
    }
    public String toString(){
        return "Radius " + radius+"Area : " + getArea()+"Perimetr" + getPerimetr();
    }
//    public Boolean equal(Object obj){
//        Circle c = (Circle)obj;
//        c.equals();
//    }
}
