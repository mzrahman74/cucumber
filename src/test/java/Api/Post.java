package Api;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
public class Post {

    @Test
        public void PostData (){

        RestAssured.baseURI="http://216.10.245.166";

        given().
        queryParam("key","qaclick123").
        body("{\n" +
                "\t\"location\":{\n" +
                "\t\t\"lat\":-38.383494,\n" +
                "\t\t\"lng\":-33.427362\n" +
                "\t\t},\n" +
                "\t\t\"accuracy\":50,\n" +
                "\t\t\"name\":\"Frontline house\",\n" +
                "\t\t\"phone_number\":\"(91) 983 893 3937\",\n" +
                "\t\t\"address\":\"29, side layout, cohen 09\",\n" +
                "\t\t\"website\": \"http://google.com\",\n" +
                "\t\t\"language\": \"French-IN\"\n" +
                "}").

                when().
                post("/maps/api/place/add/json").
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("status",equalTo("OK"));

        // create a place = response )place id)

    }
}
