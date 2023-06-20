/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import org.openapis.openapi.utils.DateTimeDeserializer;
import org.openapis.openapi.utils.DateTimeSerializer;

public class WebhooksConfig {
    @JsonProperty("active")
    public Boolean active;

    public WebhooksConfig withActive(Boolean active) {
        this.active = active;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;

    public WebhooksConfig withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("endpoint")
    public String endpoint;

    public WebhooksConfig withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    
    @JsonProperty("eventTypes")
    public String[] eventTypes;

    public WebhooksConfig withEventTypes(String[] eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    
    @JsonProperty("id")
    public String id;

    public WebhooksConfig withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("secret")
    public String secret;

    public WebhooksConfig withSecret(String secret) {
        this.secret = secret;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updatedAt")
    public OffsetDateTime updatedAt;

    public WebhooksConfig withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public WebhooksConfig(@JsonProperty("active") Boolean active, @JsonProperty("createdAt") OffsetDateTime createdAt, @JsonProperty("endpoint") String endpoint, @JsonProperty("eventTypes") String[] eventTypes, @JsonProperty("id") String id, @JsonProperty("secret") String secret, @JsonProperty("updatedAt") OffsetDateTime updatedAt) {
        this.active = active;
        this.createdAt = createdAt;
        this.endpoint = endpoint;
        this.eventTypes = eventTypes;
        this.id = id;
        this.secret = secret;
        this.updatedAt = updatedAt;
  }
}
