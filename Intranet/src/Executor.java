import java.util.Vector;

public class Executor extends Employee{
    private int donedOrders;

    public Executor(String id, Gender gender, String lastname, String firstname, String telNumber, String email, int salary){
        super(id, gender, lastname, firstname, telNumber, email, salary);
        donedOrders = 0;
    }

    public int getDonedOrders() { return donedOrders; }

    public void doOrder(Order donedOrder) {
        if(!donedOrder.getStatus()){
            donedOrder.setStatus(true);
            donedOrders++;
            Database.donedOrders.addElement(donedOrder);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(obj.getClass() != getClass())
            return false;
        Executor other = (Executor) obj;
        return donedOrders == other.donedOrders;
    }

    @Override
    public String toString() {
        return super.toString() + " Doned Orders: " + donedOrders;
    }
}
