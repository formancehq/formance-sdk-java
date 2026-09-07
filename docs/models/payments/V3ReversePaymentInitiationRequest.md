# V3ReversePaymentInitiationRequest


## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `amount`                                                                 | *BigInteger*                                                             | :heavy_check_mark:                                                       | Amount to reverse, in the asset's smallest unit                          |
| `asset`                                                                  | *String*                                                                 | :heavy_check_mark:                                                       | Asset the reversal is denominated in                                     |
| `description`                                                            | *String*                                                                 | :heavy_check_mark:                                                       | Human-readable reason for the reversal                                   |
| `metadata`                                                               | Map\<String, *String*>                                                   | :heavy_minus_sign:                                                       | Arbitrary key/value pairs attached to the resource                       |
| `reference`                                                              | *String*                                                                 | :heavy_check_mark:                                                       | Caller-supplied identifier for the reversal, used to deduplicate retries |