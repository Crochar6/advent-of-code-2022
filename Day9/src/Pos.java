public class Pos {
    public static final int ROPELEN = 1;
    public int x;
    public int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(String drection) {
        switch (drection) {
            case "U" :
                y += 1;
                break;
            case "D":
                y -= 1;
                break;
            case "R":
                x += 1;
                break;
            case "L":
                x -= 1;
                break;
        }
    }

    public void follow(Pos h) {
        if (Math.abs(x - h.x) + Math.abs(y - h.y) <= ROPELEN) {
            return;
        }
        if (Math.abs(x - h.x) + Math.abs(y - h.y) > ROPELEN+1) {
            x -= Math.signum(x - h.x);
            y -= Math.signum(y - h.y);
        }
        if (Math.abs(x - h.x) > ROPELEN) {
            x -= Math.signum(x - h.x);
        }
        if (Math.abs(y - h.y) > ROPELEN) {
            y -= Math.signum(y - h.y);
        }
    }
}
