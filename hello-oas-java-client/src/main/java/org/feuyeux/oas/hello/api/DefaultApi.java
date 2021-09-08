package org.feuyeux.oas.hello.api;

import retrofit2.Call;
import retrofit2.http.*;

import org.feuyeux.oas.hello.model.Greeting;
import org.feuyeux.oas.hello.model.What;

import java.util.List;

public interface DefaultApi {
  /**
   * 
   * 
   * @param id greeting identification (required)
   * @param what greeting type (required)
   * @return Call&lt;List&lt;Greeting&gt;&gt;
   */
  @GET("greetings/{id}")
  Call<List<Greeting>> sayGreetings(
            @retrofit2.http.Path("id") Long id            ,     @retrofit2.http.Query("what") What what                
  );

}
