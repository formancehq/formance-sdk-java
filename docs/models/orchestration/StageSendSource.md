# StageSendSource

Where a send stage takes the funds from


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `account`                                                                          | [Optional\<StageSendSourceAccount>](../../models/shared/StageSendSourceAccount.md) | :heavy_minus_sign:                                                                 | Take the funds from a ledger account                                               |
| `payment`                                                                          | [Optional\<StageSendSourcePayment>](../../models/shared/StageSendSourcePayment.md) | :heavy_minus_sign:                                                                 | Take the funds from a payment                                                      |
| `wallet`                                                                           | [Optional\<StageSendSourceWallet>](../../models/shared/StageSendSourceWallet.md)   | :heavy_minus_sign:                                                                 | Take the funds from a wallet                                                       |