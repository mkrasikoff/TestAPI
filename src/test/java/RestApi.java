import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

public class RestApi {

  @Test
  public void getUrl_rightInfoIsGiven_passed() {

    String url = "https://swapi.dev/api/people";
    String path = "/1/";

    given()
        .baseUri(url)
        .basePath(path)
        .contentType(ContentType.JSON)
        .when()
        .get()
        .then()
        .statusCode(200)
        .body("birth_year", equalTo("19BBY"));

  }
}
