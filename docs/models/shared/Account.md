# Account


## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `address`                                                | *String*                                                 | :heavy_check_mark:                                       | N/A                                                      | users:001                                                |
| `metadata`                                               | Map<String, *Object*>                                    | :heavy_minus_sign:                                       | N/A                                                      | {<br/>"admin": true,<br/>"a": {<br/>"nested": {<br/>"key": "value"<br/>}<br/>}<br/>} |
| `type`                                                   | *Optional<String>*                                       | :heavy_minus_sign:                                       | N/A                                                      | virtual                                                  |