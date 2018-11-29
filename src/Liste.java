public class Liste {

Node head;
Node tail;


public void insertFromHead(Node n) {

    if (head == null) {  // hvis listen er tom
        head = n;
        tail = n;
    }
    else  { // hvis listen ikke er tom

        n.next = head;
        head.previous = n;
        head = n;

    }

}

public void insertFromTail(Node n) {

    if (head == null) {  // hvis listen er tom
        head = n;
        tail = n;
    }
    else {
        n.previous = tail;
        tail.next = n;
        tail = n;

    }




}

public String printFromHead() {

    String res="";

    Node n = head;

    while (n != null) {

        res += n.getData() + "\n";
        n = n.next;

    }
    return res;
}

public String printFromTail () {

    String res="";

    Node n = tail;

    while (n != null) {

        res += n.getData() + "\n";
        n = n.previous;

    }
    return res;

}

public Node findeNode(String s) {

    Node res = new Node("navnet fandtes ikke");

    Node n = head;

    while (n != null) {

        if(n.getData().equalsIgnoreCase(s)) {
            res = n;
            break;

        }

        n = n.next;
    }


    return res;
}


public Node deleteFromHead () {

    Node res = new Node("lister er tom");

    if (head == null) {
        return res;
    }

    if(head == tail){
        res = head;
        head = tail = null;
    }
    else {
        res = head;
        head = head.next;
        head.previous = null;

    }

    return res;
}


    public Node deleteFromTail () {

        Node res = new Node("lister er tom");

        if (head == null) {
            return res;
        }

        if(head == tail){
            res = head;
            head = tail = null;
        }
        else {
            res = tail;
            tail = tail.previous;
            tail.next = null;

        }

        return res;
    }



    public Node deleteNode (String s) {

    Node n = findeNode(s);
    if(n == head) {
       return deleteFromHead();
    }
    if (n == tail) {
        return deleteFromTail();
    }

    n.previous.next = n.next;
    n.next.previous = n.previous;
    return n;


    }

    public void insertBeforeNode(Node n, String s) {

    Node x = findeNode(s);
    if(x == null) {
        return;
    }
    if (x == head) {
        insertFromHead(x);
        return;
    }

    x.previous.next = n;
    n.next = x;
    n.previous = x.previous;
    x.previous = n;


    }

public void exchangeNodes(String s1, String s2) {

    Node x = findeNode(s1);
    Node y = findeNode(s2);

    if (x.getData().equalsIgnoreCase("navnet fandtes ikke") ||
            y.getData().equalsIgnoreCase("navnet fandtes ikke")) {
        return;
    }

    Node tempX = x;
    Node tempY = y;

    Node xNext = x.next;
    Node yNext = y.next;

    deleteNode(s1);
    deleteNode(s2);

    insertBeforeNode(tempY, xNext.getData());
    insertBeforeNode(tempX, yNext.getData());
}


}
