package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.bakulinav.psd.server.model.PsuData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Content of the body of a Update PSU Authentication Request  Password subfield is used. 
 */
@ApiModel(description = "Content of the body of a Update PSU Authentication Request  Password subfield is used. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class UpdatePsuAuthentication   {
  @JsonProperty("psuData")
  private PsuData psuData = null;

  public UpdatePsuAuthentication psuData(PsuData psuData) {
    this.psuData = psuData;
    return this;
  }

  /**
   * Get psuData
   * @return psuData
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PsuData getPsuData() {
    return psuData;
  }

  public void setPsuData(PsuData psuData) {
    this.psuData = psuData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePsuAuthentication updatePsuAuthentication = (UpdatePsuAuthentication) o;
    return Objects.equals(this.psuData, updatePsuAuthentication.psuData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(psuData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePsuAuthentication {\n");
    
    sb.append("    psuData: ").append(toIndentedString(psuData)).append("\n");
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

