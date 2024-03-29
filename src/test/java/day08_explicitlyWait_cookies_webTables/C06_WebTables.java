package day08_explicitlyWait_cookies_webTables;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C06_WebTables extends TestBase {

    @Test
    public void test01(){

        //  1. “https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");


        //  2. Headers da bulunan basliklari yazdirin
        List<WebElement> headers= driver
                .findElements(By.xpath("//div[@class='rt-th rt-resizable-header -cursor-pointer']"));
        for (WebElement eachone:headers
             ) {
            System.out.println(eachone.getText());
        }


        //  3. 3.sutunun basligini yazdirin
        //  4. Tablodaki tum datalari yazdirin
        //  5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
        //  6. Tablodaki satir sayisini yazdirin
        //  7. Tablodaki sutun sayisini yazdirin
        //  8. Tablodaki 3.kolonu yazdirin
        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        // 10. Bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde
        //     bana datayi yazdirsin
    }
}