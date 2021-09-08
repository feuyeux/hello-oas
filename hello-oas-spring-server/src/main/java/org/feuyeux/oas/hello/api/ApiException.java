package org.feuyeux.oas.hello.api;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-07T08:42:09.443Z[GMT]")
public class ApiException extends Exception {

  private int code;

  public ApiException(int code, String msg) {
    super(msg);
    this.code = code;
  }
}
