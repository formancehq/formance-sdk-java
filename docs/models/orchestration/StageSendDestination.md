# StageSendDestination

Where a send stage puts the funds


## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `account`                                                                                    | [Optional\<StageSendDestinationAccount>](../../models/shared/StageSendDestinationAccount.md) | :heavy_minus_sign:                                                                           | Send the funds to a ledger account                                                           |
| `payment`                                                                                    | [Optional\<StageSendDestinationPayment>](../../models/shared/StageSendDestinationPayment.md) | :heavy_minus_sign:                                                                           | Send the funds to a payment                                                                  |
| `wallet`                                                                                     | [Optional\<StageSendDestinationWallet>](../../models/shared/StageSendDestinationWallet.md)   | :heavy_minus_sign:                                                                           | Send the funds to a wallet                                                                   |