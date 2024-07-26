/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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

public class WalletBalances {

    @JsonProperty("main")
    private AssetHolder main;

    @JsonCreator
    public WalletBalances(
            @JsonProperty("main") AssetHolder main) {
        Utils.checkNotNull(main, "main");
        this.main = main;
    }

    @JsonIgnore
    public AssetHolder main() {
        return main;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WalletBalances withMain(AssetHolder main) {
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
        WalletBalances other = (WalletBalances) o;
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
        return Utils.toString(WalletBalances.class,
                "main", main);
    }
    
    public final static class Builder {
 
        private AssetHolder main;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder main(AssetHolder main) {
            Utils.checkNotNull(main, "main");
            this.main = main;
            return this;
        }
        
        public WalletBalances build() {
            return new WalletBalances(
                main);
        }
    }
}

