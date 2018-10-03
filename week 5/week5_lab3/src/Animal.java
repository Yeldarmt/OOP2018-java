public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Animal(){
        name="";
        age = 0;
        weight =0;
        color="";
    }
    public Animal(String n, int a, int w, String c){
        this.name = n;
        this.age = a;
        this.weight = w;
        this.color = c;
    }

    public void getType(){
        System.out.println("Type : Animal");
    }
    public String getInfo(){
       return "Name : "+name + ".Have a ";
    }
}
