package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.bakulinav.psd.server.model.AuthenticationObject;
import net.bakulinav.psd.server.model.ChallengeData;
import net.bakulinav.psd.server.model.LinksPaymentInitiationCancel;
import net.bakulinav.psd.server.model.TransactionStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body of the response for a successful cancel payment request.
 */
@ApiModel(description = "Body of the response for a successful cancel payment request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class PaymentInitiationCancelResponse204202   {
  @JsonProperty("transactionStatus")
  private TransactionStatus transactionStatus = null;

  @JsonProperty("scaMethods")
  @Valid
  private List<AuthenticationObject> scaMethods = null;

  @JsonProperty("chosenScaMethod")
  private AuthenticationObject chosenScaMethod = null;

  @JsonProperty("challengeData")
  private ChallengeData challengeData = null;

  @JsonProperty("_links")
  private LinksPaymentInitiationCancel links = null;

  public PaymentInitiationCancelResponse204202 transactionStatus(TransactionStatus transactionStatus) {
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

  public PaymentInitiationCancelResponse204202 scaMethods(List<AuthenticationObject> scaMethods) {
    this.scaMethods = scaMethods;
    return this;
  }

  public PaymentInitiationCancelResponse204202 addScaMethodsItem(AuthenticationObject scaMethodsItem) {
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

  public PaymentInitiationCancelResponse204202 chosenScaMethod(AuthenticationObject chosenScaMethod) {
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

  public PaymentInitiationCancelResponse204202 challengeData(ChallengeData challengeData) {
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

  public PaymentInitiationCancelResponse204202 links(LinksPaymentInitiationCancel links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")

  @Valid

  public LinksPaymentInitiationCancel getLinks() {
    return links;
  }

  public void setLinks(LinksPaymentInitiationCancel links) {
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
    PaymentInitiationCancelResponse204202 paymentInitiationCancelResponse204202 = (PaymentInitiationCancelResponse204202) o;
    return Objects.equals(this.transactionStatus, paymentInitiationCancelResponse204202.transactionStatus) &&
        Objects.equals(this.scaMethods, paymentInitiationCancelResponse204202.scaMethods) &&
        Objects.equals(this.chosenScaMethod, paymentInitiationCancelResponse204202.chosenScaMethod) &&
        Objects.equals(this.challengeData, paymentInitiationCancelResponse204202.challengeData) &&
        Objects.equals(this.links, paymentInitiationCancelResponse204202.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionStatus, scaMethods, chosenScaMethod, challengeData, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationCancelResponse204202 {\n");
    
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    scaMethods: ").append(toIndentedString(scaMethods)).append("\n");
    sb.append("    chosenScaMethod: ").append(toIndentedString(chosenScaMethod)).append("\n");
    sb.append("    challengeData: ").append(toIndentedString(challengeData)).append("\n");
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

