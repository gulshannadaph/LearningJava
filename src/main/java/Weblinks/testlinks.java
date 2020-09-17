package Weblinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class testlinks {


  public static void main(String args[]){
      System.setProperty("webdriver.chrome.driver","/Users/gulshannadaph/Downloads/chromedriver");
      WebDriver driver = new ChromeDriver();
      driver.get ("www.google.com");
      List<WebElement> links = driver.findElements(By.tagName("a"));
      for(int i=0; i<links.size(); i++) {

          WebElement element = links.get(i);

          String url=element.getAttribute("href");

          verifyLink(url);  }
  }

    public static void verifyLink(String urlLink) {
        //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
        try {
//Use URL Class - Create object of the URL Class and pass the urlLink as parameter
            URL link = new URL(urlLink);
// Create a connection using URL object (i.e., link)
            HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
//Set the timeout for 2 seconds
            httpConn.setConnectTimeout(2000);
//connect using connect method
            httpConn.connect();
//use getResponseCode() to get the response code.
            if(httpConn.getResponseCode()== 200) {
                System.out.println(urlLink+" - "+httpConn.getResponseMessage());
            }
            if(httpConn.getResponseCode()== 404) {
                System.out.println(urlLink+" - "+httpConn.getResponseMessage());
            }
        }
//getResponseCode method returns = IOException - if an error occurred connecting to the server.
        catch (Exception e) {
//e.printStackTrace();
        }
    }

}
