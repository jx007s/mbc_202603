package di_p;

/*
ComputerMain
--  autowire 로 작업 요망

서버  - 본체 1, 모니터 2, 키보드 1, 마우스 1
데스크탑   - 본체 1, 모니터 1, 키보드 1, 마우스 1
노트북    - 본체 1, 마우스 1
테블릿   - 본체 1
* */

public class Server {
    String name;
    Bonche bch;
    Monitor mm1, mm2;
    KeyBoard kb;
    Mouse mo;

    public void setBch(Bonche bch) {
        this.bch = bch;
    }

    public void setKb(KeyBoard kb) {
        this.kb = kb;
    }

    public void setMm1(Monitor mm1) {
        this.mm1 = mm1;
    }

    public void setMm2(Monitor mm2) {
        this.mm2 = mm2;
    }

    public void setMo(Mouse mo) {
        this.mo = mo;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", bch=" + bch +
                ", kb=" + kb +
                ", mm1=" + mm1 +
                ", mm2=" + mm2 +
                ", mo=" + mo +
                '}';
    }
}


class DeskTop {

    String name;
    Bonche bch;
    Monitor mm1;
    KeyBoard kb;
    Mouse mo;

    public void setBch(Bonche bch) {
        this.bch = bch;
    }

    public void setKb(KeyBoard kb) {
        this.kb = kb;
    }

    public void setMm1(Monitor mm1) {
        this.mm1 = mm1;
    }



    public void setMo(Mouse mo) {
        this.mo = mo;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DeskTop{" +
                "name='" + name + '\'' +
                ", bch=" + bch +
                ", kb=" + kb +
                ", mm1=" + mm1 +
                ", mo=" + mo +
                '}';
    }
}


class NoteBook {

    String name;
    Bonche bch;
    Mouse mo;

    public void setBch(Bonche bch) {
        this.bch = bch;
    }

    public void setMo(Mouse mo) {
        this.mo = mo;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "name='" + name + '\'' +
                ", bch=" + bch +
                ", mo=" + mo +
                '}';
    }
}


class Tablet {

    String name;
    Bonche bch;


    public void setBch(Bonche bch) {
        this.bch = bch;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "name='" + name + '\'' +
                ", bch=" + bch +

                '}';
    }
}


class Bonche{
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
        return "Bonche{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
class Monitor{
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
        return "Monitor{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
class KeyBoard{String name;
    int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "KeyBoard{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
class Mouse{String name;
    int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


