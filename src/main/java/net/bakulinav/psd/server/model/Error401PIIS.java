package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.bakulinav.psd.server.model.Error401PIISAdditionalErrors;
import net.bakulinav.psd.server.model.LinksAll;
import net.bakulinav.psd.server.model.MessageCode401PIS;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Standardised definition of reporting error information according to [RFC7807]  in case of a HTTP error code 401 for PIIS. 
 */
@ApiModel(description = "Standardised definition of reporting error information according to [RFC7807]  in case of a HTTP error code 401 for PIIS. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class Error401PIIS   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("title")
  private String title;

  @JsonProperty("detail")
  private String detail;

  @JsonProperty("code")
  private MessageCode401PIS code = null;

  @JsonProperty("additionalErrors")
  @Valid
  private List<Error401PIISAdditionalErrors> additionalErrors = null;

  @JsonProperty("_links")
  private LinksAll links = null;

  public Error401PIIS type(String type) {
    this.type = type;
    return this;
  }

  /**
   * A URI reference [RFC3986] that identifies the problem type.  Remark For Future: These URI will be provided by NextGenPSD2 in future. 
   * @return type
  */
  @ApiModelProperty(required = true, value = "A URI reference [RFC3986] that identifies the problem type.  Remark For Future: These URI will be provided by NextGenPSD2 in future. ")
  @NotNull

@Size(max=70) 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Error401PIIS title(String title) {
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

  public Error401PIIS detail(String detail) {
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

  public Error401PIIS code(MessageCode401PIS code) {
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

  public MessageCode401PIS getCode() {
    return code;
  }

  public void setCode(MessageCode401PIS code) {
    this.code = code;
  }

  public Error401PIIS additionalErrors(List<Error401PIISAdditionalErrors> additionalErrors) {
    this.additionalErrors = additionalErrors;
    return this;
  }

  public Error401PIIS addAdditionalErrorsItem(Error401PIISAdditionalErrors additionalErrorsItem) {
    if (this.additionalErrors == null) {
      this.additionalErrors = new ArrayList<>();
    }
    this.additionalErrors.add(additionalErrorsItem);
    return this;
  }

  /**
   * Array of Error Information Blocks.  Might be used if more than one error is to be communicated 
   * @return additionalErrors
  */
  @ApiModelProperty(value = "Array of Error Information Blocks.  Might be used if more than one error is to be communicated ")

  @Valid

  public List<Error401PIISAdditionalErrors> getAdditionalErrors() {
    return additionalErrors;
  }

  public void setAdditionalErrors(List<Error401PIISAdditionalErrors> additionalErrors) {
    this.additionalErrors = additionalErrors;
  }

  public Error401PIIS links(LinksAll links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")

  @Valid

  public LinksAll getLinks() {
    return links;
  }

  public void setLinks(LinksAll links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error401PIIS error401PIIS = (Error401PIIS) o;
    return Objects.equals(this.type, error401PIIS.type) &&
        Objects.equals(this.title, error401PIIS.title) &&
        Objects.equals(this.detail, error401PIIS.detail) &&
        Objects.equals(this.code, error401PIIS.code) &&
        Objects.equals(this.additionalErrors, error401PIIS.additionalErrors) &&
        Objects.equals(this.links, error401PIIS.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, detail, code, additionalErrors, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error401PIIS {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    additionalErrors: ").append(toIndentedString(additionalErrors)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

