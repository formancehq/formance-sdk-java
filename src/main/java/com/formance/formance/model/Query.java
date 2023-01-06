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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Query
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-06T13:21:14.001446Z[Etc/UTC]")
public class Query {
  public static final String SERIALIZED_NAME_LEDGERS = "ledgers";
  @SerializedName(SERIALIZED_NAME_LEDGERS)
  private List<String> ledgers = null;

  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private List<String> after = null;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize;

  public static final String SERIALIZED_NAME_TERMS = "terms";
  @SerializedName(SERIALIZED_NAME_TERMS)
  private List<String> terms = null;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private String sort;

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private String policy;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private String cursor;

  public Query() {
  }

  public Query ledgers(List<String> ledgers) {
    
    this.ledgers = ledgers;
    return this;
  }

  public Query addLedgersItem(String ledgersItem) {
    if (this.ledgers == null) {
      this.ledgers = new ArrayList<>();
    }
    this.ledgers.add(ledgersItem);
    return this;
  }

   /**
   * Get ledgers
   * @return ledgers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLedgers() {
    return ledgers;
  }


  public void setLedgers(List<String> ledgers) {
    this.ledgers = ledgers;
  }


  public Query after(List<String> after) {
    
    this.after = after;
    return this;
  }

  public Query addAfterItem(String afterItem) {
    if (this.after == null) {
      this.after = new ArrayList<>();
    }
    this.after.add(afterItem);
    return this;
  }

   /**
   * Get after
   * @return after
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAfter() {
    return after;
  }


  public void setAfter(List<String> after) {
    this.after = after;
  }


  public Query pageSize(Long pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * minimum: 0
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPageSize() {
    return pageSize;
  }


  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public Query terms(List<String> terms) {
    
    this.terms = terms;
    return this;
  }

  public Query addTermsItem(String termsItem) {
    if (this.terms == null) {
      this.terms = new ArrayList<>();
    }
    this.terms.add(termsItem);
    return this;
  }

   /**
   * Get terms
   * @return terms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTerms() {
    return terms;
  }


  public void setTerms(List<String> terms) {
    this.terms = terms;
  }


  public Query sort(String sort) {
    
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "txid:asc", value = "")

  public String getSort() {
    return sort;
  }


  public void setSort(String sort) {
    this.sort = sort;
  }


  public Query policy(String policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OR", value = "")

  public String getPolicy() {
    return policy;
  }


  public void setPolicy(String policy) {
    this.policy = policy;
  }


  public Query target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public Query cursor(String cursor) {
    
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "YXVsdCBhbmQgYSBtYXhpbXVtIG1heF9yZXN1bHRzLol=", value = "")

  public String getCursor() {
    return cursor;
  }


  public void setCursor(String cursor) {
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
    Query query = (Query) o;
    return Objects.equals(this.ledgers, query.ledgers) &&
        Objects.equals(this.after, query.after) &&
        Objects.equals(this.pageSize, query.pageSize) &&
        Objects.equals(this.terms, query.terms) &&
        Objects.equals(this.sort, query.sort) &&
        Objects.equals(this.policy, query.policy) &&
        Objects.equals(this.target, query.target) &&
        Objects.equals(this.cursor, query.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ledgers, after, pageSize, terms, sort, policy, target, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    sb.append("    ledgers: ").append(toIndentedString(ledgers)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

