import unittest
from alarm_1 import Alarm
from unittest.mock import Mock
class Alarm_test(unittest.TestCase):

	def test_alarm_is_off_by_default(self):
		alarm = Alarm()
		# print(alarm._is_alarm_on)
		self.assertFalse(alarm._is_alarm_on)

	def test_check_too_low_pressure_sounds_alarm(self):
		alarm = Alarm(sensor = TestSensor(13))
		alarm.check()
		self.assertTrue(alarm._is_alarm_on)
	
	def test_check_too_high_pressure_sounds_alarm(self):
		alarm = Alarm(sensor = TestSensor(28))
		alarm.check()
		self.assertTrue(alarm._is_alarm_on)
	
	def test_check_normal_pressure_sounds_alarm(self):
		alarm = Alarm(sensor = TestSensor(19))
		alarm.check()
		self.assertFalse(alarm._is_alarm_on)

	def test_check_with_pressure_ok_with_mock_fw(self):
		# alarm = Alarm(sensor = TestSensor())
		test_sensor = Mock(Sensor)
		# test_sensor.sample_pressure() = 

# so here this TestSensor class is basically the test stub
# a test stub in any test double that has a very simple implimentation and 
# with no logic or behaviour  

class TestSensor():

	def __init__(self, pressure):
		self.pressure = pressure

	def sample_pressure(self):
		return self.pressure	