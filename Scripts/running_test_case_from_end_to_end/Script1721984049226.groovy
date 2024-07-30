import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

'Maximize current window'
WebUI.maximizeWindow()

'Navigate to saucedemo site'
WebUI.navigateToUrl('www.saucedemo.com')

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/for_saucedemo_login_page/username_xpath'), 10)

WebUI.click(findTestObject('Object Repository/for_saucedemo_login_page/username_xpath'))

/*WebUI.setText(findTestObject('Object Repository/for_saucedemo_login_page/username_xpath'), GlobalVariable.user_data)*/
List<String> usernameList = Arrays.asList(GlobalVariable.user_data, GlobalVariable.username_data_003, GlobalVariable.username_data_004, 
    GlobalVariable.user_name_data_005, GlobalVariable.user_name_data_006)

Random randProductUnit = new Random()

String randomPath = usernameList.get(randProductUnit.nextInt(usernameList.size()))

WebUI.setText(findTestObject('Object Repository/for_saucedemo_login_page/username_xpath'), randomPath)

WebUI.verifyElementPresent(findTestObject('Object Repository/for_saucedemo_login_page/password_xpath'), 10)

WebUI.click(findTestObject('Object Repository/for_saucedemo_login_page/password_xpath'))

WebUI.setText(findTestObject('Object Repository/for_saucedemo_login_page/password_xpath'), GlobalVariable.password_data)

WebUI.verifyElementPresent(findTestObject('for_saucedemo_login_page/login_button_xpath'), 10)

WebUI.click(findTestObject('for_saucedemo_login_page/login_button_xpath'))

WebUI.callTestCase(findTestCase('Test_to _get_product_info'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('verifying_product_data_in_cart_icon'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Checkout_Your_Information'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Checkout_Overview'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('logout_test_case'), [:], FailureHandling.STOP_ON_FAILURE)

