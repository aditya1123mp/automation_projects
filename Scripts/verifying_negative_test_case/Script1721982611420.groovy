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

WebUI.setText(findTestObject('Object Repository/for_saucedemo_login_page/password_xpath'), 'Password' + RandomStringUtils.randomAlphabetic(
	6))

WebUI.verifyElementPresent(findTestObject('for_saucedemo_login_page/login_button_xpath'), 10)

WebUI.click(findTestObject('for_saucedemo_login_page/login_button_xpath'))

error_message_in_login_page = WebUI.getText(findTestObject('Object Repository/negative_test_case_validation_for_login_page/error_message_in_login_page'))

System.out.println(error_message_in_login_page)

if (error_message_in_login_page == GlobalVariable.error_message_login_page) {
	KeywordUtil.markPassed('the Message is same')
} else {
	KeywordUtil.markFailed('the Message is not same')
}



