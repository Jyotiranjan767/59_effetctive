from appium import webdriver 

des_cap = {

			'appPackage':'com.android.contacts',
			'appActivity':'.activities',
			'platformName':"Android",
			'deviceName':'Redmi Y1',
			'platformVersion':'7.1.2'
		}
url="http://localhost:4723/wd/hub"

driver = webdriver.Remote(url, des_cap)