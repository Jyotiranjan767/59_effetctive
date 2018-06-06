import sys
import pytest

sys.path.append('F:\\python_pro\\unit_test_emily_beache\\py_test')
from main.phonebook_1 import Phonebook 

@pytest.fixture
def phonebook(request):
	phonebook = Phonebook()
	def cleanup_phonebook():
		phonebook.clear()
	request.addfinalizer(cleanup_phonebook)
	return phonebook

# @pytest.mark.skip("skiping like all test method following")
def test_add_and_lookup_entry(phonebook):
	# pytest.skip('work in progress')
	# phonebook = Phonebook()
	phonebook.add("bob",'2323')
	assert '2323' == phonebook.lookup('bob'), "numbers are not matching for {0} ".format(phonebook.names()[0])
def test_phonebook_gives_access_to_names_numbers(phonebook):
	# phonebook = Phonebook()
	phonebook.add("alice", "2123")

	assert "alice" in phonebook.names()
	assert "2123" in phonebook.numbers()
	assert set(phonebook.names()) == {"alice", 'bob', 'foo'}
def test_missing_entry_raises_key_error(phonebook):
	# phonebook = Phonebook()
	with pytest.raises(KeyError):
		phonebook.lookup("missing")