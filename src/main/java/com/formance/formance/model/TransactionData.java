/*
 * Formance Stack API
 * Open, modular foundation for unique payments flows  # Introduction This API is documented in **OpenAPI format**.  # Authentication Formance Stack offers one forms of authentication:   - OAuth2 OAuth2 - an open protocol to allow secure authorization in a simple and standard method from web, mobile and desktop applications. <SecurityDefinitions /> 
 *
 * The version of the OpenAPI document: v0.2.4
 * Contact: support@formance.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.formance.formance.model;

import java.util.Objects;
import java.util.Arrays;
import com.formance.formance.model.Posting;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TransactionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T17:30:16.973538Z[Etc/UTC]")
public class TransactionData {
  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_POSTINGS = "postings";
  @SerializedName(SERIALIZED_NAME_POSTINGS)
  private List<Posting> postings = new ArrayList<>();

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = null;

  public TransactionData() {
  }

  public TransactionData timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public TransactionData postings(List<Posting> postings) {
    
    this.postings = postings;
    return this;
  }

  public TransactionData addPostingsItem(Posting postingsItem) {
    this.postings.add(postingsItem);
    return this;
  }

   /**
   * Get postings
   * @return postings
  **/
  @javax.annotation.Nonnull

  public List<Posting> getPostings() {
    return postings;
  }


  public void setPostings(List<Posting> postings) {
    this.postings = postings;
  }


  public TransactionData reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public TransactionData metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public TransactionData putMetadataItem(String key, Object metadataItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionData transactionData = (TransactionData) o;
    return Objects.equals(this.timestamp, transactionData.timestamp) &&
        Objects.equals(this.postings, transactionData.postings) &&
        Objects.equals(this.reference, transactionData.reference) &&
        Objects.equals(this.metadata, transactionData.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, postings, reference, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionData {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    postings: ").append(toIndentedString(postings)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

