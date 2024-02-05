class cake{
        private final String milk;
        private final String sugar;
        private final String egg;
        private final String fruits;
        private final String chocolate;
        cake(Mybakery ref)
        {
        this.milk=ref.milk;
        this.sugar=ref.sugar;
        this.egg=ref.egg;
        this.fruits=ref.fruits;
        this.chocolate=ref.chocolate;
        }
        public String toString()
        {
        return "Ingridents required to bake cake is :- " +milk+ " "+sugar+ " "+egg+" "+fruits+" "+chocolate+".";
        }
        public static class Mybakery{
        private final String milk;
        private final String sugar;
        private String egg;
        private String fruits;
        private String chocolate;
        public Mybakery(String milk,String sugar)
        {
        this.milk=milk;
        this.sugar=sugar;
        }
        public Mybakery egg(String egg)
        {
        this.egg=egg;
        return this;
        }
        public Mybakery fruits(String fruits)
        {
        this.fruits=fruits;
        return this;
        }
        public Mybakery chocolate(String chocolate)
        {
        this.chocolate=chocolate;
        return this;
        }
        public cake build()
        {
        cake ck=new cake(this);
        return ck;
        }
        }
        }


    class builtindesign {
        public static void main(String args[]){
            cake c1 = new cake.Mybakery("amul milk", "two spoon of sugar").build();
            System.out.println(c1); 
            cake c2 = new cake.Mybakery("amul milk", "two spoon of sugar").egg("2 eggs").build();
            System.out.println(c2);
            cake c3 = new cake.Mybakery("amul milk", "two spoon of sugar").egg("2 eggs").fruits("mixed fruits").build();
            System.out.println(c3);
            cake c4 = new cake.Mybakery("amul milk", "two spoon of sugar").egg("2 eggs").fruits("mixed fruits").chocolate("choco chips").build();
            System.out.println(c4);
            cake c5 = new cake.Mybakery("amul milk", "two spoon of sugar").chocolate("choco chips").build();
            System.out.println(c5);
            cake c6 = new cake.Mybakery("amul milk", "two spoon of sugar").fruits("mixed fruits").build();
            System.out.println(c6); 
        }
    }
