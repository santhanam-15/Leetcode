class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> st = new Stack<>();
        int n=0;
        StringBuilder str=new StringBuilder();
        for(char i : s.toCharArray()){
            if(Character.isDigit(i)){
                n=n*10+i-'0';
                continue;
            }
            if(i=='['){
                st.push(str);
                st.push(new StringBuilder(String.valueOf(n)));
                str=new StringBuilder();
                n=0;
            }else if(i==']'){
                StringBuilder temp =new StringBuilder();
                int c=Integer.parseInt(st.pop().toString());
                for(int j=0;j<c;j++){
                    temp.append(str);
                }
                str=st.pop().append(temp);
            }
            else{
                str.append(i);
            }
        }
        return str.toString();
    }
}