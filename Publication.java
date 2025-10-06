import java.util.List;

public class Publication {
    private int id_publication;
    private Utilisateur utilisateur;
    private List<Message> messages;

    public Publication(int id_publication, Utilisateur utilisateur, List<Message> messages) {
        this.id_publication = id_publication;
        this.utilisateur = utilisateur;
        this.messages = messages;
    }

    public int getId_publication() {
        return id_publication;
    }

    public void setId_publication(int id_publication) {
        this.id_publication = id_publication;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void afficherAuteur(){

            if (getUtilisateur().getClass() == UtilisateurInscrit.class ) {
                System.out.println(utilisateur.toString());
            } else if (getUtilisateur().getClass() == UtilisateurNonInscrit.class ) {
                System.out.println(utilisateur.toString());
            }

    }
}
