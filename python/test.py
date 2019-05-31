"""
    python -m unittest test.py
    python -m unittest test.TestSequenceFunctions
    python -m unittest test.TestSequenceFunctions.test_getTaxRate
"""
import unittest
import run

class Test(unittest.TestCase):

    def test_env(self):
        run.compute_input(2)
        self.assertEqual(1, 2)

    def test_should_number_work(self):
        run.compute_input(2)

    def test_should_be_number(self):
        try:
            run.compute_input("truc")
        except Exception as e:
            self.assertTrue(True)
            print(e)
        else:
            self.assertTrue(False)




if __name__ == '__main__':
    unittest.main()
