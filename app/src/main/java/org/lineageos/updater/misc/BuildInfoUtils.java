/*
 * SPDX-FileCopyrightText: The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */
package org.lineageos.updater.misc;

import android.os.SystemProperties;

public final class BuildInfoUtils {

    private BuildInfoUtils() {
    }

    private static String getProperty(String primaryProperty, String legacyProperty) {
        String value = SystemProperties.get(primaryProperty);
        if (!value.trim().isEmpty()) {
            return value;
        }
        return SystemProperties.get(legacyProperty);
    }

    public static boolean getBooleanProperty(String primaryProperty, String legacyProperty,
            boolean defaultValue) {
        if (!SystemProperties.get(primaryProperty).trim().isEmpty()) {
            return SystemProperties.getBoolean(primaryProperty, defaultValue);
        }
        return SystemProperties.getBoolean(legacyProperty, defaultValue);
    }

    public static long getBuildDateTimestamp() {
        return SystemProperties.getLong(Constants.PROP_BUILD_DATE, 0);
    }

    public static String getBuildVersion() {
        return getProperty(Constants.PROP_BUILD_VERSION, Constants.PROP_LEGACY_BUILD_VERSION);
    }

    public static String getDevice() {
        String nextDevice = SystemProperties.get(Constants.PROP_NEXT_DEVICE);
        if (!nextDevice.trim().isEmpty()) {
            return nextDevice;
        }
        return getProperty(Constants.PROP_DEVICE, Constants.PROP_LEGACY_DEVICE);
    }

    public static String getReleaseType() {
        return getProperty(Constants.PROP_RELEASE_TYPE, Constants.PROP_LEGACY_RELEASE_TYPE);
    }

    public static String getUpdaterUri() {
        return getProperty(Constants.PROP_UPDATER_URI, Constants.PROP_LEGACY_UPDATER_URI);
    }
}
