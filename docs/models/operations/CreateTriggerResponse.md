# CreateTriggerResponse


## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `contentType`                                                                                                            | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | HTTP response content type for this operation                                                                            |
| `createTriggerResponse`                                                                                                  | [com.formance.formance_sdk.models.shared.CreateTriggerResponse](../../models/shared/CreateTriggerResponse.md)            | :heavy_minus_sign:                                                                                                       | Created trigger                                                                                                          |
| `error`                                                                                                                  | [com.formance.formance_sdk.models.shared.Error](../../models/shared/Error.md)                                            | :heavy_minus_sign:                                                                                                       | General error                                                                                                            |
| `statusCode`                                                                                                             | *Integer*                                                                                                                | :heavy_check_mark:                                                                                                       | HTTP response status code for this operation                                                                             |
| `rawResponse`                                                                                                            | [HttpResponse<byte[]>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_minus_sign:                                                                                                       | Raw HTTP response; suitable for custom response parsing                                                                  |