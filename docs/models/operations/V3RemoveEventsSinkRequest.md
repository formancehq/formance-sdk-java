# V3RemoveEventsSinkRequest


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `idempotencyKey`                                              | *Optional\<String>*                                           | :heavy_minus_sign:                                            | Idempotency key for the request                               |
| `controllerId`                                                | *Optional\<String>*                                           | :heavy_minus_sign:                                            | Optional opaque owner identity used as a removal precondition |
| `sinkName`                                                    | *String*                                                      | :heavy_check_mark:                                            | Name of the event sink to remove                              |