/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.shared;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class V3ForwardBankAccountResponseData {

    /**
     * Since this call is asynchronous, the response will contain the ID of the task that was created to forward the bank account to the PSP. You can use the task API to check the status of the task and get the resulting bank account ID.
     * 
     */
    @JsonProperty("taskID")
    private String taskID;

    @JsonCreator
    public V3ForwardBankAccountResponseData(
            @JsonProperty("taskID") String taskID) {
        Utils.checkNotNull(taskID, "taskID");
        this.taskID = taskID;
    }

    /**
     * Since this call is asynchronous, the response will contain the ID of the task that was created to forward the bank account to the PSP. You can use the task API to check the status of the task and get the resulting bank account ID.
     * 
     */
    @JsonIgnore
    public String taskID() {
        return taskID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Since this call is asynchronous, the response will contain the ID of the task that was created to forward the bank account to the PSP. You can use the task API to check the status of the task and get the resulting bank account ID.
     * 
     */
    public V3ForwardBankAccountResponseData withTaskID(String taskID) {
        Utils.checkNotNull(taskID, "taskID");
        this.taskID = taskID;
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
        V3ForwardBankAccountResponseData other = (V3ForwardBankAccountResponseData) o;
        return 
            Objects.deepEquals(this.taskID, other.taskID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            taskID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ForwardBankAccountResponseData.class,
                "taskID", taskID);
    }
    
    public final static class Builder {
 
        private String taskID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Since this call is asynchronous, the response will contain the ID of the task that was created to forward the bank account to the PSP. You can use the task API to check the status of the task and get the resulting bank account ID.
         * 
         */
        public Builder taskID(String taskID) {
            Utils.checkNotNull(taskID, "taskID");
            this.taskID = taskID;
            return this;
        }
        
        public V3ForwardBankAccountResponseData build() {
            return new V3ForwardBankAccountResponseData(
                taskID);
        }
    }
}

