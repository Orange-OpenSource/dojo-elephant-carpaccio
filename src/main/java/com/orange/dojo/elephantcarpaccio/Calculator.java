package com.orange.dojo.elephantcarpaccio;

class Calculator {
  private final Discounts discounts = new Discounts();

  RawPrice computeRawPrice(NumberOfItems numberOfItems, PricePerItem pricePerItem) {
    return new RawPrice(numberOfItems.val() * pricePerItem.val());
  }

  TotalPrice computeTotalPrice(Price price, StateCode stateCode) {
    return new TotalPrice(price.price() * (1 + stateCode.tax()));
  }

  public DiscountPrice computePriceWithDiscount(RawPrice rawPrice) {
    return discounts.discount(rawPrice);
  }
}
