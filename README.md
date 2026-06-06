# Selenium WebDriver Automation Project

A comprehensive hands-on learning project for mastering **Selenium WebDriver 4.x** with **Java** — covering browser automation fundamentals, advanced user interactions, popup handling, multi-window management, auto-suggestions, data-driven testing, and web element state inspection.

> **Repository:** [github.com/swapnilchhabilwad/selenium.git](https://github.com/swapnilchhabilwad/selenium.git)  
> **Author:** Swapnil Chhabilwad

---

## Table of Contents

1. [Tech Stack](#tech-stack)
2. [Project Structure](#project-structure)
3. [Package Breakdown](#package-breakdown)
   - [Chapter01 — Core Selenium Fundamentals](#chapter01--core-selenium-fundamentals)
   - [Actions — Advanced User Interactions](#actions--advanced-user-interactions)
   - [Popups — Alert & Popup Handling](#popups--alert--popup-handling)
   - [WindowHandles — Multi-Window/Tab Management](#windowhandles--multi-windowtab-management)
   - [Autosuggestions — Auto-Suggestion Handling](#autosuggestions--auto-suggestion-handling)
   - [datadriven — Data-Driven Testing](#datadriven--data-driven-testing)
   - [webelement — WebElement State Inspection](#webelement--webelement-state-inspection)
4. [Configuration & Dependencies](#configuration--dependencies)
5. [How to Run](#how-to-run)
6. [Key Observations & Improvements](#key-observations--improvements)

---

## Tech Stack

| Component                         | Technology                                      |
|-----------------------------------|-------------------------------------------------|
| **Language**                      | Java (Eclipse IDE project)                      |
| **Automation Framework**          | Selenium WebDriver 4.16.1                       |
| **Browser Drivers**               | ChromeDriver + GeckoDriver (Firefox)            |
| **Data-Driven (Properties)**      | `java.util.Properties`                          |
| **Data-Driven (Excel)**           | Apache POI 5.2.2                                |
| **Build System**                  | None (Eclipse raw project — no Maven/Gradle)    |
| **Test Framework**                | None (all scripts use `main()` methods)         |

---

## Project Structure

```
bharanibai/
├── src/
│   ├── Chapter01/          # WebDriver basics, locators, waits, navigation
│   ├── Actions/             # Actions class: double-click, drag-drop, dropdowns, frames, scrolling
│   ├── Popups/              # JavaScript alerts, confirmation/prompt dialogs
│   ├── WindowHandles/       # Multi-tab / multi-window switching
│   ├── Autosuggestions/     # Dynamic dropdown auto-complete suggestions
│   ├── datadriven/          # Data-driven testing with .properties & .xlsx
│   └── webelement/          # WebElement state: displayed, enabled, selected, attributes
├── Drivers/
│   ├── chromedriver.exe     # Chrome browser driver
│   └── geckodriver.exe      # Firefox browser driver
├── poi/                     # Apache POI 5.2.2 JARs + dependencies
├── SeleniumServer/          # selenium-server-4.16.1.jar
├── Photo/                   # Screenshot output directory
├── Book1.xlsx               # Excel test data (URL, username, password)
├── data.properties          # Properties test data
├── .classpath               # Eclipse project classpath
└── .project                 # Eclipse project configuration
```

---

## Package Breakdown

### Chapter01 — Core Selenium Fundamentals

| File                 | Concepts Demonstrated                                                             |
|----------------------|-----------------------------------------------------------------------------------|
| `Launch.java`        | Launching ChromeDriver, `get()` URL, `getTitle()`, `getCurrentUrl()`, `close()`   |
| `Facebook.java`      | Locating elements with `By.id()`, `By.name()`, `sendKeys()`, `click()`            |
| `CSSFacebook.java`   | CSS Selectors as an alternative to XPath                                          |
| `InstagramLogin.java`| Instagram login automation using CSS selector strategy                            |
| `InstaVerification.java` | Conditional verification logic after login                                    |
| `Skillarry.java`     | Form interactions on the Skillrary demo site                                     |
| `Linktext.java`      | `By.linkText()` to locate anchor elements                                         |
| `LinkText1.java`     | Additional `linkText()` examples                                                  |
| `PartialLinkText.java`| `By.partialLinkText()` for partial text matching                                 |
| `Traversexpath.java` | XPath axes and traversal techniques                                               |
| `Xpathactitime.java` | XPath-based automation on ActiTIME application                                    |
| `Verification.java`  | Assertions and URL/title verification after actions                               |
| `navigation.java`    | Browser navigation: `navigate().to()`, `back()`, `forward()`, `refresh()`         |
| `WindowManagement.java` | Window sizing and positioning with `manage().window()`                         |
| `ExplicitelyWait.java`| `WebDriverWait` with `ExpectedConditions` for synchronization                    |
| `RemoveTest.java`    | Clearing input fields with `clear()`                                              |

---

### Actions — Advanced User Interactions

| File                    | Concepts Demonstrated                                                  |
|-------------------------|------------------------------------------------------------------------|
| `Doubleclick.java`      | `Actions.doubleClick()`, scrolling to element, JavaScript alerts       |
| `Draganddrop.java`      | `Actions.dragAndDrop()` on dhtmlgoodies demo                           |
| `Dropdown.java`         | `Select` class: `selectByIndex()`, `getOptions()`, iterating options   |
| `Dropdownamazon.java`   | Amazon category dropdown handling                                      |
| `Multipleselect.java`   | Multi-select dropdowns: `isMultiple()`, `deselectAll()`, `getOptions()`|
| `Frames.java`           | Switching into/out of iframes with Snapdeal login popup                |
| `MousrHover.java`       | `Actions.moveToElement()` on eBay and Myntra (mouse hover menus)       |
| `Rightclick.java`       | `Actions.contextClick()` for right-click context menu on Google        |
| `Scrollbar.java`        | `JavascriptExecutor.executeScript()` for `window.scrollBy()`           |
| `Scrollbarflipkart.java`| Scrolling behavior on Flipkart                                         |
| `Scrollbarmyntra.java`  | Scrolling behavior on Myntra                                           |
| `Screenshots.java`      | `TakesScreenshot` + `FileUtils.copyFile()` to save screenshots         |

---

### Popups — Alert & Popup Handling

| File        | Concepts Demonstrated                                                             |
|-------------|-----------------------------------------------------------------------------------|
| `Test0.java`| JavaScript alert: `switchTo().alert()`, `getText()`, `accept()`                   |
| `Test1.java`| Confirmation dialog handling                                                      |
| `Test2.java`| Prompt dialog: sending input to alert prompt                                      |
| `Test3.java`| Hidden division popup handling                                                    |
| `Test4.java`| Authentication popup handling                                                     |
| `Test5.java`| File upload popup (using `sendKeys()` to `<input type="file">`)                   |
| `Test6.java`| Browser notification popup handling                                               |
| `Test7.java`| Combined popup scenarios                                                          |

---

### WindowHandles — Multi-Window/Tab Management

| File        | Concepts Demonstrated                                                                     |
|-------------|-------------------------------------------------------------------------------------------|
| `Test0.java`| `switchTo().newWindow(WindowType.TAB)`, `getWindowHandle()`, `getWindowHandles()`,        |
|             | iterating through window set to switch control, typing in a newly opened tab              |

---

### Autosuggestions — Auto-Suggestion Handling

| File        | Concepts Demonstrated                                                                 |
|-------------|---------------------------------------------------------------------------------------|
| `Test1.java`| Typing partial text, capturing auto-suggestion list with `findElements()`, iteration  |
|             | Google search suggestions (commented) + Myntra search bar suggestions                 |

---

### datadriven — Data-Driven Testing

| File        | Approach                                      | Data Source          |
|-------------|-----------------------------------------------|----------------------|
| `Test0.java`| `Properties` class + `FileInputStream`        | `data.properties`    |
| `Test1.java`| Apache POI `WorkbookFactory` + Excel reading  | `Book1.xlsx`         |

Both scripts read URL, username, and password from external sources and plug them into Facebook login.

---

### webelement — WebElement State Inspection

| File               | Method Used          | Purpose                                      |
|--------------------|----------------------|----------------------------------------------|
| `GetAttributes.java`| `getAttribute()`     | Read HTML attribute values (e.g., `href`, `class`) |
| `Getlocation.java` | `getLocation()`      | Get x,y coordinates of an element            |
| `getsize.java`     | `getSize()`          | Get element width and height                 |
| `gettext.java`     | `getText()`          | Get visible text content of an element       |
| `IsDisplayed.java` | `isDisplayed()`      | Check if element is visible                  |
| `isEnabled.java`   | `isEnabled()`        | Check if element is interactable             |
| `IsSelected.java`  | `isSelected()`       | Check if checkbox/radio is selected          |

---

## Configuration & Dependencies

### Browser Drivers (`Drivers/`)
- **`chromedriver.exe`** — for Chrome browser automation
- **`geckodriver.exe`** — for Firefox browser automation

### Selenium Server (`SeleniumServer/`)
- `selenium-server-4.16.1.jar` — Selenium 4 standalone server
- `commons-io-2.15.1.jar` — Apache Commons IO dependency

### Apache POI Libraries (`poi/`)
- `poi-5.2.2.jar` — Core POI for older Excel (.xls) format
- `poi-ooxml-5.2.2.jar` — POI for new Excel (.xlsx) format
- `poi-ooxml-lite-5.2.2.jar` — Lite version of OOXML
- `xmlbeans-5.0.3.jar` — XML parsing for OOXML
- `commons-collections4-4.4.jar` — Collections utility
- `commons-compress-1.21.jar` — Compression support
- `commons-io-2.11.0.jar` — File utilities (used by screenshots)
- `curvesapi-1.07.jar` — Curve API for OOXML
- `poi-examples-5.2.2.jar` — POI examples
- `poi-excelant-5.2.2.jar` — Ant integration
- `poi-scratchpad-5.2.2.jar` — Scratchpad for older formats
- `poi-javadoc-5.2.2.jar` — POI documentation
- `poi-ooxml-full-5.2.2.jar` — Full OOXML support
- `SparseBitSet-1.2.jar` — Bit set implementation
- `log4j-api-2.17.2.jar` — Logging
- `slf4j-api-1.7.36.jar` — Simple Logging Facade

### Test Data Sources
- `data.properties` — Contains Facebook test URL, username, and password
- `Book1.xlsx` — Excel file with URL, username, password on Sheet1

---

## How to Run

1. **Prerequisites**  
   - Java JDK 8+ installed  
   - Eclipse IDE (recommended)  
   - Chrome or Firefox browser installed  

2. **Setup in Eclipse**  
   - File → Import → General → Existing Projects into Workspace  
   - Select the `bharanibai` directory  
   - Eclipse will recognize `.classpath` and `.project`  

3. **Add JARs to Build Path**  
   - Right-click project → Build Path → Configure Build Path → Libraries  
   - Add all JARs from the `poi/` and `SeleniumServer/` directories  
   - Ensure `Drivers/` directory is accessible (or set `webdriver.chrome.driver` system property)  

4. **Run a script**  
   - Navigate to any Java file in `src/`  
   - Right-click → Run As → Java Application  

---

## Key Observations & Improvements

### Current Strengths
- ✅ Comprehensive coverage of Selenium 4 features (locators, Actions, alerts, frames, windows, screenshots)
- ✅ Real-world websites used for practice (Facebook, Amazon, Snapdeal, Myntra, eBay, Google)
- ✅ Multiple locator strategies demonstrated: ID, name, className, CSS, XPath, linkText, partialLinkText
- ✅ Both static and dynamic waits (`Thread.sleep()` and `WebDriverWait`)
- ✅ Data-driven approaches with both Properties files and Apache POI Excel reading

### Areas for Improvement
- ⚠️ **No test framework** — all scripts run as `main()` methods. Integrating **TestNG** or **JUnit** would enable assertions, reporting, parallel execution, and data providers
- ⚠️ **Heavy use of `Thread.sleep()`** — many scripts rely on hardcoded waits instead of smart `WebDriverWait` with `ExpectedConditions`
- ⚠️ **No Page Object Model (POM)** — locators are embedded directly in test methods, making maintenance harder. A POM approach would separate page logic from test logic
- ⚠️ **Sensitive data in version control** — `data.properties` contains plaintext credentials pushed to GitHub
- ⚠️ **No build tool** — JAR dependencies are managed manually. Migrating to **Maven** or **Gradle** would simplify dependency management
- ⚠️ **Code formatting** — many files have excessive blank lines and commented-out code blocks that could be cleaned up

---

## License

This is a personal learning project. Feel free to use it as a reference for learning Selenium WebDriver with Java.