package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.bakulinav.psd.server.model.AccountReference;
import net.bakulinav.psd.server.model.Address;
import net.bakulinav.psd.server.model.Amount;
import net.bakulinav.psd.server.model.TransactionStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON response body consistion of the corresponding SCT INST payment initation JSON body together with an optional transaction status field. 
 */
@ApiModel(description = "JSON response body consistion of the corresponding SCT INST payment initation JSON body together with an optional transaction status field. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class PaymentInitiationSctInstWithStatusResponse   {
  @JsonProperty("endToEndIdentification")
  private String endToEndIdentification;

  @JsonProperty("debtorAccount")
  private AccountReference debtorAccount = null;

  @JsonProperty("instructedAmount")
  private Amount instructedAmount = null;

  @JsonProperty("creditorAccount")
  private AccountReference creditorAccount = null;

  @JsonProperty("creditorAgent")
  private String creditorAgent;

  @JsonProperty("creditorName")
  private String creditorName;

  @JsonProperty("creditorAddress")
  private Address creditorAddress = null;

  @JsonProperty("remittanceInformationUnstructured")
  private String remittanceInformationUnstructured;

  @JsonProperty("transactionStatus")
  private TransactionStatus transactionStatus = null;

  public PaymentInitiationSctInstWithStatusResponse endToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
    return this;
  }

  /**
   * Get endToEndIdentification
   * @return endToEndIdentification
  */
  @ApiModelProperty(value = "")

@Size(max=35) 
  public String getEndToEndIdentification() {
    return endToEndIdentification;
  }

  public void setEndToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
  }

  public PaymentInitiationSctInstWithStatusResponse debtorAccount(AccountReference debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   * @return debtorAccount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AccountReference getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(AccountReference debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public PaymentInitiationSctInstWithStatusResponse instructedAmount(Amount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Amount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(Amount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public PaymentInitiationSctInstWithStatusResponse creditorAccount(AccountReference creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AccountReference getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(AccountReference creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public PaymentInitiationSctInstWithStatusResponse creditorAgent(String creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * BICFI 
   * @return creditorAgent
  */
  @ApiModelProperty(example = "AAAADEBBXXX", value = "BICFI ")

@Pattern(regexp="[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}") 
  public String getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(String creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public PaymentInitiationSctInstWithStatusResponse creditorName(String creditorName) {
    this.creditorName = creditorName;
    return this;
  }

  /**
   * Creditor Name
   * @return creditorName
  */
  @ApiModelProperty(example = "Creditor Name", required = true, value = "Creditor Name")
  @NotNull

@Size(max=70) 
  public String getCreditorName() {
    return creditorName;
  }

  public void setCreditorName(String creditorName) {
    this.creditorName = creditorName;
  }

  public PaymentInitiationSctInstWithStatusResponse creditorAddress(Address creditorAddress) {
    this.creditorAddress = creditorAddress;
    return this;
  }

  /**
   * Get creditorAddress
   * @return creditorAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address getCreditorAddress() {
    return creditorAddress;
  }

  public void setCreditorAddress(Address creditorAddress) {
    this.creditorAddress = creditorAddress;
  }

  public PaymentInitiationSctInstWithStatusResponse remittanceInformationUnstructured(String remittanceInformationUnstructured) {
    this.remittanceInformationUnstructured = remittanceInformationUnstructured;
    return this;
  }

  /**
   * Get remittanceInformationUnstructured
   * @return remittanceInformationUnstructured
  */
  @ApiModelProperty(value = "")

@Size(max=140) 
  public String getRemittanceInformationUnstructured() {
    return remittanceInformationUnstructured;
  }

  public void setRemittanceInformationUnstructured(String remittanceInformationUnstructured) {
    this.remittanceInformationUnstructured = remittanceInformationUnstructured;
  }

  public PaymentInitiationSctInstWithStatusResponse transactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  /**
   * Get transactionStatus
   * @return transactionStatus
  */
  @ApiModelProperty(value = "")

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
    PaymentInitiationSctInstWithStatusResponse paymentInitiationSctInstWithStatusResponse = (PaymentInitiationSctInstWithStatusResponse) o;
    return Objects.equals(this.endToEndIdentification, paymentInitiationSctInstWithStatusResponse.endToEndIdentification) &&
        Objects.equals(this.debtorAccount, paymentInitiationSctInstWithStatusResponse.debtorAccount) &&
        Objects.equals(this.instructedAmount, paymentInitiationSctInstWithStatusResponse.instructedAmount) &&
        Objects.equals(this.creditorAccount, paymentInitiationSctInstWithStatusResponse.creditorAccount) &&
        Objects.equals(this.creditorAgent, paymentInitiationSctInstWithStatusResponse.creditorAgent) &&
        Objects.equals(this.creditorName, paymentInitiationSctInstWithStatusResponse.creditorName) &&
        Objects.equals(this.creditorAddress, paymentInitiationSctInstWithStatusResponse.creditorAddress) &&
        Objects.equals(this.remittanceInformationUnstructured, paymentInitiationSctInstWithStatusResponse.remittanceInformationUnstructured) &&
        Objects.equals(this.transactionStatus, paymentInitiationSctInstWithStatusResponse.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endToEndIdentification, debtorAccount, instructedAmount, creditorAccount, creditorAgent, creditorName, creditorAddress, remittanceInformationUnstructured, transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationSctInstWithStatusResponse {\n");
    
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    creditorAddress: ").append(toIndentedString(creditorAddress)).append("\n");
    sb.append("    remittanceInformationUnstructured: ").append(toIndentedString(remittanceInformationUnstructured)).append("\n");
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

