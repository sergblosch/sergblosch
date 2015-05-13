package Valiables;

public enum DataEnum {
    LOGIN("sergtesting"),
    PASSWORD("qwerty_1"),
    BASEURL("https://yandex.ua/"),
    TITLE_MAIL_RU("Вход - Почта Mail.Ru"),
    LOGIN_GMAIL("sergtesting"),
    PASSWORD_GMAIL("qwerty_1"),
    BASEURL_GMAIL("https://gmail.com/"),
    TITLE_GMAIL("Вход - Почта Mail.Ru");

    private String value;

    DataEnum(String v){
        value = v;
    }

    public String getValue(){
        return value;
    }
}
