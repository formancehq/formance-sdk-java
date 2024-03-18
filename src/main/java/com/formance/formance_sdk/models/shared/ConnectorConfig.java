/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
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


@JsonDeserialize(using = ConnectorConfig._Deserializer.class)
public class ConnectorConfig {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private ConnectorConfig(TypedObject value) {
        this.value = value;
    }

    public static ConnectorConfig of(StripeConfig value) {
        Utils.checkNotNull(value, "value");
        return new ConnectorConfig(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<StripeConfig>(){}));
    }

    public static ConnectorConfig of(DummyPayConfig value) {
        Utils.checkNotNull(value, "value");
        return new ConnectorConfig(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DummyPayConfig>(){}));
    }

    public static ConnectorConfig of(WiseConfig value) {
        Utils.checkNotNull(value, "value");
        return new ConnectorConfig(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<WiseConfig>(){}));
    }

    public static ConnectorConfig of(ModulrConfig value) {
        Utils.checkNotNull(value, "value");
        return new ConnectorConfig(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ModulrConfig>(){}));
    }

    public static ConnectorConfig of(CurrencyCloudConfig value) {
        Utils.checkNotNull(value, "value");
        return new ConnectorConfig(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<CurrencyCloudConfig>(){}));
    }

    public static ConnectorConfig of(BankingCircleConfig value) {
        Utils.checkNotNull(value, "value");
        return new ConnectorConfig(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<BankingCircleConfig>(){}));
    }

    public static ConnectorConfig of(MangoPayConfig value) {
        Utils.checkNotNull(value, "value");
        return new ConnectorConfig(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<MangoPayConfig>(){}));
    }

    public static ConnectorConfig of(MoneycorpConfig value) {
        Utils.checkNotNull(value, "value");
        return new ConnectorConfig(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<MoneycorpConfig>(){}));
    }

    public static ConnectorConfig of(AtlarConfig value) {
        Utils.checkNotNull(value, "value");
        return new ConnectorConfig(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AtlarConfig>(){}));
    }

    public static ConnectorConfig of(AdyenConfig value) {
        Utils.checkNotNull(value, "value");
        return new ConnectorConfig(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AdyenConfig>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code StripeConfig}</li>
     * <li>{@code DummyPayConfig}</li>
     * <li>{@code WiseConfig}</li>
     * <li>{@code ModulrConfig}</li>
     * <li>{@code CurrencyCloudConfig}</li>
     * <li>{@code BankingCircleConfig}</li>
     * <li>{@code MangoPayConfig}</li>
     * <li>{@code MoneycorpConfig}</li>
     * <li>{@code AtlarConfig}</li>
     * <li>{@code AdyenConfig}</li>
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
        ConnectorConfig other = (ConnectorConfig) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.formance.formance_sdk.utils.OneOfDeserializer<ConnectorConfig> {

        public _Deserializer() {
            super(ConnectorConfig.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<StripeConfig>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DummyPayConfig>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<WiseConfig>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<ModulrConfig>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<CurrencyCloudConfig>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<BankingCircleConfig>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<MangoPayConfig>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<MoneycorpConfig>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<AtlarConfig>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<AdyenConfig>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectorConfig.class,
                "value", value);
    }
 
}
