package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.bakulinav.psd.server.model.Amount;
import net.bakulinav.psd.server.model.AuthenticationObject;
import net.bakulinav.psd.server.model.ChallengeData;
import net.bakulinav.psd.server.model.LinksPaymentInitiation;
import net.bakulinav.psd.server.model.TppMessage2XX;
import net.bakulinav.psd.server.model.TransactionStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body of the response for a successful payment initiation request.
 */
@ApiModel(description = "Body of the response for a successful payment initiation request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class PaymentInitationRequestResponse201   {
  @JsonProperty("transactionStatus")
  private TransactionStatus transactionStatus = null;

  @JsonProperty("paymentId")
  private String paymentId;

  @JsonProperty("transactionFees")
  private Amount transactionFees = null;

  @JsonProperty("transactionFeeIndicator")
  private Boolean transactionFeeIndicator;

  @JsonProperty("scaMethods")
  @Valid
  private List<AuthenticationObject> scaMethods = null;

  @JsonProperty("chosenScaMethod")
  private AuthenticationObject chosenScaMethod = null;

  @JsonProperty("challengeData")
  private ChallengeData challengeData = null;

  @JsonProperty("_links")
  private LinksPaymentInitiation links = null;

  @JsonProperty("psuMessage")
  private String psuMessage;

  @JsonProperty("tppMessages")
  @Valid
  private List<TppMessage2XX> tppMessages = null;

  public PaymentInitationRequestResponse201 transactionStatus(TransactionStatus transactionStatus) {
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

  public PaymentInitationRequestResponse201 paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Resource identification of the generated payment initiation resource.
   * @return paymentId
  */
  @ApiModelProperty(example = "1234-wertiq-983", required = true, value = "Resource identification of the generated payment initiation resource.")
  @NotNull


  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentInitationRequestResponse201 transactionFees(Amount transactionFees) {
    this.transactionFees = transactionFees;
    return this;
  }

  /**
   * Get transactionFees
   * @return transactionFees
  */
  @ApiModelProperty(value = "")

  @Valid

  public Amount getTransactionFees() {
    return transactionFees;
  }

  public void setTransactionFees(Amount transactionFees) {
    this.transactionFees = transactionFees;
  }

  public PaymentInitationRequestResponse201 transactionFeeIndicator(Boolean transactionFeeIndicator) {
    this.transactionFeeIndicator = transactionFeeIndicator;
    return this;
  }

  /**
   * If equals 'true', the transaction will involve specific transaction cost as shown by the ASPSP in their public price list or as agreed between ASPSP and PSU. If equals 'false', the transaction will not involve additional specific transaction costs to the PSU. 
   * @return transactionFeeIndicator
  */
  @ApiModelProperty(value = "If equals 'true', the transaction will involve specific transaction cost as shown by the ASPSP in their public price list or as agreed between ASPSP and PSU. If equals 'false', the transaction will not involve additional specific transaction costs to the PSU. ")


  public Boolean getTransactionFeeIndicator() {
    return transactionFeeIndicator;
  }

  public void setTransactionFeeIndicator(Boolean transactionFeeIndicator) {
    this.transactionFeeIndicator = transactionFeeIndicator;
  }

  public PaymentInitationRequestResponse201 scaMethods(List<AuthenticationObject> scaMethods) {
    this.scaMethods = scaMethods;
    return this;
  }

  public PaymentInitationRequestResponse201 addScaMethodsItem(AuthenticationObject scaMethodsItem) {
    if (this.scaMethods == null) {
      this.scaMethods = new ArrayList<>();
    }
    this.scaMethods.add(scaMethodsItem);
    return this;
  }

  /**
   * This data element might be contained, if SCA is required and if the PSU has a choice between different authentication methods.  Depending on the risk management of the ASPSP this choice might be offered before or after the PSU has been identified with the first relevant factor, or if an access token is transported.  If this data element is contained, then there is also an hyperlink of type 'startAuthorisationWithAuthenticationMethodSelection' contained in the response body.  These methods shall be presented towards the PSU for selection by the TPP. 
   * @return scaMethods
  */
  @ApiModelProperty(value = "This data element might be contained, if SCA is required and if the PSU has a choice between different authentication methods.  Depending on the risk management of the ASPSP this choice might be offered before or after the PSU has been identified with the first relevant factor, or if an access token is transported.  If this data element is contained, then there is also an hyperlink of type 'startAuthorisationWithAuthenticationMethodSelection' contained in the response body.  These methods shall be presented towards the PSU for selection by the TPP. ")

  @Valid

  public List<AuthenticationObject> getScaMethods() {
    return scaMethods;
  }

  public void setScaMethods(List<AuthenticationObject> scaMethods) {
    this.scaMethods = scaMethods;
  }

  public PaymentInitationRequestResponse201 chosenScaMethod(AuthenticationObject chosenScaMethod) {
    this.chosenScaMethod = chosenScaMethod;
    return this;
  }

  /**
   * Get chosenScaMethod
   * @return chosenScaMethod
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuthenticationObject getChosenScaMethod() {
    return chosenScaMethod;
  }

  public void setChosenScaMethod(AuthenticationObject chosenScaMethod) {
    this.chosenScaMethod = chosenScaMethod;
  }

  public PaymentInitationRequestResponse201 challengeData(ChallengeData challengeData) {
    this.challengeData = challengeData;
    return this;
  }

  /**
   * Get challengeData
   * @return challengeData
  */
  @ApiModelProperty(value = "")

  @Valid

  public ChallengeData getChallengeData() {
    return challengeData;
  }

  public void setChallengeData(ChallengeData challengeData) {
    this.challengeData = challengeData;
  }

  public PaymentInitationRequestResponse201 links(LinksPaymentInitiation links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LinksPaymentInitiation getLinks() {
    return links;
  }

  public void setLinks(LinksPaymentInitiation links) {
    this.links = links;
  }

  public PaymentInitationRequestResponse201 psuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
    return this;
  }

  /**
   * Text to be displayed to the PSU
   * @return psuMessage
  */
  @ApiModelProperty(value = "Text to be displayed to the PSU")

@Size(max=512) 
  public String getPsuMessage() {
    return psuMessage;
  }

  public void setPsuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
  }

  public PaymentInitationRequestResponse201 tppMessages(List<TppMessage2XX> tppMessages) {
    this.tppMessages = tppMessages;
    return this;
  }

  public PaymentInitationRequestResponse201 addTppMessagesItem(TppMessage2XX tppMessagesItem) {
    if (this.tppMessages == null) {
      this.tppMessages = new ArrayList<>();
    }
    this.tppMessages.add(tppMessagesItem);
    return this;
  }

  /**
   * Get tppMessages
   * @return tppMessages
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TppMessage2XX> getTppMessages() {
    return tppMessages;
  }

  public void setTppMessages(List<TppMessage2XX> tppMessages) {
    this.tppMessages = tppMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitationRequestResponse201 paymentInitationRequestResponse201 = (PaymentInitationRequestResponse201) o;
    return Objects.equals(this.transactionStatus, paymentInitationRequestResponse201.transactionStatus) &&
        Objects.equals(this.paymentId, paymentInitationRequestResponse201.paymentId) &&
        Objects.equals(this.transactionFees, paymentInitationRequestResponse201.transactionFees) &&
        Objects.equals(this.transactionFeeIndicator, paymentInitationRequestResponse201.transactionFeeIndicator) &&
        Objects.equals(this.scaMethods, paymentInitationRequestResponse201.scaMethods) &&
        Objects.equals(this.chosenScaMethod, paymentInitationRequestResponse201.chosenScaMethod) &&
        Objects.equals(this.challengeData, paymentInitationRequestResponse201.challengeData) &&
        Objects.equals(this.links, paymentInitationRequestResponse201.links) &&
        Objects.equals(this.psuMessage, paymentInitationRequestResponse201.psuMessage) &&
        Objects.equals(this.tppMessages, paymentInitationRequestResponse201.tppMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionStatus, paymentId, transactionFees, transactionFeeIndicator, scaMethods, chosenScaMethod, challengeData, links, psuMessage, tppMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitationRequestResponse201 {\n");
    
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    transactionFees: ").append(toIndentedString(transactionFees)).append("\n");
    sb.append("    transactionFeeIndicator: ").append(toIndentedString(transactionFeeIndicator)).append("\n");
    sb.append("    scaMethods: ").append(toIndentedString(scaMethods)).append("\n");
    sb.append("    chosenScaMethod: ").append(toIndentedString(chosenScaMethod)).append("\n");
    sb.append("    challengeData: ").append(toIndentedString(challengeData)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    psuMessage: ").append(toIndentedString(psuMessage)).append("\n");
    sb.append("    tppMessages: ").append(toIndentedString(tppMessages)).append("\n");
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

