package Task2Package;

public class Visit {
    public Customer customer;
    public String date;
    public double serviceExpense;
    public double productExpense;

    public Visit(String n ,String date){
        customer.name = n;
        this.date = date;
    }
    public String getName(){
        return customer.name;
    }
    public double getServiceExpense(){
        return  getServiceExpense();
    }
    public void setServiceExpense(double s){
        serviceExpense=s;
    }
    public double getProductExpnce(){
        return getProductExpnce();
    }
    public void setProductExpnce(double p){
        productExpense =p;
    }
    public double getTotalExpense(){
        return getServiceExpense()+getProductExpnce();
    }
    public String toString(){
        return "Serviceex"+serviceExpense;
    }
}
