import pytest
import os
from appium import webdriver

#returns abs path relative to this file and not cwd


PATH = lambda p: os.path.abspath(
	os.path.join(os.path.dirname(__file__),p))

APPIUM_LOCAL_HOST_URL = 'http://localhost:4723/wd/hub'
PLATFORM = '4.2.2'

class TestWebViewAndroid():
	@pytest.fixture(scope="function")
	def driver(self,request):
		desired_caps={

			'appPackage':'com.sonyericsson.android.socialphonebook',
			'appActivity':'.DialerEntryActivity',
			'platformName':"Android",
			'deviceName':'xperia L',
			'platformVersion':PLATFORM
		}
		global driver
		driver = webdriver.Remote(APPIUM_LOCAL_HOST_URL,desired_caps)
		def fin():
			driver.quit()

		request.addfinalizer(fin)
		return driver #provide fixture value

	def type_numbers(self,driver):
		e1=driver.find_element_by_name("1")
		e1.click()

ds=TestWebViewAndroid()
# ds.driver(request)
ds.type_numbers(driver)
# ds.driver().find_element_by_name("1").click()

