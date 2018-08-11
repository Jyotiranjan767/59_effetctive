import os
# path = lambda p : os.path.abspath(os.path.dirname(__file__),p)
# print(path) 

# def getAttributes(app):
# 	desire_caps = {

# 		'platformName': 'Android',
#         'platformVersion': '4.2.2',
#         'deviceName': 'sony',
#         'app': PATH('../../apps/' + app),
#         'newCommandTimeout': 240
# 	}
# 	return desire_caps
def get_desired():
	desire_caps = {

		'platformName': 'Android',
        'platformVersion': '4.2.2',
        'browserName'	:'Chrome',
        'deviceName': 'sony',
        # 'newCommandTimeout': 240
	}
	return desire_caps