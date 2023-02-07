class Node{
  int data;
  Node next;
}
class List3{
  Node head;
  public void add(int data){
    Node temp = new Node();
    temp.data = data;
    temp.next = null;
    Node temp1 = head;
    if(head==null){
      head = temp;
    }
    else{
      Node temp2 =head;
      while(temp2.next!=null){
        temp2 = temp2.next;
      }
      temp2.next=temp;
    }
  }
  // to display elemts in liked list
  public void display(){
    Node temp = head;
    while(temp.next!=null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println(temp.data);
  }
  //to dislay size of linked list
  public int size(){
    int cnt =0;
    Node temp = head;
    while(temp.next!=null){
      temp=temp.next;
      cnt++;
    }
    return cnt+1;
  }
  //removal of elements in linked list
  public void pop(int ind){
    Node temp = head;
    if(ind==0){
      Node temp2 = head.next;
      head=temp2;
    }
    else{
      Node temp2 = head;
      int cnt =0;
      int cnt2=0;
      while(cnt!=ind-1){
        temp = temp.next;
        cnt++;
      }
      while(cnt2!=ind+1){
        temp2 = temp2.next;
        cnt2++;
      }
      temp.next=temp2;
    }
  }
  //indexOf data of element in linked list
  public int indexOf(int data){
      boolean a = contains(data);
      if(a==true){
        Node temp = head;
        int cnt =0;
        while(data!=temp.data){
          temp=temp.next;
          cnt++;
        }
        return cnt;
      }
      else return -1;
  }
  //insertion at a certain position
  public void insertAt(int ind,int data){
    Node temp = new Node();
    temp.data=data;
    temp.next=null;
    if(ind==0){
      Node temp1 = head;
      temp.next=temp1;
      head=temp;
    }
    else{
      Node temp1 = head;
      Node temp2 = head;
      int cnt =0;
      int cnt2 =0;
      while(cnt!=ind-1){
        temp1 = temp1.next;
        cnt++;
      }
      while(cnt2!=ind){
        temp2 = temp2.next;
        cnt2++;
      }
      temp1.next=temp;
      temp.next=temp2;
    }
  }
  //contains method in linked List
  public boolean contains(int data){
    int len = size();
    Node temp = head;
    int cnt =0;
    while(data!=temp.data && cnt<len-1){
      temp=temp.next;
      cnt++;
    }
    if(temp.data==data) return true;
    else return false;
  }
  public static void main(String[] args) {
      List3 list = new List3();
      list.add(0);
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      System.out.println("Single Linked List");
      System.out.println("Add Display Size contains indexOf insertAt pop Methods");
  }
}
