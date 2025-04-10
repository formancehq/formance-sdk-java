/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.ScriptResponse;
import com.formance.formance_sdk.utils.Response;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;

public class RunScriptResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * On success, it will return a 200 status code, and the resulting transaction under the `transaction` field.
     * 
     * <p>On failure, it will also return a 200 status code, and the following fields:
     *   - `details`: contains a URL. When there is an error parsing Numscript, the result can be difficult to read—the provided URL will render the error in an easy-to-read format.
     *   - `errorCode` and `error_code` (deprecated): contains the string code of the error
     *   - `errorMessage` and `error_message` (deprecated): contains a human-readable indication of what went wrong, for example that an account had insufficient funds, or that there was an error in the provided Numscript.
     */
    private Optional<? extends ScriptResponse> scriptResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public RunScriptResponse(
            String contentType,
            Optional<? extends ScriptResponse> scriptResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(scriptResponse, "scriptResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.scriptResponse = scriptResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public RunScriptResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * On success, it will return a 200 status code, and the resulting transaction under the `transaction` field.
     * 
     * <p>On failure, it will also return a 200 status code, and the following fields:
     *   - `details`: contains a URL. When there is an error parsing Numscript, the result can be difficult to read—the provided URL will render the error in an easy-to-read format.
     *   - `errorCode` and `error_code` (deprecated): contains the string code of the error
     *   - `errorMessage` and `error_message` (deprecated): contains a human-readable indication of what went wrong, for example that an account had insufficient funds, or that there was an error in the provided Numscript.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ScriptResponse> scriptResponse() {
        return (Optional<ScriptResponse>) scriptResponse;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public RunScriptResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * On success, it will return a 200 status code, and the resulting transaction under the `transaction` field.
     * 
     * <p>On failure, it will also return a 200 status code, and the following fields:
     *   - `details`: contains a URL. When there is an error parsing Numscript, the result can be difficult to read—the provided URL will render the error in an easy-to-read format.
     *   - `errorCode` and `error_code` (deprecated): contains the string code of the error
     *   - `errorMessage` and `error_message` (deprecated): contains a human-readable indication of what went wrong, for example that an account had insufficient funds, or that there was an error in the provided Numscript.
     */
    public RunScriptResponse withScriptResponse(ScriptResponse scriptResponse) {
        Utils.checkNotNull(scriptResponse, "scriptResponse");
        this.scriptResponse = Optional.ofNullable(scriptResponse);
        return this;
    }

    /**
     * On success, it will return a 200 status code, and the resulting transaction under the `transaction` field.
     * 
     * <p>On failure, it will also return a 200 status code, and the following fields:
     *   - `details`: contains a URL. When there is an error parsing Numscript, the result can be difficult to read—the provided URL will render the error in an easy-to-read format.
     *   - `errorCode` and `error_code` (deprecated): contains the string code of the error
     *   - `errorMessage` and `error_message` (deprecated): contains a human-readable indication of what went wrong, for example that an account had insufficient funds, or that there was an error in the provided Numscript.
     */
    public RunScriptResponse withScriptResponse(Optional<? extends ScriptResponse> scriptResponse) {
        Utils.checkNotNull(scriptResponse, "scriptResponse");
        this.scriptResponse = scriptResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public RunScriptResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public RunScriptResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunScriptResponse other = (RunScriptResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.scriptResponse, other.scriptResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            scriptResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RunScriptResponse.class,
                "contentType", contentType,
                "scriptResponse", scriptResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends ScriptResponse> scriptResponse = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * On success, it will return a 200 status code, and the resulting transaction under the `transaction` field.
         * 
         * <p>On failure, it will also return a 200 status code, and the following fields:
         *   - `details`: contains a URL. When there is an error parsing Numscript, the result can be difficult to read—the provided URL will render the error in an easy-to-read format.
         *   - `errorCode` and `error_code` (deprecated): contains the string code of the error
         *   - `errorMessage` and `error_message` (deprecated): contains a human-readable indication of what went wrong, for example that an account had insufficient funds, or that there was an error in the provided Numscript.
         */
        public Builder scriptResponse(ScriptResponse scriptResponse) {
            Utils.checkNotNull(scriptResponse, "scriptResponse");
            this.scriptResponse = Optional.ofNullable(scriptResponse);
            return this;
        }

        /**
         * On success, it will return a 200 status code, and the resulting transaction under the `transaction` field.
         * 
         * <p>On failure, it will also return a 200 status code, and the following fields:
         *   - `details`: contains a URL. When there is an error parsing Numscript, the result can be difficult to read—the provided URL will render the error in an easy-to-read format.
         *   - `errorCode` and `error_code` (deprecated): contains the string code of the error
         *   - `errorMessage` and `error_message` (deprecated): contains a human-readable indication of what went wrong, for example that an account had insufficient funds, or that there was an error in the provided Numscript.
         */
        public Builder scriptResponse(Optional<? extends ScriptResponse> scriptResponse) {
            Utils.checkNotNull(scriptResponse, "scriptResponse");
            this.scriptResponse = scriptResponse;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }
        
        public RunScriptResponse build() {
            return new RunScriptResponse(
                contentType,
                scriptResponse,
                statusCode,
                rawResponse);
        }
    }
}
