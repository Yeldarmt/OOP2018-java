package Task3Package;

public abstract class Shape {
    private String color ;
    private Boolean filled;
    public Shape(){

    }
    public Shape(String color,Boolean filled){
        this.color = color;
        this.filled=filled;
    }
    public abstract double getArea();
    public abstract double getPerimetr();

    public void setColor(String c){
        color = c;
    }
    public void setFilled(Boolean b){
        filled = b;
    }
    public String getColor(){
        return color;
    }
    public Boolean isFilled(){
        return filled;
    }
    public String toString(){
        return "Color : " +color +" " + "Filled : " +filled;
    }

}
