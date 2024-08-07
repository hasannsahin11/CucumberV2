package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

//public class DriverClass {
//    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
//    private static ThreadLocal<String> threadDriverName = new ThreadLocal<>();
//
//    public static WebDriver getDriver() {
//        if (threadDriver.get() == null) {
//
//            if (threadDriverName.get() == null) {
//                threadDriverName.set("chrome");
//            }
//
//            switch (threadDriverName.get()) {
//                case "firefox":
//                    threadDriver.set(new FirefoxDriver());
//                    break;
//                case "safari":
//                    threadDriver.set(new SafariDriver());
//                    break;
//                case "edge":
//                    threadDriver.set(new EdgeDriver());
//                    break;
//                default:
//                    threadDriver.set(new ChromeDriver());
//            }
//        }
//        return threadDriver.get();
//    }
//
//
//    public static void quitDriver() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        if (threadDriver.get() != null)
//            threadDriver.get().quit();
//        WebDriver driver = null;
//        threadDriver.set(driver);
//    }
//
//    public static void setThreadDriverName(String browserName) {
//        threadDriverName.set(browserName);
//    }
//}

public class DriverClass {
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static ThreadLocal<String> threadDriverName = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (threadDriver.get() == null) {


            Logger logger = Logger.getLogger("");
            logger.setLevel(Level.SEVERE);
            if (threadDriverName.get() == null) {
                threadDriverName.set("chrome");
            }

            switch (threadDriverName.get()) {
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;
                case "safari":
                    threadDriver.set(new SafariDriver());
                    break;
                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;
                default:
                    ChromeOptions options = new ChromeOptions();
                    if (!runningFromIntelliJ()) {
                        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                    }
                    threadDriver.set(new ChromeDriver(options));
            }
        }
        return threadDriver.get();
    }

    public static boolean runningFromIntelliJ(){
        String classPath = System.getProperty("java.class.path");
        return classPath.contains("idea_rt.jar");
    }

    public static void quitDriver() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (threadDriver.get() != null)
            threadDriver.get().quit();
        WebDriver driver = null;
        threadDriver.set(driver);
    }

    public static void setThreadDriverName(String browserName) {
        threadDriverName.set(browserName);
    }
}


