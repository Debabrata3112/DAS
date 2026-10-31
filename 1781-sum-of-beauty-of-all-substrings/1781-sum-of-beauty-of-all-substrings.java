class Solution {
    public int beautySum(String s) {
        int totalBeauty=0;
        for(int i=0;i<s.length();i++){
            int [] fre=new int[26];
            for(int j=i;j<s.length();j++){
                fre[s.charAt(j)-'a']++;

                int maxfre=0;
                int minfre=Integer.MAX_VALUE;

                for(int k=0;k<26;k++){
                    if(fre[k]>0){
                        maxfre=Math.max(maxfre,fre[k]);
                        minfre=Math.min(minfre,fre[k]);
                    }
                }

                totalBeauty=totalBeauty+(maxfre-minfre);
            }
        }
        return totalBeauty;
    }
} 