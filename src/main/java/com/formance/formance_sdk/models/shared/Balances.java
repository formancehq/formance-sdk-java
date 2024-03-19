/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class Balances {

    @JsonProperty("main")
    private V2AssetHolder main;

    public Balances(
            @JsonProperty("main") V2AssetHolder main) {
        Utils.checkNotNull(main, "main");
        this.main = main;
    }

    public V2AssetHolder main() {
        return main;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Balances withMain(V2AssetHolder main) {
        Utils.checkNotNull(main, "main");
        this.main = main;
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
        Balances other = (Balances) o;
        return 
            java.util.Objects.deepEquals(this.main, other.main);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            main);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Balances.class,
                "main", main);
    }
    
    public final static class Builder {
 
        private V2AssetHolder main;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder main(V2AssetHolder main) {
            Utils.checkNotNull(main, "main");
            this.main = main;
            return this;
        }
        
        public Balances build() {
            return new Balances(
                main);
        }
    }
}

