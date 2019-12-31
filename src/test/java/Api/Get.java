package Api;

import files.resources;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Get {
    Properties prop = new Properties();

    @BeforeTest
    public void getData()throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Automation\\cucumber2\\src\\test\\java\\files\\env.properties");
        prop.load(fis);
        prop.get("HOST1");

    }

    @Test
    public void Test1(){

        // BaseURL  or Host
        RestAssured.baseURI=prop.getProperty("HOST1");

        given().
                param("location","-33.8670522,151.1957362").
                param("radius","500").
                param("KEY1", prop.getProperty("KEY")).
                when().
                get(resources.PlacePostData1()).
                then().
                assertThat().statusCode(200).and().contentType(ContentType.JSON).
                body("results[0].geometry.name",equalTo ("Sydney")).and().
                body("results[0].place_id",equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).and().
                header("Server", "pablo");


    }
}
