package io.swagger.model;

import io.swagger.model.UnitCategory;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2015-11-03T22:24:05.648Z")
public class InlineResponse20015  {
  
  private List<UnitCategory> data = new ArrayList<UnitCategory>();
  private Boolean success = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public List<UnitCategory> getData() {
    return data;
  }
  public void setData(List<UnitCategory> data) {
    this.data = data;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20015 {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}