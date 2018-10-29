package Task2Package;

public class Customer {
    public String name;
    public Boolean member=false;
    public String memberType;
    public Customer(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public Boolean isMember(){
        return member;
    }
    public void setMember(Boolean m){
        member = m;
    }
    public String getMemberType(){
        return memberType;
    }
    public void setMemberType(String mt){
        memberType=mt;
    }
    public String toString(){
        return "Name : " + name+"Membertype " + memberType;
    }
}
