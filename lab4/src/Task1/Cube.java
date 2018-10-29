package Task1;
public class Cube implements Shapes {
    public double a;
    public Cube(){};
    public Cube(int a){
        this.a =a;
    }
    public void Volume(){
        System.out.println("The Volume of Cube equal : " + a*a*a);
    }
    public void S_area(){
        System.out.println("The surface area of Cube equal : " + 6*a*a);
    }
}
