package Valiables;

public class Data {
    private String login = "sbloshchenko";
    private String password = "Hanumana123";
    private String title = "Вход - Почта Mail.Ru";
    private String baseUrl = "https://mail.ru/";

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
