package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Exchange Rate
 */
@ApiModel(description = "Exchange Rate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class ExchangeRate   {
  @JsonProperty("sourceCurrency")
  private String sourceCurrency;

  @JsonProperty("rate")
  private String rate;

  @JsonProperty("unitCurrency")
  private String unitCurrency;

  @JsonProperty("targetCurrency")
  private String targetCurrency;

  @JsonProperty("rateDate")
  private LocalDate rateDate;

  @JsonProperty("rateContract")
  private String rateContract;

  public ExchangeRate sourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

  /**
   * ISO 4217 Alpha 3 currency code 
   * @return sourceCurrency
  */
  @ApiModelProperty(example = "EUR", required = true, value = "ISO 4217 Alpha 3 currency code ")
  @NotNull

@Pattern(regexp="[A-Z]{3}") 
  public String getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public ExchangeRate rate(String rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public ExchangeRate unitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
    return this;
  }

  /**
   * Get unitCurrency
   * @return unitCurrency
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUnitCurrency() {
    return unitCurrency;
  }

  public void setUnitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
  }

  public ExchangeRate targetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
    return this;
  }

  /**
   * ISO 4217 Alpha 3 currency code 
   * @return targetCurrency
  */
  @ApiModelProperty(example = "EUR", required = true, value = "ISO 4217 Alpha 3 currency code ")
  @NotNull

@Pattern(regexp="[A-Z]{3}") 
  public String getTargetCurrency() {
    return targetCurrency;
  }

  public void setTargetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
  }

  public ExchangeRate rateDate(LocalDate rateDate) {
    this.rateDate = rateDate;
    return this;
  }

  /**
   * Get rateDate
   * @return rateDate
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LocalDate getRateDate() {
    return rateDate;
  }

  public void setRateDate(LocalDate rateDate) {
    this.rateDate = rateDate;
  }

  public ExchangeRate rateContract(String rateContract) {
    this.rateContract = rateContract;
    return this;
  }

  /**
   * Get rateContract
   * @return rateContract
  */
  @ApiModelProperty(value = "")


  public String getRateContract() {
    return rateContract;
  }

  public void setRateContract(String rateContract) {
    this.rateContract = rateContract;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRate exchangeRate = (ExchangeRate) o;
    return Objects.equals(this.sourceCurrency, exchangeRate.sourceCurrency) &&
        Objects.equals(this.rate, exchangeRate.rate) &&
        Objects.equals(this.unitCurrency, exchangeRate.unitCurrency) &&
        Objects.equals(this.targetCurrency, exchangeRate.targetCurrency) &&
        Objects.equals(this.rateDate, exchangeRate.rateDate) &&
        Objects.equals(this.rateContract, exchangeRate.rateContract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCurrency, rate, unitCurrency, targetCurrency, rateDate, rateContract);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRate {\n");
    
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
    sb.append("    targetCurrency: ").append(toIndentedString(targetCurrency)).append("\n");
    sb.append("    rateDate: ").append(toIndentedString(rateDate)).append("\n");
    sb.append("    rateContract: ").append(toIndentedString(rateContract)).append("\n");
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

