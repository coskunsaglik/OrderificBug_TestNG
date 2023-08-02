package org.example.tests;

import org.example.Base.Base_page;
import org.example.Base.TestBase;
import org.example.utility.BrowserUtility;
import org.example.utility.ConfigurationReader;
import org.example.utility.Driver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class test1 extends TestBase{

   @Test
   public void downloadButton (){
      Base_page basePage = new Base_page();

/*
After clicking the "Download QR" button, it becomes inactive.
To restore the button, the button must remain active.
The button should be rearranged as "collapse-expansion".
 */

      Driver.getDriver().get(ConfigurationReader.getProperty("URL"));

      //Before click the Download QR
      BrowserUtility.sleep(3);
      basePage.downloadQR.click();
      BrowserUtility.sleep(3);

      //After click the Download QR
      assertFalse(basePage.downloadQR.isEnabled());
      BrowserUtility.sleep(3);

   }


}
