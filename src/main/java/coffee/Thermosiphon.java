package coffee;

import javax.inject.Inject;

public class Thermosiphon implements Pump {

    private final Heater heater;

    @Inject
    Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            System.err.println("=> => pumping => =>");
        }
    }
}
