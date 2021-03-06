package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import net.bakulinav.psd.server.model.Amount;
import net.bakulinav.psd.server.model.BalanceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A single balance element 
 */
@ApiModel(description = "A single balance element ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class Balance   {
  @JsonProperty("balanceAmount")
  private Amount balanceAmount = null;

  @JsonProperty("balanceType")
  private BalanceType balanceType = null;

  @JsonProperty("lastChangeDateTime")
  private OffsetDateTime lastChangeDateTime;

  @JsonProperty("referenceDate")
  private LocalDate referenceDate;

  @JsonProperty("lastCommittedTransaction")
  private String lastCommittedTransaction;

  public Balance balanceAmount(Amount balanceAmount) {
    this.balanceAmount = balanceAmount;
    return this;
  }

  /**
   * Get balanceAmount
   * @return balanceAmount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Amount getBalanceAmount() {
    return balanceAmount;
  }

  public void setBalanceAmount(Amount balanceAmount) {
    this.balanceAmount = balanceAmount;
  }

  public Balance balanceType(BalanceType balanceType) {
    this.balanceType = balanceType;
    return this;
  }

  /**
   * Get balanceType
   * @return balanceType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BalanceType getBalanceType() {
    return balanceType;
  }

  public void setBalanceType(BalanceType balanceType) {
    this.balanceType = balanceType;
  }

  public Balance lastChangeDateTime(OffsetDateTime lastChangeDateTime) {
    this.lastChangeDateTime = lastChangeDateTime;
    return this;
  }

  /**
   * This data element might be used to indicate e.g. with the expected or booked balance that no action is known  on the account, which is not yet booked. 
   * @return lastChangeDateTime
  */
  @ApiModelProperty(value = "This data element might be used to indicate e.g. with the expected or booked balance that no action is known  on the account, which is not yet booked. ")

  @Valid

  public OffsetDateTime getLastChangeDateTime() {
    return lastChangeDateTime;
  }

  public void setLastChangeDateTime(OffsetDateTime lastChangeDateTime) {
    this.lastChangeDateTime = lastChangeDateTime;
  }

  public Balance referenceDate(LocalDate referenceDate) {
    this.referenceDate = referenceDate;
    return this;
  }

  /**
   * Reference date of the balance
   * @return referenceDate
  */
  @ApiModelProperty(value = "Reference date of the balance")

  @Valid

  public LocalDate getReferenceDate() {
    return referenceDate;
  }

  public void setReferenceDate(LocalDate referenceDate) {
    this.referenceDate = referenceDate;
  }

  public Balance lastCommittedTransaction(String lastCommittedTransaction) {
    this.lastCommittedTransaction = lastCommittedTransaction;
    return this;
  }

  /**
   * \"entryReference\" of the last commited transaction to support the TPP in identifying whether all  PSU transactions are already known. 
   * @return lastCommittedTransaction
  */
  @ApiModelProperty(value = "\"entryReference\" of the last commited transaction to support the TPP in identifying whether all  PSU transactions are already known. ")

@Size(max=35) 
  public String getLastCommittedTransaction() {
    return lastCommittedTransaction;
  }

  public void setLastCommittedTransaction(String lastCommittedTransaction) {
    this.lastCommittedTransaction = lastCommittedTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.balanceAmount, balance.balanceAmount) &&
        Objects.equals(this.balanceType, balance.balanceType) &&
        Objects.equals(this.lastChangeDateTime, balance.lastChangeDateTime) &&
        Objects.equals(this.referenceDate, balance.referenceDate) &&
        Objects.equals(this.lastCommittedTransaction, balance.lastCommittedTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAmount, balanceType, lastChangeDateTime, referenceDate, lastCommittedTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    
    sb.append("    balanceAmount: ").append(toIndentedString(balanceAmount)).append("\n");
    sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
    sb.append("    lastChangeDateTime: ").append(toIndentedString(lastChangeDateTime)).append("\n");
    sb.append("    referenceDate: ").append(toIndentedString(referenceDate)).append("\n");
    sb.append("    lastCommittedTransaction: ").append(toIndentedString(lastCommittedTransaction)).append("\n");
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

