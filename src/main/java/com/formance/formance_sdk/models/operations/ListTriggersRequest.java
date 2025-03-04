/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class ListTriggersRequest {

    /**
     * search by name
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=name")
    private Optional<String> name;

    @JsonCreator
    public ListTriggersRequest(
            Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
    }
    
    public ListTriggersRequest() {
        this(Optional.empty());
    }

    /**
     * search by name
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * search by name
     */
    public ListTriggersRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * search by name
     */
    public ListTriggersRequest withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        ListTriggersRequest other = (ListTriggersRequest) o;
        return 
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListTriggersRequest.class,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<String> name = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * search by name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * search by name
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public ListTriggersRequest build() {
            return new ListTriggersRequest(
                name);
        }
    }
}

