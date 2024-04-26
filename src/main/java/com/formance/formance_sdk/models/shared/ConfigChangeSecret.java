/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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


public class ConfigChangeSecret {

    @JsonProperty("secret")
    private String secret;

    @JsonCreator
    public ConfigChangeSecret(
            @JsonProperty("secret") String secret) {
        Utils.checkNotNull(secret, "secret");
        this.secret = secret;
    }

    @JsonIgnore
    public String secret() {
        return secret;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConfigChangeSecret withSecret(String secret) {
        Utils.checkNotNull(secret, "secret");
        this.secret = secret;
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
        ConfigChangeSecret other = (ConfigChangeSecret) o;
        return 
            java.util.Objects.deepEquals(this.secret, other.secret);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            secret);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConfigChangeSecret.class,
                "secret", secret);
    }
    
    public final static class Builder {
 
        private String secret;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder secret(String secret) {
            Utils.checkNotNull(secret, "secret");
            this.secret = secret;
            return this;
        }
        
        public ConfigChangeSecret build() {
            return new ConfigChangeSecret(
                secret);
        }
    }
}

