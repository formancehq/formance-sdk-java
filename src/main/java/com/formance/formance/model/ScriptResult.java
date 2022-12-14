/*
 * Formance Stack API
 * Open, modular foundation for unique payments flows  # Introduction This API is documented in **OpenAPI format**.  # Authentication Formance Stack offers one forms of authentication:   - OAuth2 OAuth2 - an open protocol to allow secure authorization in a simple and standard method from web, mobile and desktop applications. <SecurityDefinitions /> 
 *
 * The version of the OpenAPI document: v1.0.0-rc.1
 * Contact: support@formance.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.formance.formance.model;

import java.util.Objects;
import java.util.Arrays;
import com.formance.formance.model.Transaction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * ScriptResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-22T14:25:59.402609Z[Etc/UTC]")
public class ScriptResult {
  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  /**
   * Gets or Sets errorCode
   */
  @JsonAdapter(ErrorCodeEnum.Adapter.class)
  public enum ErrorCodeEnum {
    INTERNAL("INTERNAL"),
    
    INSUFFICIENT_FUND("INSUFFICIENT_FUND"),
    
    COMPILATION_FAILED("COMPILATION_FAILED"),
    
    NO_SCRIPT("NO_SCRIPT");

    private String value;

    ErrorCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorCodeEnum fromValue(String value) {
      for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ErrorCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private ErrorCodeEnum errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private Transaction transaction;

  public ScriptResult() {
  }

  public ScriptResult details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public ScriptResult errorCode(ErrorCodeEnum errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @javax.annotation.Nullable

  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }


  public ScriptResult errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @javax.annotation.Nullable

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public ScriptResult transaction(Transaction transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @javax.annotation.Nullable

  public Transaction getTransaction() {
    return transaction;
  }


  public void setTransaction(Transaction transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScriptResult scriptResult = (ScriptResult) o;
    return Objects.equals(this.details, scriptResult.details) &&
        Objects.equals(this.errorCode, scriptResult.errorCode) &&
        Objects.equals(this.errorMessage, scriptResult.errorMessage) &&
        Objects.equals(this.transaction, scriptResult.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, errorCode, errorMessage, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScriptResult {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

