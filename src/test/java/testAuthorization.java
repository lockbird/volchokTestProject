import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class testAuthorization {
    @Test
    void validAuthorizationTest () {
        Configuration.timeout = 5000;
        open("http://concepture.club/");
        $("[class='fa fa-user-o']").click();
        $("[class='fa fa-sign-in']").click();
        $("#frontendauthform-indentity").setValue("lockedbird96@gmail.com");
        $("#frontendauthform-validation").setValue("Cr2bSf9pa9zHhB7");
        $("[name=signup-button]").click();
        $("[class='fa fa-user-o']").click();
        $("[class='fa fa-sign-out fa-fw']").shouldBe(visible);
    }

    @Test
    void invalidAuthorizationTest () {
        Configuration.timeout = 5000;
        open("http://concepture.club/");
        $("[class='fa fa-user-o']").click();
        $("[class='fa fa-sign-in']").click();
        $("#frontendauthform-indentity").setValue("blabla@gmail.com");
        $("#frontendauthform-validation").setValue("qwerty");
        $("[name=signup-button]").click();
        $("#login-form").shouldHave(text("Неправильный логин или пароль."));
    }
}
