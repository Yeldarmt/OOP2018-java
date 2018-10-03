public class Cat extends Animal {
    public String fact="long tail";
    public Cat(){
        super();
        fact = "";
    }
    public Cat(String n, int a, int w, String c) {
        super(n, a, w, c);
    }
    public void getType(){
        System.out.println("Type : cat");
    }
    public String getInfo(int a,int w){
        return super.getInfo()+fact+".AGE : " +a+".Weight : "+w;
    }
}
