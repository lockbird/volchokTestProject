import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class testRegistration {
    @Test
    void validRegistrationTest () {
        open("https://volchok.ru/");
        $("#Layer_1").click();
        Configuration.holdBrowserOpen = true;
    }
}
