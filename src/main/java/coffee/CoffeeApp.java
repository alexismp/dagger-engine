package coffee;

import javax.inject.Inject;

public class CoffeeApp implements Runnable {
  @Inject CoffeeMaker coffeeMaker;

  @Override public void run() {
    coffeeMaker.brew();
  }

}
