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
import java.util.ArrayList;
import java.util.List;

/**
 * ScopeAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-06T13:21:14.001446Z[Etc/UTC]")
public class ScopeAllOf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TRANSIENT = "transient";
  @SerializedName(SERIALIZED_NAME_TRANSIENT)
  private List<String> _transient = null;

  public ScopeAllOf() {
  }

  public ScopeAllOf id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ScopeAllOf _transient(List<String> _transient) {
    
    this._transient = _transient;
    return this;
  }

  public ScopeAllOf addTransientItem(String _transientItem) {
    if (this._transient == null) {
      this._transient = new ArrayList<>();
    }
    this._transient.add(_transientItem);
    return this;
  }

   /**
   * Get _transient
   * @return _transient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTransient() {
    return _transient;
  }


  public void setTransient(List<String> _transient) {
    this._transient = _transient;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScopeAllOf scopeAllOf = (ScopeAllOf) o;
    return Objects.equals(this.id, scopeAllOf.id) &&
        Objects.equals(this._transient, scopeAllOf._transient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _transient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScopeAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _transient: ").append(toIndentedString(_transient)).append("\n");
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

