# ListBalancesResponseCursor

Paginated cursor wrapping the list of balances


## Fields

| Field                                                  | Type                                                   | Required                                               | Description                                            | Example                                                |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `data`                                                 | List\<[Balance](../../models/shared/Balance.md)>       | :heavy_check_mark:                                     | N/A                                                    |                                                        |
| `hasMore`                                              | *Optional\<Boolean>*                                   | :heavy_minus_sign:                                     | Whether further pages are available                    | false                                                  |
| `next`                                                 | *Optional\<String>*                                    | :heavy_minus_sign:                                     | Cursor for the next page, absent on the last page      |                                                        |
| `pageSize`                                             | *long*                                                 | :heavy_check_mark:                                     | Number of items requested per page                     | 15                                                     |
| `previous`                                             | *Optional\<String>*                                    | :heavy_minus_sign:                                     | Cursor for the previous page, absent on the first page | YXVsdCBhbmQgYSBtYXhpbXVtIG1heF9yZXN1bHRzLol=           |