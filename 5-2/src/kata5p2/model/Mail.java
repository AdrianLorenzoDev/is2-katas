package kata5p2.model;

public class Mail {
    private final String mail;

    public Mail(String mail){
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public String getDomain(){
        return this.mail.substring(mail.indexOf("@")+1);
    }
}
