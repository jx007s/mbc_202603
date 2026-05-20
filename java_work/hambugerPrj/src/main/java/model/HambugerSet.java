package model;

public class HambugerSet {
    String name;
    int price;
    Hambuger ham;
    Side side;
    Drink drink;

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void setHam(Hambuger ham) {
        this.ham = ham;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "HambugerSet{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ham=" + ham +
                ", side=" + side +
                ", drink=" + drink +
                '}';
    }
}

class Hambuger {
    String kind,name;
    int price, cal;

    public void setCal(int cal) {
        this.cal = cal;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hambuger{" +
                "kind='" + kind + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", cal=" + cal +
                '}';
    }
}

class Side{
    String name;
    int price, cnt, cal;

    public void setCal(int cal) {
        this.cal = cal;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Side{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", cnt=" + cnt +
                ", cal=" + cal +
                '}';
    }
}

class Drink{
    boolean hi;
    String name, size;
    int cal, price;

    public void setCal(int cal) {
        this.cal = cal;
    }

    public void setHi(boolean hi) {
        this.hi = hi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", hi=" + hi +
                ", price=" + price +
                ", cal=" + cal +
                '}';
    }
}
