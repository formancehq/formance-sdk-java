# MirrorSyncProgress

Sync progress for MIRROR ledgers (populated at read time)


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *long*                                                               | :heavy_check_mark:                                                   | Last ingested v2 log ID                                              |
| `error`                                                              | [Optional\<MirrorSyncError>](../../models/shared/MirrorSyncError.md) | :heavy_minus_sign:                                                   | Most recent mirror sync error (null if healthy)                      |
| `remainingLogs`                                                      | *long*                                                               | :heavy_check_mark:                                                   | Number of remaining logs to sync (sourceLogCount - cursor)           |
| `sourceLogCount`                                                     | *long*                                                               | :heavy_check_mark:                                                   | Latest known log ID in the v2 source                                 |
| `state`                                                              | [State](../../models/shared/State.md)                                | :heavy_check_mark:                                                   | Current sync state (SYNCING = catching up, FOLLOWING = up to date)   |