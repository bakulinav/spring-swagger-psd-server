package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.bakulinav.psd.server.model.CardAccountDetails;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of card accounts with details. 
 */
@ApiModel(description = "List of card accounts with details. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class CardAccountList   {
  @JsonProperty("cardAccounts")
  @Valid
  private List<CardAccountDetails> cardAccounts = new ArrayList<>();

  public CardAccountList cardAccounts(List<CardAccountDetails> cardAccounts) {
    this.cardAccounts = cardAccounts;
    return this;
  }

  public CardAccountList addCardAccountsItem(CardAccountDetails cardAccountsItem) {
    this.cardAccounts.add(cardAccountsItem);
    return this;
  }

  /**
   * Get cardAccounts
   * @return cardAccounts
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<CardAccountDetails> getCardAccounts() {
    return cardAccounts;
  }

  public void setCardAccounts(List<CardAccountDetails> cardAccounts) {
    this.cardAccounts = cardAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardAccountList cardAccountList = (CardAccountList) o;
    return Objects.equals(this.cardAccounts, cardAccountList.cardAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardAccountList {\n");
    
    sb.append("    cardAccounts: ").append(toIndentedString(cardAccounts)).append("\n");
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

