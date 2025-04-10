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
import java.util.List;
import java.util.Objects;

public class Mapping {

    @JsonProperty("contracts")
    private List<Contract> contracts;

    @JsonCreator
    public Mapping(
            @JsonProperty("contracts") List<Contract> contracts) {
        Utils.checkNotNull(contracts, "contracts");
        this.contracts = contracts;
    }

    @JsonIgnore
    public List<Contract> contracts() {
        return contracts;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public Mapping withContracts(List<Contract> contracts) {
        Utils.checkNotNull(contracts, "contracts");
        this.contracts = contracts;
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
        Mapping other = (Mapping) o;
        return 
            Objects.deepEquals(this.contracts, other.contracts);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contracts);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Mapping.class,
                "contracts", contracts);
    }
    
    public final static class Builder {
 
        private List<Contract> contracts;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder contracts(List<Contract> contracts) {
            Utils.checkNotNull(contracts, "contracts");
            this.contracts = contracts;
            return this;
        }
        
        public Mapping build() {
            return new Mapping(
                contracts);
        }
    }
}
