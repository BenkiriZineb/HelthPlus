import javax.persistence.*;

@Entity
@Table(name = "repas")
public class Repas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String heures;
    @ManyToOne
    @JoinColumn(name = "programme_id")
    private Programme programme;
    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;



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

    public String getHeures() {
        return heures;
    }

    public void setHeures(String heures) {
        this.heures = heures;
    }

    public Programme getProgramme() {
        return programme;
    }

    public void setProgramme(Programme programme) {
        this.programme = programme;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public double calculeCalories() {
        return ingredient.getCalories();
    }

    public double[] calculeMacros() {
        double[] macros = new double[3];
        macros[0] = ingredient.getProteines();
        macros[1] = ingredient.getGlucides();
        macros[2] = ingredient.getLipides();
        return macros;
    }
}