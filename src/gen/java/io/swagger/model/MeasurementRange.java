package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-06-24T22:09:50.540Z")
public class MeasurementRange   {
  
  private Integer lowerLimit = null;
  private Integer upperLimit = null;

  /**
   * The timestamp of the earliest measurement for a user.
   **/
  public MeasurementRange lowerLimit(Integer lowerLimit) {
    this.lowerLimit = lowerLimit;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The timestamp of the earliest measurement for a user.")
  @JsonProperty("lowerLimit")
  public Integer getLowerLimit() {
    return lowerLimit;
  }
  public void setLowerLimit(Integer lowerLimit) {
    this.lowerLimit = lowerLimit;
  }

  /**
   * The timestamp of the most recent measurement for a user.
   **/
  public MeasurementRange upperLimit(Integer upperLimit) {
    this.upperLimit = upperLimit;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "The timestamp of the most recent measurement for a user.")
  @JsonProperty("upperLimit")
  public Integer getUpperLimit() {
    return upperLimit;
  }
  public void setUpperLimit(Integer upperLimit) {
    this.upperLimit = upperLimit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementRange measurementRange = (MeasurementRange) o;
    return Objects.equals(lowerLimit, measurementRange.lowerLimit) &&
        Objects.equals(upperLimit, measurementRange.upperLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lowerLimit, upperLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementRange {\n");
    
    sb.append("    lowerLimit: ").append(toIndentedString(lowerLimit)).append("\n");
    sb.append("    upperLimit: ").append(toIndentedString(upperLimit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

