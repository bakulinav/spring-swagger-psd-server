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
 * A _link object with all availabel link types 
 */
@ApiModel(description = "A _link object with all availabel link types ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class LinksAll extends HashMap<String, String>  {
  @JsonProperty("scaRedirect")
  private String scaRedirect;

  @JsonProperty("scaOAuth")
  private String scaOAuth;

  @JsonProperty("startAuthorisation")
  private String startAuthorisation;

  @JsonProperty("startAuthorisationWithPsuIdentification")
  private String startAuthorisationWithPsuIdentification;

  @JsonProperty("updatePsuIdentification")
  private String updatePsuIdentification;

  @JsonProperty("startAuthorisationWithProprietaryData")
  private String startAuthorisationWithProprietaryData;

  @JsonProperty("updateProprietaryData")
  private String updateProprietaryData;

  @JsonProperty("startAuthorisationWithPsuAuthentication")
  private String startAuthorisationWithPsuAuthentication;

  @JsonProperty("updatePsuAuthentication")
  private String updatePsuAuthentication;

  @JsonProperty("startAuthorisationWithEncryptedPsuAuthentication")
  private String startAuthorisationWithEncryptedPsuAuthentication;

  @JsonProperty("updateEncryptedPsuAuthentication")
  private String updateEncryptedPsuAuthentication;

  @JsonProperty("startAuthorisationWithAuthenticationMethodSelection")
  private String startAuthorisationWithAuthenticationMethodSelection;

  @JsonProperty("selectAuthenticationMethod")
  private String selectAuthenticationMethod;

  @JsonProperty("startAuthorisationWithTransactionAuthorisation")
  private String startAuthorisationWithTransactionAuthorisation;

  @JsonProperty("authoriseTransaction")
  private String authoriseTransaction;

  @JsonProperty("self")
  private String self;

  @JsonProperty("status")
  private String status;

  @JsonProperty("scaStatus")
  private String scaStatus;

  @JsonProperty("account")
  private String account;

  @JsonProperty("balances")
  private String balances;

  @JsonProperty("transactions")
  private String transactions;

  @JsonProperty("transactionDetails")
  private String transactionDetails;

  @JsonProperty("cardAccount")
  private String cardAccount;

  @JsonProperty("cardTransactions")
  private String cardTransactions;

  @JsonProperty("first")
  private String first;

  @JsonProperty("next")
  private String next;

  @JsonProperty("previous")
  private String previous;

  @JsonProperty("last")
  private String last;

  @JsonProperty("download")
  private String download;

  public LinksAll scaRedirect(String scaRedirect) {
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

  public LinksAll scaOAuth(String scaOAuth) {
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

  public LinksAll startAuthorisation(String startAuthorisation) {
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

  public LinksAll startAuthorisationWithPsuIdentification(String startAuthorisationWithPsuIdentification) {
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

  public LinksAll updatePsuIdentification(String updatePsuIdentification) {
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

  public LinksAll startAuthorisationWithProprietaryData(String startAuthorisationWithProprietaryData) {
    this.startAuthorisationWithProprietaryData = startAuthorisationWithProprietaryData;
    return this;
  }

  /**
   * Link to a resource
   * @return startAuthorisationWithProprietaryData
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getStartAuthorisationWithProprietaryData() {
    return startAuthorisationWithProprietaryData;
  }

  public void setStartAuthorisationWithProprietaryData(String startAuthorisationWithProprietaryData) {
    this.startAuthorisationWithProprietaryData = startAuthorisationWithProprietaryData;
  }

  public LinksAll updateProprietaryData(String updateProprietaryData) {
    this.updateProprietaryData = updateProprietaryData;
    return this;
  }

  /**
   * Link to a resource
   * @return updateProprietaryData
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getUpdateProprietaryData() {
    return updateProprietaryData;
  }

  public void setUpdateProprietaryData(String updateProprietaryData) {
    this.updateProprietaryData = updateProprietaryData;
  }

  public LinksAll startAuthorisationWithPsuAuthentication(String startAuthorisationWithPsuAuthentication) {
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

  public LinksAll updatePsuAuthentication(String updatePsuAuthentication) {
    this.updatePsuAuthentication = updatePsuAuthentication;
    return this;
  }

  /**
   * Link to a resource
   * @return updatePsuAuthentication
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getUpdatePsuAuthentication() {
    return updatePsuAuthentication;
  }

  public void setUpdatePsuAuthentication(String updatePsuAuthentication) {
    this.updatePsuAuthentication = updatePsuAuthentication;
  }

  public LinksAll startAuthorisationWithEncryptedPsuAuthentication(String startAuthorisationWithEncryptedPsuAuthentication) {
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

  public LinksAll updateEncryptedPsuAuthentication(String updateEncryptedPsuAuthentication) {
    this.updateEncryptedPsuAuthentication = updateEncryptedPsuAuthentication;
    return this;
  }

  /**
   * Link to a resource
   * @return updateEncryptedPsuAuthentication
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getUpdateEncryptedPsuAuthentication() {
    return updateEncryptedPsuAuthentication;
  }

  public void setUpdateEncryptedPsuAuthentication(String updateEncryptedPsuAuthentication) {
    this.updateEncryptedPsuAuthentication = updateEncryptedPsuAuthentication;
  }

  public LinksAll startAuthorisationWithAuthenticationMethodSelection(String startAuthorisationWithAuthenticationMethodSelection) {
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

  public LinksAll selectAuthenticationMethod(String selectAuthenticationMethod) {
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

  public LinksAll startAuthorisationWithTransactionAuthorisation(String startAuthorisationWithTransactionAuthorisation) {
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

  public LinksAll authoriseTransaction(String authoriseTransaction) {
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

  public LinksAll self(String self) {
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

  public LinksAll status(String status) {
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

  public LinksAll scaStatus(String scaStatus) {
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

  public LinksAll account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Link to a resource
   * @return account
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public LinksAll balances(String balances) {
    this.balances = balances;
    return this;
  }

  /**
   * Link to a resource
   * @return balances
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getBalances() {
    return balances;
  }

  public void setBalances(String balances) {
    this.balances = balances;
  }

  public LinksAll transactions(String transactions) {
    this.transactions = transactions;
    return this;
  }

  /**
   * Link to a resource
   * @return transactions
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getTransactions() {
    return transactions;
  }

  public void setTransactions(String transactions) {
    this.transactions = transactions;
  }

  public LinksAll transactionDetails(String transactionDetails) {
    this.transactionDetails = transactionDetails;
    return this;
  }

  /**
   * Link to a resource
   * @return transactionDetails
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getTransactionDetails() {
    return transactionDetails;
  }

  public void setTransactionDetails(String transactionDetails) {
    this.transactionDetails = transactionDetails;
  }

  public LinksAll cardAccount(String cardAccount) {
    this.cardAccount = cardAccount;
    return this;
  }

  /**
   * Link to a resource
   * @return cardAccount
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getCardAccount() {
    return cardAccount;
  }

  public void setCardAccount(String cardAccount) {
    this.cardAccount = cardAccount;
  }

  public LinksAll cardTransactions(String cardTransactions) {
    this.cardTransactions = cardTransactions;
    return this;
  }

  /**
   * Link to a resource
   * @return cardTransactions
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getCardTransactions() {
    return cardTransactions;
  }

  public void setCardTransactions(String cardTransactions) {
    this.cardTransactions = cardTransactions;
  }

  public LinksAll first(String first) {
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

  public LinksAll next(String next) {
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

  public LinksAll previous(String previous) {
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

  public LinksAll last(String last) {
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

  public LinksAll download(String download) {
    this.download = download;
    return this;
  }

  /**
   * Link to a resource
   * @return download
  */
  @ApiModelProperty(example = "/v1/payments/sepa-credit-transfers/1234-wertiq-983", value = "Link to a resource")


  public String getDownload() {
    return download;
  }

  public void setDownload(String download) {
    this.download = download;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksAll linksAll = (LinksAll) o;
    return Objects.equals(this.scaRedirect, linksAll.scaRedirect) &&
        Objects.equals(this.scaOAuth, linksAll.scaOAuth) &&
        Objects.equals(this.startAuthorisation, linksAll.startAuthorisation) &&
        Objects.equals(this.startAuthorisationWithPsuIdentification, linksAll.startAuthorisationWithPsuIdentification) &&
        Objects.equals(this.updatePsuIdentification, linksAll.updatePsuIdentification) &&
        Objects.equals(this.startAuthorisationWithProprietaryData, linksAll.startAuthorisationWithProprietaryData) &&
        Objects.equals(this.updateProprietaryData, linksAll.updateProprietaryData) &&
        Objects.equals(this.startAuthorisationWithPsuAuthentication, linksAll.startAuthorisationWithPsuAuthentication) &&
        Objects.equals(this.updatePsuAuthentication, linksAll.updatePsuAuthentication) &&
        Objects.equals(this.startAuthorisationWithEncryptedPsuAuthentication, linksAll.startAuthorisationWithEncryptedPsuAuthentication) &&
        Objects.equals(this.updateEncryptedPsuAuthentication, linksAll.updateEncryptedPsuAuthentication) &&
        Objects.equals(this.startAuthorisationWithAuthenticationMethodSelection, linksAll.startAuthorisationWithAuthenticationMethodSelection) &&
        Objects.equals(this.selectAuthenticationMethod, linksAll.selectAuthenticationMethod) &&
        Objects.equals(this.startAuthorisationWithTransactionAuthorisation, linksAll.startAuthorisationWithTransactionAuthorisation) &&
        Objects.equals(this.authoriseTransaction, linksAll.authoriseTransaction) &&
        Objects.equals(this.self, linksAll.self) &&
        Objects.equals(this.status, linksAll.status) &&
        Objects.equals(this.scaStatus, linksAll.scaStatus) &&
        Objects.equals(this.account, linksAll.account) &&
        Objects.equals(this.balances, linksAll.balances) &&
        Objects.equals(this.transactions, linksAll.transactions) &&
        Objects.equals(this.transactionDetails, linksAll.transactionDetails) &&
        Objects.equals(this.cardAccount, linksAll.cardAccount) &&
        Objects.equals(this.cardTransactions, linksAll.cardTransactions) &&
        Objects.equals(this.first, linksAll.first) &&
        Objects.equals(this.next, linksAll.next) &&
        Objects.equals(this.previous, linksAll.previous) &&
        Objects.equals(this.last, linksAll.last) &&
        Objects.equals(this.download, linksAll.download) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaRedirect, scaOAuth, startAuthorisation, startAuthorisationWithPsuIdentification, updatePsuIdentification, startAuthorisationWithProprietaryData, updateProprietaryData, startAuthorisationWithPsuAuthentication, updatePsuAuthentication, startAuthorisationWithEncryptedPsuAuthentication, updateEncryptedPsuAuthentication, startAuthorisationWithAuthenticationMethodSelection, selectAuthenticationMethod, startAuthorisationWithTransactionAuthorisation, authoriseTransaction, self, status, scaStatus, account, balances, transactions, transactionDetails, cardAccount, cardTransactions, first, next, previous, last, download, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksAll {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    scaRedirect: ").append(toIndentedString(scaRedirect)).append("\n");
    sb.append("    scaOAuth: ").append(toIndentedString(scaOAuth)).append("\n");
    sb.append("    startAuthorisation: ").append(toIndentedString(startAuthorisation)).append("\n");
    sb.append("    startAuthorisationWithPsuIdentification: ").append(toIndentedString(startAuthorisationWithPsuIdentification)).append("\n");
    sb.append("    updatePsuIdentification: ").append(toIndentedString(updatePsuIdentification)).append("\n");
    sb.append("    startAuthorisationWithProprietaryData: ").append(toIndentedString(startAuthorisationWithProprietaryData)).append("\n");
    sb.append("    updateProprietaryData: ").append(toIndentedString(updateProprietaryData)).append("\n");
    sb.append("    startAuthorisationWithPsuAuthentication: ").append(toIndentedString(startAuthorisationWithPsuAuthentication)).append("\n");
    sb.append("    updatePsuAuthentication: ").append(toIndentedString(updatePsuAuthentication)).append("\n");
    sb.append("    startAuthorisationWithEncryptedPsuAuthentication: ").append(toIndentedString(startAuthorisationWithEncryptedPsuAuthentication)).append("\n");
    sb.append("    updateEncryptedPsuAuthentication: ").append(toIndentedString(updateEncryptedPsuAuthentication)).append("\n");
    sb.append("    startAuthorisationWithAuthenticationMethodSelection: ").append(toIndentedString(startAuthorisationWithAuthenticationMethodSelection)).append("\n");
    sb.append("    selectAuthenticationMethod: ").append(toIndentedString(selectAuthenticationMethod)).append("\n");
    sb.append("    startAuthorisationWithTransactionAuthorisation: ").append(toIndentedString(startAuthorisationWithTransactionAuthorisation)).append("\n");
    sb.append("    authoriseTransaction: ").append(toIndentedString(authoriseTransaction)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    scaStatus: ").append(toIndentedString(scaStatus)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
    sb.append("    cardAccount: ").append(toIndentedString(cardAccount)).append("\n");
    sb.append("    cardTransactions: ").append(toIndentedString(cardTransactions)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
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

