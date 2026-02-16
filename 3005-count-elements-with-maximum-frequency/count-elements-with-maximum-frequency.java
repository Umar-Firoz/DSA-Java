class Solution {
    public int maxFrequencyElements(int[] arr) {
               int max=0;
        HashMap<Integer,Integer> map= new HashMap<>();


//        for (int i : arr) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//            max = Math.max(max, map.get(i));
//        }
//
//        int count = 0;
//        for (int freq : map.values()) {
//            if (freq == max)
//                count++;
//        }

        for (int i : arr) {
            if (map.containsKey(i)) {
                int f = map.get(i);
                map.put(i, map.get(i) + 1);


                //map.put(i, map.getOrDefault(i, 0) + 1);

            } else {
                map.put(i, 1);
            }
            max=Math.max(max,map.get(i));
        }
        int count=0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
                if(e.getValue()==max)
                    count++;
        }




        return max*count;
    }
}