/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.formance.formance_sdk.utils.OneOfDeserializer;
import com.formance.formance_sdk.utils.TypedObject;
import com.formance.formance_sdk.utils.Utils.JsonShape;
import com.formance.formance_sdk.utils.Utils.TypeReferenceWithShape;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;

@JsonDeserialize(using = Stage._Deserializer.class)
public class Stage {

    @JsonValue
    private TypedObject value;
    
    private Stage(TypedObject value) {
        this.value = value;
    }

    public static Stage of(StageSend value) {
        Utils.checkNotNull(value, "value");
        return new Stage(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<StageSend>(){}));
    }

    public static Stage of(StageDelay value) {
        Utils.checkNotNull(value, "value");
        return new Stage(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<StageDelay>(){}));
    }

    public static Stage of(StageWaitEvent value) {
        Utils.checkNotNull(value, "value");
        return new Stage(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<StageWaitEvent>(){}));
    }

    public static Stage of(Update value) {
        Utils.checkNotNull(value, "value");
        return new Stage(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Update>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.formance.formance_sdk.models.shared.StageSend}</li>
     * <li>{@code com.formance.formance_sdk.models.shared.StageDelay}</li>
     * <li>{@code com.formance.formance_sdk.models.shared.StageWaitEvent}</li>
     * <li>{@code com.formance.formance_sdk.models.shared.Update}</li>
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
        Stage other = (Stage) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<Stage> {

        public _Deserializer() {
            super(Stage.class, false,
                  TypeReferenceWithShape.of(new TypeReference<StageSend>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<StageDelay>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<Update>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<StageWaitEvent>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(Stage.class,
                "value", value);
    }
 
}

