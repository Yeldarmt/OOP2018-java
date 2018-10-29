public abstract class Piece {
    public abstract String isLegalMove();
    public int x1,x2,y1,y2;
    public Piece(int x1,int x2,int y1,int y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
}
class King extends Piece{
    public King(int x1, int x2, int y1, int y2) {
        super(x1, x2, y1, y2);
    }

    @Override
    public String isLegalMove() {
        if(Math.abs(x2-x1)<=1 && Math.abs(y2-y1)<=1) {
            return "King can move !";
        }
        else{
            return "King can't move !";
        }
    }
}
class Quin extends Piece{
    public Quin(int x1,int x2,int y1,int y2){
        super(x1,x2,y1,y2);
    }

    @Override
    public String isLegalMove() {
        if(x1==x2 || y1==y2 || Math.abs(x2-x1)==Math.abs(y2-y1)) {
            return "Quin can move !";
        }
        else{
            return "Quin can't move !";
        }
    }
}

class Kon extends Piece{
    public Kon(int x1,int x2,int y1, int y2){
        super(x1,x2,y1,y2);
    }

    @Override
    public String isLegalMove() {
        if(Math.abs(x2-x1)==2 && Math.abs(y2-y1)==1 || Math.abs(y2-y1)==2 && Math.abs(x1-x2)==1){
            return "Con can move";
        }
        else
            return "Con can't move";
    }
}
class Slon extends Piece{
    public Slon(int x1,int x2,int y1, int y2){
        super(x1,x2,y1,y2);
    }

    @Override
    public String isLegalMove() {
        if(Math.abs(x2-x1)==Math.abs(y2-y1)){
            return "Slon can move !";
        }
        else{
            return "Slon can't move !";
        }
    }
}
class Test{
    public static void main(String[] args){
        King k = new King(0, 1,5,3);
        System.out.println(k.isLegalMove());
        Quin q = new Quin(10000,8,10,11);
        System.out.println(q.isLegalMove());
        Slon s = new Slon(1,1,3,3);
        System.out.println(s.isLegalMove());
        Kon p = new Kon(3,4,3,1);
        System.out.println(p.isLegalMove());
    }
}
