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
 * A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the  response depend on the dynamical decisions of the ASPSP when processing the request.  **Remark:** All links can be relative or full links, to be decided by the ASPSP.  Type of links admitted in this response, (further links might be added for ASPSP defined  extensions):  - &#39;scaRedirect&#39;:    In case of an SCA Redirect Approach, the ASPSP is transmitting the link to which to    redirect the PSU browser. - &#39;scaOAuth&#39;:    In case of a SCA OAuth2 Approach, the ASPSP is transmitting the URI where the configuration of the Authorisation Server can be retrieved. The configuration follows the OAuth 2.0 Authorisation Server Metadata specification. - &#39;updatePsuIdentification&#39;:    The link to the authorisation or cancellation authorisation sub-resource,    where PSU identification data needs to be uploaded. - &#39;startAuthorisationWithPsuAuthentication&#39;:   The link to the authorisation or cancellation authorisation sub-resource,    where PSU authentication data needs to be uploaded.   * &#39;startAuthorisationWithEncryptedPsuAuthentication&#39;:     Same as startAuthorisactionWithPsuAuthentication where the authentication data need to be encrypted on      application layer in uploading. - &#39;selectAuthenticationMethod&#39;:   The link to the authorisation or cancellation authorisation sub-resource,    where the selected authentication method needs to be uploaded.    This link is contained under exactly the same conditions as the data element &#39;scaMethods&#39;. - &#39;authoriseTransaction&#39;:   The link to the authorisation or cancellation authorisation sub-resource,    where the authorisation data has to be uploaded, e.g. the TOP received by SMS.  - &#39;scaStatus&#39;:    The link to retrieve the scaStatus of the corresponding authorisation sub-resource.  
 */
@ApiModel(description = "A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the  response depend on the dynamical decisions of the ASPSP when processing the request.  **Remark:** All links can be relative or full links, to be decided by the ASPSP.  Type of links admitted in this response, (further links might be added for ASPSP defined  extensions):  - 'scaRedirect':    In case of an SCA Redirect Approach, the ASPSP is transmitting the link to which to    redirect the PSU browser. - 'scaOAuth':    In case of a SCA OAuth2 Approach, the ASPSP is transmitting the URI where the configuration of the Authorisation Server can be retrieved. The configuration follows the OAuth 2.0 Authorisation Server Metadata specification. - 'updatePsuIdentification':    The link to the authorisation or cancellation authorisation sub-resource,    where PSU identification data needs to be uploaded. - 'startAuthorisationWithPsuAuthentication':   The link to the authorisation or cancellation authorisation sub-resource,    where PSU authentication data needs to be uploaded.   * 'startAuthorisationWithEncryptedPsuAuthentication':     Same as startAuthorisactionWithPsuAuthentication where the authentication data need to be encrypted on      application layer in uploading. - 'selectAuthenticationMethod':   The link to the authorisation or cancellation authorisation sub-resource,    where the selected authentication method needs to be uploaded.    This link is contained under exactly the same conditions as the data element 'scaMethods'. - 'authoriseTransaction':   The link to the authorisation or cancellation authorisation sub-resource,    where the authorisation data has to be uploaded, e.g. the TOP received by SMS.  - 'scaStatus':    The link to retrieve the scaStatus of the corresponding authorisation sub-resource.  ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class LinksStartScaProcess extends HashMap<String, String>  {
  @JsonProperty("scaRedirect")
  private String scaRedirect;

  @JsonProperty("scaOAuth")
  private String scaOAuth;

  @JsonProperty("updatePsuIdentification")
  private String updatePsuIdentification;

  @JsonProperty("startAuthorisationWithPsuAuthentication")
  private String startAuthorisationWithPsuAuthentication;

  @JsonProperty("startAuthorisationWithEncryptedPsuAuthentication")
  private String startAuthorisationWithEncryptedPsuAuthentication;

  @JsonProperty("selectAuthenticationMethod")
  private String selectAuthenticationMethod;

  @JsonProperty("authoriseTransaction")
  private String authoriseTransaction;

  @JsonProperty("scaStatus")
  private String scaStatus;

  public LinksStartScaProcess scaRedirect(String scaRedirect) {
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

  public LinksStartScaProcess scaOAuth(String scaOAuth) {
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

  public LinksStartScaProcess updatePsuIdentification(String updatePsuIdentification) {
    this.updatePsuIdentification = updatePsuIdentification;
    return this;
  }

  /**
   * Link to a resource
   * @return updatePsuIdentification
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getUpdatePsuIdentification() {
    return updatePsuIdentification;
  }

  public void setUpdatePsuIdentification(String updatePsuIdentification) {
    this.updatePsuIdentification = updatePsuIdentification;
  }

  public LinksStartScaProcess startAuthorisationWithPsuAuthentication(String startAuthorisationWithPsuAuthentication) {
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

  public LinksStartScaProcess startAuthorisationWithEncryptedPsuAuthentication(String startAuthorisationWithEncryptedPsuAuthentication) {
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

  public LinksStartScaProcess selectAuthenticationMethod(String selectAuthenticationMethod) {
    this.selectAuthenticationMethod = selectAuthenticationMethod;
    return this;
  }

  /**
   * Link to a resource
   * @return selectAuthenticationMethod
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getSelectAuthenticationMethod() {
    return selectAuthenticationMethod;
  }

  public void setSelectAuthenticationMethod(String selectAuthenticationMethod) {
    this.selectAuthenticationMethod = selectAuthenticationMethod;
  }

  public LinksStartScaProcess authoriseTransaction(String authoriseTransaction) {
    this.authoriseTransaction = authoriseTransaction;
    return this;
  }

  /**
   * Link to a resource
   * @return authoriseTransaction
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getAuthoriseTransaction() {
    return authoriseTransaction;
  }

  public void setAuthoriseTransaction(String authoriseTransaction) {
    this.authoriseTransaction = authoriseTransaction;
  }

  public LinksStartScaProcess scaStatus(String scaStatus) {
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
    LinksStartScaProcess linksStartScaProcess = (LinksStartScaProcess) o;
    return Objects.equals(this.scaRedirect, linksStartScaProcess.scaRedirect) &&
        Objects.equals(this.scaOAuth, linksStartScaProcess.scaOAuth) &&
        Objects.equals(this.updatePsuIdentification, linksStartScaProcess.updatePsuIdentification) &&
        Objects.equals(this.startAuthorisationWithPsuAuthentication, linksStartScaProcess.startAuthorisationWithPsuAuthentication) &&
        Objects.equals(this.startAuthorisationWithEncryptedPsuAuthentication, linksStartScaProcess.startAuthorisationWithEncryptedPsuAuthentication) &&
        Objects.equals(this.selectAuthenticationMethod, linksStartScaProcess.selectAuthenticationMethod) &&
        Objects.equals(this.authoriseTransaction, linksStartScaProcess.authoriseTransaction) &&
        Objects.equals(this.scaStatus, linksStartScaProcess.scaStatus) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaRedirect, scaOAuth, updatePsuIdentification, startAuthorisationWithPsuAuthentication, startAuthorisationWithEncryptedPsuAuthentication, selectAuthenticationMethod, authoriseTransaction, scaStatus, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksStartScaProcess {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    scaRedirect: ").append(toIndentedString(scaRedirect)).append("\n");
    sb.append("    scaOAuth: ").append(toIndentedString(scaOAuth)).append("\n");
    sb.append("    updatePsuIdentification: ").append(toIndentedString(updatePsuIdentification)).append("\n");
    sb.append("    startAuthorisationWithPsuAuthentication: ").append(toIndentedString(startAuthorisationWithPsuAuthentication)).append("\n");
    sb.append("    startAuthorisationWithEncryptedPsuAuthentication: ").append(toIndentedString(startAuthorisationWithEncryptedPsuAuthentication)).append("\n");
    sb.append("    selectAuthenticationMethod: ").append(toIndentedString(selectAuthenticationMethod)).append("\n");
    sb.append("    authoriseTransaction: ").append(toIndentedString(authoriseTransaction)).append("\n");
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

