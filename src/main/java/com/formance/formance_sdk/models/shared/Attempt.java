/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;


public class Attempt {

    @JsonProperty("config")
    private WebhooksConfig config;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("id")
    private String id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nextRetryAfter")
    private Optional<? extends OffsetDateTime> nextRetryAfter;

    @JsonProperty("payload")
    private String payload;

    @JsonProperty("retryAttempt")
    private long retryAttempt;

    @JsonProperty("status")
    private String status;

    @JsonProperty("statusCode")
    private long statusCode;

    @JsonProperty("updatedAt")
    private OffsetDateTime updatedAt;

    @JsonProperty("webhookID")
    private String webhookID;

    public Attempt(
            @JsonProperty("config") WebhooksConfig config,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("id") String id,
            @JsonProperty("nextRetryAfter") Optional<? extends OffsetDateTime> nextRetryAfter,
            @JsonProperty("payload") String payload,
            @JsonProperty("retryAttempt") long retryAttempt,
            @JsonProperty("status") String status,
            @JsonProperty("statusCode") long statusCode,
            @JsonProperty("updatedAt") OffsetDateTime updatedAt,
            @JsonProperty("webhookID") String webhookID) {
        Utils.checkNotNull(config, "config");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(nextRetryAfter, "nextRetryAfter");
        Utils.checkNotNull(payload, "payload");
        Utils.checkNotNull(retryAttempt, "retryAttempt");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(webhookID, "webhookID");
        this.config = config;
        this.createdAt = createdAt;
        this.id = id;
        this.nextRetryAfter = nextRetryAfter;
        this.payload = payload;
        this.retryAttempt = retryAttempt;
        this.status = status;
        this.statusCode = statusCode;
        this.updatedAt = updatedAt;
        this.webhookID = webhookID;
    }

    public WebhooksConfig config() {
        return config;
    }

    public OffsetDateTime createdAt() {
        return createdAt;
    }

    public String id() {
        return id;
    }

    public Optional<? extends OffsetDateTime> nextRetryAfter() {
        return nextRetryAfter;
    }

    public String payload() {
        return payload;
    }

    public long retryAttempt() {
        return retryAttempt;
    }

    public String status() {
        return status;
    }

    public long statusCode() {
        return statusCode;
    }

    public OffsetDateTime updatedAt() {
        return updatedAt;
    }

    public String webhookID() {
        return webhookID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Attempt withConfig(WebhooksConfig config) {
        Utils.checkNotNull(config, "config");
        this.config = config;
        return this;
    }

    public Attempt withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public Attempt withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Attempt withNextRetryAfter(OffsetDateTime nextRetryAfter) {
        Utils.checkNotNull(nextRetryAfter, "nextRetryAfter");
        this.nextRetryAfter = Optional.ofNullable(nextRetryAfter);
        return this;
    }

    public Attempt withNextRetryAfter(Optional<? extends OffsetDateTime> nextRetryAfter) {
        Utils.checkNotNull(nextRetryAfter, "nextRetryAfter");
        this.nextRetryAfter = nextRetryAfter;
        return this;
    }

    public Attempt withPayload(String payload) {
        Utils.checkNotNull(payload, "payload");
        this.payload = payload;
        return this;
    }

    public Attempt withRetryAttempt(long retryAttempt) {
        Utils.checkNotNull(retryAttempt, "retryAttempt");
        this.retryAttempt = retryAttempt;
        return this;
    }

    public Attempt withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public Attempt withStatusCode(long statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    public Attempt withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public Attempt withWebhookID(String webhookID) {
        Utils.checkNotNull(webhookID, "webhookID");
        this.webhookID = webhookID;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Attempt other = (Attempt) o;
        return 
            java.util.Objects.deepEquals(this.config, other.config) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.nextRetryAfter, other.nextRetryAfter) &&
            java.util.Objects.deepEquals(this.payload, other.payload) &&
            java.util.Objects.deepEquals(this.retryAttempt, other.retryAttempt) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            java.util.Objects.deepEquals(this.webhookID, other.webhookID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            config,
            createdAt,
            id,
            nextRetryAfter,
            payload,
            retryAttempt,
            status,
            statusCode,
            updatedAt,
            webhookID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Attempt.class,
                "config", config,
                "createdAt", createdAt,
                "id", id,
                "nextRetryAfter", nextRetryAfter,
                "payload", payload,
                "retryAttempt", retryAttempt,
                "status", status,
                "statusCode", statusCode,
                "updatedAt", updatedAt,
                "webhookID", webhookID);
    }
    
    public final static class Builder {
 
        private WebhooksConfig config;
 
        private OffsetDateTime createdAt;
 
        private String id;
 
        private Optional<? extends OffsetDateTime> nextRetryAfter = Optional.empty();
 
        private String payload;
 
        private Long retryAttempt;
 
        private String status;
 
        private Long statusCode;
 
        private OffsetDateTime updatedAt;
 
        private String webhookID;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder config(WebhooksConfig config) {
            Utils.checkNotNull(config, "config");
            this.config = config;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder nextRetryAfter(OffsetDateTime nextRetryAfter) {
            Utils.checkNotNull(nextRetryAfter, "nextRetryAfter");
            this.nextRetryAfter = Optional.ofNullable(nextRetryAfter);
            return this;
        }

        public Builder nextRetryAfter(Optional<? extends OffsetDateTime> nextRetryAfter) {
            Utils.checkNotNull(nextRetryAfter, "nextRetryAfter");
            this.nextRetryAfter = nextRetryAfter;
            return this;
        }

        public Builder payload(String payload) {
            Utils.checkNotNull(payload, "payload");
            this.payload = payload;
            return this;
        }

        public Builder retryAttempt(long retryAttempt) {
            Utils.checkNotNull(retryAttempt, "retryAttempt");
            this.retryAttempt = retryAttempt;
            return this;
        }

        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder statusCode(long statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder webhookID(String webhookID) {
            Utils.checkNotNull(webhookID, "webhookID");
            this.webhookID = webhookID;
            return this;
        }
        
        public Attempt build() {
            return new Attempt(
                config,
                createdAt,
                id,
                nextRetryAfter,
                payload,
                retryAttempt,
                status,
                statusCode,
                updatedAt,
                webhookID);
        }
    }
}

