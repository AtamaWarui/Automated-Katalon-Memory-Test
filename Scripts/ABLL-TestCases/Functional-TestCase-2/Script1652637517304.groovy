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

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_username (6)'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_password (6)'), '')

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Log in (6)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/svg (10)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/div_Home Testing (3)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/a_Patients (4)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i_Workflow_custom-svg-icon (2)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Share (2)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i_Shareable link_mdi mdi-content-copy false (2)'))

WebUI.switchToWindowTitle('Workmap')

WebUI.navigateToUrl('https://nk-gke-test.gcp.workmap.ai/#/forms/23/6iov55cdv952tseyww2wqoojj6la5zr9')

