package com.orange.dojo.elephantcarpaccio;

class Calculator {

  RawPrice computeRawPrice(NumberOfItems numberOfItems, PricePerItem pricePerItem) {
    return new RawPrice(numberOfItems.val() * pricePerItem.val());
  }
}
