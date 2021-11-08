package token;

public class Add implements Operation {
    public String toString() {
        return "ADD";
    }

    @Override
    public int calc(int first, int second) {
        return first + second;
    }

    @Override
    public int prior() {
        return 0;
    }
}
