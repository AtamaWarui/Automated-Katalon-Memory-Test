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

WebUI.navigateToUrl('https://nk-gke-test.gcp.workmap.ai/#/signIn')

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_username (4)'), 'pankajunk@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_password (4)'), 'Piu45nT0PQ8=')

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Log in (4)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/a_Go to app (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/svg (7)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/a_Testing Queue (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i_Automation_mdi mdi-chart-arc (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i_Add New_custom-svg-icon'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/span_Appointment Time_ag-icon ag-icon-filter'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/span'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i__mdi mdi-pencil'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/img'))

