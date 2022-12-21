/*
 * Formance Stack API
 * Open, modular foundation for unique payments flows  # Introduction This API is documented in **OpenAPI format**.  # Authentication Formance Stack offers one forms of authentication:   - OAuth2 OAuth2 - an open protocol to allow secure authorization in a simple and standard method from web, mobile and desktop applications. <SecurityDefinitions /> 
 *
 * The version of the OpenAPI document: develop
 * Contact: support@formance.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.formance.formance.model;

import java.util.Objects;
import java.util.Arrays;
import com.formance.formance.model.ListConnectorsConfigsResponseConnector;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * ListConnectorsConfigsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-21T14:26:42.711637Z[Etc/UTC]")
public class ListConnectorsConfigsResponse {
  public static final String SERIALIZED_NAME_CONNECTOR = "connector";
  @SerializedName(SERIALIZED_NAME_CONNECTOR)
  private ListConnectorsConfigsResponseConnector connector;

  public ListConnectorsConfigsResponse() {
  }

  public ListConnectorsConfigsResponse connector(ListConnectorsConfigsResponseConnector connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * Get connector
   * @return connector
  **/
  @javax.annotation.Nullable

  public ListConnectorsConfigsResponseConnector getConnector() {
    return connector;
  }


  public void setConnector(ListConnectorsConfigsResponseConnector connector) {
    this.connector = connector;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListConnectorsConfigsResponse listConnectorsConfigsResponse = (ListConnectorsConfigsResponse) o;
    return Objects.equals(this.connector, listConnectorsConfigsResponse.connector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListConnectorsConfigsResponse {\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
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

