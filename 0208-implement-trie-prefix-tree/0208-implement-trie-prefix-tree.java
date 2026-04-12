class Node{
    boolean flag=false;
    Node[] arr = new Node[26];
    public Node(){

    }
    boolean containsKey(char i){
        return arr[i-'a']!=null;
    }
    Node get(char i){
        return arr[i-'a'];
    }
    void set(){
        flag=true;
    }
    boolean isEnd(){
        return flag;
    }
}
class Trie {
    private static Node root;
    public Trie() {
        root= new Node();
    }
    
    public void insert(String word) {  
        Node node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(!node.containsKey(ch)){
                node.arr[ch-'a']=new Node();
            }
            node = node.arr[ch-'a'];
        } 
        node.set();
    }
    
    public boolean search(String word) {
        Node node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(!node.containsKey(ch)){
                return false;
            }
            node=node.arr[ch-'a'];
        }
        return node.isEnd();
    }
    
    public boolean startsWith(String word) {
        Node node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(!node.containsKey(ch)){
                return false;
            }
            node=node.arr[ch-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */