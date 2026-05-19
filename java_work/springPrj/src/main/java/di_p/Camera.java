package di_p;

public class Camera {
    String name, kind;
    public String size;

    public void setName(String name) {
        System.out.println("setName() : "+name);
        this.name = name;
    }

    public void setKind(String kind) {
        System.out.println("setKind() : "+kind);
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public Camera() {
        System.out.println("Camera 기본생성자");
    }
}
