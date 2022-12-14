/*
 * Formance Stack API
 * Open, modular foundation for unique payments flows  # Introduction This API is documented in **OpenAPI format**.  # Authentication Formance Stack offers one forms of authentication:   - OAuth2 OAuth2 - an open protocol to allow secure authorization in a simple and standard method from web, mobile and desktop applications. <SecurityDefinitions /> 
 *
 * The version of the OpenAPI document: v1.0.0-rc.1
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
import java.time.OffsetDateTime;

/**
 * StripeTask
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-22T14:25:59.402609Z[Etc/UTC]")
public class StripeTask {
  public static final String SERIALIZED_NAME_OLDEST_ID = "oldestId";
  @SerializedName(SERIALIZED_NAME_OLDEST_ID)
  private String oldestId;

  public static final String SERIALIZED_NAME_OLDEST_DATE = "oldestDate";
  @SerializedName(SERIALIZED_NAME_OLDEST_DATE)
  private OffsetDateTime oldestDate;

  public static final String SERIALIZED_NAME_MORE_RECENT_ID = "moreRecentId";
  @SerializedName(SERIALIZED_NAME_MORE_RECENT_ID)
  private String moreRecentId;

  public static final String SERIALIZED_NAME_MORE_RECENT_DATE = "moreRecentDate";
  @SerializedName(SERIALIZED_NAME_MORE_RECENT_DATE)
  private OffsetDateTime moreRecentDate;

  public static final String SERIALIZED_NAME_NO_MORE_HISTORY = "noMoreHistory";
  @SerializedName(SERIALIZED_NAME_NO_MORE_HISTORY)
  private Boolean noMoreHistory;

  public StripeTask() {
  }

  public StripeTask oldestId(String oldestId) {
    
    this.oldestId = oldestId;
    return this;
  }

   /**
   * The id of the oldest BalanceTransaction fetched from stripe for this account
   * @return oldestId
  **/
  @javax.annotation.Nullable

  public String getOldestId() {
    return oldestId;
  }


  public void setOldestId(String oldestId) {
    this.oldestId = oldestId;
  }


  public StripeTask oldestDate(OffsetDateTime oldestDate) {
    
    this.oldestDate = oldestDate;
    return this;
  }

   /**
   * The creation date of the oldest BalanceTransaction fetched from stripe for this account
   * @return oldestDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getOldestDate() {
    return oldestDate;
  }


  public void setOldestDate(OffsetDateTime oldestDate) {
    this.oldestDate = oldestDate;
  }


  public StripeTask moreRecentId(String moreRecentId) {
    
    this.moreRecentId = moreRecentId;
    return this;
  }

   /**
   * The id of the more recent BalanceTransaction fetched from stripe for this account
   * @return moreRecentId
  **/
  @javax.annotation.Nullable

  public String getMoreRecentId() {
    return moreRecentId;
  }


  public void setMoreRecentId(String moreRecentId) {
    this.moreRecentId = moreRecentId;
  }


  public StripeTask moreRecentDate(OffsetDateTime moreRecentDate) {
    
    this.moreRecentDate = moreRecentDate;
    return this;
  }

   /**
   * The creation date of the more recent BalanceTransaction fetched from stripe for this account
   * @return moreRecentDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getMoreRecentDate() {
    return moreRecentDate;
  }


  public void setMoreRecentDate(OffsetDateTime moreRecentDate) {
    this.moreRecentDate = moreRecentDate;
  }


  public StripeTask noMoreHistory(Boolean noMoreHistory) {
    
    this.noMoreHistory = noMoreHistory;
    return this;
  }

   /**
   * Get noMoreHistory
   * @return noMoreHistory
  **/
  @javax.annotation.Nullable

  public Boolean getNoMoreHistory() {
    return noMoreHistory;
  }


  public void setNoMoreHistory(Boolean noMoreHistory) {
    this.noMoreHistory = noMoreHistory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StripeTask stripeTask = (StripeTask) o;
    return Objects.equals(this.oldestId, stripeTask.oldestId) &&
        Objects.equals(this.oldestDate, stripeTask.oldestDate) &&
        Objects.equals(this.moreRecentId, stripeTask.moreRecentId) &&
        Objects.equals(this.moreRecentDate, stripeTask.moreRecentDate) &&
        Objects.equals(this.noMoreHistory, stripeTask.noMoreHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldestId, oldestDate, moreRecentId, moreRecentDate, noMoreHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StripeTask {\n");
    sb.append("    oldestId: ").append(toIndentedString(oldestId)).append("\n");
    sb.append("    oldestDate: ").append(toIndentedString(oldestDate)).append("\n");
    sb.append("    moreRecentId: ").append(toIndentedString(moreRecentId)).append("\n");
    sb.append("    moreRecentDate: ").append(toIndentedString(moreRecentDate)).append("\n");
    sb.append("    noMoreHistory: ").append(toIndentedString(noMoreHistory)).append("\n");
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

