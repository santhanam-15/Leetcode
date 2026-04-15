
class Node{
    boolean flag=false;
    Node[] arr = new Node[26];
    List<String> sugg=new ArrayList<>();
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
    private Node root;
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
            if(node.sugg.size()<3){
                node.sugg.add(word);
            }
        }
        node.set();
    }
    
    public List<List<String>> search(String word) {
        Node node=root;
        List<List<String>> res = new ArrayList<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if (node != null && node.containsKey(ch)) {
                node = node.get(ch);
            }else {
                node = null;
            }
            if(node==null){
                res.add(new ArrayList<>());
            }else{
                res.add(node.sugg);
            }
        }
        return res;
    }
}
class Solution {
    public List<List<String>> suggestedProducts(String[] products, String word) {
        Arrays.sort(products);
        Trie t = new Trie();
        for(String i : products){
            t.insert(i);
        }
        return t.search(word);
    }
}