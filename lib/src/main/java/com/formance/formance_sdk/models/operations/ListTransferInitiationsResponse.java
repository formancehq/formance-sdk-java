/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ListTransferInitiationsResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ListTransferInitiationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ListTransferInitiationsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ListTransferInitiationsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public com.formance.formance_sdk.models.shared.TransferInitiationsCursor transferInitiationsCursor;

    public ListTransferInitiationsResponse withTransferInitiationsCursor(com.formance.formance_sdk.models.shared.TransferInitiationsCursor transferInitiationsCursor) {
        this.transferInitiationsCursor = transferInitiationsCursor;
        return this;
    }
    
    public ListTransferInitiationsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}