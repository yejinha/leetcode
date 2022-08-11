class Solution {
 public ListNode reverseList(ListNode head) {
    /* iterative solution */
     // To reverse, we have to change 'next' pointer to point previous element.
     // Use pointer that points previous element so that we change head's next pointer to point it. 
     
     // 지금 노드의 다음 노드가 그 이전 노드가 되도록 하면 된다. ( 다음 노드 가리키는 next pointer 가 이전 노드 가리키면됨)
     // 이전 노드를 저장할 포인터 만들어 사용
     
     // First element's previous node is null so that we can use this wheter it ends after reversing list. 
     // null -> 1 - 2 - .. 
     // 첫 노드의 이전노드는 reverse 했을때 끝을 알리기 위해 null 이라고 한다. 
     
    ListNode prevNode =null; 
     
    while(head != null){
        ListNode temp = head.next;   // 다음에 변경될 노드를 저장한다  // save next node to use it next turn. 
        head.next = prevNode; // change head's next into previous node
        // 다음 루프때 다음 노드가 나를 가리키도록 previous node 바꿔준다. (제일 첫번째 위치한 노드가 됨)
        // change previous node into head so that next noode will point this. 
        prevNode = head; 
        // change head into next node
        head = temp; 
    }
    return prevNode; // 제일 앞 노드 반환 return the first node of linkedlist
}}
