# V2InsertSchemaRequest


## Fields

| Field                                               | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `idempotencyKey`                                    | *Optional\<String>*                                 | :heavy_minus_sign:                                  | Use an idempotency key                              |                                                     |
| `v2SchemaData`                                      | [V2SchemaData](../../models/shared/V2SchemaData.md) | :heavy_check_mark:                                  | N/A                                                 |                                                     |
| `ledger`                                            | *String*                                            | :heavy_check_mark:                                  | Name of the ledger.                                 | ledger001                                           |
| `version`                                           | *String*                                            | :heavy_check_mark:                                  | Schema version.                                     | v1.0.0                                              |