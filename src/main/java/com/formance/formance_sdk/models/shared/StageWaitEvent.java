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


public class StageWaitEvent {

    @JsonProperty("event")
    private String event;

    @JsonCreator
    public StageWaitEvent(
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

    public StageWaitEvent withEvent(String event) {
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
        StageWaitEvent other = (StageWaitEvent) o;
        return 
            Objects.deepEquals(this.event, other.event);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            event);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StageWaitEvent.class,
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
        
        public StageWaitEvent build() {
            return new StageWaitEvent(
                event);
        }
    }
}

