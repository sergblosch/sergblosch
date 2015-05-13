package Elements;
import org.openqa.selenium.By;

public class Button extends Element {

    public Button(){
    }

    public Button(By by){
        this.by = by;
    }

    public void click() {
        element().click();
    }

    public void click(By by) {
        element(by).click();
    }
}