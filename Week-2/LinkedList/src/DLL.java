public class DLL {
   private  class Node{
        int val;
        Node next;
        Node prev ;

        Node head;
        public void insertFirst(int val){
            Node node = new Node(val);
             node.next =head;
             node.prev = null;
             if(head!=null){
                 head.prev =node;
             }
             head =node;
        }

        public void insertLast(int val){
            Node node = new Node(val);
            Node last = head;
            node.next =null;
            if(head == prev){
                node.prev = null;
                head = node;
                return;
            }
            while (last.next!=null){
                last = last.next;
            }
            last.next = node;
            node.prev =last;
        }

        public void insert(int after,int val){

        }

        public void display(){
            Node node = head;
            Node last =null;
            while (node!=null){
                System.out.println(node.val + "->");
                node =node.next;
                last =node;
            }
        }


       public Node(int val) {
           this.val = val;
       }

       public Node(int val, Node next, Node prev) {
           this.val = val;
           this.next = next;
           this.prev = prev;
       }
   }

}
