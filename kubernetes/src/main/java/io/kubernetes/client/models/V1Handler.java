/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1ExecAction;
import io.kubernetes.client.models.V1HTTPGetAction;
import io.kubernetes.client.models.V1TCPSocketAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Handler defines a specific action that should be taken
 */
@ApiModel(description = "Handler defines a specific action that should be taken")

public class V1Handler {
  @SerializedName("exec")
  private V1ExecAction exec = null;

  @SerializedName("httpGet")
  private V1HTTPGetAction httpGet = null;

  @SerializedName("tcpSocket")
  private V1TCPSocketAction tcpSocket = null;

  public V1Handler exec(V1ExecAction exec) {
    this.exec = exec;
    return this;
  }

   /**
   * One and only one of the following should be specified. Exec specifies the action to take.
   * @return exec
  **/
  @ApiModelProperty(value = "One and only one of the following should be specified. Exec specifies the action to take.")
  public V1ExecAction getExec() {
    return exec;
  }

  public void setExec(V1ExecAction exec) {
    this.exec = exec;
  }

  public V1Handler httpGet(V1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
    return this;
  }

   /**
   * HTTPGet specifies the http request to perform.
   * @return httpGet
  **/
  @ApiModelProperty(value = "HTTPGet specifies the http request to perform.")
  public V1HTTPGetAction getHttpGet() {
    return httpGet;
  }

  public void setHttpGet(V1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
  }

  public V1Handler tcpSocket(V1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
    return this;
  }

   /**
   * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
   * @return tcpSocket
  **/
  @ApiModelProperty(value = "TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported")
  public V1TCPSocketAction getTcpSocket() {
    return tcpSocket;
  }

  public void setTcpSocket(V1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Handler v1Handler = (V1Handler) o;
    return Objects.equals(this.exec, v1Handler.exec) &&
        Objects.equals(this.httpGet, v1Handler.httpGet) &&
        Objects.equals(this.tcpSocket, v1Handler.tcpSocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, httpGet, tcpSocket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Handler {\n");
    
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
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

