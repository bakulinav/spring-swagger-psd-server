package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.bakulinav.psd.server.model.LinksAll;
import net.bakulinav.psd.server.model.TppMessage405PIIS;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 401. 
 */
@ApiModel(description = "NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 401. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class Error405NGPIIS   {
  @JsonProperty("tppMessages")
  @Valid
  private List<TppMessage405PIIS> tppMessages = null;

  @JsonProperty("_links")
  private LinksAll links = null;

  public Error405NGPIIS tppMessages(List<TppMessage405PIIS> tppMessages) {
    this.tppMessages = tppMessages;
    return this;
  }

  public Error405NGPIIS addTppMessagesItem(TppMessage405PIIS tppMessagesItem) {
    if (this.tppMessages == null) {
      this.tppMessages = new ArrayList<>();
    }
    this.tppMessages.add(tppMessagesItem);
    return this;
  }

  /**
   * Get tppMessages
   * @return tppMessages
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TppMessage405PIIS> getTppMessages() {
    return tppMessages;
  }

  public void setTppMessages(List<TppMessage405PIIS> tppMessages) {
    this.tppMessages = tppMessages;
  }

  public Error405NGPIIS links(LinksAll links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")

  @Valid

  public LinksAll getLinks() {
    return links;
  }

  public void setLinks(LinksAll links) {
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
    Error405NGPIIS error405NGPIIS = (Error405NGPIIS) o;
    return Objects.equals(this.tppMessages, error405NGPIIS.tppMessages) &&
        Objects.equals(this.links, error405NGPIIS.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tppMessages, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error405NGPIIS {\n");
    
    sb.append("    tppMessages: ").append(toIndentedString(tppMessages)).append("\n");
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

