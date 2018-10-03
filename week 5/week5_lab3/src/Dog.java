public class Dog extends Animal {
    private String fact=" long tongue";
    public Dog(){
        super();
         fact= "";
    }
    public Dog(String n, int a, int w, String c) {
        super(n, a, w, c);

    }
    public void getType(){
        System.out.println("Type : dog");
    }
    public String getInfo(String c){
        return super.getInfo()+fact+".Color : " + c;
    }
}
