package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.bakulinav.psd.server.model.AccountReference;
import net.bakulinav.psd.server.model.AccountReport;
import net.bakulinav.psd.server.model.Balance;
import net.bakulinav.psd.server.model.LinksDownload;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body of the JSON response for a successful read transaction list request. This account report contains transactions resulting from the query parameters. 
 */
@ApiModel(description = "Body of the JSON response for a successful read transaction list request. This account report contains transactions resulting from the query parameters. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class TransactionsResponse200Json   {
  @JsonProperty("account")
  private AccountReference account = null;

  @JsonProperty("transactions")
  private AccountReport transactions = null;

  @JsonProperty("balances")
  @Valid
  private List<Balance> balances = null;

  @JsonProperty("_links")
  private LinksDownload links = null;

  public TransactionsResponse200Json account(AccountReference account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountReference getAccount() {
    return account;
  }

  public void setAccount(AccountReference account) {
    this.account = account;
  }

  public TransactionsResponse200Json transactions(AccountReport transactions) {
    this.transactions = transactions;
    return this;
  }

  /**
   * Get transactions
   * @return transactions
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountReport getTransactions() {
    return transactions;
  }

  public void setTransactions(AccountReport transactions) {
    this.transactions = transactions;
  }

  public TransactionsResponse200Json balances(List<Balance> balances) {
    this.balances = balances;
    return this;
  }

  public TransactionsResponse200Json addBalancesItem(Balance balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<>();
    }
    this.balances.add(balancesItem);
    return this;
  }

  /**
   * A list of balances regarding this account, e.g. the current balance, the last booked balance. The list migght be restricted to the current ballance. 
   * @return balances
  */
  @ApiModelProperty(value = "A list of balances regarding this account, e.g. the current balance, the last booked balance. The list migght be restricted to the current ballance. ")

  @Valid

  public List<Balance> getBalances() {
    return balances;
  }

  public void setBalances(List<Balance> balances) {
    this.balances = balances;
  }

  public TransactionsResponse200Json links(LinksDownload links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")

  @Valid

  public LinksDownload getLinks() {
    return links;
  }

  public void setLinks(LinksDownload links) {
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
    TransactionsResponse200Json transactionsResponse200Json = (TransactionsResponse200Json) o;
    return Objects.equals(this.account, transactionsResponse200Json.account) &&
        Objects.equals(this.transactions, transactionsResponse200Json.transactions) &&
        Objects.equals(this.balances, transactionsResponse200Json.balances) &&
        Objects.equals(this.links, transactionsResponse200Json.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, transactions, balances, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsResponse200Json {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
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

