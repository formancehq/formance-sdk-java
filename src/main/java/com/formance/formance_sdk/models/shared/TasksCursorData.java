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

@JsonDeserialize(using = TasksCursorData._Deserializer.class)
public class TasksCursorData {

    @JsonValue
    private TypedObject value;
    
    private TasksCursorData(TypedObject value) {
        this.value = value;
    }

    public static TasksCursorData of(TaskStripe value) {
        Utils.checkNotNull(value, "value");
        return new TasksCursorData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TaskStripe>(){}));
    }

    public static TasksCursorData of(TaskWise value) {
        Utils.checkNotNull(value, "value");
        return new TasksCursorData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TaskWise>(){}));
    }

    public static TasksCursorData of(TaskCurrencyCloud value) {
        Utils.checkNotNull(value, "value");
        return new TasksCursorData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TaskCurrencyCloud>(){}));
    }

    public static TasksCursorData of(TaskDummyPay value) {
        Utils.checkNotNull(value, "value");
        return new TasksCursorData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TaskDummyPay>(){}));
    }

    public static TasksCursorData of(TaskModulr value) {
        Utils.checkNotNull(value, "value");
        return new TasksCursorData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TaskModulr>(){}));
    }

    public static TasksCursorData of(TaskBankingCircle value) {
        Utils.checkNotNull(value, "value");
        return new TasksCursorData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TaskBankingCircle>(){}));
    }

    public static TasksCursorData of(TaskMangoPay value) {
        Utils.checkNotNull(value, "value");
        return new TasksCursorData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TaskMangoPay>(){}));
    }

    public static TasksCursorData of(TaskMoneycorp value) {
        Utils.checkNotNull(value, "value");
        return new TasksCursorData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TaskMoneycorp>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.formance.formance_sdk.models.shared.TaskStripe}</li>
     * <li>{@code com.formance.formance_sdk.models.shared.TaskWise}</li>
     * <li>{@code com.formance.formance_sdk.models.shared.TaskCurrencyCloud}</li>
     * <li>{@code com.formance.formance_sdk.models.shared.TaskDummyPay}</li>
     * <li>{@code com.formance.formance_sdk.models.shared.TaskModulr}</li>
     * <li>{@code com.formance.formance_sdk.models.shared.TaskBankingCircle}</li>
     * <li>{@code com.formance.formance_sdk.models.shared.TaskMangoPay}</li>
     * <li>{@code com.formance.formance_sdk.models.shared.TaskMoneycorp}</li>
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
        TasksCursorData other = (TasksCursorData) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<TasksCursorData> {

        public _Deserializer() {
            super(TasksCursorData.class, false,
                  TypeReferenceWithShape.of(new TypeReference<TaskMoneycorp>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<TaskMangoPay>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<TaskBankingCircle>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<TaskModulr>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<TaskDummyPay>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<TaskCurrencyCloud>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<TaskWise>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<TaskStripe>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(TasksCursorData.class,
                "value", value);
    }
 
}

