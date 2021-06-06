package regression;

import com.bookdepository.core.BrowserFactory;
import com.bookdepository.pages.*;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BrowserFactory {

    private final String bookTitle = "Harry Potter and the Cursed Child - Parts I & II";
    private final String searchTerm = "Potter";
    private final String orderTotal = "17,18 €";
    private String deliveryCost = "FREE";

    HomePage homePage = new HomePage();
    SearchResultPage searchResultPage = new SearchResultPage();
    BookPage bookPage = new BookPage();
    BasketPage basketPage = new BasketPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    SoftAssertions softAssert = new SoftAssertions();

    @Test
    public void addBookToBasket() {
        homePage.open();
        homePage.search(searchTerm);
        searchResultPage.selectBook(bookTitle);
        bookPage.addBookToBasket();
        softAssert.assertThat(bookPage.getOrderTotal()).isEqualTo(orderTotal);
        basketPage.checkout();
        softAssert.assertThat(checkoutPage.getOrderSubtotal()).isEqualTo(orderTotal);
        softAssert.assertThat(checkoutPage.getDeliveryCost()).isEqualTo(deliveryCost);
        Assertions.assertEquals(orderTotal, checkoutPage.getTotalPrice(), "Total price is wrong");
    }
}
