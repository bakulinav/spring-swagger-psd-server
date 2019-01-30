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
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body of the response for a successful read balance for an account request.
 */
@ApiModel(description = "Body of the response for a successful read balance for an account request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class ReadAccountBalanceResponse200   {
  @JsonProperty("account")
  private AccountReference account = null;

  @JsonProperty("balances")
  @Valid
  private List<Balance> balances = new ArrayList<>();

  public ReadAccountBalanceResponse200 account(AccountReference account) {
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

  public ReadAccountBalanceResponse200 balances(List<Balance> balances) {
    this.balances = balances;
    return this;
  }

  public ReadAccountBalanceResponse200 addBalancesItem(Balance balancesItem) {
    this.balances.add(balancesItem);
    return this;
  }

  /**
   * A list of balances regarding this account, e.g. the current balance, the last booked balance. The list migght be restricted to the current ballance. 
   * @return balances
  */
  @ApiModelProperty(required = true, value = "A list of balances regarding this account, e.g. the current balance, the last booked balance. The list migght be restricted to the current ballance. ")
  @NotNull

  @Valid

  public List<Balance> getBalances() {
    return balances;
  }

  public void setBalances(List<Balance> balances) {
    this.balances = balances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadAccountBalanceResponse200 readAccountBalanceResponse200 = (ReadAccountBalanceResponse200) o;
    return Objects.equals(this.account, readAccountBalanceResponse200.account) &&
        Objects.equals(this.balances, readAccountBalanceResponse200.balances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, balances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadAccountBalanceResponse200 {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
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

