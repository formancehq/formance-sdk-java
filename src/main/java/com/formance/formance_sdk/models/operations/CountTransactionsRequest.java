/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

public class CountTransactionsRequest {

    /**
     * Filter transactions with postings involving given account, either as source or destination (regular expression placed between ^ and $).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=account")
    private Optional<String> account;

    /**
     * Filter transactions with postings involving given account at destination (regular expression placed between ^ and $).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=destination")
    private Optional<String> destination;

    /**
     * Filter transactions that occurred before this timestamp.
     * The format is RFC3339 and is exclusive (for example, "2023-01-02T15:04:01Z" excludes the first second of 4th minute).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=endTime")
    private Optional<OffsetDateTime> endTime;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    /**
     * Filter transactions by metadata key value pairs. Nested objects can be used as seen in the example below.
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    private Optional<? extends Metadata> metadata;

    /**
     * Filter transactions by reference field.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=reference")
    private Optional<String> reference;

    /**
     * Filter transactions with postings involving given account at source (regular expression placed between ^ and $).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=source")
    private Optional<String> source;

    /**
     * Filter transactions that occurred after this timestamp.
     * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=startTime")
    private Optional<OffsetDateTime> startTime;

    @JsonCreator
    public CountTransactionsRequest(
            Optional<String> account,
            Optional<String> destination,
            Optional<OffsetDateTime> endTime,
            String ledger,
            Optional<? extends Metadata> metadata,
            Optional<String> reference,
            Optional<String> source,
            Optional<OffsetDateTime> startTime) {
        Utils.checkNotNull(account, "account");
        Utils.checkNotNull(destination, "destination");
        Utils.checkNotNull(endTime, "endTime");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(source, "source");
        Utils.checkNotNull(startTime, "startTime");
        this.account = account;
        this.destination = destination;
        this.endTime = endTime;
        this.ledger = ledger;
        this.metadata = metadata;
        this.reference = reference;
        this.source = source;
        this.startTime = startTime;
    }
    
    public CountTransactionsRequest(
            String ledger) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), ledger, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Filter transactions with postings involving given account, either as source or destination (regular expression placed between ^ and $).
     */
    @JsonIgnore
    public Optional<String> account() {
        return account;
    }

    /**
     * Filter transactions with postings involving given account at destination (regular expression placed between ^ and $).
     */
    @JsonIgnore
    public Optional<String> destination() {
        return destination;
    }

    /**
     * Filter transactions that occurred before this timestamp.
     * The format is RFC3339 and is exclusive (for example, "2023-01-02T15:04:01Z" excludes the first second of 4th minute).
     */
    @JsonIgnore
    public Optional<OffsetDateTime> endTime() {
        return endTime;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    /**
     * Filter transactions by metadata key value pairs. Nested objects can be used as seen in the example below.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Metadata> metadata() {
        return (Optional<Metadata>) metadata;
    }

    /**
     * Filter transactions by reference field.
     */
    @JsonIgnore
    public Optional<String> reference() {
        return reference;
    }

    /**
     * Filter transactions with postings involving given account at source (regular expression placed between ^ and $).
     */
    @JsonIgnore
    public Optional<String> source() {
        return source;
    }

    /**
     * Filter transactions that occurred after this timestamp.
     * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
     */
    @JsonIgnore
    public Optional<OffsetDateTime> startTime() {
        return startTime;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Filter transactions with postings involving given account, either as source or destination (regular expression placed between ^ and $).
     */
    public CountTransactionsRequest withAccount(String account) {
        Utils.checkNotNull(account, "account");
        this.account = Optional.ofNullable(account);
        return this;
    }

    /**
     * Filter transactions with postings involving given account, either as source or destination (regular expression placed between ^ and $).
     */
    public CountTransactionsRequest withAccount(Optional<String> account) {
        Utils.checkNotNull(account, "account");
        this.account = account;
        return this;
    }

    /**
     * Filter transactions with postings involving given account at destination (regular expression placed between ^ and $).
     */
    public CountTransactionsRequest withDestination(String destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = Optional.ofNullable(destination);
        return this;
    }

    /**
     * Filter transactions with postings involving given account at destination (regular expression placed between ^ and $).
     */
    public CountTransactionsRequest withDestination(Optional<String> destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = destination;
        return this;
    }

    /**
     * Filter transactions that occurred before this timestamp.
     * The format is RFC3339 and is exclusive (for example, "2023-01-02T15:04:01Z" excludes the first second of 4th minute).
     */
    public CountTransactionsRequest withEndTime(OffsetDateTime endTime) {
        Utils.checkNotNull(endTime, "endTime");
        this.endTime = Optional.ofNullable(endTime);
        return this;
    }

    /**
     * Filter transactions that occurred before this timestamp.
     * The format is RFC3339 and is exclusive (for example, "2023-01-02T15:04:01Z" excludes the first second of 4th minute).
     */
    public CountTransactionsRequest withEndTime(Optional<OffsetDateTime> endTime) {
        Utils.checkNotNull(endTime, "endTime");
        this.endTime = endTime;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public CountTransactionsRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    /**
     * Filter transactions by metadata key value pairs. Nested objects can be used as seen in the example below.
     */
    public CountTransactionsRequest withMetadata(Metadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Filter transactions by metadata key value pairs. Nested objects can be used as seen in the example below.
     */
    public CountTransactionsRequest withMetadata(Optional<? extends Metadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * Filter transactions by reference field.
     */
    public CountTransactionsRequest withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    /**
     * Filter transactions by reference field.
     */
    public CountTransactionsRequest withReference(Optional<String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    /**
     * Filter transactions with postings involving given account at source (regular expression placed between ^ and $).
     */
    public CountTransactionsRequest withSource(String source) {
        Utils.checkNotNull(source, "source");
        this.source = Optional.ofNullable(source);
        return this;
    }

    /**
     * Filter transactions with postings involving given account at source (regular expression placed between ^ and $).
     */
    public CountTransactionsRequest withSource(Optional<String> source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    /**
     * Filter transactions that occurred after this timestamp.
     * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
     */
    public CountTransactionsRequest withStartTime(OffsetDateTime startTime) {
        Utils.checkNotNull(startTime, "startTime");
        this.startTime = Optional.ofNullable(startTime);
        return this;
    }

    /**
     * Filter transactions that occurred after this timestamp.
     * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
     */
    public CountTransactionsRequest withStartTime(Optional<OffsetDateTime> startTime) {
        Utils.checkNotNull(startTime, "startTime");
        this.startTime = startTime;
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
        CountTransactionsRequest other = (CountTransactionsRequest) o;
        return 
            Objects.deepEquals(this.account, other.account) &&
            Objects.deepEquals(this.destination, other.destination) &&
            Objects.deepEquals(this.endTime, other.endTime) &&
            Objects.deepEquals(this.ledger, other.ledger) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.reference, other.reference) &&
            Objects.deepEquals(this.source, other.source) &&
            Objects.deepEquals(this.startTime, other.startTime);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            account,
            destination,
            endTime,
            ledger,
            metadata,
            reference,
            source,
            startTime);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CountTransactionsRequest.class,
                "account", account,
                "destination", destination,
                "endTime", endTime,
                "ledger", ledger,
                "metadata", metadata,
                "reference", reference,
                "source", source,
                "startTime", startTime);
    }
    
    public final static class Builder {
 
        private Optional<String> account = Optional.empty();
 
        private Optional<String> destination = Optional.empty();
 
        private Optional<OffsetDateTime> endTime = Optional.empty();
 
        private String ledger;
 
        private Optional<? extends Metadata> metadata = Optional.empty();
 
        private Optional<String> reference = Optional.empty();
 
        private Optional<String> source = Optional.empty();
 
        private Optional<OffsetDateTime> startTime = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Filter transactions with postings involving given account, either as source or destination (regular expression placed between ^ and $).
         */
        public Builder account(String account) {
            Utils.checkNotNull(account, "account");
            this.account = Optional.ofNullable(account);
            return this;
        }

        /**
         * Filter transactions with postings involving given account, either as source or destination (regular expression placed between ^ and $).
         */
        public Builder account(Optional<String> account) {
            Utils.checkNotNull(account, "account");
            this.account = account;
            return this;
        }

        /**
         * Filter transactions with postings involving given account at destination (regular expression placed between ^ and $).
         */
        public Builder destination(String destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = Optional.ofNullable(destination);
            return this;
        }

        /**
         * Filter transactions with postings involving given account at destination (regular expression placed between ^ and $).
         */
        public Builder destination(Optional<String> destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = destination;
            return this;
        }

        /**
         * Filter transactions that occurred before this timestamp.
         * The format is RFC3339 and is exclusive (for example, "2023-01-02T15:04:01Z" excludes the first second of 4th minute).
         */
        public Builder endTime(OffsetDateTime endTime) {
            Utils.checkNotNull(endTime, "endTime");
            this.endTime = Optional.ofNullable(endTime);
            return this;
        }

        /**
         * Filter transactions that occurred before this timestamp.
         * The format is RFC3339 and is exclusive (for example, "2023-01-02T15:04:01Z" excludes the first second of 4th minute).
         */
        public Builder endTime(Optional<OffsetDateTime> endTime) {
            Utils.checkNotNull(endTime, "endTime");
            this.endTime = endTime;
            return this;
        }

        /**
         * Name of the ledger.
         */
        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }

        /**
         * Filter transactions by metadata key value pairs. Nested objects can be used as seen in the example below.
         */
        public Builder metadata(Metadata metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * Filter transactions by metadata key value pairs. Nested objects can be used as seen in the example below.
         */
        public Builder metadata(Optional<? extends Metadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * Filter transactions by reference field.
         */
        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = Optional.ofNullable(reference);
            return this;
        }

        /**
         * Filter transactions by reference field.
         */
        public Builder reference(Optional<String> reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        /**
         * Filter transactions with postings involving given account at source (regular expression placed between ^ and $).
         */
        public Builder source(String source) {
            Utils.checkNotNull(source, "source");
            this.source = Optional.ofNullable(source);
            return this;
        }

        /**
         * Filter transactions with postings involving given account at source (regular expression placed between ^ and $).
         */
        public Builder source(Optional<String> source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }

        /**
         * Filter transactions that occurred after this timestamp.
         * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
         */
        public Builder startTime(OffsetDateTime startTime) {
            Utils.checkNotNull(startTime, "startTime");
            this.startTime = Optional.ofNullable(startTime);
            return this;
        }

        /**
         * Filter transactions that occurred after this timestamp.
         * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
         */
        public Builder startTime(Optional<OffsetDateTime> startTime) {
            Utils.checkNotNull(startTime, "startTime");
            this.startTime = startTime;
            return this;
        }
        
        public CountTransactionsRequest build() {
            return new CountTransactionsRequest(
                account,
                destination,
                endTime,
                ledger,
                metadata,
                reference,
                source,
                startTime);
        }
    }
}
