/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetHoldsResponse {
    
    public String contentType;

    public GetHoldsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Holds
     */
    
    public org.openapis.openapi.models.shared.GetHoldsResponse getHoldsResponse;

    public GetHoldsResponse withGetHoldsResponse(org.openapis.openapi.models.shared.GetHoldsResponse getHoldsResponse) {
        this.getHoldsResponse = getHoldsResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public GetHoldsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetHoldsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error
     */
    
    public org.openapis.openapi.models.shared.WalletsErrorResponse walletsErrorResponse;

    public GetHoldsResponse withWalletsErrorResponse(org.openapis.openapi.models.shared.WalletsErrorResponse walletsErrorResponse) {
        this.walletsErrorResponse = walletsErrorResponse;
        return this;
    }
    
    public GetHoldsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
