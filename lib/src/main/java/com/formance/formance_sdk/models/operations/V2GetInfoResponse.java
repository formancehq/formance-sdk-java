/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class V2GetInfoResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public V2GetInfoResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public V2GetInfoResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public V2GetInfoResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public com.formance.formance_sdk.models.shared.V2ConfigInfoResponse v2ConfigInfoResponse;

    public V2GetInfoResponse withV2ConfigInfoResponse(com.formance.formance_sdk.models.shared.V2ConfigInfoResponse v2ConfigInfoResponse) {
        this.v2ConfigInfoResponse = v2ConfigInfoResponse;
        return this;
    }
    
    /**
     * Error
     */
    
    public com.formance.formance_sdk.models.shared.V2ErrorResponse v2ErrorResponse;

    public V2GetInfoResponse withV2ErrorResponse(com.formance.formance_sdk.models.shared.V2ErrorResponse v2ErrorResponse) {
        this.v2ErrorResponse = v2ErrorResponse;
        return this;
    }
    
    public V2GetInfoResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
