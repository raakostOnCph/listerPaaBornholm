import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        List<String> list = new ArrayList<>();
//
//        List<String> list1 = new LinkedList<>();



        Liste liste = new Liste();

        liste.insertFromHead(new Node("karl"));
        liste.insertFromHead(new Node("bue"));
        liste.insertFromHead(new Node("ole"));
        liste.insertFromHead(new Node("joshua"));
        liste.insertFromHead(new Node("emil"));
        liste.insertFromHead(new Node("jeppe"));
        liste.insertFromHead(new Node("ulrik"));
        liste.insertFromHead(new Node("tobias"));
        liste.insertFromHead(new Node("simon"));
        liste.insertFromHead(new Node("jesper"));

        liste.insertFromTail(new Node("nikolaj"));

        System.out.println(liste.printFromHead());

        System.out.println("\n\n");

        System.out.println(liste.deleteFromHead().getData());

        System.out.println("\n\n");

        System.out.println(liste.printFromHead());


        System.out.println("\n\n");
        Liste liste1 = new Liste();

        liste1.insertFromTail(new Node("ole"));

        System.out.println(liste1.printFromHead());

        liste.deleteNode("bue");

        liste.insertBeforeNode(new Node("bue"),"tobias");

        System.out.println(liste.printFromHead());


        liste.exchangeNodes("ulrik","karl");

        System.out.println(liste.printFromHead());


    }
}
