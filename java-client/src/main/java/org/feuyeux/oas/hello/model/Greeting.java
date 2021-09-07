/*
 * Hello-OAS API
 * This is a simple hello-oas API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: feuyeux@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.feuyeux.oas.hello.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
/**
 * Greeting
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-07T09:05:05.121Z[GMT]")
public class Greeting {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("yours")
  private String yours = null;

  @SerializedName("mine")
  private String mine = null;

  @SerializedName("value")
  private Saying value = null;

  public Greeting id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Greeting yours(String yours) {
    this.yours = yours;
    return this;
  }

   /**
   * Get yours
   * @return yours
  **/
  @Schema(example = "java", required = true, description = "")
  public String getYours() {
    return yours;
  }

  public void setYours(String yours) {
    this.yours = yours;
  }

  public Greeting mine(String mine) {
    this.mine = mine;
    return this;
  }

   /**
   * Get mine
   * @return mine
  **/
  @Schema(example = "go", required = true, description = "")
  public String getMine() {
    return mine;
  }

  public void setMine(String mine) {
    this.mine = mine;
  }

  public Greeting value(Saying value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(required = true, description = "")
  public Saying getValue() {
    return value;
  }

  public void setValue(Saying value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Greeting greeting = (Greeting) o;
    return Objects.equals(this.id, greeting.id) &&
        Objects.equals(this.yours, greeting.yours) &&
        Objects.equals(this.mine, greeting.mine) &&
        Objects.equals(this.value, greeting.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, yours, mine, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Greeting {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    yours: ").append(toIndentedString(yours)).append("\n");
    sb.append("    mine: ").append(toIndentedString(mine)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
