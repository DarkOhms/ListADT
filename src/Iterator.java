
public class Iterator<T> {
  
  ListItem<T> currentItem = new ListItem<T>();
  
  Iterator(ListItem<T> head){
	  currentItem = head;
  }
  
  public T next(){  
	  
	    ListItem<T> temp = new ListItem<T>();
	    temp = currentItem;
	    currentItem = temp.next;
	    return temp.data;  
  }
}