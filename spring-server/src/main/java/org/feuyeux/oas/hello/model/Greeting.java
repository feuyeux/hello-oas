package org.feuyeux.oas.hello.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import java.util.UUID;

/**
 * Greeting
 */

public class Greeting {

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("yours")
  private String yours = null;

  @JsonProperty("mine")
  private String mine = null;

  @JsonProperty("value")
  private Saying value = null;

  public Greeting id(UUID id) {
    this.id = id;
    return this;
  }

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
   * Convert the given object to string with each line indented by 4 spaces (except the first
   * line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
