package di_p;

public class Camera {
    String name, kind;

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
                '}';
    }

    public Camera() {
        System.out.println("Camera 기본생성자");
    }
}
