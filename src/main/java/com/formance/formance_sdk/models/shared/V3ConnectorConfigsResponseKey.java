/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.shared;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class V3ConnectorConfigsResponseKey {

    @JsonProperty("dataType")
    private String dataType;

    @JsonProperty("required")
    private boolean required;

    @JsonCreator
    public V3ConnectorConfigsResponseKey(
            @JsonProperty("dataType") String dataType,
            @JsonProperty("required") boolean required) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(required, "required");
        this.dataType = dataType;
        this.required = required;
    }

    @JsonIgnore
    public String dataType() {
        return dataType;
    }

    @JsonIgnore
    public boolean required() {
        return required;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V3ConnectorConfigsResponseKey withDataType(String dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    public V3ConnectorConfigsResponseKey withRequired(boolean required) {
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
        V3ConnectorConfigsResponseKey other = (V3ConnectorConfigsResponseKey) o;
        return 
            Objects.deepEquals(this.dataType, other.dataType) &&
            Objects.deepEquals(this.required, other.required);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dataType,
            required);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ConnectorConfigsResponseKey.class,
                "dataType", dataType,
                "required", required);
    }
    
    public final static class Builder {
 
        private String dataType;
 
        private Boolean required;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder dataType(String dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        public Builder required(boolean required) {
            Utils.checkNotNull(required, "required");
            this.required = required;
            return this;
        }
        
        public V3ConnectorConfigsResponseKey build() {
            return new V3ConnectorConfigsResponseKey(
                dataType,
                required);
        }
    }
}

