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
import com.formance.formance.model.LedgerStorage;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * Config
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T10:57:38.704831Z[Etc/UTC]")
public class Config {
  public static final String SERIALIZED_NAME_STORAGE = "storage";
  @SerializedName(SERIALIZED_NAME_STORAGE)
  private LedgerStorage storage;

  public Config() {
  }

  public Config storage(LedgerStorage storage) {
    
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @javax.annotation.Nonnull

  public LedgerStorage getStorage() {
    return storage;
  }


  public void setStorage(LedgerStorage storage) {
    this.storage = storage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Config config = (Config) o;
    return Objects.equals(this.storage, config.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Config {\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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

