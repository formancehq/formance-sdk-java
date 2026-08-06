# Snooze

A time-boxed, operator-initiated mute of an alert's notifications. While
`until` is in the future the alert keeps failing and keeps counting
against period-green — only its notifications are suppressed.



## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `at`                                                                                      | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `by`                                                                                      | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       | ops@buildr.com                                                                            |
| `note`                                                                                    | *Optional\<String>*                                                                       | :heavy_minus_sign:                                                                        | N/A                                                                                       |                                                                                           |
| `until`                                                                                   | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |