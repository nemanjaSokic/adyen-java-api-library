package com.adyen.model.checkout;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class PayByBankAISDirectDebitDetails {

    public static final String JSON_PROPERTY_TYPE = "type";
    private TypeEnum type;

    /**
     * Pay by bank type.
     */
    public enum TypeEnum {
        PAY_BY_BANK_AIS_DD("paybybank_AIS_DD");

        private final String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PayByBankAISDirectDebitDetails.TypeEnum fromValue(String value) {
            for (PayByBankAISDirectDebitDetails.TypeEnum b : PayByBankAISDirectDebitDetails.TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
    private String checkoutAttemptId;

    /**
     * **pay by bank type**
     * @return type
     **/
    @ApiModelProperty(value = "**pay by bank type**")
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TypeEnum getType() {
        return type;
    }

    /**
     * **pay by bank type**
     */
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The checkout attempt identifier.
     * @return checkoutAttemptId
     **/
    @ApiModelProperty(value = "The checkout attempt identifier.")
    @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCheckoutAttemptId() {
        return checkoutAttemptId;
    }

    /**
     * The checkout attempt identifier.
     */
    @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCheckoutAttemptId(String checkoutAttemptId) {
        this.checkoutAttemptId = checkoutAttemptId;
    }

    /**
     * Return true if this PayByBankAISDirectDebitDetails object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PayByBankAISDirectDebitDetails payByBankAISDD = (PayByBankAISDirectDebitDetails) o;
        return  Objects.equals(this.checkoutAttemptId, payByBankAISDD.checkoutAttemptId) &&
                Objects.equals(this.type, payByBankAISDD.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkoutAttemptId, type);
    }

    @Override
    public String toString() {
        return "class PayByBankAISDirectDebitDetails {\n" +
                "    checkoutAttemptId: " + toIndentedString(checkoutAttemptId) + "\n" +
                "    type: " + toIndentedString(type) + "\n" +
                "}";
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

    /**
     * Create an instance of PayByBankAISDirectDebitDetails given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PayByBankAISDirectDebitDetails
     * @throws JsonProcessingException if the JSON string is invalid with respect to PayByBankAISDirectDebitDetails
     */
    public static PayByBankAISDirectDebitDetails fromJson(String jsonString) throws JsonProcessingException {
        return JSON.getMapper().readValue(jsonString, PayByBankAISDirectDebitDetails.class);
    }
    /**
     * Convert an instance of PayByBankAISDirectDebitDetails to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return JSON.getMapper().writeValueAsString(this);
    }

}