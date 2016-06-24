package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-06-24T22:09:50.540Z")
public class TrackingReminderNotificationSnooze   {
  
  private Integer id = null;

  /**
   * Id of the PENDING reminder to be snoozed
   **/
  public TrackingReminderNotificationSnooze id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "Id of the PENDING reminder to be snoozed")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingReminderNotificationSnooze trackingReminderNotificationSnooze = (TrackingReminderNotificationSnooze) o;
    return Objects.equals(id, trackingReminderNotificationSnooze.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingReminderNotificationSnooze {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
