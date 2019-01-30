package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.bakulinav.psd.server.model.LinksAccountReport;
import net.bakulinav.psd.server.model.TransactionDetails;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON based account report. This account report contains transactions resulting from the query parameters.  &#39;booked&#39; shall be contained if bookingStatus parameter is set to \&quot;booked\&quot; or \&quot;both\&quot;.  &#39;pending&#39; is not contained if the bookingStatus parameter is set to \&quot;booked\&quot;. 
 */
@ApiModel(description = "JSON based account report. This account report contains transactions resulting from the query parameters.  'booked' shall be contained if bookingStatus parameter is set to \"booked\" or \"both\".  'pending' is not contained if the bookingStatus parameter is set to \"booked\". ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class AccountReport   {
  @JsonProperty("booked")
  @Valid
  private List<TransactionDetails> booked = null;

  @JsonProperty("pending")
  @Valid
  private List<TransactionDetails> pending = null;

  @JsonProperty("_links")
  private LinksAccountReport links = null;

  public AccountReport booked(List<TransactionDetails> booked) {
    this.booked = booked;
    return this;
  }

  public AccountReport addBookedItem(TransactionDetails bookedItem) {
    if (this.booked == null) {
      this.booked = new ArrayList<>();
    }
    this.booked.add(bookedItem);
    return this;
  }

  /**
   * Array of transaction details
   * @return booked
  */
  @ApiModelProperty(value = "Array of transaction details")

  @Valid

  public List<TransactionDetails> getBooked() {
    return booked;
  }

  public void setBooked(List<TransactionDetails> booked) {
    this.booked = booked;
  }

  public AccountReport pending(List<TransactionDetails> pending) {
    this.pending = pending;
    return this;
  }

  public AccountReport addPendingItem(TransactionDetails pendingItem) {
    if (this.pending == null) {
      this.pending = new ArrayList<>();
    }
    this.pending.add(pendingItem);
    return this;
  }

  /**
   * Array of transaction details
   * @return pending
  */
  @ApiModelProperty(value = "Array of transaction details")

  @Valid

  public List<TransactionDetails> getPending() {
    return pending;
  }

  public void setPending(List<TransactionDetails> pending) {
    this.pending = pending;
  }

  public AccountReport links(LinksAccountReport links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LinksAccountReport getLinks() {
    return links;
  }

  public void setLinks(LinksAccountReport links) {
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
    AccountReport accountReport = (AccountReport) o;
    return Objects.equals(this.booked, accountReport.booked) &&
        Objects.equals(this.pending, accountReport.pending) &&
        Objects.equals(this.links, accountReport.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(booked, pending, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountReport {\n");
    
    sb.append("    booked: ").append(toIndentedString(booked)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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

