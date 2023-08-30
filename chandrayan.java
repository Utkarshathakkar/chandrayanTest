public class chandrayan {
    public static void main(String[] args) {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, "N");
        String[] commands = {"f", "r", "u", "b", "l"};

        for (String command : commands) {
            spacecraft.executeCommand(command);
        }

        System.out.println("Final Position: " + spacecraft.getCurrentPosition());
        System.out.println("Final Direction: " + spacecraft.getCurrentDirection());
    }
}

class Spacecraft {
    public int x, y, z;
     String direction;

    public Spacecraft(int x, int y, int z, String direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void executeCommand(String command) {
        switch (command) {
            case "f":
                moveForward();
                break;
            case "b":
                moveBackward();
                break;
            case "l":
                turnLeft();
                break;
            case "r":
                turnRight();
                break;
            case "u":
                turnUp();
                break;
            case "d":
                turnDown();
                break;
        }
    }

    void moveForward() {
        if (direction.equals("N")) {
            y++;
        } else if (direction.equals("S")) {
            y--;
        } else if (direction.equals("E")) {
            x++;
        } else if (direction.equals("W")) {
            x--;
        } else if (direction.equals("Up")) {
            z++;
        } else if (direction.equals("Down")) {
            z--;
        }
    }

    private void moveBackward() {
        if (direction.equals("N")) {
            y--;
        } else if (direction.equals("S")) {
            y++;
        } else if (direction.equals("E")) {
            x--;
        } else if (direction.equals("W")) {
            x++;
        } else if (direction.equals("Up")) {
            z--;
        } else if (direction.equals("Down")) {
            z++;
        }
    }

    private void turnLeft() {
        if (direction.equals("N")) {
            direction = "W";
        } else if (direction.equals("S")) {
            direction = "E";
        } else if (direction.equals("E")) {
            direction = "N";
        } else if (direction.equals("W")) {
            direction = "S";
        }
         else if(direction.equals("Up")){
            direction="N";
         }
         else if(direction.equals("Down")){
            direction="N";
         }
    }

    private void turnRight() {
        if (direction.equals("N")) {
            direction = "E";
        } else if (direction.equals("S")) {
            direction = "W";
        } else if (direction.equals("E")) {
            direction = "S";
        } else if (direction.equals("W")) {
            direction = "N";
        }
          else if(direction.equals("Up")){
            direction="S";
         }
         else if(direction.equals("Down")){
            direction="S";
         }
    }

    private void turnUp() {
        if (direction.equals("N") || direction.equals("S") || direction.equals("E") || direction.equals("W")) {
            direction = "Up";
        }
    }

    private void turnDown() {
        if (direction.equals("N") || direction.equals("S") || direction.equals("E") || direction.equals("W")) {
            direction = "Down";
        }
    }

    public String getCurrentPosition() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public String getCurrentDirection() {
        return direction;
    }
}
