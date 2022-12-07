package Mystepdef;

import classfile.Demo;
import io.cucumber.java.en.Given;

public class stepdef {
    Demo de=new Demo();
    @Given("elements button")
    public void elementsButton()  {
        de.login();
    }

    @Given("text box feature")
    public void textBoxFeature() {
       de.textbox();
    }

    @Given("cart feature")
    public void cartFeature() {
        de.cart();
    }

    @Given("checkout function")
    public void checkoutFunction() throws InterruptedException {
        de.checkout();
    }
}
