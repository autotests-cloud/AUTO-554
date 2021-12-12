package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("There is a brand name on the product page")
    void generatedTest() {
        step("Open https://www.petshop.ru/catalog/dogs/lezaki/domik_uyutnoe_gnezdyshko_s_ushkami_sherst_forma_krug_siniy_l_40x40x20sm_25186/", () -> {
            step("// todo: just add selenium action");
        });

        step("ProductBrand_product_card_brand_link__2s_IJ is visible", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.petshop.ru/catalog/dogs/lezaki/domik_uyutnoe_gnezdyshko_s_ushkami_sherst_forma_krug_siniy_l_40x40x20sm_25186/'", () ->
            open("https://www.petshop.ru/catalog/dogs/lezaki/domik_uyutnoe_gnezdyshko_s_ushkami_sherst_forma_krug_siniy_l_40x40x20sm_25186/"));

        step("Page title should have text 'Zoobaloo домик "Уютное гнездышко" с ушками (шерсть, форма круг, синий) L: 40x40x20см | Petshop.ru'", () -> {
            String expectedTitle = "Zoobaloo домик "Уютное гнездышко" с ушками (шерсть, форма круг, синий) L: 40x40x20см | Petshop.ru";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.petshop.ru/catalog/dogs/lezaki/domik_uyutnoe_gnezdyshko_s_ushkami_sherst_forma_krug_siniy_l_40x40x20sm_25186/'", () ->
            open("https://www.petshop.ru/catalog/dogs/lezaki/domik_uyutnoe_gnezdyshko_s_ushkami_sherst_forma_krug_siniy_l_40x40x20sm_25186/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}