/*
 * Formance Stack API
 * Open, modular foundation for unique payments flows  # Introduction This API is documented in **OpenAPI format**.  # Authentication Formance Stack offers one forms of authentication:   - OAuth2 OAuth2 - an open protocol to allow secure authorization in a simple and standard method from web, mobile and desktop applications. <SecurityDefinitions /> 
 *
 * The version of the OpenAPI document: v0.2.6
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
import java.util.ArrayList;
import java.util.List;

/**
 * Query
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T15:55:56.337030Z[Etc/UTC]")
public class Query {
  public static final String SERIALIZED_NAME_LEDGERS = "ledgers";
  @SerializedName(SERIALIZED_NAME_LEDGERS)
  private List<String> ledgers = null;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "nextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_TERMS = "terms";
  @SerializedName(SERIALIZED_NAME_TERMS)
  private List<String> terms = null;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

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

  public List<String> getLedgers() {
    return ledgers;
  }


  public void setLedgers(List<String> ledgers) {
    this.ledgers = ledgers;
  }


  public Query nextToken(String nextToken) {
    
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @javax.annotation.Nullable

  public String getNextToken() {
    return nextToken;
  }


  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  public Query size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
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

  public List<String> getTerms() {
    return terms;
  }


  public void setTerms(List<String> terms) {
    this.terms = terms;
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

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
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
        Objects.equals(this.nextToken, query.nextToken) &&
        Objects.equals(this.size, query.size) &&
        Objects.equals(this.terms, query.terms) &&
        Objects.equals(this.target, query.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ledgers, nextToken, size, terms, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    sb.append("    ledgers: ").append(toIndentedString(ledgers)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

