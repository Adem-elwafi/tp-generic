package exercice1;

public class Point<T1> {
    private T1 abs;
    private T1 ord;

    public Point(T1 abs, T1 ord) {  // Fixed: no 'void'
        this.abs = abs;
        this.ord = ord;
    }

    public T1 getAbs() {
        return this.abs;
    }

    public T1 getOrd() {
        return this.ord;
    }

    public void setAbs(T1 abs) {
        this.abs = abs;
    }

    public void setOrd(T1 ord) {
        this.ord = ord;
    }

    @Override
    public String toString() {
        return "Point [abs=" + abs + ", ord=" + ord + "]";
    }
}