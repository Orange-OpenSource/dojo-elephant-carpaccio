package com.orange.dojo.elephantcarpaccio;

class Terminal {

  public static final String NUMBER_OF_ITEMS_INPUT_STRING = "Number of items";

  void run() {
    NumberOfItems numberOfItems = readNumberOfItems(new InputReader(NUMBER_OF_ITEMS_INPUT_STRING));
    System.out.println(NUMBER_OF_ITEMS_INPUT_STRING + " is " + numberOfItems.val());
  }

  NumberOfItems readNumberOfItems(InputReader inputReader) {
    return new NumberOfItems((int) inputReader.read());
  }
}
