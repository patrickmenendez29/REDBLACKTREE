public class Node implements Comparable<Node>{
    private int value;
    private Color color = Color.BLACK;
     Node left = null;
     Node right = null;
    private String fontColor;

    public Node(int value) {
        this.value = value;
        this.color = Color.BLACK;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void update(){
        if (this.left == null && this.right == null){
            this.color = Color.RED;
        }

        switch (this.color){
            case RED:
                this.fontColor = "\\u001B[31m";
                break;
            case BLACK:
                this.fontColor = "\u001B[30m";
                break;
        }

    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Node node) {

        if (node.value < this.value){
            return 1;
        } else if (node.value == this.value) {
            return 0;
        } else return -1;
    }

    @Override
    public String toString() {
        return String.format(this.fontColor+ " %s \\u001B[0m ",this.value);
    }
}
