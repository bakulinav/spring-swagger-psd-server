package net.bakulinav.psd.server.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Message codes defined for AIS for HTTP Error code 404 (NOT FOUND).
 */
public enum MessageCode404AIS {
  
  RESOURCE_UNKNOWN("RESOURCE_UNKNOWN");

  private String value;

  MessageCode404AIS(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MessageCode404AIS fromValue(String text) {
    for (MessageCode404AIS b : MessageCode404AIS.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

