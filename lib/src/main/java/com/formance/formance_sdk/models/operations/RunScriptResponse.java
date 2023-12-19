/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class RunScriptResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public RunScriptResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * On success, it will return a 200 status code, and the resulting transaction under the `transaction` field.
     * 
     * On failure, it will also return a 200 status code, and the following fields:
     *   - `details`: contains a URL. When there is an error parsing Numscript, the result can be difficult to read—the provided URL will render the error in an easy-to-read format.
     *   - `errorCode` and `error_code` (deprecated): contains the string code of the error
     *   - `errorMessage` and `error_message` (deprecated): contains a human-readable indication of what went wrong, for example that an account had insufficient funds, or that there was an error in the provided Numscript.
     * 
     */
    
    public com.formance.formance_sdk.models.shared.ScriptResponse scriptResponse;

    public RunScriptResponse withScriptResponse(com.formance.formance_sdk.models.shared.ScriptResponse scriptResponse) {
        this.scriptResponse = scriptResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public RunScriptResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public RunScriptResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public RunScriptResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
