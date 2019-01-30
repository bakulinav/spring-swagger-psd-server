package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.bakulinav.psd.server.model.AccountStatus;
import net.bakulinav.psd.server.model.Balance;
import net.bakulinav.psd.server.model.LinksAccountDetails;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The ASPSP shall give at least one of the account reference identifiers:   - iban   - bban   - pan   - maskedPan   - msisdn If the account is a multicurrency account currency code in \&quot;currency\&quot; is set to \&quot;XXX\&quot;. 
 */
@ApiModel(description = "The ASPSP shall give at least one of the account reference identifiers:   - iban   - bban   - pan   - maskedPan   - msisdn If the account is a multicurrency account currency code in \"currency\" is set to \"XXX\". ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class AccountDetails   {
  @JsonProperty("resourceId")
  private String resourceId;

  @JsonProperty("iban")
  private String iban;

  @JsonProperty("bban")
  private String bban;

  @JsonProperty("msisdn")
  private String msisdn;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("name")
  private String name;

  @JsonProperty("product")
  private String product;

  @JsonProperty("cashAccountType")
  private String cashAccountType;

  @JsonProperty("status")
  private AccountStatus status = null;

  @JsonProperty("bic")
  private String bic;

  @JsonProperty("linkedAccounts")
  private String linkedAccounts;

  /**
   * Specifies the usage of the account   * PRIV: private personal account   * ORGA: professional account 
   */
  public enum UsageEnum {
    PRIV("PRIV"),
    
    ORGA("ORGA");

    private String value;

    UsageEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UsageEnum fromValue(String text) {
      for (UsageEnum b : UsageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("usage")
  private UsageEnum usage;

  @JsonProperty("details")
  private String details;

  @JsonProperty("balances")
  @Valid
  private List<Balance> balances = null;

  @JsonProperty("_links")
  private LinksAccountDetails links = null;

  public AccountDetails resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * This shall be filled, if addressable resource are created by the ASPSP on the /accounts or /card-accounts endpoint.
   * @return resourceId
  */
  @ApiModelProperty(value = "This shall be filled, if addressable resource are created by the ASPSP on the /accounts or /card-accounts endpoint.")


  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public AccountDetails iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * IBAN of an account
   * @return iban
  */
  @ApiModelProperty(example = "FR7612345987650123456789014", value = "IBAN of an account")

@Pattern(regexp="[A-Z]{2,2}[0-9]{2,2}[a-zA-Z0-9]{1,30}") 
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public AccountDetails bban(String bban) {
    this.bban = bban;
    return this;
  }

  /**
   * Basic Bank Account Number (BBAN) Identifier  This data element can be used in the body of the Consent Request   Message for retrieving Account access Consent from this Account. This   data elements is used for payment Accounts which have no IBAN.   ISO20022: Basic Bank Account Number (BBAN).       Identifier used nationally by financial institutions, i.e., in individual countries,    generally as part of a National Account Numbering Scheme(s),    which uniquely identifies the account of a customer. 
   * @return bban
  */
  @ApiModelProperty(example = "BARC12345612345678", value = "Basic Bank Account Number (BBAN) Identifier  This data element can be used in the body of the Consent Request   Message for retrieving Account access Consent from this Account. This   data elements is used for payment Accounts which have no IBAN.   ISO20022: Basic Bank Account Number (BBAN).       Identifier used nationally by financial institutions, i.e., in individual countries,    generally as part of a National Account Numbering Scheme(s),    which uniquely identifies the account of a customer. ")

@Pattern(regexp="[a-zA-Z0-9]{1,30}") 
  public String getBban() {
    return bban;
  }

  public void setBban(String bban) {
    this.bban = bban;
  }

  public AccountDetails msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

  /**
   * Mobile phone number.
   * @return msisdn
  */
  @ApiModelProperty(example = "+49 170 1234567", value = "Mobile phone number.")

@Size(max=35) 
  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public AccountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * ISO 4217 Alpha 3 currency code 
   * @return currency
  */
  @ApiModelProperty(example = "EUR", required = true, value = "ISO 4217 Alpha 3 currency code ")
  @NotNull

@Pattern(regexp="[A-Z]{3}") 
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AccountDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the account given by the bank or the PSU in online-banking.
   * @return name
  */
  @ApiModelProperty(value = "Name of the account given by the bank or the PSU in online-banking.")

@Size(max=35) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountDetails product(String product) {
    this.product = product;
    return this;
  }

  /**
   * Product name of the bank for this account, proprietary definition.
   * @return product
  */
  @ApiModelProperty(value = "Product name of the bank for this account, proprietary definition.")

@Size(max=35) 
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public AccountDetails cashAccountType(String cashAccountType) {
    this.cashAccountType = cashAccountType;
    return this;
  }

  /**
   * ExternalCashAccountType1Code from ISO 20022. 
   * @return cashAccountType
  */
  @ApiModelProperty(value = "ExternalCashAccountType1Code from ISO 20022. ")


  public String getCashAccountType() {
    return cashAccountType;
  }

  public void setCashAccountType(String cashAccountType) {
    this.cashAccountType = cashAccountType;
  }

  public AccountDetails status(AccountStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountStatus getStatus() {
    return status;
  }

  public void setStatus(AccountStatus status) {
    this.status = status;
  }

  public AccountDetails bic(String bic) {
    this.bic = bic;
    return this;
  }

  /**
   * BICFI 
   * @return bic
  */
  @ApiModelProperty(example = "AAAADEBBXXX", value = "BICFI ")

@Pattern(regexp="[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}") 
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public AccountDetails linkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
    return this;
  }

  /**
   * Case of a set of pending card transactions, the APSP will provide the relevant cash account the card is set up on.
   * @return linkedAccounts
  */
  @ApiModelProperty(value = "Case of a set of pending card transactions, the APSP will provide the relevant cash account the card is set up on.")

@Size(max=70) 
  public String getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }

  public AccountDetails usage(UsageEnum usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Specifies the usage of the account   * PRIV: private personal account   * ORGA: professional account 
   * @return usage
  */
  @ApiModelProperty(value = "Specifies the usage of the account   * PRIV: private personal account   * ORGA: professional account ")

@Size(max=4) 
  public UsageEnum getUsage() {
    return usage;
  }

  public void setUsage(UsageEnum usage) {
    this.usage = usage;
  }

  public AccountDetails details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Specifications that might be provided by the ASPSP   - characteristics of the account   - characteristics of the relevant card 
   * @return details
  */
  @ApiModelProperty(value = "Specifications that might be provided by the ASPSP   - characteristics of the account   - characteristics of the relevant card ")

@Size(max=140) 
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public AccountDetails balances(List<Balance> balances) {
    this.balances = balances;
    return this;
  }

  public AccountDetails addBalancesItem(Balance balancesItem) {
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

  public AccountDetails links(LinksAccountDetails links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")

  @Valid

  public LinksAccountDetails getLinks() {
    return links;
  }

  public void setLinks(LinksAccountDetails links) {
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
    AccountDetails accountDetails = (AccountDetails) o;
    return Objects.equals(this.resourceId, accountDetails.resourceId) &&
        Objects.equals(this.iban, accountDetails.iban) &&
        Objects.equals(this.bban, accountDetails.bban) &&
        Objects.equals(this.msisdn, accountDetails.msisdn) &&
        Objects.equals(this.currency, accountDetails.currency) &&
        Objects.equals(this.name, accountDetails.name) &&
        Objects.equals(this.product, accountDetails.product) &&
        Objects.equals(this.cashAccountType, accountDetails.cashAccountType) &&
        Objects.equals(this.status, accountDetails.status) &&
        Objects.equals(this.bic, accountDetails.bic) &&
        Objects.equals(this.linkedAccounts, accountDetails.linkedAccounts) &&
        Objects.equals(this.usage, accountDetails.usage) &&
        Objects.equals(this.details, accountDetails.details) &&
        Objects.equals(this.balances, accountDetails.balances) &&
        Objects.equals(this.links, accountDetails.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, iban, bban, msisdn, currency, name, product, cashAccountType, status, bic, linkedAccounts, usage, details, balances, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetails {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bban: ").append(toIndentedString(bban)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    cashAccountType: ").append(toIndentedString(cashAccountType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    linkedAccounts: ").append(toIndentedString(linkedAccounts)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

