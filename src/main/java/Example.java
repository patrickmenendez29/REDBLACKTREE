
public class Example {
    public static void main(String[] args) {
        Tree example = new Tree();
        example.build();

        example.insert(0);
        example.insert(1);
        example.insert(2);
        example.insert(10);
        example.insert(12);
        example.insert(15);
        example.insert(20);
        System.out.println(example.getTree());
        System.out.println(example.getRoot());
    }
}
