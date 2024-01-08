/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ListConfigsAvailableConnectorsResponse {
    /**
     * OK
     */
    
    public com.formance.formance_sdk.models.shared.ConnectorsConfigsResponse connectorsConfigsResponse;

    public ListConfigsAvailableConnectorsResponse withConnectorsConfigsResponse(com.formance.formance_sdk.models.shared.ConnectorsConfigsResponse connectorsConfigsResponse) {
        this.connectorsConfigsResponse = connectorsConfigsResponse;
        return this;
    }
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ListConfigsAvailableConnectorsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ListConfigsAvailableConnectorsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ListConfigsAvailableConnectorsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ListConfigsAvailableConnectorsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
