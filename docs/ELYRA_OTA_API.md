# ElyraOS OTA API

The updater expects a JSON response containing a `response` array.

Default endpoint:

```text
https://elyraos-project.github.io/ota/api/v1/{device}/{type}/{incr}
```

Placeholders:

- `{device}`: value from `ro.updater.next_device`, then `ro.elyra.device`, then `ro.lineage.device`
- `{type}`: value from `ro.elyra.releasetype`, then `ro.lineage.releasetype`
- `{incr}`: value from `ro.build.version.incremental`

Example response:

```json
{
  "response": [
    {
      "datetime": 1710000000,
      "filename": "elyra-23.2-20260625-UNOFFICIAL-garnet.zip",
      "id": "sha256-or-build-id",
      "romtype": "UNOFFICIAL",
      "size": 2147483648,
      "url": "https://elyraos-project.github.io/ota/builds/garnet/elyra.zip",
      "version": "23.2"
    }
  ]
}
```
