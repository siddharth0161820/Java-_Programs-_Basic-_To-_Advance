package Challenge102;

public enum TrafficColor {
    RED(9000),
    YELLOW(2000),
    GREEN(3000);

    //ek color ka signal kitne time tk rakhna hein
    private  final int onTimeInMillis;
    //getter
    public int getOnTimeInMillis() {
        return onTimeInMillis;
    }

    TrafficColor(int onTimeInMillis) {
        this.onTimeInMillis = onTimeInMillis;
    }
}
