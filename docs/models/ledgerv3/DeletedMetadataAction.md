# DeletedMetadataAction


## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `drop`                                                                         | [Optional\<DropAction>](../../models/shared/DropAction.md)                     | :heavy_minus_sign:                                                             | Turns the entry into a fill-gap that preserves log-ID and tx-ID continuity.    |
| `rewriteAddress`                                                               | [Optional\<RewriteAddressAction>](../../models/shared/RewriteAddressAction.md) | :heavy_minus_sign:                                                             | N/A                                                                            |