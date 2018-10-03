public class Test_Animal {
    public static void main(String[] args){
        Dog d = new Dog("Reks",4,50,"black");
        d.getType();
        System.out.println(d.getInfo("black"));
        Cat c = new Cat("Fred",3,15,"white");
        c.getType();
        System.out.println(c.getInfo(4,34));
        Crocodile b= new Crocodile("Kill",7,34,"green");
        b.getType();
        System.out.println(b.getInfo(12));
    }
}
