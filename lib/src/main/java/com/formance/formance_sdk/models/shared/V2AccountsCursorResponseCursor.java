/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V2AccountsCursorResponseCursor {
    @JsonProperty("data")
    public V2Account[] data;

    public V2AccountsCursorResponseCursor withData(V2Account[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("hasMore")
    public Boolean hasMore;

    public V2AccountsCursorResponseCursor withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    public String next;

    public V2AccountsCursorResponseCursor withNext(String next) {
        this.next = next;
        return this;
    }
    
    @JsonProperty("pageSize")
    public Long pageSize;

    public V2AccountsCursorResponseCursor withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    public String previous;

    public V2AccountsCursorResponseCursor withPrevious(String previous) {
        this.previous = previous;
        return this;
    }
    
    public V2AccountsCursorResponseCursor(@JsonProperty("data") V2Account[] data, @JsonProperty("hasMore") Boolean hasMore, @JsonProperty("pageSize") Long pageSize) {
        this.data = data;
        this.hasMore = hasMore;
        this.pageSize = pageSize;
  }
}
