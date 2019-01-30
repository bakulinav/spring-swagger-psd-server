package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.bakulinav.psd.server.model.MessageCode401AIS;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is a data element to support the declaration of additional errors in the context of [RFC7807].
 */
@ApiModel(description = "This is a data element to support the declaration of additional errors in the context of [RFC7807].")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class Error401AISAdditionalErrors   {
  @JsonProperty("title")
  private String title;

  @JsonProperty("detail")
  private String detail;

  @JsonProperty("code")
  private MessageCode401AIS code = null;

  public Error401AISAdditionalErrors title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Short human readable description of error type.  Could be in local language.  To be provided by ASPSPs. 
   * @return title
  */
  @ApiModelProperty(value = "Short human readable description of error type.  Could be in local language.  To be provided by ASPSPs. ")

@Size(max=70) 
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Error401AISAdditionalErrors detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Detailed human readable text specific to this instance of the error.  XPath might be used to point to the issue generating the error in addition. Remark for Future: In future, a dedicated field might be introduced for the XPath. 
   * @return detail
  */
  @ApiModelProperty(value = "Detailed human readable text specific to this instance of the error.  XPath might be used to point to the issue generating the error in addition. Remark for Future: In future, a dedicated field might be introduced for the XPath. ")

@Size(max=512) 
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public Error401AISAdditionalErrors code(MessageCode401AIS code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public MessageCode401AIS getCode() {
    return code;
  }

  public void setCode(MessageCode401AIS code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error401AISAdditionalErrors error401AISAdditionalErrors = (Error401AISAdditionalErrors) o;
    return Objects.equals(this.title, error401AISAdditionalErrors.title) &&
        Objects.equals(this.detail, error401AISAdditionalErrors.detail) &&
        Objects.equals(this.code, error401AISAdditionalErrors.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, detail, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error401AISAdditionalErrors {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

