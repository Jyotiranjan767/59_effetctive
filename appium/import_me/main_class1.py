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
print(dir(size))
try:
	time.sleep(16)
	# s_width = size[0][width] * 21
	size_x=size['width'] * .21
	size_y = size['height'] * .7
	end_y = size['height']/2
	driver.swipe(22, 444, 243, 733)
	time.sleep(6)
	# tex = driver.find_element_by_xpath(".//android.widget.EditText[@text='Mobile No.']")#.click()
	# time.sleep(2)
	# tex.send_keys('9986432193')
	# driver.find_element_by_xpath("//android.widget.Button[@text= 'SIGN UP']").click()
	# time.sleep(1)
	# driver.find_element_by_xpath("//android.widget.EditText[@index = '0']").send_keys('fslf')
	# ds= []
	ds = driver.find_elements_by_xpath("//android.widget.LinearLayout[@index = '0' ]")
	# time.sleep(12)
	# print(ds, end = "" )
	# print(driver.app_strings)
	# action = TouchAction(driver)
	# ds[1].click()	

	shoe  = driver.find_element_by_xpath("//android.widget.TextView(@index = '2')")
	shoe.click()
	for i,s in enumerate(ds) :
		# print(dir(s))
		# print(s)
		if(i==3):
			# s.click()
			pass
		# print(i,'.',s.text())#.get_attribute())
		# action.press(s, x=10, y = 10).release().perform()
finally:
	print("lucjis")
	driver.quit()