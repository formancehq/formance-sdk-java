/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Version {

    @JsonProperty("health")
    private boolean health;

    @JsonProperty("name")
    private String name;

    @JsonProperty("version")
    private String version;

    @JsonCreator
    public Version(
            @JsonProperty("health") boolean health,
            @JsonProperty("name") String name,
            @JsonProperty("version") String version) {
        Utils.checkNotNull(health, "health");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(version, "version");
        this.health = health;
        this.name = name;
        this.version = version;
    }

    @JsonIgnore
    public boolean health() {
        return health;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String version() {
        return version;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Version withHealth(boolean health) {
        Utils.checkNotNull(health, "health");
        this.health = health;
        return this;
    }

    public Version withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public Version withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
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
        Version other = (Version) o;
        return 
            java.util.Objects.deepEquals(this.health, other.health) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.version, other.version);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            health,
            name,
            version);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Version.class,
                "health", health,
                "name", name,
                "version", version);
    }
    
    public final static class Builder {
 
        private Boolean health;
 
        private String name;
 
        private String version;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder health(boolean health) {
            Utils.checkNotNull(health, "health");
            this.health = health;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }
        
        public Version build() {
            return new Version(
                health,
                name,
                version);
        }
    }
}

