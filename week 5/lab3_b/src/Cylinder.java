public class Cylinder extends Shapes_3D {
    public int radius;
    public int height;

    public Cylinder(int r,int h){
        super();
        this.radius=r;
        this.height=h;
    }
    @Override
    public double Volume(){
        return Math.PI*radius*radius*height;
    }
    @Override
    public double surfaceArea(){
        return Math.PI*radius*radius*2+2*Math.PI*radius*height;
    }
}
