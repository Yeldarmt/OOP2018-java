public class Crocodile extends Animal{

    private String fact = "long body";
    public Crocodile(){
        super();
    }
    public Crocodile(String n, int a, int w, String c) {
        super(n, a, w, c);
    }
    public void getType(){
        System.out.println("Type : crocodile");
    }

    public String getInfo(int age){
        return super.getInfo()+ fact+".Age : " + age;
    }
}
