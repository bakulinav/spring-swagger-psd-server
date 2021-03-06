package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the  response depend on the dynamical decisions of the ASPSP when processing the request.  Remark: All links can be relative or full links, to be decided by the ASPSP. Type of links admitted in this response, (further links might be added for ASPSP defined  extensions):    * &#39;scaRedirect&#39;:      In case of an SCA Redirect Approach, the ASPSP is transmitting the link to      which to redirect the PSU browser.   * &#39;scaOAuth&#39;:      In case of a SCA OAuth2 Approach, the ASPSP is transmitting the URI where the configuration of      the Authorisation Server can be retrieved. The configuration follows the      OAuth 2.0 Authorisation Server Metadata specification.   * &#39;startAuthorisation&#39;:      In case, where an explicit start of the transaction authorisation is needed,      but no more data needs to be updated (no authentication method to be selected,      no PSU identification nor PSU authentication data to be uploaded).   * &#39;startAuthorisationWithPsuIdentification&#39;:      The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while uploading the PSU identification data.   * &#39;startAuthorisationWithPsuAuthentication&#39;:     The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while uploading the PSU authentication data.   * &#39;startAuthorisationWithEncryptedPsuAuthentication&#39;:     The link to the authorisation end-point, where the authorisation sub-resource has      to be generated while uploading the encrypted PSU authentication data.   * &#39;startAuthorisationWithAuthenticationMethodSelection&#39;:     The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while selecting the authentication method.      This link is contained under exactly the same conditions as the data element &#39;scaMethods&#39;    * &#39;startAuthorisationWithTransactionAuthorisation&#39;:     The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while authorising the transaction e.g. by uploading an      OTP received by SMS.   * &#39;self&#39;:      The link to the payment initiation resource created by this request.      This link can be used to retrieve the resource data.    * &#39;status&#39;:      The link to retrieve the transaction status of the payment initiation.   * &#39;scaStatus&#39;:      The link to retrieve the scaStatus of the corresponding authorisation sub-resource.      This link is only contained, if an authorisation sub-resource has been already created. 
 */
@ApiModel(description = "A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the  response depend on the dynamical decisions of the ASPSP when processing the request.  Remark: All links can be relative or full links, to be decided by the ASPSP. Type of links admitted in this response, (further links might be added for ASPSP defined  extensions):    * 'scaRedirect':      In case of an SCA Redirect Approach, the ASPSP is transmitting the link to      which to redirect the PSU browser.   * 'scaOAuth':      In case of a SCA OAuth2 Approach, the ASPSP is transmitting the URI where the configuration of      the Authorisation Server can be retrieved. The configuration follows the      OAuth 2.0 Authorisation Server Metadata specification.   * 'startAuthorisation':      In case, where an explicit start of the transaction authorisation is needed,      but no more data needs to be updated (no authentication method to be selected,      no PSU identification nor PSU authentication data to be uploaded).   * 'startAuthorisationWithPsuIdentification':      The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while uploading the PSU identification data.   * 'startAuthorisationWithPsuAuthentication':     The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while uploading the PSU authentication data.   * 'startAuthorisationWithEncryptedPsuAuthentication':     The link to the authorisation end-point, where the authorisation sub-resource has      to be generated while uploading the encrypted PSU authentication data.   * 'startAuthorisationWithAuthenticationMethodSelection':     The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while selecting the authentication method.      This link is contained under exactly the same conditions as the data element 'scaMethods'    * 'startAuthorisationWithTransactionAuthorisation':     The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while authorising the transaction e.g. by uploading an      OTP received by SMS.   * 'self':      The link to the payment initiation resource created by this request.      This link can be used to retrieve the resource data.    * 'status':      The link to retrieve the transaction status of the payment initiation.   * 'scaStatus':      The link to retrieve the scaStatus of the corresponding authorisation sub-resource.      This link is only contained, if an authorisation sub-resource has been already created. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class LinksSigningBasket   {
  @JsonProperty("scaRedirect")
  private String scaRedirect;

  @JsonProperty("scaOAuth")
  private String scaOAuth;

  @JsonProperty("startAuthorisation")
  private String startAuthorisation;

  @JsonProperty("startAuthorisationWithPsuIdentification")
  private String startAuthorisationWithPsuIdentification;

  @JsonProperty("startAuthorisationWithPsuAuthentication")
  private String startAuthorisationWithPsuAuthentication;

  @JsonProperty("startAuthorisationWithEncryptedPsuAuthentication")
  private String startAuthorisationWithEncryptedPsuAuthentication;

  @JsonProperty("startAuthorisationWithAuthenticationMethodSelection")
  private String startAuthorisationWithAuthenticationMethodSelection;

  @JsonProperty("startAuthorisationWithTransactionAuthorisation")
  private String startAuthorisationWithTransactionAuthorisation;

  @JsonProperty("self")
  private String self;

  @JsonProperty("status")
  private String status;

  @JsonProperty("scaStatus")
  private String scaStatus;

  public LinksSigningBasket scaRedirect(String scaRedirect) {
    this.scaRedirect = scaRedirect;
    return this;
  }

  /**
   * Link to a resource
   * @return scaRedirect
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getScaRedirect() {
    return scaRedirect;
  }

  public void setScaRedirect(String scaRedirect) {
    this.scaRedirect = scaRedirect;
  }

  public LinksSigningBasket scaOAuth(String scaOAuth) {
    this.scaOAuth = scaOAuth;
    return this;
  }

  /**
   * Link to a resource
   * @return scaOAuth
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getScaOAuth() {
    return scaOAuth;
  }

  public void setScaOAuth(String scaOAuth) {
    this.scaOAuth = scaOAuth;
  }

  public LinksSigningBasket startAuthorisation(String startAuthorisation) {
    this.startAuthorisation = startAuthorisation;
    return this;
  }

  /**
   * Link to a resource
   * @return startAuthorisation
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getStartAuthorisation() {
    return startAuthorisation;
  }

  public void setStartAuthorisation(String startAuthorisation) {
    this.startAuthorisation = startAuthorisation;
  }

  public LinksSigningBasket startAuthorisationWithPsuIdentification(String startAuthorisationWithPsuIdentification) {
    this.startAuthorisationWithPsuIdentification = startAuthorisationWithPsuIdentification;
    return this;
  }

  /**
   * Link to a resource
   * @return startAuthorisationWithPsuIdentification
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getStartAuthorisationWithPsuIdentification() {
    return startAuthorisationWithPsuIdentification;
  }

  public void setStartAuthorisationWithPsuIdentification(String startAuthorisationWithPsuIdentification) {
    this.startAuthorisationWithPsuIdentification = startAuthorisationWithPsuIdentification;
  }

  public LinksSigningBasket startAuthorisationWithPsuAuthentication(String startAuthorisationWithPsuAuthentication) {
    this.startAuthorisationWithPsuAuthentication = startAuthorisationWithPsuAuthentication;
    return this;
  }

  /**
   * Link to a resource
   * @return startAuthorisationWithPsuAuthentication
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getStartAuthorisationWithPsuAuthentication() {
    return startAuthorisationWithPsuAuthentication;
  }

  public void setStartAuthorisationWithPsuAuthentication(String startAuthorisationWithPsuAuthentication) {
    this.startAuthorisationWithPsuAuthentication = startAuthorisationWithPsuAuthentication;
  }

  public LinksSigningBasket startAuthorisationWithEncryptedPsuAuthentication(String startAuthorisationWithEncryptedPsuAuthentication) {
    this.startAuthorisationWithEncryptedPsuAuthentication = startAuthorisationWithEncryptedPsuAuthentication;
    return this;
  }

  /**
   * Link to a resource
   * @return startAuthorisationWithEncryptedPsuAuthentication
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getStartAuthorisationWithEncryptedPsuAuthentication() {
    return startAuthorisationWithEncryptedPsuAuthentication;
  }

  public void setStartAuthorisationWithEncryptedPsuAuthentication(String startAuthorisationWithEncryptedPsuAuthentication) {
    this.startAuthorisationWithEncryptedPsuAuthentication = startAuthorisationWithEncryptedPsuAuthentication;
  }

  public LinksSigningBasket startAuthorisationWithAuthenticationMethodSelection(String startAuthorisationWithAuthenticationMethodSelection) {
    this.startAuthorisationWithAuthenticationMethodSelection = startAuthorisationWithAuthenticationMethodSelection;
    return this;
  }

  /**
   * Link to a resource
   * @return startAuthorisationWithAuthenticationMethodSelection
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getStartAuthorisationWithAuthenticationMethodSelection() {
    return startAuthorisationWithAuthenticationMethodSelection;
  }

  public void setStartAuthorisationWithAuthenticationMethodSelection(String startAuthorisationWithAuthenticationMethodSelection) {
    this.startAuthorisationWithAuthenticationMethodSelection = startAuthorisationWithAuthenticationMethodSelection;
  }

  public LinksSigningBasket startAuthorisationWithTransactionAuthorisation(String startAuthorisationWithTransactionAuthorisation) {
    this.startAuthorisationWithTransactionAuthorisation = startAuthorisationWithTransactionAuthorisation;
    return this;
  }

  /**
   * Link to a resource
   * @return startAuthorisationWithTransactionAuthorisation
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getStartAuthorisationWithTransactionAuthorisation() {
    return startAuthorisationWithTransactionAuthorisation;
  }

  public void setStartAuthorisationWithTransactionAuthorisation(String startAuthorisationWithTransactionAuthorisation) {
    this.startAuthorisationWithTransactionAuthorisation = startAuthorisationWithTransactionAuthorisation;
  }

  public LinksSigningBasket self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Link to a resource
   * @return self
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public LinksSigningBasket status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Link to a resource
   * @return status
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public LinksSigningBasket scaStatus(String scaStatus) {
    this.scaStatus = scaStatus;
    return this;
  }

  /**
   * Link to a resource
   * @return scaStatus
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getScaStatus() {
    return scaStatus;
  }

  public void setScaStatus(String scaStatus) {
    this.scaStatus = scaStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksSigningBasket linksSigningBasket = (LinksSigningBasket) o;
    return Objects.equals(this.scaRedirect, linksSigningBasket.scaRedirect) &&
        Objects.equals(this.scaOAuth, linksSigningBasket.scaOAuth) &&
        Objects.equals(this.startAuthorisation, linksSigningBasket.startAuthorisation) &&
        Objects.equals(this.startAuthorisationWithPsuIdentification, linksSigningBasket.startAuthorisationWithPsuIdentification) &&
        Objects.equals(this.startAuthorisationWithPsuAuthentication, linksSigningBasket.startAuthorisationWithPsuAuthentication) &&
        Objects.equals(this.startAuthorisationWithEncryptedPsuAuthentication, linksSigningBasket.startAuthorisationWithEncryptedPsuAuthentication) &&
        Objects.equals(this.startAuthorisationWithAuthenticationMethodSelection, linksSigningBasket.startAuthorisationWithAuthenticationMethodSelection) &&
        Objects.equals(this.startAuthorisationWithTransactionAuthorisation, linksSigningBasket.startAuthorisationWithTransactionAuthorisation) &&
        Objects.equals(this.self, linksSigningBasket.self) &&
        Objects.equals(this.status, linksSigningBasket.status) &&
        Objects.equals(this.scaStatus, linksSigningBasket.scaStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaRedirect, scaOAuth, startAuthorisation, startAuthorisationWithPsuIdentification, startAuthorisationWithPsuAuthentication, startAuthorisationWithEncryptedPsuAuthentication, startAuthorisationWithAuthenticationMethodSelection, startAuthorisationWithTransactionAuthorisation, self, status, scaStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksSigningBasket {\n");
    
    sb.append("    scaRedirect: ").append(toIndentedString(scaRedirect)).append("\n");
    sb.append("    scaOAuth: ").append(toIndentedString(scaOAuth)).append("\n");
    sb.append("    startAuthorisation: ").append(toIndentedString(startAuthorisation)).append("\n");
    sb.append("    startAuthorisationWithPsuIdentification: ").append(toIndentedString(startAuthorisationWithPsuIdentification)).append("\n");
    sb.append("    startAuthorisationWithPsuAuthentication: ").append(toIndentedString(startAuthorisationWithPsuAuthentication)).append("\n");
    sb.append("    startAuthorisationWithEncryptedPsuAuthentication: ").append(toIndentedString(startAuthorisationWithEncryptedPsuAuthentication)).append("\n");
    sb.append("    startAuthorisationWithAuthenticationMethodSelection: ").append(toIndentedString(startAuthorisationWithAuthenticationMethodSelection)).append("\n");
    sb.append("    startAuthorisationWithTransactionAuthorisation: ").append(toIndentedString(startAuthorisationWithTransactionAuthorisation)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    scaStatus: ").append(toIndentedString(scaStatus)).append("\n");
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

