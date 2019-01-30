package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import net.bakulinav.psd.server.model.Address;
import net.bakulinav.psd.server.model.Amount;
import net.bakulinav.psd.server.model.ExchangeRate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Card transaction information
 */
@ApiModel(description = "Card transaction information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class CardTransaction   {
  @JsonProperty("cardTransactionId")
  private String cardTransactionId;

  @JsonProperty("terminalId")
  private String terminalId;

  @JsonProperty("transactionDate")
  private LocalDate transactionDate;

  @JsonProperty("bookingDate")
  private LocalDate bookingDate;

  @JsonProperty("transactionAmount")
  private Amount transactionAmount = null;

  @JsonProperty("exchangeRate")
  @Valid
  private List<ExchangeRate> exchangeRate = null;

  @JsonProperty("originalAmount")
  private Amount originalAmount = null;

  @JsonProperty("markupFee")
  private Amount markupFee = null;

  @JsonProperty("markupFeePercentage")
  private String markupFeePercentage;

  @JsonProperty("cardAcceptorId")
  private String cardAcceptorId;

  @JsonProperty("cardAcceptorAddress")
  private Address cardAcceptorAddress = null;

  @JsonProperty("cardAcceptorCategoryCode")
  private String cardAcceptorCategoryCode;

  @JsonProperty("maskedPAN")
  private String maskedPAN;

  @JsonProperty("transactionDetails")
  private String transactionDetails;

  @JsonProperty("invoiced")
  private Boolean invoiced;

  @JsonProperty("proprietaryBankTransactionCode")
  private String proprietaryBankTransactionCode;

  public CardTransaction cardTransactionId(String cardTransactionId) {
    this.cardTransactionId = cardTransactionId;
    return this;
  }

  /**
   * Unique end to end identity.
   * @return cardTransactionId
  */
  @ApiModelProperty(value = "Unique end to end identity.")

@Size(max=35) 
  public String getCardTransactionId() {
    return cardTransactionId;
  }

  public void setCardTransactionId(String cardTransactionId) {
    this.cardTransactionId = cardTransactionId;
  }

  public CardTransaction terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

  /**
   * Identification of the Terminal, where the card has been used.
   * @return terminalId
  */
  @ApiModelProperty(value = "Identification of the Terminal, where the card has been used.")

@Size(max=35) 
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public CardTransaction transactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  /**
   * Date of the actual card transaction
   * @return transactionDate
  */
  @ApiModelProperty(value = "Date of the actual card transaction")

  @Valid

  public LocalDate getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
  }

  public CardTransaction bookingDate(LocalDate bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

  /**
   * The Date when an entry is posted to an account on the ASPSPs books. 
   * @return bookingDate
  */
  @ApiModelProperty(value = "The Date when an entry is posted to an account on the ASPSPs books. ")

  @Valid

  public LocalDate getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(LocalDate bookingDate) {
    this.bookingDate = bookingDate;
  }

  public CardTransaction transactionAmount(Amount transactionAmount) {
    this.transactionAmount = transactionAmount;
    return this;
  }

  /**
   * Get transactionAmount
   * @return transactionAmount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Amount getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(Amount transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public CardTransaction exchangeRate(List<ExchangeRate> exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  public CardTransaction addExchangeRateItem(ExchangeRate exchangeRateItem) {
    if (this.exchangeRate == null) {
      this.exchangeRate = new ArrayList<>();
    }
    this.exchangeRate.add(exchangeRateItem);
    return this;
  }

  /**
   * Array of exchange rates
   * @return exchangeRate
  */
  @ApiModelProperty(value = "Array of exchange rates")

  @Valid

  public List<ExchangeRate> getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(List<ExchangeRate> exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public CardTransaction originalAmount(Amount originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

  /**
   * Get originalAmount
   * @return originalAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public Amount getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(Amount originalAmount) {
    this.originalAmount = originalAmount;
  }

  public CardTransaction markupFee(Amount markupFee) {
    this.markupFee = markupFee;
    return this;
  }

  /**
   * Get markupFee
   * @return markupFee
  */
  @ApiModelProperty(value = "")

  @Valid

  public Amount getMarkupFee() {
    return markupFee;
  }

  public void setMarkupFee(Amount markupFee) {
    this.markupFee = markupFee;
  }

  public CardTransaction markupFeePercentage(String markupFeePercentage) {
    this.markupFeePercentage = markupFeePercentage;
    return this;
  }

  /**
   * Get markupFeePercentage
   * @return markupFeePercentage
  */
  @ApiModelProperty(value = "")


  public String getMarkupFeePercentage() {
    return markupFeePercentage;
  }

  public void setMarkupFeePercentage(String markupFeePercentage) {
    this.markupFeePercentage = markupFeePercentage;
  }

  public CardTransaction cardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
    return this;
  }

  /**
   * Get cardAcceptorId
   * @return cardAcceptorId
  */
  @ApiModelProperty(value = "")

@Size(max=35) 
  public String getCardAcceptorId() {
    return cardAcceptorId;
  }

  public void setCardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
  }

  public CardTransaction cardAcceptorAddress(Address cardAcceptorAddress) {
    this.cardAcceptorAddress = cardAcceptorAddress;
    return this;
  }

  /**
   * Get cardAcceptorAddress
   * @return cardAcceptorAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address getCardAcceptorAddress() {
    return cardAcceptorAddress;
  }

  public void setCardAcceptorAddress(Address cardAcceptorAddress) {
    this.cardAcceptorAddress = cardAcceptorAddress;
  }

  public CardTransaction cardAcceptorCategoryCode(String cardAcceptorCategoryCode) {
    this.cardAcceptorCategoryCode = cardAcceptorCategoryCode;
    return this;
  }

  /**
   * Card Acceptor Category Code of the Card Acceptor as given in the related card transaction.  
   * @return cardAcceptorCategoryCode
  */
  @ApiModelProperty(value = "Card Acceptor Category Code of the Card Acceptor as given in the related card transaction.  ")


  public String getCardAcceptorCategoryCode() {
    return cardAcceptorCategoryCode;
  }

  public void setCardAcceptorCategoryCode(String cardAcceptorCategoryCode) {
    this.cardAcceptorCategoryCode = cardAcceptorCategoryCode;
  }

  public CardTransaction maskedPAN(String maskedPAN) {
    this.maskedPAN = maskedPAN;
    return this;
  }

  /**
   * Masked Primary Account Number 
   * @return maskedPAN
  */
  @ApiModelProperty(example = "123456xxxxxx1234", value = "Masked Primary Account Number ")

@Size(max=35) 
  public String getMaskedPAN() {
    return maskedPAN;
  }

  public void setMaskedPAN(String maskedPAN) {
    this.maskedPAN = maskedPAN;
  }

  public CardTransaction transactionDetails(String transactionDetails) {
    this.transactionDetails = transactionDetails;
    return this;
  }

  /**
   * Get transactionDetails
   * @return transactionDetails
  */
  @ApiModelProperty(value = "")

@Size(max=140) 
  public String getTransactionDetails() {
    return transactionDetails;
  }

  public void setTransactionDetails(String transactionDetails) {
    this.transactionDetails = transactionDetails;
  }

  public CardTransaction invoiced(Boolean invoiced) {
    this.invoiced = invoiced;
    return this;
  }

  /**
   * Get invoiced
   * @return invoiced
  */
  @ApiModelProperty(value = "")


  public Boolean getInvoiced() {
    return invoiced;
  }

  public void setInvoiced(Boolean invoiced) {
    this.invoiced = invoiced;
  }

  public CardTransaction proprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    return this;
  }

  /**
   * Proprietary bank transaction code as used within a community or within an ASPSP e.g.  for MT94x based transaction reports. 
   * @return proprietaryBankTransactionCode
  */
  @ApiModelProperty(value = "Proprietary bank transaction code as used within a community or within an ASPSP e.g.  for MT94x based transaction reports. ")

@Size(max=35) 
  public String getProprietaryBankTransactionCode() {
    return proprietaryBankTransactionCode;
  }

  public void setProprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardTransaction cardTransaction = (CardTransaction) o;
    return Objects.equals(this.cardTransactionId, cardTransaction.cardTransactionId) &&
        Objects.equals(this.terminalId, cardTransaction.terminalId) &&
        Objects.equals(this.transactionDate, cardTransaction.transactionDate) &&
        Objects.equals(this.bookingDate, cardTransaction.bookingDate) &&
        Objects.equals(this.transactionAmount, cardTransaction.transactionAmount) &&
        Objects.equals(this.exchangeRate, cardTransaction.exchangeRate) &&
        Objects.equals(this.originalAmount, cardTransaction.originalAmount) &&
        Objects.equals(this.markupFee, cardTransaction.markupFee) &&
        Objects.equals(this.markupFeePercentage, cardTransaction.markupFeePercentage) &&
        Objects.equals(this.cardAcceptorId, cardTransaction.cardAcceptorId) &&
        Objects.equals(this.cardAcceptorAddress, cardTransaction.cardAcceptorAddress) &&
        Objects.equals(this.cardAcceptorCategoryCode, cardTransaction.cardAcceptorCategoryCode) &&
        Objects.equals(this.maskedPAN, cardTransaction.maskedPAN) &&
        Objects.equals(this.transactionDetails, cardTransaction.transactionDetails) &&
        Objects.equals(this.invoiced, cardTransaction.invoiced) &&
        Objects.equals(this.proprietaryBankTransactionCode, cardTransaction.proprietaryBankTransactionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardTransactionId, terminalId, transactionDate, bookingDate, transactionAmount, exchangeRate, originalAmount, markupFee, markupFeePercentage, cardAcceptorId, cardAcceptorAddress, cardAcceptorCategoryCode, maskedPAN, transactionDetails, invoiced, proprietaryBankTransactionCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardTransaction {\n");
    
    sb.append("    cardTransactionId: ").append(toIndentedString(cardTransactionId)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    markupFee: ").append(toIndentedString(markupFee)).append("\n");
    sb.append("    markupFeePercentage: ").append(toIndentedString(markupFeePercentage)).append("\n");
    sb.append("    cardAcceptorId: ").append(toIndentedString(cardAcceptorId)).append("\n");
    sb.append("    cardAcceptorAddress: ").append(toIndentedString(cardAcceptorAddress)).append("\n");
    sb.append("    cardAcceptorCategoryCode: ").append(toIndentedString(cardAcceptorCategoryCode)).append("\n");
    sb.append("    maskedPAN: ").append(toIndentedString(maskedPAN)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
    sb.append("    invoiced: ").append(toIndentedString(invoiced)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
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

