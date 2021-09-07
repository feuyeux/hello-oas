package org.feuyeux.oas.hello.api;

import java.io.IOException;
import java.util.List;
import org.feuyeux.oas.hello.ApiClient;
import org.feuyeux.oas.hello.model.Greeting;
import org.feuyeux.oas.hello.model.What;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

  private DefaultApi api;

  @Before
  public void setup() {
    api = new ApiClient().createService(DefaultApi.class);
  }


  /**
   *
   */
  @Test
  public void sayGreetingsTest() throws IOException {
    Long id = 1L;
    What what = What.HELLO;
    Call<List<Greeting>> sayGreetings = api.sayGreetings(id, what);
    Response<List<Greeting>> listResponse = sayGreetings.execute();
    List<Greeting> body = listResponse.body();
    System.out.println(body);
  }
}
