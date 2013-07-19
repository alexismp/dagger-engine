package coffee;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(
        injects = CoffeeApp.class,
        includes = PumpModule.class
        )
public class DripCoffeeModule {

    @Provides @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }
}
