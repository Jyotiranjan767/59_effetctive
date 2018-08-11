from appium import webdriver

desired_caps={

			'appPackage':'com.google.android.youtube',#/com.google.android.apps.youtube.app.WatchWhileActivity',
			'appActivity':'com.google.android.apps.youtube.app.WatchWhileActivity',
			'platformName':"Android",
			'deviceName':'xperia L',
			'platformVersion':'4.2.2'
		}
url="http://localhost:4723/wd/hub"
driver=webdriver.Remote(url,desired_caps)

if False:
	driver.find_element_by_xpath("//aqo[@index='0']").click()
	driver.find_element_by_class_name('android.widget.EditText').send_keys('maula maula')
	driver.find_element_by_xpath("//android.widget.TextView[@index='1']").click()
	driver.find_element_by_name("Maula Maula-Singham New Bollywood Full Video Song 2011 in HD").click()
else:
	driver.find_element_by_name("Downloads").click()
	options =driver.find_elements_by_xpath("//android.widget.RelativeLayout[@index='1']")
	re=[]
	for x in options:
		print("jyti")
		re.append(x.text)
		print("424")
		print(x.text)



