import javax.persistence.*;

@Entity
@Table(name = "service_payant")
public class ServicePayant extends Service {
    private double cout;


    public double getCout() {
        return cout;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }
}