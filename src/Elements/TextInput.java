package Elements;
import org.openqa.selenium.By;

public class TextInput extends Element {

    public TextInput(){
    }

    public TextInput(By by){
        this.by = by;
    }

    public void sendKeys(String value) {
        element().clear();
        element().sendKeys(value);
    }

    public void sendKeys(By by, String value) {
        element(by).clear();
        element(by).sendKeys(value);
    }

}