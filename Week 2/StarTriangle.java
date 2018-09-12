public class StarTriangle {
    public int width;

    public StarTriangle(int width){
        this.width = width;
    }
    public StarTriangle(){
        width = 5;
    }
    public int getWidth(){
        return width;
    }
    public String toString(){
        String s = "";
        for(int i =1;i<=getWidth();i++){
            for(int j=0;j<i;j++){
                s=s+"[*]";
            }
            s=s+"\n";
        }
        return s;
    }

    public static void main(String args[]){
        StarTriangle small = new StarTriangle(3);
        StarTriangle small2 = new StarTriangle();
        System.out.println("Triangle1:");
        System.out.println(small.toString());
        System.out.println("Triangle2:");
        System.out.println(small2.toString());
    }
}
