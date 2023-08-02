package org.example.Base;
import org.example.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Base_page {

    public Base_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='btn col-md-12 btn-outline-secondary W1 ellipsis generate_qrcode ']")
    public WebElement downloadQR;

}
