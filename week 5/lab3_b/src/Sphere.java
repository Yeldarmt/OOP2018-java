public class Sphere extends Shapes_3D {
    public int radius;

    public Sphere(int r){
        this.radius=r;
    }
    @Override
    public double Volume(){
        return 4*Math.PI*radius*radius*radius/3;
    }
    @Override
    public double surfaceArea(){
        return 6*Math.PI*radius;
    }
}
