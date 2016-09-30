package com.orange.dojo.elephantcarpaccio;

class Calculator {

  RawPrice computeRawPrice(NumberOfItems numberOfItems, PricePerItem pricePerItem) {
    return new RawPrice(numberOfItems.val() * pricePerItem.val());
  }

  TotalPrice computeTotalPrice(RawPrice rawPrice, StateCode stateCode) {
    return new TotalPrice(rawPrice.val() * (1 + stateCode.tax()));
  }
}
