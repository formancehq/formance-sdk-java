# Pool

A named group of accounts whose balances are aggregated together


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `accounts`                                                        | List\<*String*>                                                   | :heavy_check_mark:                                                | Accounts currently in the pool                                    |
| `id`                                                              | *String*                                                          | :heavy_check_mark:                                                | Unique identifier of the pool                                     |
| `name`                                                            | *String*                                                          | :heavy_check_mark:                                                | Human-readable name of the pool                                   |
| `query`                                                           | Map\<String, *Object*>                                            | :heavy_minus_sign:                                                | Filter selecting the accounts a dynamic pool contains             |
| `type`                                                            | [Optional\<PoolTypeEnum>](../../models/shared/PoolTypeEnum.md)    | :heavy_minus_sign:                                                | Whether a pool holds a fixed account list or is driven by a query |