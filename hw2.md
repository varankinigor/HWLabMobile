1.	For existing native mobile autotest try to use another locator (xpath, classname, ?). Define these locators using Appium Inspector. Are there any difference with id version?
The only difference i see is the readability of locator.

2.	Modify existing tests to run on a real device. What should be changed? 
deviceName should be changed in capabilities.

3.	Connect a real device to Appium (describe required actions) and run tests. Are there any difference with run on emulator?
The required actions are: 
    connect device to PC;
    change deviceName in capabilities;
    run appium server.
I assume only perfomance speed difference.

4.	What should be improved/changed in existing test code? Why, for what?
Improvments: 
    using enums instead hardcode values;
    using page object pattern;
    using xml configuration files;
    including asserts with error messages;
    changing thread.sleep to WebDriverWait.
Improvments done.