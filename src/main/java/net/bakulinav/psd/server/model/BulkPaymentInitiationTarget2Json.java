package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import net.bakulinav.psd.server.model.AccountReference;
import net.bakulinav.psd.server.model.PaymentInitiationTarget2BulkElementJson;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON Body for a bulk TARGET-2 payment initation. 
 */
@ApiModel(description = "JSON Body for a bulk TARGET-2 payment initation. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class BulkPaymentInitiationTarget2Json   {
  @JsonProperty("batchBookingPreferred")
  private Boolean batchBookingPreferred;

  @JsonProperty("requestedExecutionDate")
  private LocalDate requestedExecutionDate;

  @JsonProperty("debtorAccount")
  private AccountReference debtorAccount = null;

  @JsonProperty("payments")
  @Valid
  private List<PaymentInitiationTarget2BulkElementJson> payments = new ArrayList<>();

  public BulkPaymentInitiationTarget2Json batchBookingPreferred(Boolean batchBookingPreferred) {
    this.batchBookingPreferred = batchBookingPreferred;
    return this;
  }

  /**
   * If this element equals 'true', the PSU prefers only one booking entry.  If this element equals 'false', the PSU prefers individual booking of all contained individual transactions.   The ASPSP will follow this preference according to contracts agreed on with the PSU. 
   * @return batchBookingPreferred
  */
  @ApiModelProperty(value = "If this element equals 'true', the PSU prefers only one booking entry.  If this element equals 'false', the PSU prefers individual booking of all contained individual transactions.   The ASPSP will follow this preference according to contracts agreed on with the PSU. ")


  public Boolean getBatchBookingPreferred() {
    return batchBookingPreferred;
  }

  public void setBatchBookingPreferred(Boolean batchBookingPreferred) {
    this.batchBookingPreferred = batchBookingPreferred;
  }

  public BulkPaymentInitiationTarget2Json requestedExecutionDate(LocalDate requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
    return this;
  }

  /**
   * Get requestedExecutionDate
   * @return requestedExecutionDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getRequestedExecutionDate() {
    return requestedExecutionDate;
  }

  public void setRequestedExecutionDate(LocalDate requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
  }

  public BulkPaymentInitiationTarget2Json debtorAccount(AccountReference debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   * @return debtorAccount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AccountReference getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(AccountReference debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public BulkPaymentInitiationTarget2Json payments(List<PaymentInitiationTarget2BulkElementJson> payments) {
    this.payments = payments;
    return this;
  }

  public BulkPaymentInitiationTarget2Json addPaymentsItem(PaymentInitiationTarget2BulkElementJson paymentsItem) {
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * A list of JSON bodies for TARGET-2 payments.
   * @return payments
  */
  @ApiModelProperty(required = true, value = "A list of JSON bodies for TARGET-2 payments.")
  @NotNull

  @Valid

  public List<PaymentInitiationTarget2BulkElementJson> getPayments() {
    return payments;
  }

  public void setPayments(List<PaymentInitiationTarget2BulkElementJson> payments) {
    this.payments = payments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPaymentInitiationTarget2Json bulkPaymentInitiationTarget2Json = (BulkPaymentInitiationTarget2Json) o;
    return Objects.equals(this.batchBookingPreferred, bulkPaymentInitiationTarget2Json.batchBookingPreferred) &&
        Objects.equals(this.requestedExecutionDate, bulkPaymentInitiationTarget2Json.requestedExecutionDate) &&
        Objects.equals(this.debtorAccount, bulkPaymentInitiationTarget2Json.debtorAccount) &&
        Objects.equals(this.payments, bulkPaymentInitiationTarget2Json.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchBookingPreferred, requestedExecutionDate, debtorAccount, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPaymentInitiationTarget2Json {\n");
    
    sb.append("    batchBookingPreferred: ").append(toIndentedString(batchBookingPreferred)).append("\n");
    sb.append("    requestedExecutionDate: ").append(toIndentedString(requestedExecutionDate)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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

