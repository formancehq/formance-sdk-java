# V3PoolBalance


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `amount`                                                                | *BigInteger*                                                            | :heavy_check_mark:                                                      | Total held across the pool for this asset, in the asset's smallest unit |
| `asset`                                                                 | *String*                                                                | :heavy_check_mark:                                                      | Asset the balance is denominated in                                     |
| `relatedAccounts`                                                       | List\<*String*>                                                         | :heavy_minus_sign:                                                      | Accounts contributing to this balance                                   |