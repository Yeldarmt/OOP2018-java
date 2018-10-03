public class Cube extends Shapes_3D {
    public int a;

    public Cube(int a){
        this.a = a;
    }
    @Override
    public double Volume(){
        return a*a*a;
    }
    @Override
    public double surfaceArea(){
        return 6*a*a;
    }
}
