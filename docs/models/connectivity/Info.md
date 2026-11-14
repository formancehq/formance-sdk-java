# Info


## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `buildDate`                                                  | *String*                                                     | :heavy_check_mark:                                           | Source commit timestamp (`org.opencontainers.image.created`) |
| `commit`                                                     | *String*                                                     | :heavy_check_mark:                                           | Git commit SHA of the build                                  |
| `version`                                                    | *String*                                                     | :heavy_check_mark:                                           | Build version of the API binary (the image tag)              |