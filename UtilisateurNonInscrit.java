public class UtilisateurNonInscrit implements Utilisateur {
    private String id_utilisateur;

    public UtilisateurNonInscrit(String id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(String id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

}
