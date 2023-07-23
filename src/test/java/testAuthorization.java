import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class testAuthorization {
    @Test
    void validAuthorizationTest () {
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000;
        open("http://concepture.club/");
        $("[class='fa fa-user-o']").click();
        $("[class='fa fa-sign-in']").click();
    }
}
