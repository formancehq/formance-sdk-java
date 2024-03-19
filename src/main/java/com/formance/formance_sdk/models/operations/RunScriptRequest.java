/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class RunScriptRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.formance.formance_sdk.models.shared.Script script;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    /**
     * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=preview")
    private Optional<? extends Boolean> preview;

    public RunScriptRequest(
            com.formance.formance_sdk.models.shared.Script script,
            String ledger,
            Optional<? extends Boolean> preview) {
        Utils.checkNotNull(script, "script");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(preview, "preview");
        this.script = script;
        this.ledger = ledger;
        this.preview = preview;
    }

    public com.formance.formance_sdk.models.shared.Script script() {
        return script;
    }

    /**
     * Name of the ledger.
     */
    public String ledger() {
        return ledger;
    }

    /**
     * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
     */
    public Optional<? extends Boolean> preview() {
        return preview;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RunScriptRequest withScript(com.formance.formance_sdk.models.shared.Script script) {
        Utils.checkNotNull(script, "script");
        this.script = script;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public RunScriptRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    /**
     * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
     */
    public RunScriptRequest withPreview(boolean preview) {
        Utils.checkNotNull(preview, "preview");
        this.preview = Optional.ofNullable(preview);
        return this;
    }

    /**
     * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
     */
    public RunScriptRequest withPreview(Optional<? extends Boolean> preview) {
        Utils.checkNotNull(preview, "preview");
        this.preview = preview;
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
        RunScriptRequest other = (RunScriptRequest) o;
        return 
            java.util.Objects.deepEquals(this.script, other.script) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger) &&
            java.util.Objects.deepEquals(this.preview, other.preview);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            script,
            ledger,
            preview);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RunScriptRequest.class,
                "script", script,
                "ledger", ledger,
                "preview", preview);
    }
    
    public final static class Builder {
 
        private com.formance.formance_sdk.models.shared.Script script;
 
        private String ledger;
 
        private Optional<? extends Boolean> preview = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder script(com.formance.formance_sdk.models.shared.Script script) {
            Utils.checkNotNull(script, "script");
            this.script = script;
            return this;
        }

        /**
         * Name of the ledger.
         */
        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }

        /**
         * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
         */
        public Builder preview(boolean preview) {
            Utils.checkNotNull(preview, "preview");
            this.preview = Optional.ofNullable(preview);
            return this;
        }

        /**
         * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
         */
        public Builder preview(Optional<? extends Boolean> preview) {
            Utils.checkNotNull(preview, "preview");
            this.preview = preview;
            return this;
        }
        
        public RunScriptRequest build() {
            return new RunScriptRequest(
                script,
                ledger,
                preview);
        }
    }
}

