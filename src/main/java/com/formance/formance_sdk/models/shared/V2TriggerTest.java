/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class V2TriggerTest {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    private Optional<? extends Filter> filter;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("variables")
    private Optional<? extends java.util.Map<String, Variables>> variables;

    @JsonCreator
    public V2TriggerTest(
            @JsonProperty("filter") Optional<? extends Filter> filter,
            @JsonProperty("variables") Optional<? extends java.util.Map<String, Variables>> variables) {
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(variables, "variables");
        this.filter = filter;
        this.variables = variables;
    }
    
    public V2TriggerTest() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Filter> filter() {
        return (Optional<Filter>) filter;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.Map<String, Variables>> variables() {
        return (Optional<java.util.Map<String, Variables>>) variables;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2TriggerTest withFilter(Filter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    public V2TriggerTest withFilter(Optional<? extends Filter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    public V2TriggerTest withVariables(java.util.Map<String, Variables> variables) {
        Utils.checkNotNull(variables, "variables");
        this.variables = Optional.ofNullable(variables);
        return this;
    }

    public V2TriggerTest withVariables(Optional<? extends java.util.Map<String, Variables>> variables) {
        Utils.checkNotNull(variables, "variables");
        this.variables = variables;
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
        V2TriggerTest other = (V2TriggerTest) o;
        return 
            java.util.Objects.deepEquals(this.filter, other.filter) &&
            java.util.Objects.deepEquals(this.variables, other.variables);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            filter,
            variables);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2TriggerTest.class,
                "filter", filter,
                "variables", variables);
    }
    
    public final static class Builder {
 
        private Optional<? extends Filter> filter = Optional.empty();
 
        private Optional<? extends java.util.Map<String, Variables>> variables = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder filter(Filter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        public Builder filter(Optional<? extends Filter> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        public Builder variables(java.util.Map<String, Variables> variables) {
            Utils.checkNotNull(variables, "variables");
            this.variables = Optional.ofNullable(variables);
            return this;
        }

        public Builder variables(Optional<? extends java.util.Map<String, Variables>> variables) {
            Utils.checkNotNull(variables, "variables");
            this.variables = variables;
            return this;
        }
        
        public V2TriggerTest build() {
            return new V2TriggerTest(
                filter,
                variables);
        }
    }
}

