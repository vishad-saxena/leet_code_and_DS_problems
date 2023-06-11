package leetcode;

public class BuilderPattern {

    static class Coffee{
        private String type;
        private String milk;
        private String sugar;
        private String size;
        private Coffee (Builder builder){
            this.type=builder.type;
            this.milk=builder.milk;
            this.sugar=builder.sugar;
            this.size= builder.size;
        }
        public static class Builder{
            private String type;
            private String milk;
            private String sugar;
            private String size;

            public Builder setMilk(String milk) {
                this.milk = milk;
                return this;
            }

            public Builder setSugar(String sugar) {
                this.sugar = sugar;
                return this;
            }

            public Builder setSize(String size) {
                this.size = size;
                return this;
            }
            public Coffee build(){
                return new Coffee(this);
            }
            public Builder(String type){
                this.type=type;
            }

        }

        @Override
        public String toString() {
            return "Coffee{" +
                    "type='" + type + '\'' +
                    ", milk='" + milk + '\'' +
                    ", sugar='" + sugar + '\'' +
                    ", size='" + size + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        Coffee coffee=new BuilderPattern.Coffee.Builder("Mocha").setMilk("true").setSugar("false").build();
        System.out.println(coffee);
    }
}
