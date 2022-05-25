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

WebUI.navigateToUrl('https://nk-gke-test.gcp.workmap.ai/#/boards/2')

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_username (7) (1)'), 'pankajunk@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_password (7) (1)'), 'Piu45nT0PQ8=')

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Log in (7) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i_Automation_mdi mdi-chart-arc (2) (1)'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nk-gke-test.gcp.workmap.ai/#/boards/3')

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_username (7) (1)'), 'pankajunk@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_password (7) (1)'), 'Piu45nT0PQ8=')

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Log in (7) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/span_Result_ag-icon ag-icon-filter (1)'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nk-gke-test.gcp.workmap.ai/#/boards/2')

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_username (7) (1)'), 'pankajunk@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_password (7) (1)'), 'Piu45nT0PQ8=')

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Log in (7) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Add Phase_ant-btn download__button a_993cea (2) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i_AI Matching_custom-svg-icon (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Add team members to this Workflow_ant-input (1)'), '')

WebUI.click(findTestObject('Object Repository/Page_Workmap/div_Content Editor (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Invite (1)'))

