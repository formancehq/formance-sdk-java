# V3ConversionsCursorResponseCursor

Paginated cursor wrapping the list of conversions


## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `data`                                                     | List\<[V3Conversion](../../models/shared/V3Conversion.md)> | :heavy_check_mark:                                         | N/A                                                        |                                                            |
| `hasMore`                                                  | *boolean*                                                  | :heavy_check_mark:                                         | N/A                                                        | false                                                      |
| `next`                                                     | *Optional\<String>*                                        | :heavy_minus_sign:                                         | N/A                                                        |                                                            |
| `pageSize`                                                 | *long*                                                     | :heavy_check_mark:                                         | N/A                                                        | 15                                                         |
| `previous`                                                 | *Optional\<String>*                                        | :heavy_minus_sign:                                         | N/A                                                        | YXVsdCBhbmQgYSBtYXhpbXVtIG1heF9yZXN1bHRzLol=               |