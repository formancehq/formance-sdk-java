# V2VolumesWithBalance


## Fields

| Field                                                   | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `account`                                               | *String*                                                | :heavy_check_mark:                                      | The account address these volumes belong to             |
| `asset`                                                 | *String*                                                | :heavy_check_mark:                                      | The asset these volumes are denominated in              |
| `balance`                                               | *BigInteger*                                            | :heavy_check_mark:                                      | Net balance for this asset, equal to input minus output |
| `input`                                                 | *BigInteger*                                            | :heavy_check_mark:                                      | Total amount credited to the account for this asset     |
| `output`                                                | *BigInteger*                                            | :heavy_check_mark:                                      | Total amount debited from the account for this asset    |