https://leetcode.com/problems/defanging-an-ip-address/description/

1108. Defanging an IP Address


class Solution {
    public String defangIPaddr(String address) {
        // StringBuilder sb=new StringBuilder();
        // for(int i=0;i<address.length();i++){
        //     if(address.charAt(i)=='.'){
        //         sb.append("[.]");
        //     }else{
        //         sb.append(address.charAt(i));
        //     }
        // }
        // return sb.toString();

        // return address.replace(".", "[.]");

        StringBuilder sb=new StringBuilder(address);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='.'){
                sb.replace(i,i+1,"[.]");
                i+=2;
            }
        }
        return sb.toString();
    }
}