/*
 * Formance Stack API
 * Open, modular foundation for unique payments flows  # Introduction This API is documented in **OpenAPI format**.  # Authentication Formance Stack offers one forms of authentication:   - OAuth2 OAuth2 - an open protocol to allow secure authorization in a simple and standard method from web, mobile and desktop applications. <SecurityDefinitions /> 
 *
 * The version of the OpenAPI document: v0.2.6
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

/**
 * StripeConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T15:55:56.337030Z[Etc/UTC]")
public class StripeConfig {
  public static final String SERIALIZED_NAME_POLLING_PERIOD = "pollingPeriod";
  @SerializedName(SERIALIZED_NAME_POLLING_PERIOD)
  private String pollingPeriod = "120s";

  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private BigDecimal pageSize = new BigDecimal("10");

  public StripeConfig() {
  }

  public StripeConfig pollingPeriod(String pollingPeriod) {
    
    this.pollingPeriod = pollingPeriod;
    return this;
  }

   /**
   * The frequency at which the connector will try to fetch new BalanceTransaction objects from Stripe api
   * @return pollingPeriod
  **/
  @javax.annotation.Nullable

  public String getPollingPeriod() {
    return pollingPeriod;
  }


  public void setPollingPeriod(String pollingPeriod) {
    this.pollingPeriod = pollingPeriod;
  }


  public StripeConfig apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nonnull

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public StripeConfig pageSize(BigDecimal pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Number of BalanceTransaction to fetch at each polling interval. 
   * @return pageSize
  **/
  @javax.annotation.Nullable

  public BigDecimal getPageSize() {
    return pageSize;
  }


  public void setPageSize(BigDecimal pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StripeConfig stripeConfig = (StripeConfig) o;
    return Objects.equals(this.pollingPeriod, stripeConfig.pollingPeriod) &&
        Objects.equals(this.apiKey, stripeConfig.apiKey) &&
        Objects.equals(this.pageSize, stripeConfig.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pollingPeriod, apiKey, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StripeConfig {\n");
    sb.append("    pollingPeriod: ").append(toIndentedString(pollingPeriod)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

