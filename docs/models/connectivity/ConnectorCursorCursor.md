# ConnectorCursorCursor


## Fields

| Field                                                | Type                                                 | Required                                             | Description                                          |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `data`                                               | List\<[Connector](../../models/shared/Connector.md)> | :heavy_check_mark:                                   | N/A                                                  |
| `hasMore`                                            | *boolean*                                            | :heavy_check_mark:                                   | N/A                                                  |
| `next`                                               | *Optional\<String>*                                  | :heavy_minus_sign:                                   | Cursor of the next page; absent on the last page     |
| `pageSize`                                           | *int*                                                | :heavy_check_mark:                                   | N/A                                                  |