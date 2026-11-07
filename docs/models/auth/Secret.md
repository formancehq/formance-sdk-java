# Secret

A client secret. The full value is returned only at creation and cannot be retrieved again


## Fields

| Field                                              | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `clear`                                            | *String*                                           | :heavy_check_mark:                                 | N/A                                                |
| `id`                                               | *String*                                           | :heavy_check_mark:                                 | N/A                                                |
| `lastDigits`                                       | *String*                                           | :heavy_check_mark:                                 | N/A                                                |
| `metadata`                                         | Map\<String, *String*>                             | :heavy_minus_sign:                                 | Arbitrary key/value pairs attached to the resource |
| `name`                                             | *String*                                           | :heavy_check_mark:                                 | Human-readable name identifying the secret         |