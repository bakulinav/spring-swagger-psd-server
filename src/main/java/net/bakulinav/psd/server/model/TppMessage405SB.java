package net.bakulinav.psd.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.bakulinav.psd.server.model.MessageCode405SB;
import net.bakulinav.psd.server.model.TppMessageCategory;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TppMessage405SB
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

public class TppMessage405SB   {
  @JsonProperty("category")
  private TppMessageCategory category = null;

  @JsonProperty("code")
  private MessageCode405SB code = null;

  @JsonProperty("path")
  private String path;

  @JsonProperty("text")
  private String text;

  public TppMessage405SB category(TppMessageCategory category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TppMessageCategory getCategory() {
    return category;
  }

  public void setCategory(TppMessageCategory category) {
    this.category = category;
  }

  public TppMessage405SB code(MessageCode405SB code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public MessageCode405SB getCode() {
    return code;
  }

  public void setCode(MessageCode405SB code) {
    this.code = code;
  }

  public TppMessage405SB path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  @ApiModelProperty(value = "")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public TppMessage405SB text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Additional explaining text to the TPP.
   * @return text
  */
  @ApiModelProperty(value = "Additional explaining text to the TPP.")

@Size(max=512) 
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TppMessage405SB tppMessage405SB = (TppMessage405SB) o;
    return Objects.equals(this.category, tppMessage405SB.category) &&
        Objects.equals(this.code, tppMessage405SB.code) &&
        Objects.equals(this.path, tppMessage405SB.path) &&
        Objects.equals(this.text, tppMessage405SB.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, code, path, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TppMessage405SB {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

