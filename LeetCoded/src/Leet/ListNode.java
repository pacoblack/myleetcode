package Leet;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x){val = x;}
	
	@Override
	public String toString() {
		String str = "ListNode [";
		ListNode pointer = this;
		
		while(pointer != null){
			str += pointer.val;
			if(pointer.next != null){
				str +=", ";
			}
			pointer = pointer.next;
		}
		str += "]";
		return str;
	}
	public static ListNode init(int[] list){
		if(list == null || list.length == 0) return null;
		
		ListNode listNode = new ListNode(list[0]);
		ListNode pointer = listNode;
		
		for(int i = 1; i < list.length; i++){
			pointer.next = new ListNode(list[i]);
			pointer = pointer.next;
		}
		
		System.out.println(listNode);
		return listNode;
	}
	public static ListNode reverse(ListNode list){
		if(list == null || list.next == null) return list;
		
		ListNode oldTail = null, temp = null;
		
		while(list != null){
			temp = list;
			list = list.next;
			
			if(oldTail == null){
				oldTail = temp;
				temp.next = null;
			}else{
				temp.next = oldTail;
				oldTail = temp;
			}
			
		}
		System.out.println("reverse:" + oldTail);
		return oldTail;
	}
}
