/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class V2ListTransactionsResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public V2ListTransactionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public V2ListTransactionsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public V2ListTransactionsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error
     */
    
    public com.formance.formance_sdk.models.shared.V2ErrorResponse v2ErrorResponse;

    public V2ListTransactionsResponse withV2ErrorResponse(com.formance.formance_sdk.models.shared.V2ErrorResponse v2ErrorResponse) {
        this.v2ErrorResponse = v2ErrorResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public com.formance.formance_sdk.models.shared.V2TransactionsCursorResponse v2TransactionsCursorResponse;

    public V2ListTransactionsResponse withV2TransactionsCursorResponse(com.formance.formance_sdk.models.shared.V2TransactionsCursorResponse v2TransactionsCursorResponse) {
        this.v2TransactionsCursorResponse = v2TransactionsCursorResponse;
        return this;
    }
    
    public V2ListTransactionsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
