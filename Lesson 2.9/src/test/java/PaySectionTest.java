package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.PayPage;

public class PaySectionTest extends BaseTest {

    @Test
    public void checkBlockTitle() {
        PayPage page = new PayPage(driver);

        Assertions.assertTrue(
                page.isTitleDisplayed(),
                "Заголовок не отображается"
        );
    }

    @Test
    public void checkLogos() {
        PayPage page = new PayPage(driver);

        Assertions.assertTrue(
                page.getLogosCount() > 0,
                "Логотипы не найдены"
        );
    }

    @Test
    public void checkMoreLink() {
        PayPage page = new PayPage(driver);

        Assertions.assertTrue(
                page.isMoreLinkDisplayed(),
                "Ссылка Подробнее не отображается"
        );

        page.clickMoreLink();
    }

    @Test
    public void checkFormFill() {
        PayPage page = new PayPage(driver);

        page.enterPhone("297777777");

        Assertions.assertTrue(
                page.isButtonDisplayed(),
                "Кнопка не отображается"
        );
    }
}