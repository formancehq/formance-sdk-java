# Error

Request or server error. The HTTP status and code identify the failure.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `details`                                                                           | *Optional\<String>*                                                                 | :heavy_minus_sign:                                                                  | Additional details; when structured, this string contains a JSON object.            |
| `errorCode`                                                                         | *Optional\<String>*                                                                 | :heavy_minus_sign:                                                                  | Machine-readable error code (e.g. `not_found`, `unauthorized`, `connector_missing`) |
| `errorMessage`                                                                      | *Optional\<String>*                                                                 | :heavy_minus_sign:                                                                  | N/A                                                                                 |