/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

@JsonTypeInfo(use = Id.NAME, property = "action", include = As.EXISTING_PROPERTY, visible = true)
@JsonSubTypes({
    @Type(value = V2BulkElementCreateTransaction.class, name="CREATE_TRANSACTION"),
    @Type(value = V2BulkElementAddMetadata.class, name="ADD_METADATA"),
    @Type(value = V2BulkElementRevertTransaction.class, name="REVERT_TRANSACTION"),
    @Type(value = V2BulkElementDeleteMetadata.class, name="DELETE_METADATA")})
public interface V2BulkElement {

    String action();

}

