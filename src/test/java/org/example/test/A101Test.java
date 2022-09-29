package org.example.test;

import org.example.driver.BaseTest;
import org.example.page.A101Page;
import org.junit.Test;

public class A101Test extends BaseTest {
    @Test
    public void A101Test(){
        A101Page a101Page = new A101Page();
        a101Page.a101();
    }


}
