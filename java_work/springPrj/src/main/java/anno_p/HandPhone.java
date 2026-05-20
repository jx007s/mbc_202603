package anno_p;

import di_p.Camera;

public class HandPhone {
    di_p.Camera fc, rc;
    String name;
    Mic mm;

    public void setFc(di_p.Camera fc) {
        this.fc = fc;
    }

    public void setRc(Camera rc) {
        this.rc = rc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMm(Mic mm) {
        this.mm = mm;
    }

    @Override
    public String toString() {
        return "HandPhone{" +
                "name='" + name + '\'' +
                ", fc=" + fc +
                ", rc=" + rc +
                ", mm=" + mm +
                '}';
    }
}

class Mic{
    String name;
    int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mic{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
