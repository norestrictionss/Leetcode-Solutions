#include<iostream>
using namespace std;

struct ListNode {
      int val;
      ListNode *next;
      ListNode() : val(0), next(nullptr) {}
      ListNode(int x) : val(x), next(nullptr) {}
      ListNode(int x, ListNode *next) : val(x), next(next) {}
  };


class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        
        ListNode* result;
        if(head->next==NULL)
            return head;

        else{

            ListNode* previous = head;
            ListNode* temp = head->next;  
            result = temp;
            while(temp!=NULL){
                
                ListNode* next_one = temp->next;
                
                temp->next = previous;
                previous->next = next_one;
                
            }

        }

        return result;
    }
};

int main(){





    return 0;
}