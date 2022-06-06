public class Color {
    private int R, G, B;

    public Color(int R, int G, int B) {
        this.R = R;
        this.G = G;
        this.B = B;
    }

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public int getG() {
        return G;
    }

    public void setG(int G) {
        this.G = G;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    @Override
    public String toString() {
        return "color[" +
                "R=" + R +
                ", G=" + G +
                ", B=" + B +
                ']';
    }
}