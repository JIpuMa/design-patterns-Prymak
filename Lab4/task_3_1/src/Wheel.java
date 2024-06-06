public class Wheel {
    public enum Material {  // Матеріал диску
        Steel,  //  Стальний диск
        Alloy,  //  Легкосплавний
        Forged  //  Кований легкосплавний диск
    }

    public static class WheelBuilder {
        private Material material = Material.Steel;
        public WheelBuilder setMaterial(Material material) {
            this.material = material;
            return this;
        }

        int diameter = 14;
        public WheelBuilder setDiameter(int diameter) {
            this.diameter = diameter;
            return this;
        }

        public Wheel build() {
            return new Wheel(material, diameter);
        }
    }

    final private Material material;   // Матеріал диску
    final int diameter;                //  Діаметр колеса

    private Wheel(Material material,
                 int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "material=" + material +
                ", diameter=" + diameter +
                '}';
    }
}