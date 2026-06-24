# ElyraOS Updater Setup

This setup prepares the LineageOS Updater application for ElyraOS branding while
keeping early bring-up compatibility.

## What changed

- User-facing brand strings now say ElyraOS/Elyra Updater.
- Download path is `/data/elyraos_updates/`.
- Export path is `ElyraOS updates/`.
- Default OTA endpoint is `https://ota.elyraos.org/api/v1/{device}/{type}/{incr}`.
- The app prefers ElyraOS build properties and falls back to LineageOS ones.

## Why the package name is not renamed yet

The app still uses `org.lineageos.updater`. This is intentional. Renaming it too
early can break:

- privapp permissions
- Settings links
- exported update/import services
- existing updater data
- recovery/update integration

Rename package later after ElyraOS has a stable booting build.
