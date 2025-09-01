Max Rhyming Word Length bookmark_borderGiven is a wordlist L, and a word W. 
Your task is to find the length of the longest word in L having the longest common suffix with W.

https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/max-rhyming-word-length
  
import java.io.*;
import java.util.*;

public class Main {
    static class TrieNode{
        TrieNode[] children=new TrieNode[26];
        int maxLen=0;
    }
    static class Trie{
        TrieNode root=new TrieNode();
        void insert(String word){
            TrieNode node=root;
            int len=word.length();
            for(char c:word.toCharArray()){
                int idx=c-'a';
                if(node.children[idx]==null){
                    node.children[idx]=new TrieNode();
                }
                node=node.children[idx];
                node.maxLen=Math.max(node.maxLen,len);
            }
        }
        int query(String word){
            TrieNode node=root;
            int result=0;
            for(char c:word.toCharArray()){
                int idx=c-'a';
                if(node.children[idx]==null){
                    break;
                }
                node=node.children[idx];
                result=node.maxLen;
            }
            return result;
        }
    }
    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        Trie trie=new Trie();
        for(int i=0;i<n;i++){
            String word=br.readLine().trim();
            trie.insert(new StringBuilder(word).reverse().toString());
        }
        int q=Integer.parseInt(br.readLine());
        for(int i=0;i<q;i++){
            String w=br.readLine().trim();
            int ans=trie.query(new StringBuilder(w).reverse().toString());
            out.append(ans).append("\n");
        }
        System.out.print(out.toString());
    }
}
