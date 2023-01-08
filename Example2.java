public class Example2{
    class Node{
        int data;
        Node pre;
        Node next;

        public Node(int d){
            data=d;
        }
    }

    Node head, tail=null;

    public void addNode(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
            head.pre=null;
            tail.next=null;
        }
        else{
            tail.next=newNode;
            newNode.pre=tail;
            tail=newNode;
            tail.next=null;
        }
    }
    public void display(){
        Node x=head;
        System.out.println("Orignal List:");
        while(x!=null){
            System.out.print(x.data+" ");
            x=x.next;
        }
    }  
    public void show(){
        System.out.println("\n"+"Updated List: ");
        Node y=head;

        int i=4;
        for(int a=1;a<i;a++){
            y=y.next;
        }
        while(y!=null){
            System.out.print(y.data + " ");
            y=y.next;
        }
    
        Node z=head;       
        for(int b=1;b<i;b++){
            System.out.print(z.data +" ");
            z=z.next;
        }
        System.out.println();
        
    }
    public static void main(String args[]){
        Example2 obj = new Example2();
        
            obj.addNode(1);
            obj.addNode(2);
            obj.addNode(3);
            obj.addNode(4);
            obj.addNode(5);
        

        obj.display();
        
        obj.show();
    }
}