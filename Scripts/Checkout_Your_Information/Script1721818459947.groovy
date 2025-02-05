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

WebUI.verifyElementPresent(findTestObject('Object Repository/for_check_out_name_form/first_name_input'), 10)

WebUI.click(findTestObject('Object Repository/for_check_out_name_form/first_name_input'))

WebUI.setText(findTestObject('Object Repository/for_check_out_name_form/first_name_input'), 'UserFirstName' + RandomStringUtils.randomAlphabetic(
        6))

WebUI.verifyElementPresent(findTestObject('Object Repository/for_check_out_name_form/last_name_input'), 10)

WebUI.click(findTestObject('Object Repository/for_check_out_name_form/last_name_input'))

WebUI.setText(findTestObject('Object Repository/for_check_out_name_form/last_name_input'), 'UserLastName' + RandomStringUtils.randomAlphabetic(
        6))

WebUI.verifyElementPresent(findTestObject('Object Repository/for_check_out_name_form/zip_code_input'), 10)

WebUI.click(findTestObject('Object Repository/for_check_out_name_form/zip_code_input'))

WebUI.setText(findTestObject('Object Repository/for_check_out_name_form/zip_code_input'), '33' + RandomStringUtils.randomNumeric(
        6))

WebUI.verifyElementPresent(findTestObject('for_check_out_name_form/continue_button'), 10)

WebUI.click(findTestObject('for_check_out_name_form/continue_button'))

