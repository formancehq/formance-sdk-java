/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.formance.formance_sdk.utils.TypedObject;
import com.formance.formance_sdk.utils.Utils.JsonShape;


@JsonDeserialize(using = V2BulkElementResult._Deserializer.class)
public class V2BulkElementResult {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private V2BulkElementResult(TypedObject value) {
        this.value = value;
    }

    public static V2BulkElementResult of(V2BulkElementResultCreateTransactionSchemas value) {
        Utils.checkNotNull(value, "value");
        return new V2BulkElementResult(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<V2BulkElementResultCreateTransactionSchemas>(){}));
    }

    public static V2BulkElementResult of(Schemas value) {
        Utils.checkNotNull(value, "value");
        return new V2BulkElementResult(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Schemas>(){}));
    }

    public static V2BulkElementResult of(V2BulkElementResultRevertTransactionSchemas value) {
        Utils.checkNotNull(value, "value");
        return new V2BulkElementResult(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<V2BulkElementResultRevertTransactionSchemas>(){}));
    }

    public static V2BulkElementResult of(V2BulkElementResultDeleteMetadataSchemas value) {
        Utils.checkNotNull(value, "value");
        return new V2BulkElementResult(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<V2BulkElementResultDeleteMetadataSchemas>(){}));
    }

    public static V2BulkElementResult of(V2BulkElementResultErrorSchemas value) {
        Utils.checkNotNull(value, "value");
        return new V2BulkElementResult(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<V2BulkElementResultErrorSchemas>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code V2BulkElementResultCreateTransactionSchemas}</li>
     * <li>{@code Schemas}</li>
     * <li>{@code V2BulkElementResultRevertTransactionSchemas}</li>
     * <li>{@code V2BulkElementResultDeleteMetadataSchemas}</li>
     * <li>{@code V2BulkElementResultErrorSchemas}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V2BulkElementResult other = (V2BulkElementResult) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.formance.formance_sdk.utils.OneOfDeserializer<V2BulkElementResult> {

        public _Deserializer() {
            super(V2BulkElementResult.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<V2BulkElementResultCreateTransactionSchemas>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Schemas>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<V2BulkElementResultRevertTransactionSchemas>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<V2BulkElementResultDeleteMetadataSchemas>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<V2BulkElementResultErrorSchemas>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2BulkElementResult.class,
                "value", value);
    }
 
}
