package Model;

import java.util.Random;

public enum VehicleType {
    CAR, BIKE, BUS;

    private static final Random random = new Random();

    public static VehicleType random() {
        int index = random.nextInt(values().length);
        return values()[index];
    }
}
