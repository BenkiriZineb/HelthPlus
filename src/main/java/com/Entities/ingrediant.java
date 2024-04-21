import javax.persistence.*;

@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private double calories;
    private double proteines;
    private double glucides;
    private double lipides;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getProteines() {
        return proteines;
    }

    public void setProteines(double proteines) {
        this.proteines = proteines;
    }

    public double getGlucides() {
        return glucides;
    }

    public void setGlucides(double glucides) {
        this.glucides = glucides;
    }

    public double getLipides() {
        return lipides;
    }

    public void setLipides(double lipides) {
        this.lipides = lipides;
    }
}