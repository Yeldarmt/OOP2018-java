package Task1;

public class Sphere implements Shapes {
    int radius;
    public Sphere(){ }

    public Sphere(int r){
        radius =r;
    }
    public void Volume(){
        System.out.println("The volume of Sphere equal : " + 4*Math.PI*radius*radius/3);
    }
    public void S_area(){
        System.out.println("The surface area of Sphere equal : " + 6*Math.PI*radius);
    }

}
