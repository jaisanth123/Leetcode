struct ListNode* addTwoNumbers (struct ListNode* l1, struct ListNode* l2){
    struct ListNode* dummy = (struct ListNode*)malloc(sizeof(struct ListNode)); 
    struct ListNode* current = dummy;
    int carry = 0;
while (l1!= NULL || l2 != NULL) {
int x = (l1 != NULL)? l1->val: 0;
int y = (l2 !=NULL) ? l2->val: 0;
int sum = carry + x + y;
carry = sum / 10;
current->next = (struct ListNode*)malloc(sizeof(struct ListNode)); 
current = current->next;
current->val = sum % 10;
if (l1 != NULL) l1 = l1->next;
if (l2 != NULL) l2 = l2->next;
}
if (carry > 0) {
current->next = (struct ListNode*)malloc(sizeof(struct ListNode));
current = current->next;
current->val = carry;
}
current->next = NULL;
return dummy->next;
}


