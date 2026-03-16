# V2LogDataDeleteMetadata

Payload for DELETE_METADATA log entries. Contains the target entity and the metadata key that was deleted.


## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `key`                                                                                         | *String*                                                                                      | :heavy_check_mark:                                                                            | The metadata key that was deleted                                                             |
| `targetId`                                                                                    | [V2LogDataDeleteMetadataTargetId](../../models/shared/V2LogDataDeleteMetadataTargetId.md)     | :heavy_check_mark:                                                                            | N/A                                                                                           |
| `targetType`                                                                                  | [V2LogDataDeleteMetadataTargetType](../../models/shared/V2LogDataDeleteMetadataTargetType.md) | :heavy_check_mark:                                                                            | Type of the target entity                                                                     |