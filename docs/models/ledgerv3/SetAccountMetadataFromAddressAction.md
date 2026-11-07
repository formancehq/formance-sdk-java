# SetAccountMetadataFromAddressAction

For every posting address matching `pattern`, iterate every entry in `replacements` and set accountMetadata[address][key] to the RE2 replacement of the address. Each replacement carries an optional metadata `type` token (same tokens as SetMetadataAction.type).



## Fields

| Field                                                                                                              | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `pattern`                                                                                                          | *String*                                                                                                           | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |
| `replacements`                                                                                                     | List\<[SetAccountMetadataFromAddressReplacement](../../models/shared/SetAccountMetadataFromAddressReplacement.md)> | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |