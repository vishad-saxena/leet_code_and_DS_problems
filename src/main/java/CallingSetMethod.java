import java.util.Objects;

public class CallingSetMethod {
    int del;
    int uniqDel;
    int open;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallingSetMethod that = (CallingSetMethod) o;
        return del == that.del && uniqDel == that.uniqDel && open == that.open && uniqOpen == that.uniqOpen;
    }

    @Override
    public String toString() {
        return "CallingSetMethod{" +
                "del=" + del +
                ", uniqDel=" + uniqDel +
                ", open=" + open +
                ", uniqOpen=" + uniqOpen +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(del, uniqDel, open, uniqOpen);
    }

    int uniqOpen;

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    public int getUniqDel() {
        return uniqDel;
    }

    public void setUniqDel(int uniqDel) {
        this.uniqDel = uniqDel;
    }

    public int getOpen() {
        return open;
    }

    public void setOpen(int open) {
        this.open = open;
    }

    public int getUniqOpen() {
        return uniqOpen;
    }

    public void setUniqOpen(int uniqOpen) {
        this.uniqOpen = uniqOpen;
    }
    public void setAll(int a,int b,int c,int d){
        this.setDel(a);
        this.setUniqDel(b);
        this.setOpen(c);
        this.setUniqOpen(d);
    }

    public static void main(String[] args) {
        CallingSetMethod csm=new CallingSetMethod();
        csm.setAll(1,2,3,4);
        System.out.println(csm.getDel());
    }
}
