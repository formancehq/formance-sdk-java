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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ListConnectorsConfigsResponseConnectorKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T18:11:33.896070Z[Etc/UTC]")
public class ListConnectorsConfigsResponseConnectorKey {
  public static final String SERIALIZED_NAME_DATATYPE = "datatype";
  @SerializedName(SERIALIZED_NAME_DATATYPE)
  private String datatype;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public ListConnectorsConfigsResponseConnectorKey() {
  }

  public ListConnectorsConfigsResponseConnectorKey datatype(String datatype) {
    
    this.datatype = datatype;
    return this;
  }

   /**
   * Get datatype
   * @return datatype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatatype() {
    return datatype;
  }


  public void setDatatype(String datatype) {
    this.datatype = datatype;
  }


  public ListConnectorsConfigsResponseConnectorKey required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListConnectorsConfigsResponseConnectorKey listConnectorsConfigsResponseConnectorKey = (ListConnectorsConfigsResponseConnectorKey) o;
    return Objects.equals(this.datatype, listConnectorsConfigsResponseConnectorKey.datatype) &&
        Objects.equals(this.required, listConnectorsConfigsResponseConnectorKey.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datatype, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListConnectorsConfigsResponseConnectorKey {\n");
    sb.append("    datatype: ").append(toIndentedString(datatype)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

