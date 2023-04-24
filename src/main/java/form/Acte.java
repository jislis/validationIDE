package form;
import java.util.Date;

public class Acte {
    private Date date;
    private String nom;
    private String IDE;


    public Acte(Date date, String nom, String UID) {
        this.date = date;
        this.nom = nom;
        this.IDE = UID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }
}
