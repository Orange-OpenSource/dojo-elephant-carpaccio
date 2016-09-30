package com.orange.dojo.elephantcarpaccio;

class Terminal {

  public static final String NUMBER_OF_ITEMS_INPUT_STRING = "Number of items";
  public static final String PRICE_PER_ITEM_INPUT_STRING = "Price per item";

  void run() {
    NumberOfItems numberOfItems = readNumberOfItems(new InputReader(NUMBER_OF_ITEMS_INPUT_STRING));
    PricePerItem pricePerItem = readPricePerItem(new InputReader(PRICE_PER_ITEM_INPUT_STRING));
    System.out.println(NUMBER_OF_ITEMS_INPUT_STRING + " is " + numberOfItems.val());
    System.out.println(PRICE_PER_ITEM_INPUT_STRING + " is " + pricePerItem.val());

    Calculator calculator = new Calculator();
    RawPrice rawPrice = calculator.computeRawPrice(numberOfItems, pricePerItem);

    System.out.println("Total price is " + rawPrice.val());
  }

  NumberOfItems readNumberOfItems(InputReader inputReader) {
    return new NumberOfItems((int) inputReader.read());
  }

  public PricePerItem readPricePerItem(InputReader inputReader) {
    return new PricePerItem((float) inputReader.read());
  }
}
