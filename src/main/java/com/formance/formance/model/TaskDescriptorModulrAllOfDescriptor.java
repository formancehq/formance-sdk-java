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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * TaskDescriptorModulrAllOfDescriptor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-22T14:25:59.402609Z[Etc/UTC]")
public class TaskDescriptorModulrAllOfDescriptor {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_ACCOUNT_I_D = "accountID";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_I_D)
  private String accountID;

  public TaskDescriptorModulrAllOfDescriptor() {
  }

  public TaskDescriptorModulrAllOfDescriptor name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TaskDescriptorModulrAllOfDescriptor key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public TaskDescriptorModulrAllOfDescriptor accountID(String accountID) {
    
    this.accountID = accountID;
    return this;
  }

   /**
   * Get accountID
   * @return accountID
  **/
  @javax.annotation.Nullable

  public String getAccountID() {
    return accountID;
  }


  public void setAccountID(String accountID) {
    this.accountID = accountID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskDescriptorModulrAllOfDescriptor taskDescriptorModulrAllOfDescriptor = (TaskDescriptorModulrAllOfDescriptor) o;
    return Objects.equals(this.name, taskDescriptorModulrAllOfDescriptor.name) &&
        Objects.equals(this.key, taskDescriptorModulrAllOfDescriptor.key) &&
        Objects.equals(this.accountID, taskDescriptorModulrAllOfDescriptor.accountID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, accountID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDescriptorModulrAllOfDescriptor {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
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
