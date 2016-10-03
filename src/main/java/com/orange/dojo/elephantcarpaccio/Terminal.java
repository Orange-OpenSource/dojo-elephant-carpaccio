package com.orange.dojo.elephantcarpaccio;

class Terminal {

  public static final String NUMBER_OF_ITEMS_INPUT_STRING = "Number of items";
  public static final String PRICE_PER_ITEM_INPUT_STRING = "Price per item";
  public static final String STATE_CODE_INPUT_STRING = "2 letters state code";

  void run() {
    NumberOfItems numberOfItems = readNumberOfItems(new InputNumberReader(NUMBER_OF_ITEMS_INPUT_STRING));
    PricePerItem pricePerItem = readPricePerItem(new InputNumberReader(PRICE_PER_ITEM_INPUT_STRING));
    StateCode stateCode = readStateCode(new StringInputReader(STATE_CODE_INPUT_STRING));
    System.out.println(NUMBER_OF_ITEMS_INPUT_STRING + " is " + numberOfItems.val());
    System.out.println(PRICE_PER_ITEM_INPUT_STRING + " is " + pricePerItem.val());
    System.out.println(STATE_CODE_INPUT_STRING + " is " + stateCode.val());


    Calculator calculator = new Calculator();
    RawPrice rawPrice = calculator.computeRawPrice(numberOfItems, pricePerItem);

    DiscountPrice discountPrice = calculator.computePriceWithDiscount(rawPrice);

    TotalPrice totalPrice = calculator.computeTotalPrice(discountPrice, stateCode);

    System.out.println();
    System.out.println("Discount: " + (rawPrice.price() - discountPrice.price()));
    System.out.println("Total price is " + totalPrice.price());
  }

  NumberOfItems readNumberOfItems(InputNumberReader inputNumberReader) {
    return new NumberOfItems((int) inputNumberReader.read());
  }

  public PricePerItem readPricePerItem(InputNumberReader inputNumberReader) {
    return new PricePerItem((float) inputNumberReader.read());
  }

  public StateCode readStateCode(StringInputReader stringInputReader) {
    StateCode stateCode;
    do {
      stateCode = new StateCode(stringInputReader.read());
    } while(!stateCode.isSupported());
    return stateCode;
  }
}
