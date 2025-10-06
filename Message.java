import java.time.LocalDateTime;

public class Message {
    private String message;
    private LocalDateTime date_envoiement;
    private boolean confidontiel;
    private Utilisateur utilisateur;

    public Message(String message, LocalDateTime date_envoiement, boolean confidontiel, Utilisateur utilisateur) {
        this.message = message;
        this.date_envoiement = date_envoiement;
        this.confidontiel = confidontiel;
        this.utilisateur = utilisateur;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDate_envoiement() {
        return date_envoiement;
    }

    public void setDate_envoiement(LocalDateTime date_envoiement) {
        this.date_envoiement = date_envoiement;
    }

    public boolean isConfidontiel() {
        return confidontiel;
    }

    public void setConfidontiel(boolean confidontiel) {
        this.confidontiel = confidontiel;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
