package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.bakulinav.psd.server.model.CardTransaction;
import net.bakulinav.psd.server.model.LinksCardAccountReport;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON based card account report.  This card account report contains transactions resulting from the query parameters. 
 */
@ApiModel(description = "JSON based card account report.  This card account report contains transactions resulting from the query parameters. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class CardAccountReport   {
  @JsonProperty("booked")
  @Valid
  private List<CardTransaction> booked = new ArrayList<>();

  @JsonProperty("pending")
  @Valid
  private List<CardTransaction> pending = null;

  @JsonProperty("_links")
  private LinksCardAccountReport links = null;

  public CardAccountReport booked(List<CardTransaction> booked) {
    this.booked = booked;
    return this;
  }

  public CardAccountReport addBookedItem(CardTransaction bookedItem) {
    this.booked.add(bookedItem);
    return this;
  }

  /**
   * Array of transaction details
   * @return booked
  */
  @ApiModelProperty(required = true, value = "Array of transaction details")
  @NotNull

  @Valid

  public List<CardTransaction> getBooked() {
    return booked;
  }

  public void setBooked(List<CardTransaction> booked) {
    this.booked = booked;
  }

  public CardAccountReport pending(List<CardTransaction> pending) {
    this.pending = pending;
    return this;
  }

  public CardAccountReport addPendingItem(CardTransaction pendingItem) {
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

  public List<CardTransaction> getPending() {
    return pending;
  }

  public void setPending(List<CardTransaction> pending) {
    this.pending = pending;
  }

  public CardAccountReport links(LinksCardAccountReport links) {
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

  public LinksCardAccountReport getLinks() {
    return links;
  }

  public void setLinks(LinksCardAccountReport links) {
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
    CardAccountReport cardAccountReport = (CardAccountReport) o;
    return Objects.equals(this.booked, cardAccountReport.booked) &&
        Objects.equals(this.pending, cardAccountReport.pending) &&
        Objects.equals(this.links, cardAccountReport.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(booked, pending, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardAccountReport {\n");
    
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

