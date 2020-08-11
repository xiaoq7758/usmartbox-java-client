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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * RemoteTakeOutHistoryResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-11T11:22:01.772Z[GMT]")
public class RemoteTakeOutHistoryResponse extends BasicApiResponse {
  @SerializedName("status")
  private String status = null;

  public RemoteTakeOutHistoryResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 1未取走;2用户取走;3快递员取出;4系统复原
   * @return status
  **/
  @Schema(description = "1未取走;2用户取走;3快递员取出;4系统复原")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteTakeOutHistoryResponse remoteTakeOutHistoryResponse = (RemoteTakeOutHistoryResponse) o;
    return Objects.equals(this.status, remoteTakeOutHistoryResponse.status) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteTakeOutHistoryResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
