/*
 * 电商对接API参考文档
 * 电商对接API参考文档
 *
 * OpenAPI spec version: 2.2.2
 * Contact: qyang@yicksolutions.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.BasicApiResponse;
import io.swagger.client.model.Box;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * BranchBoxSearchResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-11T11:22:01.772Z[GMT]")
public class BranchBoxSearchResponse extends BasicApiResponse {
  @SerializedName("list")
  private List<Box> list = null;

  public BranchBoxSearchResponse list(List<Box> list) {
    this.list = list;
    return this;
  }

  public BranchBoxSearchResponse addListItem(Box listItem) {
    if (this.list == null) {
      this.list = new ArrayList<Box>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @Schema(description = "")
  public List<Box> getList() {
    return list;
  }

  public void setList(List<Box> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchBoxSearchResponse branchBoxSearchResponse = (BranchBoxSearchResponse) o;
    return Objects.equals(this.list, branchBoxSearchResponse.list) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchBoxSearchResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
