package Task3Package;

public class Rectangle extends Shape {
    private double width,length;
    public Rectangle(){

    }
    public Rectangle(double w,double l){
        width = w;
        length = l;
    }
    public Rectangle(double we,double le,String c,Boolean f){
        super(c,f);
        width =we;
        length = le;
    }
    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimetr() {
        return 2*(length+width);
    }
    public void setWidth(double w){
        width = w;
    }
    public void setLength(double l){
        length = l;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public String toString(){
        return "Width ; " +width+"Length : " +length;
    }
}
