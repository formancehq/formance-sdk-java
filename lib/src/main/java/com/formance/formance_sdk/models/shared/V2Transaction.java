/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.DateTimeDeserializer;
import com.formance.formance_sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;


public class V2Transaction {
    @JsonProperty("id")
    public Long id;

    public V2Transaction withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("metadata")
    public java.util.Map<String, String> metadata;

    public V2Transaction withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonProperty("postings")
    public V2Posting[] postings;

    public V2Transaction withPostings(V2Posting[] postings) {
        this.postings = postings;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    public String reference;

    public V2Transaction withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    @JsonProperty("reverted")
    public Boolean reverted;

    public V2Transaction withReverted(Boolean reverted) {
        this.reverted = reverted;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("timestamp")
    public OffsetDateTime timestamp;

    public V2Transaction withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    
    public V2Transaction(@JsonProperty("id") Long id, @JsonProperty("metadata") java.util.Map<String, String> metadata, @JsonProperty("postings") V2Posting[] postings, @JsonProperty("reverted") Boolean reverted, @JsonProperty("timestamp") OffsetDateTime timestamp) {
        this.id = id;
        this.metadata = metadata;
        this.postings = postings;
        this.reverted = reverted;
        this.timestamp = timestamp;
  }
}
