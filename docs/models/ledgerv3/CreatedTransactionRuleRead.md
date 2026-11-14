# CreatedTransactionRuleRead

Rule scoped to MirrorCreatedTransaction. Inside `match`, `log` is the created-transaction proto directly (e.g. `log.metadata["k"]`).



## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `actions`                                                                                  | List\<[CreatedTransactionActionRead](../../models/shared/CreatedTransactionActionRead.md)> | :heavy_minus_sign:                                                                         | N/A                                                                                        |
| `match`                                                                                    | *Optional\<String>*                                                                        | :heavy_minus_sign:                                                                         | N/A                                                                                        |