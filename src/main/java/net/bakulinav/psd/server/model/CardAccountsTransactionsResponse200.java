package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.bakulinav.psd.server.model.AccountReference;
import net.bakulinav.psd.server.model.Balance;
import net.bakulinav.psd.server.model.CardAccountReport;
import net.bakulinav.psd.server.model.LinksDownload;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body of the JSON response for a successful read card account transaction list request. This card account report contains transactions resulting from the query parameters. 
 */
@ApiModel(description = "Body of the JSON response for a successful read card account transaction list request. This card account report contains transactions resulting from the query parameters. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class CardAccountsTransactionsResponse200   {
  @JsonProperty("cardAccount")
  private AccountReference cardAccount = null;

  @JsonProperty("cardTransactions")
  private CardAccountReport cardTransactions = null;

  @JsonProperty("balances")
  @Valid
  private List<Balance> balances = null;

  @JsonProperty("_links")
  private LinksDownload links = null;

  public CardAccountsTransactionsResponse200 cardAccount(AccountReference cardAccount) {
    this.cardAccount = cardAccount;
    return this;
  }

  /**
   * Get cardAccount
   * @return cardAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountReference getCardAccount() {
    return cardAccount;
  }

  public void setCardAccount(AccountReference cardAccount) {
    this.cardAccount = cardAccount;
  }

  public CardAccountsTransactionsResponse200 cardTransactions(CardAccountReport cardTransactions) {
    this.cardTransactions = cardTransactions;
    return this;
  }

  /**
   * Get cardTransactions
   * @return cardTransactions
  */
  @ApiModelProperty(value = "")

  @Valid

  public CardAccountReport getCardTransactions() {
    return cardTransactions;
  }

  public void setCardTransactions(CardAccountReport cardTransactions) {
    this.cardTransactions = cardTransactions;
  }

  public CardAccountsTransactionsResponse200 balances(List<Balance> balances) {
    this.balances = balances;
    return this;
  }

  public CardAccountsTransactionsResponse200 addBalancesItem(Balance balancesItem) {
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

  public CardAccountsTransactionsResponse200 links(LinksDownload links) {
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
    CardAccountsTransactionsResponse200 cardAccountsTransactionsResponse200 = (CardAccountsTransactionsResponse200) o;
    return Objects.equals(this.cardAccount, cardAccountsTransactionsResponse200.cardAccount) &&
        Objects.equals(this.cardTransactions, cardAccountsTransactionsResponse200.cardTransactions) &&
        Objects.equals(this.balances, cardAccountsTransactionsResponse200.balances) &&
        Objects.equals(this.links, cardAccountsTransactionsResponse200.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardAccount, cardTransactions, balances, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardAccountsTransactionsResponse200 {\n");
    
    sb.append("    cardAccount: ").append(toIndentedString(cardAccount)).append("\n");
    sb.append("    cardTransactions: ").append(toIndentedString(cardTransactions)).append("\n");
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

