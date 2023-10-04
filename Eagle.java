public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() { return altitude; }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if(!this.flying && altitude == 0) {
            this.flying = true;
            System.out.printf("%s takeoff into the air.%n", this.getName());
        }
    }

    @Override
    public int ascend(int meters) {
        if(this.flying) {
            this.altitude += meters;
            System.out.printf("%s fly upwards, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        if(this.flying) {
            this.altitude -= meters;
            System.out.printf("%s fly downwards, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.flying && this.altitude <= 1) {
            System.out.printf("%s land on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't land.%n", this.getName());
        }
    }
}
