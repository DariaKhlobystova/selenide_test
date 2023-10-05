package common;

import com.codeborne.selenide.Configuration;

public class Config {

    /**
     * Specify for browser and platform for test:
     * CHROME_MAC
     * CHROME_WINDOWS
     * MOZILLA_MAC
     **/
    public static final String BROWSER_AND_PLATFORM = "CHROME_MAC";
    /** Clean browser cookie after each iteration */
    public static final boolean CLEAR_COOKIES = true;
    /** Clear the reports-directory before starting the build */
    public static final boolean CLEAR_REPORTS_DIR = true;
    /** To keep the browser open after all scenario/tests */
    public static final boolean HOLD_BROWSER_OPEN = true;

    static {
        Configuration.holdBrowserOpen = HOLD_BROWSER_OPEN;
        Configuration.reportsFolder = "build/reports/tests";
        Configuration.browser = BROWSER_AND_PLATFORM;
    }
}
