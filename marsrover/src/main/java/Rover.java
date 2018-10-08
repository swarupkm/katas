public class Rover {

    Direction direction = Direction.NORTH;

    public String execute(String command) {
        for (char c : command.toCharArray()) {
            switch (c) {
                case 'R':
                    direction = direction.right();
                    break;
                case 'L':
                    direction = direction.left();
                    break;
            }
        }
        return "0:0:" + direction.value();
    }
}
