package com.orange.dojo.elephantcarpaccio;

class Calculator {

  /** Raw Price Discount in percent / 100, ie 10% == 0.1 */
  private static float DISCOUNT = 0.1f;

  RawPrice computeRawPrice(NumberOfItems numberOfItems, PricePerItem pricePerItem) {
    return new RawPrice(numberOfItems.val() * pricePerItem.val());
  }

  TotalPrice computeTotalPrice(Price price, StateCode stateCode) {
    return new TotalPrice(price.price() * (1 + stateCode.tax()));
  }

  public DiscountPrice computePriceWithDiscount(RawPrice rawPrice) {
    float rawPriceVal = rawPrice.price();
    float discountPrice = rawPriceVal * (1 - DISCOUNT);
    return new DiscountPrice(discountPrice);
  }
}
