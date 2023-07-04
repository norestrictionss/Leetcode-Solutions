#include<iostream>
#include<vector>
#include<string>
using namespace std;


class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {

        string first_element = strs[0];
        string result = "";
        if(strs.size()==1)
            return first_element;
        int j = 0;
        int i = 0;
        while(j<strs[i].length() && j<strs[i+1].length()){

            if(strs[i][j] != strs[i+1][j])
                return result;

            if(i==strs.size()-2){

                result += strs[i][j];
                
                i = 0;
                j++;

            }
            else i++;
        }

        return result;
    }
};

int main(){
	
	Solution solution = Solution();
	vector<string> inputs;
	inputs.push_back("flower");
	inputs.push_back("flow");
	inputs.push_back("flight");
	cout<<solution.longestCommonPrefix(inputs);
	
	return 0;
}
