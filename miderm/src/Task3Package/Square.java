package Task3Package;

public class Square extends Rectangle {
    private double side;
    public Square(){

    }
    public Square(double side){
        this.side = side;
    }
    public Square(double s,String c,Boolean f){
       super(s,s,c,f);
    }
    public double getSide(){
        return side;
    }
    public void setSide(double s){
        side = s;
    }
    public void setWidth(double si){
        //super(si,si);
    }
    public void setLength(double sid){
        //super(sid,sid);
    }
    public String toString(){
        return "Side : " + side;
    }
}
