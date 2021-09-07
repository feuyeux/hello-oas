package org.feuyeux.oas.hello.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public enum What {
  hello("hello"),
  bye("bye");

  private String value;

  What(String value) {
    this.value = value;
  }
}
