package org.feuyeux.oas.hello.api;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-07T08:42:09.443Z[GMT]")
public class NotFoundException extends ApiException {

  private int code;

  public NotFoundException(int code, String msg) {
    super(code, msg);
    this.code = code;
  }
}
