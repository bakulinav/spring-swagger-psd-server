package net.bakulinav.psd.server.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Message codes defined for PIS for HTTP Error code 409 (CONFLICT).
 */
public enum MessageCode409PIS {
  
  STATUS_INVALID("STATUS_INVALID");

  private String value;

  MessageCode409PIS(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MessageCode409PIS fromValue(String text) {
    for (MessageCode409PIS b : MessageCode409PIS.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

