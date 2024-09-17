# V2RevertTransactionRequest


## Fields

| Field                                                   | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `atEffectiveDate`                                       | *Optional<Boolean>*                                     | :heavy_minus_sign:                                      | Revert transaction at effective date of the original tx |                                                         |
| `force`                                                 | *Optional<Boolean>*                                     | :heavy_minus_sign:                                      | Force revert                                            |                                                         |
| `id`                                                    | *BigInteger*                                            | :heavy_check_mark:                                      | Transaction ID.                                         | 1234                                                    |
| `ledger`                                                | *String*                                                | :heavy_check_mark:                                      | Name of the ledger.                                     | ledger001                                               |