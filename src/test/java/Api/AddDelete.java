package Api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import files.resources;
import files.payLoad;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AddDelete{
    Properties prop = new Properties();
    @BeforeTest
    public void getData()throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Automation\\cucumber2\\src\\test\\java\\files\\env.properties");
        prop.load(fis);
        prop.get("HOST");

    }

    @Test
    public void PostData (){


        RestAssured.baseURI= prop.getProperty("HOST");

       Response res=given().
                queryParam("KEY", prop.getProperty("KEY")).
                body(payLoad.getPostData()).
                when().
                post(resources.placePostData()).
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("status",equalTo("OK")).
                extract().response();

            String responseString=res.asString();
        System.out.println(responseString);
        JsonPath js= new JsonPath(responseString);
        String placeid=js.get("place_id");
        System.out.println(placeid);


        // Task 1-Grab the response

        // create a place = response )place id)

        // Task 3 place this place id in the Delete request
        given().queryParam("KEY", prop.getProperty("KEY")).
        body("{\"place_id\" : \"" +placeid+"\"}").
                when().
                post(resources.placeDelete()).
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("status",equalTo("OK"));


    }
}
