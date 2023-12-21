/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V2ListWalletsResponseCursor {
    @JsonProperty("data")
    public V2Wallet[] data;

    public V2ListWalletsResponseCursor withData(V2Wallet[] data) {
        this.data = data;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hasMore")
    public Boolean hasMore;

    public V2ListWalletsResponseCursor withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    public String next;

    public V2ListWalletsResponseCursor withNext(String next) {
        this.next = next;
        return this;
    }
    
    @JsonProperty("pageSize")
    public Long pageSize;

    public V2ListWalletsResponseCursor withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    public String previous;

    public V2ListWalletsResponseCursor withPrevious(String previous) {
        this.previous = previous;
        return this;
    }
    
    public V2ListWalletsResponseCursor(@JsonProperty("data") V2Wallet[] data, @JsonProperty("pageSize") Long pageSize) {
        this.data = data;
        this.pageSize = pageSize;
  }
}
