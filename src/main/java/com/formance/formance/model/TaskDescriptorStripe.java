/*
 * Formance Stack API
 * Open, modular foundation for unique payments flows  # Introduction This API is documented in **OpenAPI format**.  # Authentication Formance Stack offers one forms of authentication:   - OAuth2 OAuth2 - an open protocol to allow secure authorization in a simple and standard method from web, mobile and desktop applications. <SecurityDefinitions /> 
 *
 * The version of the OpenAPI document: develop
 * Contact: support@formance.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.formance.formance.model;

import java.util.Objects;
import java.util.Arrays;
import com.formance.formance.model.TaskDescriptorStripeDescriptor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * TaskDescriptorStripe
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-06T13:21:14.001446Z[Etc/UTC]")
public class TaskDescriptorStripe {
  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  /**
   * The task status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    STOPPED("stopped"),
    
    PENDING("pending"),
    
    TERMINATED("terminated"),
    
    ACTIVE("active"),
    
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private Object state;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private TaskDescriptorStripeDescriptor descriptor;

  public TaskDescriptorStripe() {
  }

  public TaskDescriptorStripe provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * The connector code
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "stripe", value = "The connector code")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  public TaskDescriptorStripe createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date when the task was created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T00:00Z", value = "The date when the task was created")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public TaskDescriptorStripe status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The task status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "stopped", value = "The task status")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public TaskDescriptorStripe error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * The error message if the task failed
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Error: Something went wrong", value = "The error message if the task failed")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public TaskDescriptorStripe state(Object state) {
    
    this.state = state;
    return this;
  }

   /**
   * The task state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "The task state")

  public Object getState() {
    return state;
  }


  public void setState(Object state) {
    this.state = state;
  }


  public TaskDescriptorStripe descriptor(TaskDescriptorStripeDescriptor descriptor) {
    
    this.descriptor = descriptor;
    return this;
  }

   /**
   * Get descriptor
   * @return descriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskDescriptorStripeDescriptor getDescriptor() {
    return descriptor;
  }


  public void setDescriptor(TaskDescriptorStripeDescriptor descriptor) {
    this.descriptor = descriptor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskDescriptorStripe taskDescriptorStripe = (TaskDescriptorStripe) o;
    return Objects.equals(this.provider, taskDescriptorStripe.provider) &&
        Objects.equals(this.createdAt, taskDescriptorStripe.createdAt) &&
        Objects.equals(this.status, taskDescriptorStripe.status) &&
        Objects.equals(this.error, taskDescriptorStripe.error) &&
        Objects.equals(this.state, taskDescriptorStripe.state) &&
        Objects.equals(this.descriptor, taskDescriptorStripe.descriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, createdAt, status, error, state, descriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDescriptorStripe {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
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

