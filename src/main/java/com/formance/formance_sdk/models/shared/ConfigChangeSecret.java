/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

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
            Objects.deepEquals(this.secret, other.secret);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
