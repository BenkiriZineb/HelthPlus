import javax.persistence.*;

@Entity
@Table(name = "utilisateur_premium")
public class UtilisateurPremium extends Utilisateur {
    @Enumerated(EnumType.STRING)
    private Pack pack;



    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }
}