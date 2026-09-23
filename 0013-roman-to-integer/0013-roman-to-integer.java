class Solution {
    public int romanToInt(String s) {
        int num=0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for(int i=0;i<s.length();i++){
            int current=roman.get(s.charAt(i));
            if(i+1 < s.length() && current < roman.get(s.charAt(i+1))){
                num=num-current;
            }
            else{
                num=num+current;
            }
        }
        return num;
    }
}