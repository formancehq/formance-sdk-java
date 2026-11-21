# V2LogsCursorResponse


## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `cursor`                                                                                       | [V2LogsCursorResponseCursor](../../models/shared/V2LogsCursorResponseCursor.md)                | :heavy_check_mark:                                                                             | Paginated cursor wrapping the list of logs                                                     |
| `resource`                                                                                     | [Optional\<V2LogsCursorResponseResource>](../../models/shared/V2LogsCursorResponseResource.md) | :heavy_minus_sign:                                                                             | The resource type carried by this cursor                                                       |