package com.bookdepository.pages;

import com.bookdepository.core.BrowserFactory;
import com.bookdepository.core.Elem;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class CheckoutPage {

    Elem subtotalIndicator = new Elem(By.xpath("//div[@class='sidebar right']//strong[contains(text(),'Sub-total')]//parent::dt/following-sibling::dd[@class='text-right']"));
    Elem deliveryCostIndicator = new Elem(By.xpath("//div[@class='sidebar right']//strong[contains(text(),'Delivery')]//parent::dt/following-sibling::dd[@class='text-right']/strong"));
    Elem totalPriceIndicator = new Elem(By.xpath("//div[@class='sidebar right']//dt[@class='total']/following-sibling::dd[@class='text-right total-price']"));


    public String getOrderSubtotal() {
        subtotalIndicator.find();
        return subtotalIndicator.getTextByAttribute("textContent");
    }

    public String getDeliveryCost() {
        deliveryCostIndicator.find();
        return deliveryCostIndicator.getTextByAttribute("textContent");
    }

    public String getTotalPrice() {
        totalPriceIndicator.find();
        return totalPriceIndicator.getTextByAttribute("textContent");
    }
}
