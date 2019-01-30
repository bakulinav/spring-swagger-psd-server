package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.bakulinav.psd.server.model.LinksAll;
import net.bakulinav.psd.server.model.TppMessage429AIS;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 429. 
 */
@ApiModel(description = "NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 429. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class Error429NGAIS   {
  @JsonProperty("tppMessages")
  @Valid
  private List<TppMessage429AIS> tppMessages = null;

  @JsonProperty("_links")
  private LinksAll links = null;

  public Error429NGAIS tppMessages(List<TppMessage429AIS> tppMessages) {
    this.tppMessages = tppMessages;
    return this;
  }

  public Error429NGAIS addTppMessagesItem(TppMessage429AIS tppMessagesItem) {
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

  public List<TppMessage429AIS> getTppMessages() {
    return tppMessages;
  }

  public void setTppMessages(List<TppMessage429AIS> tppMessages) {
    this.tppMessages = tppMessages;
  }

  public Error429NGAIS links(LinksAll links) {
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
    Error429NGAIS error429NGAIS = (Error429NGAIS) o;
    return Objects.equals(this.tppMessages, error429NGAIS.tppMessages) &&
        Objects.equals(this.links, error429NGAIS.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tppMessages, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error429NGAIS {\n");
    
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

