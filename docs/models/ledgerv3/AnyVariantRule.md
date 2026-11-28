# AnyVariantRule

Rule scoped to every variant. `log` is the full MirrorLogEntry — use `has(log.<variant>)` guards to read variant-specific fields.



## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `actions`                                                          | List\<[AnyVariantAction](../../models/shared/AnyVariantAction.md)> | :heavy_minus_sign:                                                 | N/A                                                                |
| `match`                                                            | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | N/A                                                                |