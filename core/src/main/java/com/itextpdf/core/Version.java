package com.itextpdf.core;

import java.lang.reflect.Method;

/**
 * This class contains version information about iText.
 * DO NOT CHANGE THE VERSION INFORMATION WITHOUT PERMISSION OF THE COPYRIGHT HOLDERS OF ITEXT.
 * Changing the version makes it extremely difficult to debug an application.
 * Also, the nature of open source software is that you honor the copyright of the original creators of the software.
 */
public final class Version {

    /** The iText version instance. */
    private static Version version = null;
    /**
     * This String contains the name of the product.
     * iText is a registered trademark by iText Group NV.
     * Please don't change this constant.
     */
    private String iText = "iText\u00ae";
    /**
     * This String contains the version number of this iText release.
     * For debugging purposes, we request you NOT to change this constant.
     */
    private String release = "6.0.0-SNAPSHOT";
    /**
     * This String contains the iText version as shown in the producer line.
     * iText is a product developed by iText Group NV.
     * iText Group requests that you retain the iText producer line
     * in every PDF that is created or manipulated using iText.
     */
    private String iTextVersion = iText + " " + release + " \u00a92000-2014 iText Group NV (AGPL-version)";
    /**
     * The license key.
     */
    private String key = null;

    /**
     * Gets an instance of the iText version that is currently used.
     * Note that iText Group requests that you retain the iText producer line
     * in every PDF that is created or manipulated using iText.
     */
    public static Version getInstance() {
        if (version == null) {
            version = new Version();
        }
        return version;
    }

    /**
     * Gets the product name.
     * iText Group NV requests that you retain the iText producer line
     * in every PDF that is created or manipulated using iText.
     * @return the product name
     */
    public String getProduct() {
        return iText;
    }

    /**
     * Gets the release number.
     * iText Group NV requests that you retain the iText producer line
     * in every PDF that is created or manipulated using iText.
     * @return the release number
     */
    public String getRelease() {
        return release;
    }

    /**
     * Returns the iText version as shown in the producer line.
     * iText is a product developed by iText Group NV.
     * iText Group requests that you retain the iText producer line
     * in every PDF that is created or manipulated using iText.
     * @return iText version
     */
    public String getVersion() {
        return iTextVersion;
    }

    /**
     * Returns a license key if one was provided, or null if not.
     * @return a license key.
     */
    public String getKey() {
        return key;
    }
}

