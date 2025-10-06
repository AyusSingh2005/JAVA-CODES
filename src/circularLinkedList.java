class Data {
    int data;
    Data next;

    Data(int data){
        this.data=data;
        this.next=null;
    }
}

public class circularLinkedList {
    Data head = head=null, tail = null;

    public void insertion(int data){
        Data newData= new Data( data);
        if(head==null){
            head=newData;
            tail=newData;
            newData.next=head;
        }else{
            tail.next=newData;
            tail=newData;
            tail.next=head;
        }
    }

    public void Show(){
        if(head==null){ System.out.println("List Emptyyy"); return;}

        Data temp=head;
    do{
        System.out.print(temp.data +" ");
        System.out.print(" -> ");
        temp=temp.next;
    }while(temp!= head);
        System.out.println();
    }
    public static void main(String[]args){
        circularLinkedList list = new circularLinkedList();
        list.insertion(10);
        list.insertion(120);
        list.insertion(14);
        list.insertion(40);
        list.Show();
    }
}