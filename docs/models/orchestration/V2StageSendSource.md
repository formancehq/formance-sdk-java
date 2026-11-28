# V2StageSendSource

Where a send stage takes the funds from


## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `account`                                                                              | [Optional\<V2StageSendSourceAccount>](../../models/shared/V2StageSendSourceAccount.md) | :heavy_minus_sign:                                                                     | Take the funds from a ledger account                                                   |
| `payment`                                                                              | [Optional\<V2StageSendSourcePayment>](../../models/shared/V2StageSendSourcePayment.md) | :heavy_minus_sign:                                                                     | Take the funds from a payment                                                          |
| `wallet`                                                                               | [Optional\<V2StageSendSourceWallet>](../../models/shared/V2StageSendSourceWallet.md)   | :heavy_minus_sign:                                                                     | Take the funds from a wallet                                                           |