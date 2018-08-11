from  appium import webdriver 
import time
from appium.webdriver.common.touch_action  import TouchAction
desired_caps={

			'appPackage':'com.flipkart.android',
			'appActivity':'.activity.HomeFragmentHolderActivity',
			'platformName':"Android",
			'deviceName':'xperia L',
			'platformVersion':'4.2.2'
		}	

url="http://localhost:4723/wd/hub"

driver  = webdriver.Remote(url, desired_caps)
size  = driver.get_window_size()
print('seise',size)
# print(dir(size))
	# driver.swipe(22, 444, 243, 733)

try:
	print('jyoti')
	time.sleep(1)
	# driver.find_element_by_xpath("//android.support.v4.widget.DrawerLayout").touch()
	# driver.find_element_by_name('Electronics').click()
	im_1 = driver.find_element_by_xpath("//android.widget.ImageView[@index='0']")
	im_1.click()
	driver.find_element_by_name('Electronics').send_keys("redmi y1")
	driver.find_element_by_name('Mobiles').click()
	time.sleep(1)
	action = TouchAction(driver)
	el1 = driver.find_element_by_class_name('android.widget.TextView')
	action.press(0).move_to(el1).release().perform()
	# driver.scroll(0 , el1).release().perform()
finally:
	time.sleep(3)
	driver.quit()
	# pass

