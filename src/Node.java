public class Node {

    Node next;
    Node previous;
    private String data;

    public Node(String navn) {

        this.data = navn;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}
