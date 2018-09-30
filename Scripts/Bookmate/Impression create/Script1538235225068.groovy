import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\Nick\\Downloads\\application-dev-debug.apk', false)

Mobile.tapAndHold(findTestObject('android.widget.ImageView4'), 0, 0)

Mobile.tap(findTestObject('android.widget.LinearLayout6'), 0)

Mobile.tap(findTestObject('android.widget.FrameLayout3 (1)'), 0)

Mobile.setText(findTestObject('android.widget.LinearLayout0'), 'Nice book!', 0)

Mobile.tap(findTestObject('android.widget.LinearLayout6 (1)'), 0)

Mobile.tap(findTestObject('android.widget.ImageButton1'), 0)

Mobile.tap(findTestObject('android.widget.ImageButton0'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('android.widget.RelativeLayout1'), 0)

Mobile.tap(findTestObject('android.widget.ImageView4 (1)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView8'), 0)

Mobile.tap(findTestObject('android.widget.TextView2 - '), 0)

Mobile.pressBack()

Mobile.closeApplication()

