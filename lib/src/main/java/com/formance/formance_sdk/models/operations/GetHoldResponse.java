/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetHoldResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetHoldResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Holds
     */
    
    public com.formance.formance_sdk.models.shared.GetHoldResponse getHoldResponse;

    public GetHoldResponse withGetHoldResponse(com.formance.formance_sdk.models.shared.GetHoldResponse getHoldResponse) {
        this.getHoldResponse = getHoldResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetHoldResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetHoldResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error
     */
    
    public com.formance.formance_sdk.models.shared.WalletsErrorResponse walletsErrorResponse;

    public GetHoldResponse withWalletsErrorResponse(com.formance.formance_sdk.models.shared.WalletsErrorResponse walletsErrorResponse) {
        this.walletsErrorResponse = walletsErrorResponse;
        return this;
    }
    
    public GetHoldResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
