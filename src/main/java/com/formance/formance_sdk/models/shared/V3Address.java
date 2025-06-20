/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class V3Address {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    private Optional<String> city;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private Optional<String> country;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postalCode")
    private Optional<String> postalCode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    private Optional<String> region;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("streetName")
    private Optional<String> streetName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("streetNumber")
    private Optional<String> streetNumber;

    @JsonCreator
    public V3Address(
            @JsonProperty("city") Optional<String> city,
            @JsonProperty("country") Optional<String> country,
            @JsonProperty("postalCode") Optional<String> postalCode,
            @JsonProperty("region") Optional<String> region,
            @JsonProperty("streetName") Optional<String> streetName,
            @JsonProperty("streetNumber") Optional<String> streetNumber) {
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(postalCode, "postalCode");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(streetName, "streetName");
        Utils.checkNotNull(streetNumber, "streetNumber");
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.region = region;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }
    
    public V3Address() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> city() {
        return city;
    }

    @JsonIgnore
    public Optional<String> country() {
        return country;
    }

    @JsonIgnore
    public Optional<String> postalCode() {
        return postalCode;
    }

    @JsonIgnore
    public Optional<String> region() {
        return region;
    }

    @JsonIgnore
    public Optional<String> streetName() {
        return streetName;
    }

    @JsonIgnore
    public Optional<String> streetNumber() {
        return streetNumber;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V3Address withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = Optional.ofNullable(city);
        return this;
    }

    public V3Address withCity(Optional<String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    public V3Address withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }

    public V3Address withCountry(Optional<String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    public V3Address withPostalCode(String postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = Optional.ofNullable(postalCode);
        return this;
    }

    public V3Address withPostalCode(Optional<String> postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    public V3Address withRegion(String region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }

    public V3Address withRegion(Optional<String> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    public V3Address withStreetName(String streetName) {
        Utils.checkNotNull(streetName, "streetName");
        this.streetName = Optional.ofNullable(streetName);
        return this;
    }

    public V3Address withStreetName(Optional<String> streetName) {
        Utils.checkNotNull(streetName, "streetName");
        this.streetName = streetName;
        return this;
    }

    public V3Address withStreetNumber(String streetNumber) {
        Utils.checkNotNull(streetNumber, "streetNumber");
        this.streetNumber = Optional.ofNullable(streetNumber);
        return this;
    }

    public V3Address withStreetNumber(Optional<String> streetNumber) {
        Utils.checkNotNull(streetNumber, "streetNumber");
        this.streetNumber = streetNumber;
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
        V3Address other = (V3Address) o;
        return 
            Objects.deepEquals(this.city, other.city) &&
            Objects.deepEquals(this.country, other.country) &&
            Objects.deepEquals(this.postalCode, other.postalCode) &&
            Objects.deepEquals(this.region, other.region) &&
            Objects.deepEquals(this.streetName, other.streetName) &&
            Objects.deepEquals(this.streetNumber, other.streetNumber);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            city,
            country,
            postalCode,
            region,
            streetName,
            streetNumber);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3Address.class,
                "city", city,
                "country", country,
                "postalCode", postalCode,
                "region", region,
                "streetName", streetName,
                "streetNumber", streetNumber);
    }
    
    public final static class Builder {
 
        private Optional<String> city = Optional.empty();
 
        private Optional<String> country = Optional.empty();
 
        private Optional<String> postalCode = Optional.empty();
 
        private Optional<String> region = Optional.empty();
 
        private Optional<String> streetName = Optional.empty();
 
        private Optional<String> streetNumber = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder city(String city) {
            Utils.checkNotNull(city, "city");
            this.city = Optional.ofNullable(city);
            return this;
        }

        public Builder city(Optional<String> city) {
            Utils.checkNotNull(city, "city");
            this.city = city;
            return this;
        }

        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = Optional.ofNullable(country);
            return this;
        }

        public Builder country(Optional<String> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        public Builder postalCode(String postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = Optional.ofNullable(postalCode);
            return this;
        }

        public Builder postalCode(Optional<String> postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = postalCode;
            return this;
        }

        public Builder region(String region) {
            Utils.checkNotNull(region, "region");
            this.region = Optional.ofNullable(region);
            return this;
        }

        public Builder region(Optional<String> region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }

        public Builder streetName(String streetName) {
            Utils.checkNotNull(streetName, "streetName");
            this.streetName = Optional.ofNullable(streetName);
            return this;
        }

        public Builder streetName(Optional<String> streetName) {
            Utils.checkNotNull(streetName, "streetName");
            this.streetName = streetName;
            return this;
        }

        public Builder streetNumber(String streetNumber) {
            Utils.checkNotNull(streetNumber, "streetNumber");
            this.streetNumber = Optional.ofNullable(streetNumber);
            return this;
        }

        public Builder streetNumber(Optional<String> streetNumber) {
            Utils.checkNotNull(streetNumber, "streetNumber");
            this.streetNumber = streetNumber;
            return this;
        }
        
        public V3Address build() {
            return new V3Address(
                city,
                country,
                postalCode,
                region,
                streetName,
                streetNumber);
        }
    }
}
