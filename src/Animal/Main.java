package Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bão",27,"Đực");
        Cat cat = new Cat("Trang",29,"Xinh đẹp");
        dog.setCân_nặng(60);
        dog.setMàu_sắc("Đen");
        cat.setChiều_cao(155);
        cat.setMàu_lông("Trắng");
        cat.displayInfoCat();
        dog.displayInfoDog();


    }
}
