public class No05_ReversePrintNode {

    /*You need to print a string of nodes in a reversed sort*/
    

    class Node{
        String data;
        Node next;
        public Node(String data) {
            super();
            this.data = data;
        }
        public Node(String data, Node next) {
            super();
            this.data = data;
            this.next = next;
        }
        public String getData() {
            return data;
        }
        public void setData(String data) {
            this.data = data;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
