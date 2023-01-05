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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * BalanceWithAssets
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-05T10:38:51.863656Z[Etc/UTC]")
public class BalanceWithAssets {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private Map<String, BigDecimal> assets = new HashMap<>();

  public BalanceWithAssets() {
  }

  public BalanceWithAssets name(String name) {
    
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


  public BalanceWithAssets assets(Map<String, BigDecimal> assets) {
    
    this.assets = assets;
    return this;
  }

  public BalanceWithAssets putAssetsItem(String key, BigDecimal assetsItem) {
    this.assets.put(key, assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @javax.annotation.Nonnull

  public Map<String, BigDecimal> getAssets() {
    return assets;
  }


  public void setAssets(Map<String, BigDecimal> assets) {
    this.assets = assets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceWithAssets balanceWithAssets = (BalanceWithAssets) o;
    return Objects.equals(this.name, balanceWithAssets.name) &&
        Objects.equals(this.assets, balanceWithAssets.assets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, assets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceWithAssets {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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

