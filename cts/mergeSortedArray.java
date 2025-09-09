https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            ans.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
            ans.add(nums2[i]);
        }
        Collections.sort(ans);
        for(int i=0;i<(m+n);i++){
            nums1[i]=ans.get(i);
        }
    }
}


//merge sort approch

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a[]=new int[n+m];
        int l1,l2,i;
        for(l1=0,l2=0,i=0;l1<m && l2<n;i++){
            if(nums1[l1]<nums2[l2]){
                a[i]=nums1[l1++];
            }else{
                a[i]=nums2[l2++];
            }
        }
        while(l1<m){
            a[i++]=nums1[l1++];
        }
        while(l2<n){
            a[i++]=nums2[l2++];
        }
        for(int j=0;j<(m+n);j++){
            nums1[j]=a[j];
        }
    }
}
