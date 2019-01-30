package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.bakulinav.psd.server.model.TransactionStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body of the response for a successful payment initiation status request in case of an JSON based endpoint.
 */
@ApiModel(description = "Body of the response for a successful payment initiation status request in case of an JSON based endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class PaymentInitiationStatusResponse200Json   {
  @JsonProperty("transactionStatus")
  private TransactionStatus transactionStatus = null;

  public PaymentInitiationStatusResponse200Json transactionStatus(TransactionStatus transactionStatus) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationStatusResponse200Json paymentInitiationStatusResponse200Json = (PaymentInitiationStatusResponse200Json) o;
    return Objects.equals(this.transactionStatus, paymentInitiationStatusResponse200Json.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationStatusResponse200Json {\n");
    
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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

