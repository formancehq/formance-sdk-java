# V2StageSendDestination

Where a send stage puts the funds


## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `account`                                                                                        | [Optional\<V2StageSendDestinationAccount>](../../models/shared/V2StageSendDestinationAccount.md) | :heavy_minus_sign:                                                                               | Send the funds to a ledger account                                                               |
| `payment`                                                                                        | [Optional\<V2StageSendDestinationPayment>](../../models/shared/V2StageSendDestinationPayment.md) | :heavy_minus_sign:                                                                               | Send the funds to a payment                                                                      |
| `wallet`                                                                                         | [Optional\<V2StageSendDestinationWallet>](../../models/shared/V2StageSendDestinationWallet.md)   | :heavy_minus_sign:                                                                               | Send the funds to a wallet                                                                       |