# GetVersionsResponse


## Fields

| Field                                             | Type                                              | Required                                          | Description                                       |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `env`                                             | *String*                                          | :heavy_check_mark:                                | Environment the stack is deployed in              |
| `region`                                          | *String*                                          | :heavy_check_mark:                                | Region the stack is deployed in                   |
| `versions`                                        | List\<[Version](../../models/shared/Version.md)>  | :heavy_check_mark:                                | Version and health of each component in the stack |