# V2Hold

Funds locked by a pending wallet debit, later either confirmed or voided


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `description`                                                                    | *String*                                                                         | :heavy_check_mark:                                                               | Human-readable reason the funds were held                                        |
| `destination`                                                                    | [Optional\<V2Subject>](../../models/shared/V2Subject.md)                         | :heavy_minus_sign:                                                               | The counterparty of a wallet movement, either a ledger account or another wallet |
| `id`                                                                             | *String*                                                                         | :heavy_check_mark:                                                               | The unique ID of the hold.                                                       |
| `metadata`                                                                       | Map\<String, *String*>                                                           | :heavy_check_mark:                                                               | Metadata associated with the hold.                                               |
| `walletID`                                                                       | *String*                                                                         | :heavy_check_mark:                                                               | The ID of the wallet the hold is associated with.                                |