import java.awt.*;
import java.awt.image.BufferedImage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Tree {
    private Node root;

    private ArrayList<Node> nodes = new ArrayList<>();

    private void swap(Node n, Node o){
        Node temp = n;
        n = o;
        o = temp;
    }

    public void build(){

    }

    public void draw(){
        int width = 5000, height = 5000, nodeSize = 100;

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = bufferedImage.createGraphics();
    }

    public void insert(int v){
        Node newNode = new Node(v);
        nodes.add(newNode);
        Collections.sort(nodes);

        if (newNode.getValue() == root.getValue()){
            newNode.setColor(Color.BLACK);
        }
        insert(newNode, root);

        




        //updateNodes();
    }

    private Node insert(Node node, Node root){

        if (root == null){
            root = node;
        }

        if (node.getValue() < root.getValue()){

            root.left = insert(node,root.left);

        } else if (root.getValue() < node.getValue()){

            root.right = insert(node,root);
        }
        return root;

    }


    private void updateNodes(){
        this.root = nodes.get(nodes.size()/2);
        for (int i = 0; i < nodes.size() -1; i++){
            //Do something here
            nodes.get(i).update();
        }


    }

    public ArrayList<Node> getTree(){
        return nodes;
    }

    public Node getRoot(){
        return this.root;
    }
}
