"""
    python -m unittest test.py
    python -m unittest test.TestSequenceFunctions
    python -m unittest test.TestSequenceFunctions.test_getTaxRate
"""
import unittest

class Test(unittest.TestCase):

    def test_env(self):
        self.assertEqual(1, 2)

if __name__ == '__main__':
    unittest.main()
