/*
 * Formance Stack API
 * Open, modular foundation for unique payments flows  # Introduction This API is documented in **OpenAPI format**.  # Authentication Formance Stack offers one forms of authentication:   - OAuth2 OAuth2 - an open protocol to allow secure authorization in a simple and standard method from web, mobile and desktop applications. <SecurityDefinitions /> 
 *
 * The version of the OpenAPI document: v1.0.0-rc.4
 * Contact: support@formance.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.formance.formance.model;

import java.util.Objects;
import java.util.Arrays;
import com.formance.formance.model.ListTransactionsResponseCursor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * ListTransactionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-03T14:28:56.964425Z[Etc/UTC]")
public class ListTransactionsResponse {
  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private ListTransactionsResponseCursor cursor;

  public ListTransactionsResponse() {
  }

  public ListTransactionsResponse cursor(ListTransactionsResponseCursor cursor) {
    
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @javax.annotation.Nonnull

  public ListTransactionsResponseCursor getCursor() {
    return cursor;
  }


  public void setCursor(ListTransactionsResponseCursor cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTransactionsResponse listTransactionsResponse = (ListTransactionsResponse) o;
    return Objects.equals(this.cursor, listTransactionsResponse.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsResponse {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

