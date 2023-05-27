public class Main {
    public static void main(String[] args) {
        Collection collection = new MyCollection ();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");

        collection.add("five");
        collection.add("second");
        collection.add(3,"six");
        collection.add(6,"seven");
        collection.delete("second");

        collection.add("ten");

        collection.get(5);
        collection.add(9,"nine");
        collection.add(11,"1");
        collection.delete("second");

        Collection collection1 = new MyCollection ();

         collection1.contain("second");
         collection1.contain("seven");

        collection1.equals(collection1);

        collection1.clear();
        collection1.size();

        ((MyCollection) collection).display();
        ((MyCollection) collection1).display();

        System.out.println(collection.equals(collection1));

        collection.clear();
        System.out.println(collection.size());
    }

}



