from appium import webdriver 

desired_caps={

			'appPackage':'com.truecaller',
			'appActivity':'.ui.TruecallerInit',
			'platformName':"Android",
			'deviceName':'xperia L',
			'platformVersion':'4.2.2'
		}
url="http://localhost:4723/wd/hub"
driver=webdriver.Remote(url,desired_caps)

# try:
pad1=driver.find_element_by_xpath("//android.widget.ImageButton[@index='1']")
# name1=driver.find_element_by_name("Jyoti Ranjan")
pad1.click()
# name1.click()
# re=[]
re=[x for x in driver.find_elements_by_xpath("//android.widget.RelativeLayout[@index='1']")]
# for x1 in re:#.__len__():
# 	print(x1)
# except  :
# 	driver.quit()