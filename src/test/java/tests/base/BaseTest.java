package tests.base;
import common.Config;
import common.Listener;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.base.BasePage;
import pages.loans.CarLoansPage;
import pages.telecomunications.MobilePhoneReplenishmentPage;

import java.io.File;
import java.time.LocalTime;
import java.util.Objects;

import static common.Config.*;
public class BaseTest {
    protected BasePage basePage = new BasePage();
    protected CarLoansPage carLoansPage = new CarLoansPage();
    protected MobilePhoneReplenishmentPage mobilePhoneReplenishmentPage = new MobilePhoneReplenishmentPage();
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

/** Clear reports from log and screenshots */
    static {
        LOGGER.info("START TIME: " + LocalTime.now());
        LOGGER.info("START clear reports dir: built/reports ... ");
        File allureResults = new File("allure-results");
        if (allureResults.isDirectory()) {
            for(File item : Objects.requireNonNull(allureResults.listFiles())) {
                item.delete();
            }
        }
        if(Config.CLEAR_REPORTS_DIR) {
            File reports = new File("build/reports/tests");
            if(reports.isDirectory()){
            for(File item : Objects.requireNonNull(reports.listFiles())) {
                item.delete();
                }
            }
            File downloads = new File("build/downloads/");
            if(downloads.isDirectory()){
                for (File item : Objects.requireNonNull(reports.listFiles())) {
                    item.delete();
                }
            }
        }
    }

}
