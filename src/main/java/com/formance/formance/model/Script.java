/*
 * Formance Stack API
 * Open, modular foundation for unique payments flows  # Introduction This API is documented in **OpenAPI format**.  # Authentication Formance Stack offers one forms of authentication:   - OAuth2 OAuth2 - an open protocol to allow secure authorization in a simple and standard method from web, mobile and desktop applications. <SecurityDefinitions /> 
 *
 * The version of the OpenAPI document: SDK_VERSION
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
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Script
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T11:06:23.894642Z[Etc/UTC]")
public class Script {
  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = null;

  public static final String SERIALIZED_NAME_PLAIN = "plain";
  @SerializedName(SERIALIZED_NAME_PLAIN)
  private String plain;

  public static final String SERIALIZED_NAME_VARS = "vars";
  @SerializedName(SERIALIZED_NAME_VARS)
  private Object vars;

  public Script() {
  }

  public Script reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Reference to attach to the generated transaction
   * @return reference
  **/
  @javax.annotation.Nullable

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public Script metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public Script putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public Script plain(String plain) {
    
    this.plain = plain;
    return this;
  }

   /**
   * Get plain
   * @return plain
  **/
  @javax.annotation.Nonnull

  public String getPlain() {
    return plain;
  }


  public void setPlain(String plain) {
    this.plain = plain;
  }


  public Script vars(Object vars) {
    
    this.vars = vars;
    return this;
  }

   /**
   * Get vars
   * @return vars
  **/
  @javax.annotation.Nullable

  public Object getVars() {
    return vars;
  }


  public void setVars(Object vars) {
    this.vars = vars;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Script script = (Script) o;
    return Objects.equals(this.reference, script.reference) &&
        Objects.equals(this.metadata, script.metadata) &&
        Objects.equals(this.plain, script.plain) &&
        Objects.equals(this.vars, script.vars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, metadata, plain, vars);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Script {\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    plain: ").append(toIndentedString(plain)).append("\n");
    sb.append("    vars: ").append(toIndentedString(vars)).append("\n");
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

