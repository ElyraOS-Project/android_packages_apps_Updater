# Elyra Updater

Elyra Updater is the OTA updater application for ElyraOS.

This repository is based on the LineageOS Updater application and keeps the
`org.lineageos.updater` package name during early bring-up to preserve
privileged permission compatibility, Settings integration, exported services,
and upgrade paths.

## ElyraOS integration

The app now prefers ElyraOS properties and falls back to LineageOS properties
when needed:

| Purpose | ElyraOS property | Legacy fallback |
| --- | --- | --- |
| Build version | `ro.elyra.build.version` | `ro.lineage.build.version` |
| Device | `ro.elyra.device` | `ro.lineage.device` |
| Release type | `ro.elyra.releasetype` | `ro.lineage.releasetype` |
| Updater URL | `elyra.updater.uri` | `lineage.updater.uri` |
| Allow downgrade | `elyra.updater.allow_downgrading` | `lineage.updater.allow_downgrading` |
| Allow major upgrade | `elyra.updater.allow_major_upgrades` | `lineage.updater.allow_major_upgrades` |

## Default OTA endpoint

```text
https://ota.elyraos.org/api/v1/{device}/{type}/{incr}
```

This can be overridden at runtime with:

```properties
elyra.updater.uri=https://your-domain.example/api/v1/{device}/{type}/{incr}
```

## Storage path

```text
/data/elyraos_updates/
```

## Rename policy

Do not rename the Java package yet. A full package migration should be done only
after the first bootable ElyraOS build is stable.
