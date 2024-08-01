/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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

public class V2StageWaitEvent {

    @JsonProperty("event")
    private String event;

    @JsonCreator
    public V2StageWaitEvent(
            @JsonProperty("event") String event) {
        Utils.checkNotNull(event, "event");
        this.event = event;
    }

    @JsonIgnore
    public String event() {
        return event;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2StageWaitEvent withEvent(String event) {
        Utils.checkNotNull(event, "event");
        this.event = event;
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
        V2StageWaitEvent other = (V2StageWaitEvent) o;
        return 
            java.util.Objects.deepEquals(this.event, other.event);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            event);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2StageWaitEvent.class,
                "event", event);
    }
    
    public final static class Builder {
 
        private String event;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder event(String event) {
            Utils.checkNotNull(event, "event");
            this.event = event;
            return this;
        }
        
        public V2StageWaitEvent build() {
            return new V2StageWaitEvent(
                event);
        }
    }
}

