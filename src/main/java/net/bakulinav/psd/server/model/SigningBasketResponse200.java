package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.bakulinav.psd.server.model.TransactionStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body of the JSON response for a successful get signing basket request.    * &#39;payments&#39;: payment initiations which shall be authorised through this signing basket.   * &#39;consents&#39;: consent objects which shall be authorised through this signing basket.   * &#39;transactionStatus&#39;: Only the codes RCVD, ACTC, RJCT are used. 
 */
@ApiModel(description = "Body of the JSON response for a successful get signing basket request.    * 'payments': payment initiations which shall be authorised through this signing basket.   * 'consents': consent objects which shall be authorised through this signing basket.   * 'transactionStatus': Only the codes RCVD, ACTC, RJCT are used. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class SigningBasketResponse200   {
  @JsonProperty("payments")
  @Valid
  private List<String> payments = null;

  @JsonProperty("consents")
  @Valid
  private List<String> consents = null;

  @JsonProperty("transactionStatus")
  private TransactionStatus transactionStatus = null;

  public SigningBasketResponse200 payments(List<String> payments) {
    this.payments = payments;
    return this;
  }

  public SigningBasketResponse200 addPaymentsItem(String paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * A list of paymentIds
   * @return payments
  */
  @ApiModelProperty(value = "A list of paymentIds")

@Size(min=1) 
  public List<String> getPayments() {
    return payments;
  }

  public void setPayments(List<String> payments) {
    this.payments = payments;
  }

  public SigningBasketResponse200 consents(List<String> consents) {
    this.consents = consents;
    return this;
  }

  public SigningBasketResponse200 addConsentsItem(String consentsItem) {
    if (this.consents == null) {
      this.consents = new ArrayList<>();
    }
    this.consents.add(consentsItem);
    return this;
  }

  /**
   * A list of consentIds
   * @return consents
  */
  @ApiModelProperty(value = "A list of consentIds")

@Size(min=1) 
  public List<String> getConsents() {
    return consents;
  }

  public void setConsents(List<String> consents) {
    this.consents = consents;
  }

  public SigningBasketResponse200 transactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  /**
   * Get transactionStatus
   * @return transactionStatus
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TransactionStatus getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningBasketResponse200 signingBasketResponse200 = (SigningBasketResponse200) o;
    return Objects.equals(this.payments, signingBasketResponse200.payments) &&
        Objects.equals(this.consents, signingBasketResponse200.consents) &&
        Objects.equals(this.transactionStatus, signingBasketResponse200.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payments, consents, transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningBasketResponse200 {\n");
    
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    consents: ").append(toIndentedString(consents)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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

