# V3ErrorResponse


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `details`                                                 | *Optional\<String>*                                       | :heavy_minus_sign:                                        | Optional link carrying additional context about the error |                                                           |
| `errorCode`                                               | [V3ErrorsEnum](../../models/shared/V3ErrorsEnum.md)       | :heavy_check_mark:                                        | Machine-readable error code identifying the failure       | VALIDATION                                                |
| `errorMessage`                                            | *String*                                                  | :heavy_check_mark:                                        | Human-readable description of the error                   | [VALIDATION] missing required config field: pollingPeriod |