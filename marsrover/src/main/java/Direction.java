enum Direction {
    NORTH("N","W","E"),
    EAST("E","N","S"),
    WEST("W","S","N"),
    SOUTH("S","E","W");

    private final String value;
    private final String left;
    private final String right;

    Direction(String value, String left, String right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Direction right() {
        return rotateTo(right);
    }

    public Direction left() {
        return rotateTo(left);
    }

    public String value() {
        return value;
    }

    private Direction rotateTo(String rotation) {
        for (Direction eachDirection : values()){
            if (eachDirection.value == rotation) return eachDirection;
        }
        return null;

    }
}