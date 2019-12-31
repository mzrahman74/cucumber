package Api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

class Main {

    public static void main(String[] args) {

        // BaseURL  or Host
        RestAssured.baseURI="https://maps.googleapis.com";

        given().
                param("location","-33.8670522,151.1957362").
                param("radius","500").
                param("key","").
                when().
                get("/maps/api/place/nearbysearch/json").
                then().
                assertThat().statusCode(200).and().contentType(ContentType.JSON).
                body("results[0].geometry.name",equalTo ("Sydney")).and().
                body("results[0].place_id",equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM"));


//                header("dds","ffse").
//                cookie("jljlk","ldkjl").
//                body("jlk;","kjlkd")



    }

  }
