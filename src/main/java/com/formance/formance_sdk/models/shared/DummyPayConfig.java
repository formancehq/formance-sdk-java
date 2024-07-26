/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.LazySingletonValue;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class DummyPayConfig {

    @JsonProperty("directory")
    private String directory;

    /**
     * The frequency at which the connector will try to fetch new payment objects from the directory
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filePollingPeriod")
    private Optional<? extends String> filePollingPeriod;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("numberOfAccountsPreGenerated")
    private Optional<? extends Long> numberOfAccountsPreGenerated;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("numberOfPaymentsPreGenerated")
    private Optional<? extends Long> numberOfPaymentsPreGenerated;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prefixFileToIngest")
    private Optional<? extends String> prefixFileToIngest;

    @JsonCreator
    public DummyPayConfig(
            @JsonProperty("directory") String directory,
            @JsonProperty("filePollingPeriod") Optional<? extends String> filePollingPeriod,
            @JsonProperty("name") String name,
            @JsonProperty("numberOfAccountsPreGenerated") Optional<? extends Long> numberOfAccountsPreGenerated,
            @JsonProperty("numberOfPaymentsPreGenerated") Optional<? extends Long> numberOfPaymentsPreGenerated,
            @JsonProperty("prefixFileToIngest") Optional<? extends String> prefixFileToIngest) {
        Utils.checkNotNull(directory, "directory");
        Utils.checkNotNull(filePollingPeriod, "filePollingPeriod");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(numberOfAccountsPreGenerated, "numberOfAccountsPreGenerated");
        Utils.checkNotNull(numberOfPaymentsPreGenerated, "numberOfPaymentsPreGenerated");
        Utils.checkNotNull(prefixFileToIngest, "prefixFileToIngest");
        this.directory = directory;
        this.filePollingPeriod = filePollingPeriod;
        this.name = name;
        this.numberOfAccountsPreGenerated = numberOfAccountsPreGenerated;
        this.numberOfPaymentsPreGenerated = numberOfPaymentsPreGenerated;
        this.prefixFileToIngest = prefixFileToIngest;
    }
    
    public DummyPayConfig(
            String directory,
            String name) {
        this(directory, Optional.empty(), name, Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String directory() {
        return directory;
    }

    /**
     * The frequency at which the connector will try to fetch new payment objects from the directory
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> filePollingPeriod() {
        return (Optional<String>) filePollingPeriod;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> numberOfAccountsPreGenerated() {
        return (Optional<Long>) numberOfAccountsPreGenerated;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> numberOfPaymentsPreGenerated() {
        return (Optional<Long>) numberOfPaymentsPreGenerated;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> prefixFileToIngest() {
        return (Optional<String>) prefixFileToIngest;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DummyPayConfig withDirectory(String directory) {
        Utils.checkNotNull(directory, "directory");
        this.directory = directory;
        return this;
    }

    /**
     * The frequency at which the connector will try to fetch new payment objects from the directory
     */
    public DummyPayConfig withFilePollingPeriod(String filePollingPeriod) {
        Utils.checkNotNull(filePollingPeriod, "filePollingPeriod");
        this.filePollingPeriod = Optional.ofNullable(filePollingPeriod);
        return this;
    }

    /**
     * The frequency at which the connector will try to fetch new payment objects from the directory
     */
    public DummyPayConfig withFilePollingPeriod(Optional<? extends String> filePollingPeriod) {
        Utils.checkNotNull(filePollingPeriod, "filePollingPeriod");
        this.filePollingPeriod = filePollingPeriod;
        return this;
    }

    public DummyPayConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public DummyPayConfig withNumberOfAccountsPreGenerated(long numberOfAccountsPreGenerated) {
        Utils.checkNotNull(numberOfAccountsPreGenerated, "numberOfAccountsPreGenerated");
        this.numberOfAccountsPreGenerated = Optional.ofNullable(numberOfAccountsPreGenerated);
        return this;
    }

    public DummyPayConfig withNumberOfAccountsPreGenerated(Optional<? extends Long> numberOfAccountsPreGenerated) {
        Utils.checkNotNull(numberOfAccountsPreGenerated, "numberOfAccountsPreGenerated");
        this.numberOfAccountsPreGenerated = numberOfAccountsPreGenerated;
        return this;
    }

    public DummyPayConfig withNumberOfPaymentsPreGenerated(long numberOfPaymentsPreGenerated) {
        Utils.checkNotNull(numberOfPaymentsPreGenerated, "numberOfPaymentsPreGenerated");
        this.numberOfPaymentsPreGenerated = Optional.ofNullable(numberOfPaymentsPreGenerated);
        return this;
    }

    public DummyPayConfig withNumberOfPaymentsPreGenerated(Optional<? extends Long> numberOfPaymentsPreGenerated) {
        Utils.checkNotNull(numberOfPaymentsPreGenerated, "numberOfPaymentsPreGenerated");
        this.numberOfPaymentsPreGenerated = numberOfPaymentsPreGenerated;
        return this;
    }

    public DummyPayConfig withPrefixFileToIngest(String prefixFileToIngest) {
        Utils.checkNotNull(prefixFileToIngest, "prefixFileToIngest");
        this.prefixFileToIngest = Optional.ofNullable(prefixFileToIngest);
        return this;
    }

    public DummyPayConfig withPrefixFileToIngest(Optional<? extends String> prefixFileToIngest) {
        Utils.checkNotNull(prefixFileToIngest, "prefixFileToIngest");
        this.prefixFileToIngest = prefixFileToIngest;
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
        DummyPayConfig other = (DummyPayConfig) o;
        return 
            java.util.Objects.deepEquals(this.directory, other.directory) &&
            java.util.Objects.deepEquals(this.filePollingPeriod, other.filePollingPeriod) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.numberOfAccountsPreGenerated, other.numberOfAccountsPreGenerated) &&
            java.util.Objects.deepEquals(this.numberOfPaymentsPreGenerated, other.numberOfPaymentsPreGenerated) &&
            java.util.Objects.deepEquals(this.prefixFileToIngest, other.prefixFileToIngest);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            directory,
            filePollingPeriod,
            name,
            numberOfAccountsPreGenerated,
            numberOfPaymentsPreGenerated,
            prefixFileToIngest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DummyPayConfig.class,
                "directory", directory,
                "filePollingPeriod", filePollingPeriod,
                "name", name,
                "numberOfAccountsPreGenerated", numberOfAccountsPreGenerated,
                "numberOfPaymentsPreGenerated", numberOfPaymentsPreGenerated,
                "prefixFileToIngest", prefixFileToIngest);
    }
    
    public final static class Builder {
 
        private String directory;
 
        private Optional<? extends String> filePollingPeriod;
 
        private String name;
 
        private Optional<? extends Long> numberOfAccountsPreGenerated = Optional.empty();
 
        private Optional<? extends Long> numberOfPaymentsPreGenerated = Optional.empty();
 
        private Optional<? extends String> prefixFileToIngest = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder directory(String directory) {
            Utils.checkNotNull(directory, "directory");
            this.directory = directory;
            return this;
        }

        /**
         * The frequency at which the connector will try to fetch new payment objects from the directory
         */
        public Builder filePollingPeriod(String filePollingPeriod) {
            Utils.checkNotNull(filePollingPeriod, "filePollingPeriod");
            this.filePollingPeriod = Optional.ofNullable(filePollingPeriod);
            return this;
        }

        /**
         * The frequency at which the connector will try to fetch new payment objects from the directory
         */
        public Builder filePollingPeriod(Optional<? extends String> filePollingPeriod) {
            Utils.checkNotNull(filePollingPeriod, "filePollingPeriod");
            this.filePollingPeriod = filePollingPeriod;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder numberOfAccountsPreGenerated(long numberOfAccountsPreGenerated) {
            Utils.checkNotNull(numberOfAccountsPreGenerated, "numberOfAccountsPreGenerated");
            this.numberOfAccountsPreGenerated = Optional.ofNullable(numberOfAccountsPreGenerated);
            return this;
        }

        public Builder numberOfAccountsPreGenerated(Optional<? extends Long> numberOfAccountsPreGenerated) {
            Utils.checkNotNull(numberOfAccountsPreGenerated, "numberOfAccountsPreGenerated");
            this.numberOfAccountsPreGenerated = numberOfAccountsPreGenerated;
            return this;
        }

        public Builder numberOfPaymentsPreGenerated(long numberOfPaymentsPreGenerated) {
            Utils.checkNotNull(numberOfPaymentsPreGenerated, "numberOfPaymentsPreGenerated");
            this.numberOfPaymentsPreGenerated = Optional.ofNullable(numberOfPaymentsPreGenerated);
            return this;
        }

        public Builder numberOfPaymentsPreGenerated(Optional<? extends Long> numberOfPaymentsPreGenerated) {
            Utils.checkNotNull(numberOfPaymentsPreGenerated, "numberOfPaymentsPreGenerated");
            this.numberOfPaymentsPreGenerated = numberOfPaymentsPreGenerated;
            return this;
        }

        public Builder prefixFileToIngest(String prefixFileToIngest) {
            Utils.checkNotNull(prefixFileToIngest, "prefixFileToIngest");
            this.prefixFileToIngest = Optional.ofNullable(prefixFileToIngest);
            return this;
        }

        public Builder prefixFileToIngest(Optional<? extends String> prefixFileToIngest) {
            Utils.checkNotNull(prefixFileToIngest, "prefixFileToIngest");
            this.prefixFileToIngest = prefixFileToIngest;
            return this;
        }
        
        public DummyPayConfig build() {
            if (filePollingPeriod == null) {
                filePollingPeriod = _SINGLETON_VALUE_FilePollingPeriod.value();
            }
            return new DummyPayConfig(
                directory,
                filePollingPeriod,
                name,
                numberOfAccountsPreGenerated,
                numberOfPaymentsPreGenerated,
                prefixFileToIngest);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_FilePollingPeriod =
                new LazySingletonValue<>(
                        "filePollingPeriod",
                        "\"10s\"",
                        new TypeReference<Optional<? extends String>>() {});
    }
}

