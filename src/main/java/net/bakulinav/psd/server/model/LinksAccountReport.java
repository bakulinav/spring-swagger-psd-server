package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LinksAccountReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class LinksAccountReport extends HashMap<String, String>  {
  @JsonProperty("account")
  private String account;

  @JsonProperty("first")
  private String first;

  @JsonProperty("next")
  private String next;

  @JsonProperty("previous")
  private String previous;

  @JsonProperty("last")
  private String last;

  public LinksAccountReport account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Link to a resource
   * @return account
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", required = true, value = "Link to a resource")
  @NotNull


  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public LinksAccountReport first(String first) {
    this.first = first;
    return this;
  }

  /**
   * Link to a resource
   * @return first
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public LinksAccountReport next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Link to a resource
   * @return next
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public LinksAccountReport previous(String previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Link to a resource
   * @return previous
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public LinksAccountReport last(String last) {
    this.last = last;
    return this;
  }

  /**
   * Link to a resource
   * @return last
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksAccountReport linksAccountReport = (LinksAccountReport) o;
    return Objects.equals(this.account, linksAccountReport.account) &&
        Objects.equals(this.first, linksAccountReport.first) &&
        Objects.equals(this.next, linksAccountReport.next) &&
        Objects.equals(this.previous, linksAccountReport.previous) &&
        Objects.equals(this.last, linksAccountReport.last) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, first, next, previous, last, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksAccountReport {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

