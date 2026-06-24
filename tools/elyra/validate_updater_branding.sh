#!/usr/bin/env bash
set -euo pipefail

echo "== ElyraOS Updater branding validation =="

grep -R "ro.elyra" app/src/main/java/org/lineageos/updater/misc >/dev/null
grep -R "elyra.updater.uri" app/src/main/java/org/lineageos/updater/misc >/dev/null
grep -R "ElyraOS" app/src/main/res/values/strings.xml >/dev/null
grep -R "/data/elyraos_updates/" app/src/main/res/values/strings.xml >/dev/null

echo "Updater branding validation passed."
