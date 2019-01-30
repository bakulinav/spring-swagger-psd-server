package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON Body of a establish signing basket request. The body shall contain at least one entry. 
 */
@ApiModel(description = "JSON Body of a establish signing basket request. The body shall contain at least one entry. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class SigningBasket   {
  @JsonProperty("paymentIds")
  @Valid
  private List<String> paymentIds = null;

  @JsonProperty("consentIds")
  @Valid
  private List<String> consentIds = null;

  public SigningBasket paymentIds(List<String> paymentIds) {
    this.paymentIds = paymentIds;
    return this;
  }

  public SigningBasket addPaymentIdsItem(String paymentIdsItem) {
    if (this.paymentIds == null) {
      this.paymentIds = new ArrayList<>();
    }
    this.paymentIds.add(paymentIdsItem);
    return this;
  }

  /**
   * A list of paymentIds
   * @return paymentIds
  */
  @ApiModelProperty(value = "A list of paymentIds")

@Size(min=1) 
  public List<String> getPaymentIds() {
    return paymentIds;
  }

  public void setPaymentIds(List<String> paymentIds) {
    this.paymentIds = paymentIds;
  }

  public SigningBasket consentIds(List<String> consentIds) {
    this.consentIds = consentIds;
    return this;
  }

  public SigningBasket addConsentIdsItem(String consentIdsItem) {
    if (this.consentIds == null) {
      this.consentIds = new ArrayList<>();
    }
    this.consentIds.add(consentIdsItem);
    return this;
  }

  /**
   * A list of consentIds
   * @return consentIds
  */
  @ApiModelProperty(value = "A list of consentIds")

@Size(min=1) 
  public List<String> getConsentIds() {
    return consentIds;
  }

  public void setConsentIds(List<String> consentIds) {
    this.consentIds = consentIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningBasket signingBasket = (SigningBasket) o;
    return Objects.equals(this.paymentIds, signingBasket.paymentIds) &&
        Objects.equals(this.consentIds, signingBasket.consentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentIds, consentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningBasket {\n");
    
    sb.append("    paymentIds: ").append(toIndentedString(paymentIds)).append("\n");
    sb.append("    consentIds: ").append(toIndentedString(consentIds)).append("\n");
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

