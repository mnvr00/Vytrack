package com.vytruck.tests;

import com.vytruck.pages.Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VytruckTest extends TestBase {

    @Test
    public void TestCase1(){
        Page page = new Page();
        Assert.assertTrue(page.options.isDisplayed() ,"verify that options is displayed");
    }

    @Test
    public void TestCase2(){
        Page page = new Page();
        Assert.assertEquals(page.page1.getAttribute("value"),"1");
    }

    @Test
    public  void TestCase3(){
        Page page = new Page();
        Assert.assertEquals(page.twentyfive.getAttribute("data-size"),"25","Verify that view per page number is equals to\"25\"");
    }

    @Test
    public void TestCase4(){

    }

    @Test
    public void TestCase5(){

    }

    @Test
    public void TestCase6(){

    }
}
