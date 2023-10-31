public class Utente {
    String username="Scasti521";
    private String password="1234";
    boolean utente=true;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void registrati(String username, String password, boolean tipo){
        this.username=username;
        this.password=password;
        utente=tipo;
    }

    
}
