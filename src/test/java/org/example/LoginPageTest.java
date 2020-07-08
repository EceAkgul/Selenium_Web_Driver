package org.example;

import org.junit.Test;

public class LoginPageTest extends PageTest{

    @Test
    public void login() { new LoginPage(driver).login("eceakgull8@gmail.com" , "123456ea");}



}
