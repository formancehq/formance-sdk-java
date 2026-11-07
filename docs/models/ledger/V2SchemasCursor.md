# V2SchemasCursor

Paginated cursor over the ledger's schemas


## Fields

| Field                                                  | Type                                                   | Required                                               | Description                                            | Example                                                |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `data`                                                 | List\<[V2Schema](../../models/shared/V2Schema.md)>     | :heavy_check_mark:                                     | The schemas on this page                               |                                                        |
| `hasMore`                                              | *boolean*                                              | :heavy_check_mark:                                     | Whether further pages are available                    |                                                        |
| `next`                                                 | *Optional\<String>*                                    | :heavy_minus_sign:                                     | Cursor for the next page, absent on the last page      | aW0gdmVuaWFtLCBxdWlzIG5vc3RydWQ=                       |
| `pageSize`                                             | *long*                                                 | :heavy_check_mark:                                     | Number of items requested per page                     |                                                        |
| `previous`                                             | *Optional\<String>*                                    | :heavy_minus_sign:                                     | Cursor for the previous page, absent on the first page | YXVsdCBhbmQgYSBtYXhpbXVtIG1heF9yZXN1bHRzLol=           |