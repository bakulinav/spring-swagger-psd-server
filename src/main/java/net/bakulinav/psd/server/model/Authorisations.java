package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An array of all authorisationIds
 */
@ApiModel(description = "An array of all authorisationIds")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class Authorisations   {
  @JsonProperty("authorisationIds")
  @Valid
  private List<String> authorisationIds = new ArrayList<>();

  public Authorisations authorisationIds(List<String> authorisationIds) {
    this.authorisationIds = authorisationIds;
    return this;
  }

  public Authorisations addAuthorisationIdsItem(String authorisationIdsItem) {
    this.authorisationIds.add(authorisationIdsItem);
    return this;
  }

  /**
   * An array of all authorisationIds
   * @return authorisationIds
  */
  @ApiModelProperty(required = true, value = "An array of all authorisationIds")
  @NotNull


  public List<String> getAuthorisationIds() {
    return authorisationIds;
  }

  public void setAuthorisationIds(List<String> authorisationIds) {
    this.authorisationIds = authorisationIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authorisations authorisations = (Authorisations) o;
    return Objects.equals(this.authorisationIds, authorisations.authorisationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorisationIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authorisations {\n");
    
    sb.append("    authorisationIds: ").append(toIndentedString(authorisationIds)).append("\n");
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

