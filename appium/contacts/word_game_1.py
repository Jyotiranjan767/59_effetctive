from appium import webdriver 
import time
dc  = {
	
	'appPackage'  :'com.wordgame.puzzle.board.en',
	'appActivity' :'com.queensgame.wordgame.Wordgame',
	'platformName':"Android",
	'deviceName'  :"xperia L",
	'platformVersion':'4.2.2',
	"automationName": 'Appium'
}
url = 'http://localhost:4723/wd/hub'
driver = webdriver.Remote(url, dc)
time.sleep(17)
driver.find_element_by_name('Collect').click()