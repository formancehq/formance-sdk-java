/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class V2ListLogsResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public V2ListLogsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public V2ListLogsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public V2ListLogsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error
     */
    
    public com.formance.formance_sdk.models.shared.V2ErrorResponse v2ErrorResponse;

    public V2ListLogsResponse withV2ErrorResponse(com.formance.formance_sdk.models.shared.V2ErrorResponse v2ErrorResponse) {
        this.v2ErrorResponse = v2ErrorResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public com.formance.formance_sdk.models.shared.V2LogsCursorResponse v2LogsCursorResponse;

    public V2ListLogsResponse withV2LogsCursorResponse(com.formance.formance_sdk.models.shared.V2LogsCursorResponse v2LogsCursorResponse) {
        this.v2LogsCursorResponse = v2LogsCursorResponse;
        return this;
    }
    
    public V2ListLogsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
