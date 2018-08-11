from appium import webdriver
# from selenium import webdriver
import  desired_capabilities as ga
import time
# webdriver.Chrome(executable_path = 'C:\\Users\\luckie\\Downloads/chromedriver.exe')
driver = webdriver.Remote('http://localhost:4725/wd/hub',ga.get_desired())

try:
	time.sleep(13200)
	driver.get("http://www.disney.in")

except Exception:
	print('this is an so i am arised')
finally:
	driver.quit()