import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nk-gke-test.gcp.workmap.ai/#/boards/7')

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_username (8)'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_password (8)'), '')

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Log in (8)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i_Automation_mdi mdi-chart-arc (3)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_All Tested Positive (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_All Tested'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_All Tested (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Marketing (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Marketing (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Production (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Production (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_HR (2)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_HR'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i_Add New_custom-svg-icon (2)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i_Automation_mdi mdi-chart-arc (3)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i_Automation_mdi mdi-chart-arc (3)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i_Add New_custom-svg-icon (2)'))

