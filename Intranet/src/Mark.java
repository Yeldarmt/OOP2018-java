import java.util.Date;
import java.util.Map;

public class Mark {
    private double point;
    private Date date;

    public Mark(double point, Date date){
        this.point = point;
        this.date = date;
    }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public double getPoint() { return point; }
    public void setPoint(double point) { this.point = point; }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(obj.getClass() != getClass())
            return false;
        Mark other = (Mark) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        return point == other.point;
    }

    @Override
    public String toString() {
        return point + " " + date;
    }
}
