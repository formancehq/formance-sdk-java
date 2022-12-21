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
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Secret
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-21T14:26:42.711637Z[Etc/UTC]")
public class Secret {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_DIGITS = "lastDigits";
  @SerializedName(SERIALIZED_NAME_LAST_DIGITS)
  private String lastDigits;

  public static final String SERIALIZED_NAME_CLEAR = "clear";
  @SerializedName(SERIALIZED_NAME_CLEAR)
  private String clear;

  public Secret() {
  }

  public Secret name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Secret metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public Secret putMetadataItem(String key, Object metadataItem) {
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


  public Secret id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Secret lastDigits(String lastDigits) {
    
    this.lastDigits = lastDigits;
    return this;
  }

   /**
   * Get lastDigits
   * @return lastDigits
  **/
  @javax.annotation.Nonnull

  public String getLastDigits() {
    return lastDigits;
  }


  public void setLastDigits(String lastDigits) {
    this.lastDigits = lastDigits;
  }


  public Secret clear(String clear) {
    
    this.clear = clear;
    return this;
  }

   /**
   * Get clear
   * @return clear
  **/
  @javax.annotation.Nonnull

  public String getClear() {
    return clear;
  }


  public void setClear(String clear) {
    this.clear = clear;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Secret secret = (Secret) o;
    return Objects.equals(this.name, secret.name) &&
        Objects.equals(this.metadata, secret.metadata) &&
        Objects.equals(this.id, secret.id) &&
        Objects.equals(this.lastDigits, secret.lastDigits) &&
        Objects.equals(this.clear, secret.clear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, metadata, id, lastDigits, clear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secret {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastDigits: ").append(toIndentedString(lastDigits)).append("\n");
    sb.append("    clear: ").append(toIndentedString(clear)).append("\n");
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

