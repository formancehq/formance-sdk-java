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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LedgerStorage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T11:11:02.881452Z[Etc/UTC]")
public class LedgerStorage {
  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_LEDGERS = "ledgers";
  @SerializedName(SERIALIZED_NAME_LEDGERS)
  private List<String> ledgers = new ArrayList<>();

  public LedgerStorage() {
  }

  public LedgerStorage driver(String driver) {
    
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @javax.annotation.Nonnull

  public String getDriver() {
    return driver;
  }


  public void setDriver(String driver) {
    this.driver = driver;
  }


  public LedgerStorage ledgers(List<String> ledgers) {
    
    this.ledgers = ledgers;
    return this;
  }

  public LedgerStorage addLedgersItem(String ledgersItem) {
    this.ledgers.add(ledgersItem);
    return this;
  }

   /**
   * Get ledgers
   * @return ledgers
  **/
  @javax.annotation.Nonnull

  public List<String> getLedgers() {
    return ledgers;
  }


  public void setLedgers(List<String> ledgers) {
    this.ledgers = ledgers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LedgerStorage ledgerStorage = (LedgerStorage) o;
    return Objects.equals(this.driver, ledgerStorage.driver) &&
        Objects.equals(this.ledgers, ledgerStorage.ledgers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver, ledgers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LedgerStorage {\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    ledgers: ").append(toIndentedString(ledgers)).append("\n");
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

