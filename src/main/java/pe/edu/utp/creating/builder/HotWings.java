package pe.edu.utp.creating.builder;

public class HotWings {
    private final int number;
    private final boolean soda; private final boolean fries;
    private final String name;

    public static class Builder{
        private int number;   // required
        private boolean soda = false;
        private boolean fries = false;
        private String name;

        public Builder(int number) {this.number = number;}

        public Builder withSoda(){
            soda = true; return this;
        }

        public Builder withFries(){
            fries = true; return this;
        }

        public Builder name(String name){
            this.name = name; return this;
        }

        public HotWings build(){
            return new HotWings(this);
        }
    }

    private HotWings(Builder builder){
        number = builder.number; soda = builder.soda;
        fries = builder.fries; name = builder.name;
    }

    @Override
    public String toString() {
        return "HotWings{" +
                "number=" + number +
                ", soda=" + soda +
                ", fries=" + fries +
                ", name='" + name + '\'' +
                '}';
    }
}
