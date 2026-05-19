package di_main;

import di_p.Camera;

public class DiMain {
    public static void main(String[] args) {
        System.out.println("DiMain 시작 ------");

        Camera cam1 = new Camera();
        cam1.setName("전방카메라");
        cam1.setKind("일반렌즈");

        System.out.println("cam1:"+cam1);

        System.out.println("DiMain 끝 ------");
    }
}
