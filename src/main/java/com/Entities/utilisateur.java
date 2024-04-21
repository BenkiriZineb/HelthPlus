import javax.persistence.*;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long utilisateurId;
    private String nom;
    private float poids;
    private float taille;
    private int age;
    private String sexe;
    private String email;
    private String motDePasse;



    public Long getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(Long utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public float getTaille() {
        return taille;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public float calculerBMI() {
        return poids / (taille * taille);
    }

    public float calculerBMR() {
        if (sexe.equalsIgnoreCase("homme")) {
            return 66 + (13.75f * poids) + (5 * (taille * 100)) - (6.75f * age);
        } else {
            return 655 + (9.563f * poids) + (1.850f * (taille * 100)) - (4.676f * age);
        }
    }
}