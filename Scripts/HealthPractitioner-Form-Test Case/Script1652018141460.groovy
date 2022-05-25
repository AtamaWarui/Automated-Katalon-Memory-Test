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

WebUI.navigateToUrl('https://nk-gke-test.gcp.workmap.ai/#/forms/8/iasscfnyxn3151en5yti3k2nu6d87yf9')

WebUI.click(findTestObject('Object Repository/Page_Workmap/div_Select or type here'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/svg (6)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/div_16'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/a_select time'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/span_Select (6)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Site2'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/input_Walk in_ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/svg_1 (3)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/span_Select (6)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Type 2'))

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Test ID_ant-input'), '666666')

WebUI.click(findTestObject('Object Repository/Page_Workmap/span_Select (6)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Positive (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Submit (5)'))

