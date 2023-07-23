package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class API_GetRequest {

//    {
//        "userId": 5,
//            "id": 44,
//            "title": "optio dolor molestias sit",
//            "body": "temporibus est consectetur dolore\net libero debitis vel velit laboriosam quia\nipsum quibusdam qui itaque fuga rem aut\nea et iure quam sed maxime ut distinctio quae"
//    }


@Test
        public void get01(){

    // 1- Request URL ve Body olustur

    String url ="https://jsonplaceholder.typicode.com/posts/44";

    // 2- Expected Data olustur

    JSONObject expBody = new JSONObject();

    expBody.put("userId",5);
    expBody.put("title","optio dolor molestias sit");

    // 3- Responsu kaydet

    Response response = given().when().get(url);

    // response.prettyPrint();

    // 4- Assertion

    response.
            then().
            assertThat().
            statusCode(200).
            contentType(ContentType.JSON);

}
}
