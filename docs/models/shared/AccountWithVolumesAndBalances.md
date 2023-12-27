# AccountWithVolumesAndBalances


## Fields

| Field                                                | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `address`                                            | *String*                                             | :heavy_check_mark:                                   | N/A                                                  | users:001                                            |
| `balances`                                           | Map<String, *Long*>                                  | :heavy_minus_sign:                                   | N/A                                                  | [object Object]                                      |
| `metadata`                                           | Map<String, *Object*>                                | :heavy_minus_sign:                                   | N/A                                                  | [object Object]                                      |
| `type`                                               | *String*                                             | :heavy_minus_sign:                                   | N/A                                                  | virtual                                              |
| `volumes`                                            | Map<String, [Volume](../../models/shared/Volume.md)> | :heavy_minus_sign:                                   | N/A                                                  | [object Object]                                      |