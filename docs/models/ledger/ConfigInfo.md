# ConfigInfo

Configuration and version information for the ledger server


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `config`                                              | [Config](../../models/shared/Config.md)               | :heavy_check_mark:                                    | Configuration the ledger server is running with       |
| `experimentalFeatures`                                | List\<*String*>                                       | :heavy_minus_sign:                                    | Experimental feature flags enabled on this deployment |
| `server`                                              | *String*                                              | :heavy_check_mark:                                    | Name of the server serving the API                    |
| `version`                                             | *String*                                              | :heavy_check_mark:                                    | Version of the ledger service                         |