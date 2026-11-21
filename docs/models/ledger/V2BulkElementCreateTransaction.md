# V2BulkElementCreateTransaction


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `action`                                                                         | *String*                                                                         | :heavy_check_mark:                                                               | The bulk action this element performs                                            |
| `data`                                                                           | [Optional\<V2PostTransaction>](../../models/shared/V2PostTransaction.md)         | :heavy_minus_sign:                                                               | N/A                                                                              |
| `ik`                                                                             | *Optional\<String>*                                                              | :heavy_minus_sign:                                                               | Idempotency key scoped to this element, making it safe to retry the bulk request |