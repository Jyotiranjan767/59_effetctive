class Phonebook():

	def __init__(self):
		self.entries = {}
		# print(help(self.entries))
		self.filename = 'phonebook.txt'
		self.file_cache = open(self.filename, "w")
	def add(self, name, key):
		self.entries[name] = key
		return self.entries
	def lookup(self, name):
		return self.entries[name]

	def names(self):
		return list(self.entries.keys())
	def numbers(self):
		return self.entries.values()

	def clear(self):
		import os
		self.entries = {}
		self.file_cache.close()
		os.remove(self.filename)
# x = Phonebook()
# print(x.add('bob','1212'))