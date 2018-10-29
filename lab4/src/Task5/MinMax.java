package Task5;

public class MinMax {
    static class Inner{
        public void my_method(){
            System.out.println("This is inner class");
        }
    }
     static int[] minmax(int[] values){
        int min = values[0];
        int max = values[0];
        for(int i =1 ;i< values.length;i++){
            max = Math.max(max,values[i]);
            min=Math.min(min,values[i]);
        }
        return new int[] {max,min};
     }
}
class Test{
    static int a[] = {0,8,-3,20,12,43,-6,17,4};
    public static void main(String[] args){
        MinMax m = new MinMax();
        int result[] = m.minmax(a);
        System.out.println("Maximum : "+result[0]+"\nMinimum : "+result[1] );
        MinMax.Inner inner = new MinMax.Inner();
        inner.my_method();
    }
}
