package Planes;

import java.util.Objects;

public class SpecialPlane extends Plane {

    private int maxFlightTime;

    public SpecialPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int maxFlightTime) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.maxFlightTime = maxFlightTime;
    }

    public int getMaxFlightTime() {
        return maxFlightTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SpecialPlane that = (SpecialPlane) o;
        return maxFlightTime == that.maxFlightTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxFlightTime);
    }

    @Override
    public String toString() {
        return "SpecialPlane{" +
                "maxFlightTime=" + maxFlightTime +
                '}';
    }
}
