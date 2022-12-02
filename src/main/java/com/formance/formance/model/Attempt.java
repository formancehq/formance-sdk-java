/*
 * Formance Stack API
 * Open, modular foundation for unique payments flows  # Introduction This API is documented in **OpenAPI format**.  # Authentication Formance Stack offers one forms of authentication:   - OAuth2 OAuth2 - an open protocol to allow secure authorization in a simple and standard method from web, mobile and desktop applications. <SecurityDefinitions /> 
 *
 * The version of the OpenAPI document: v0.2.8
 * Contact: support@formance.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.formance.formance.model;

import java.util.Objects;
import java.util.Arrays;
import com.formance.formance.model.WebhooksConfig;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Attempt
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T16:06:44.667212Z[Etc/UTC]")
public class Attempt {
  public static final String SERIALIZED_NAME_WEBHOOK_I_D = "webhookID";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_I_D)
  private String webhookID;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private WebhooksConfig config;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;

  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public static final String SERIALIZED_NAME_RETRY_ATTEMPT = "retryAttempt";
  @SerializedName(SERIALIZED_NAME_RETRY_ATTEMPT)
  private Integer retryAttempt;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_NEXT_RETRY_AFTER = "nextRetryAfter";
  @SerializedName(SERIALIZED_NAME_NEXT_RETRY_AFTER)
  private OffsetDateTime nextRetryAfter;

  public Attempt() {
  }

  public Attempt webhookID(String webhookID) {
    
    this.webhookID = webhookID;
    return this;
  }

   /**
   * Get webhookID
   * @return webhookID
  **/
  @javax.annotation.Nullable

  public String getWebhookID() {
    return webhookID;
  }


  public void setWebhookID(String webhookID) {
    this.webhookID = webhookID;
  }


  public Attempt date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public Attempt config(WebhooksConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable

  public WebhooksConfig getConfig() {
    return config;
  }


  public void setConfig(WebhooksConfig config) {
    this.config = config;
  }


  public Attempt payload(String payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable

  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    this.payload = payload;
  }


  public Attempt statusCode(Integer statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable

  public Integer getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public Attempt retryAttempt(Integer retryAttempt) {
    
    this.retryAttempt = retryAttempt;
    return this;
  }

   /**
   * Get retryAttempt
   * @return retryAttempt
  **/
  @javax.annotation.Nullable

  public Integer getRetryAttempt() {
    return retryAttempt;
  }


  public void setRetryAttempt(Integer retryAttempt) {
    this.retryAttempt = retryAttempt;
  }


  public Attempt status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Attempt nextRetryAfter(OffsetDateTime nextRetryAfter) {
    
    this.nextRetryAfter = nextRetryAfter;
    return this;
  }

   /**
   * Get nextRetryAfter
   * @return nextRetryAfter
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getNextRetryAfter() {
    return nextRetryAfter;
  }


  public void setNextRetryAfter(OffsetDateTime nextRetryAfter) {
    this.nextRetryAfter = nextRetryAfter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attempt attempt = (Attempt) o;
    return Objects.equals(this.webhookID, attempt.webhookID) &&
        Objects.equals(this.date, attempt.date) &&
        Objects.equals(this.config, attempt.config) &&
        Objects.equals(this.payload, attempt.payload) &&
        Objects.equals(this.statusCode, attempt.statusCode) &&
        Objects.equals(this.retryAttempt, attempt.retryAttempt) &&
        Objects.equals(this.status, attempt.status) &&
        Objects.equals(this.nextRetryAfter, attempt.nextRetryAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookID, date, config, payload, statusCode, retryAttempt, status, nextRetryAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attempt {\n");
    sb.append("    webhookID: ").append(toIndentedString(webhookID)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    retryAttempt: ").append(toIndentedString(retryAttempt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    nextRetryAfter: ").append(toIndentedString(nextRetryAfter)).append("\n");
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

