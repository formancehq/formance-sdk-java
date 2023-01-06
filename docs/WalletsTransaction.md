

# WalletsTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timestamp** | **OffsetDateTime** |  |  |
|**postings** | [**List&lt;WalletsPosting&gt;**](WalletsPosting.md) |  |  |
|**reference** | **String** |  |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Metadata associated with the wallet. |  [optional] |
|**txid** | **Long** |  |  |
|**preCommitVolumes** | **Map&lt;String, Map&lt;String, WalletsVolume&gt;&gt;** |  |  [optional] |
|**postCommitVolumes** | **Map&lt;String, Map&lt;String, WalletsVolume&gt;&gt;** |  |  [optional] |



