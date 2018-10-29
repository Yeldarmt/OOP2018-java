package Task1Package;

public class Sequence {
    private String field;
    public Sequence(String f){
        field = f;
    }
    public void setField(String ff){
        field = ff;
    }

    Boolean isPolindrom(){
        String t = field;//fadaf
        int n = t.length();
        int k =0;
        for(int i=0;i<t.length()/2;i++){
            n--;
            if(t.charAt(i)==t.charAt(n)){
                k++;
            }
        }
        if(k==t.length()/2) {
            return true;
        }
        else{
            return false;
        }
    }
    Boolean isSubString(Sequence s){
        String h = s.field;
        String p=field;
        int cnt =0;
        for(int i=0;i<p.length()-1;i++){
            if(p.charAt(i)==h.charAt(0)){
                cnt=1;
                for(int j =1;j<h.length();j++){
                    i++;
                    if(p.charAt(i)==h.charAt(j)){
                        cnt++;
                    }
                }
            }
        }
        if(cnt==h.length()){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){
        Sequence seq = new Sequence("abssba");
        System.out.println(seq.isPolindrom());
        seq.setField("abbfa");
        System.out.println(seq.isPolindrom());
        Sequence se = new Sequence("ab");
        System.out.println(seq.isSubString(se));

    }

}
