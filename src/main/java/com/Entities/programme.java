import javax.persistence.*;

@Entity
@Table(name = "programme")
public class Programme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long programmeId;
    private String nom;
    private String description;
    private String objectif;
    private double calories;
    @ManyToOne
    @JoinColumn(name = "utilisateur_premium_id")
    private UtilisateurPremium utilisateurPremium;


    public Long getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(Long programmeId) {
        this.programmeId = programmeId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public UtilisateurPremium getUtilisateurPremium() {
        return utilisateurPremium;
    }

    public void setUtilisateurPremium(UtilisateurPremium utilisateurPremium) {
        this.utilisateurPremium = utilisateurPremium;
    }
}