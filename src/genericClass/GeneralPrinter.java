package genericClass;

/**
 * Material 을 상속받는 모든 클래스가 올 수 있다
 */
public class GeneralPrinter<T extends Material> {
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }
}
