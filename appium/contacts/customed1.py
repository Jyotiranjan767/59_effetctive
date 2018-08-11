
from appium import webdriver 

desired_caps={

			'appPackage':'com.sonyericsson.android.socialphonebook',
			'appActivity':'.DialerEntryActivity',
			'platformName':"Android",
			'deviceName':'xperia L',
			'platformVersion':'4.2.2'
		}
desired_caps1 = {

			'appPackage':'com.android.contacts',
			'appActivity':'.activities',
			'platformName':"Android",
			'deviceName':'Redmi Y1',
			'platformVersion':'7.1.2'
		}
url="http://localhost:4723/wd/hub"
driver=webdriver.Remote(url,desired_caps1)
c1=driver.find_element_by_name('8')#("7")
c2=driver.find_element_by_name('5')#("2")
c3=driver.find_element_by_name('3')#("2")
c4=driver.find_element_by_name('9')#("3")
c5=driver.find_element_by_name('7')#("2")
c6=driver.find_element_by_name('2')#("7")
c7=driver.find_element_by_name('8')#("8")
c0=driver.find_element_by_name('9')#("8")
c8=driver.find_element_by_name('0')#("0")
c9=driver.find_element_by_name('2')#("2")

#9092122304
#9853972802
c0.click()
c1.click()
c2.click()
c3.click()
c4.click()
c5.click()
c6.click()
c7.click()
c8.click()
c9.click()


edit=driver.find_element_by_xpath("//android.widget.LinearLayout/android.widget.EditText")
# edit.clear()
# edit.set_values("8867793725")
# edit.click()
# edit.send_keys("8867793725")
#8722327802
# call=driver.find_element_by_accessibility_id("Call")
# call=driver.find_element_by_xpath("//Androiddroid.widget.LinearLayout[@index='1']")
call=driver.find_element_by_xpath("//android.widget.ImageButton[@content-desc='Call']")
call.click()