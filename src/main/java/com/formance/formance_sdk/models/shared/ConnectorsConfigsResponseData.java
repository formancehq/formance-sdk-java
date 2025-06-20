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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class ConnectorsConfigsResponseData {

    @JsonProperty("dataType")
    private String dataType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultValue")
    private Optional<String> defaultValue;

    @JsonProperty("required")
    private boolean required;

    @JsonCreator
    public ConnectorsConfigsResponseData(
            @JsonProperty("dataType") String dataType,
            @JsonProperty("defaultValue") Optional<String> defaultValue,
            @JsonProperty("required") boolean required) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(defaultValue, "defaultValue");
        Utils.checkNotNull(required, "required");
        this.dataType = dataType;
        this.defaultValue = defaultValue;
        this.required = required;
    }
    
    public ConnectorsConfigsResponseData(
            String dataType,
            boolean required) {
        this(dataType, Optional.empty(), required);
    }

    @JsonIgnore
    public String dataType() {
        return dataType;
    }

    @JsonIgnore
    public Optional<String> defaultValue() {
        return defaultValue;
    }

    @JsonIgnore
    public boolean required() {
        return required;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public ConnectorsConfigsResponseData withDataType(String dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    public ConnectorsConfigsResponseData withDefaultValue(String defaultValue) {
        Utils.checkNotNull(defaultValue, "defaultValue");
        this.defaultValue = Optional.ofNullable(defaultValue);
        return this;
    }

    public ConnectorsConfigsResponseData withDefaultValue(Optional<String> defaultValue) {
        Utils.checkNotNull(defaultValue, "defaultValue");
        this.defaultValue = defaultValue;
        return this;
    }

    public ConnectorsConfigsResponseData withRequired(boolean required) {
        Utils.checkNotNull(required, "required");
        this.required = required;
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
        ConnectorsConfigsResponseData other = (ConnectorsConfigsResponseData) o;
        return 
            Objects.deepEquals(this.dataType, other.dataType) &&
            Objects.deepEquals(this.defaultValue, other.defaultValue) &&
            Objects.deepEquals(this.required, other.required);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dataType,
            defaultValue,
            required);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectorsConfigsResponseData.class,
                "dataType", dataType,
                "defaultValue", defaultValue,
                "required", required);
    }
    
    public final static class Builder {
 
        private String dataType;
 
        private Optional<String> defaultValue = Optional.empty();
 
        private Boolean required;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder dataType(String dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        public Builder defaultValue(String defaultValue) {
            Utils.checkNotNull(defaultValue, "defaultValue");
            this.defaultValue = Optional.ofNullable(defaultValue);
            return this;
        }

        public Builder defaultValue(Optional<String> defaultValue) {
            Utils.checkNotNull(defaultValue, "defaultValue");
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder required(boolean required) {
            Utils.checkNotNull(required, "required");
            this.required = required;
            return this;
        }
        
        public ConnectorsConfigsResponseData build() {
            return new ConnectorsConfigsResponseData(
                dataType,
                defaultValue,
                required);
        }
    }
}
