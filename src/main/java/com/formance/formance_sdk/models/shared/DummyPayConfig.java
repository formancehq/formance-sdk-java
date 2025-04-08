/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.LazySingletonValue;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class DummyPayConfig implements ConnectorConfig {

    @JsonProperty("directory")
    private String directory;

    /**
     * The frequency at which the connector will try to fetch new payment objects from the directory
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filePollingPeriod")
    private Optional<String> filePollingPeriod;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("numberOfAccountsPreGenerated")
    private Optional<Long> numberOfAccountsPreGenerated;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("numberOfPaymentsPreGenerated")
    private Optional<Long> numberOfPaymentsPreGenerated;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prefixFileToIngest")
    private Optional<String> prefixFileToIngest;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    private Optional<String> provider;

    @JsonCreator
    public DummyPayConfig(
            @JsonProperty("directory") String directory,
            @JsonProperty("filePollingPeriod") Optional<String> filePollingPeriod,
            @JsonProperty("name") String name,
            @JsonProperty("numberOfAccountsPreGenerated") Optional<Long> numberOfAccountsPreGenerated,
            @JsonProperty("numberOfPaymentsPreGenerated") Optional<Long> numberOfPaymentsPreGenerated,
            @JsonProperty("prefixFileToIngest") Optional<String> prefixFileToIngest,
            @JsonProperty("provider") Optional<String> provider) {
        Utils.checkNotNull(directory, "directory");
        Utils.checkNotNull(filePollingPeriod, "filePollingPeriod");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(numberOfAccountsPreGenerated, "numberOfAccountsPreGenerated");
        Utils.checkNotNull(numberOfPaymentsPreGenerated, "numberOfPaymentsPreGenerated");
        Utils.checkNotNull(prefixFileToIngest, "prefixFileToIngest");
        Utils.checkNotNull(provider, "provider");
        this.directory = directory;
        this.filePollingPeriod = filePollingPeriod;
        this.name = name;
        this.numberOfAccountsPreGenerated = numberOfAccountsPreGenerated;
        this.numberOfPaymentsPreGenerated = numberOfPaymentsPreGenerated;
        this.prefixFileToIngest = prefixFileToIngest;
        this.provider = provider;
    }
    
    public DummyPayConfig(
            String directory,
            String name) {
        this(directory, Optional.empty(), name, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String directory() {
        return directory;
    }

    /**
     * The frequency at which the connector will try to fetch new payment objects from the directory
     */
    @JsonIgnore
    public Optional<String> filePollingPeriod() {
        return filePollingPeriod;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public Optional<Long> numberOfAccountsPreGenerated() {
        return numberOfAccountsPreGenerated;
    }

    @JsonIgnore
    public Optional<Long> numberOfPaymentsPreGenerated() {
        return numberOfPaymentsPreGenerated;
    }

    @JsonIgnore
    public Optional<String> prefixFileToIngest() {
        return prefixFileToIngest;
    }

    @JsonIgnore
    @Override
    public String provider() {
        return Utils.discriminatorToString(provider);
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
    public DummyPayConfig withFilePollingPeriod(Optional<String> filePollingPeriod) {
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

    public DummyPayConfig withNumberOfAccountsPreGenerated(Optional<Long> numberOfAccountsPreGenerated) {
        Utils.checkNotNull(numberOfAccountsPreGenerated, "numberOfAccountsPreGenerated");
        this.numberOfAccountsPreGenerated = numberOfAccountsPreGenerated;
        return this;
    }

    public DummyPayConfig withNumberOfPaymentsPreGenerated(long numberOfPaymentsPreGenerated) {
        Utils.checkNotNull(numberOfPaymentsPreGenerated, "numberOfPaymentsPreGenerated");
        this.numberOfPaymentsPreGenerated = Optional.ofNullable(numberOfPaymentsPreGenerated);
        return this;
    }

    public DummyPayConfig withNumberOfPaymentsPreGenerated(Optional<Long> numberOfPaymentsPreGenerated) {
        Utils.checkNotNull(numberOfPaymentsPreGenerated, "numberOfPaymentsPreGenerated");
        this.numberOfPaymentsPreGenerated = numberOfPaymentsPreGenerated;
        return this;
    }

    public DummyPayConfig withPrefixFileToIngest(String prefixFileToIngest) {
        Utils.checkNotNull(prefixFileToIngest, "prefixFileToIngest");
        this.prefixFileToIngest = Optional.ofNullable(prefixFileToIngest);
        return this;
    }

    public DummyPayConfig withPrefixFileToIngest(Optional<String> prefixFileToIngest) {
        Utils.checkNotNull(prefixFileToIngest, "prefixFileToIngest");
        this.prefixFileToIngest = prefixFileToIngest;
        return this;
    }

    public DummyPayConfig withProvider(String provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = Optional.ofNullable(provider);
        return this;
    }

    public DummyPayConfig withProvider(Optional<String> provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = provider;
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
            Objects.deepEquals(this.directory, other.directory) &&
            Objects.deepEquals(this.filePollingPeriod, other.filePollingPeriod) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.numberOfAccountsPreGenerated, other.numberOfAccountsPreGenerated) &&
            Objects.deepEquals(this.numberOfPaymentsPreGenerated, other.numberOfPaymentsPreGenerated) &&
            Objects.deepEquals(this.prefixFileToIngest, other.prefixFileToIngest) &&
            Objects.deepEquals(this.provider, other.provider);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            directory,
            filePollingPeriod,
            name,
            numberOfAccountsPreGenerated,
            numberOfPaymentsPreGenerated,
            prefixFileToIngest,
            provider);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DummyPayConfig.class,
                "directory", directory,
                "filePollingPeriod", filePollingPeriod,
                "name", name,
                "numberOfAccountsPreGenerated", numberOfAccountsPreGenerated,
                "numberOfPaymentsPreGenerated", numberOfPaymentsPreGenerated,
                "prefixFileToIngest", prefixFileToIngest,
                "provider", provider);
    }
    
    public final static class Builder {
 
        private String directory;
 
        private Optional<String> filePollingPeriod;
 
        private String name;
 
        private Optional<Long> numberOfAccountsPreGenerated = Optional.empty();
 
        private Optional<Long> numberOfPaymentsPreGenerated = Optional.empty();
 
        private Optional<String> prefixFileToIngest = Optional.empty();
 
        private Optional<String> provider;
        
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
        public Builder filePollingPeriod(Optional<String> filePollingPeriod) {
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

        public Builder numberOfAccountsPreGenerated(Optional<Long> numberOfAccountsPreGenerated) {
            Utils.checkNotNull(numberOfAccountsPreGenerated, "numberOfAccountsPreGenerated");
            this.numberOfAccountsPreGenerated = numberOfAccountsPreGenerated;
            return this;
        }

        public Builder numberOfPaymentsPreGenerated(long numberOfPaymentsPreGenerated) {
            Utils.checkNotNull(numberOfPaymentsPreGenerated, "numberOfPaymentsPreGenerated");
            this.numberOfPaymentsPreGenerated = Optional.ofNullable(numberOfPaymentsPreGenerated);
            return this;
        }

        public Builder numberOfPaymentsPreGenerated(Optional<Long> numberOfPaymentsPreGenerated) {
            Utils.checkNotNull(numberOfPaymentsPreGenerated, "numberOfPaymentsPreGenerated");
            this.numberOfPaymentsPreGenerated = numberOfPaymentsPreGenerated;
            return this;
        }

        public Builder prefixFileToIngest(String prefixFileToIngest) {
            Utils.checkNotNull(prefixFileToIngest, "prefixFileToIngest");
            this.prefixFileToIngest = Optional.ofNullable(prefixFileToIngest);
            return this;
        }

        public Builder prefixFileToIngest(Optional<String> prefixFileToIngest) {
            Utils.checkNotNull(prefixFileToIngest, "prefixFileToIngest");
            this.prefixFileToIngest = prefixFileToIngest;
            return this;
        }

        public Builder provider(String provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = Optional.ofNullable(provider);
            return this;
        }

        public Builder provider(Optional<String> provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = provider;
            return this;
        }
        
        public DummyPayConfig build() {
            if (filePollingPeriod == null) {
                filePollingPeriod = _SINGLETON_VALUE_FilePollingPeriod.value();
            }
            if (provider == null) {
                provider = _SINGLETON_VALUE_Provider.value();
            }
            return new DummyPayConfig(
                directory,
                filePollingPeriod,
                name,
                numberOfAccountsPreGenerated,
                numberOfPaymentsPreGenerated,
                prefixFileToIngest,
                provider);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_FilePollingPeriod =
                new LazySingletonValue<>(
                        "filePollingPeriod",
                        "\"10s\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Provider =
                new LazySingletonValue<>(
                        "provider",
                        "\"Dummypay\"",
                        new TypeReference<Optional<String>>() {});
    }
}
