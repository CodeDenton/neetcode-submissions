class LRUCache {

    public ArrayList<int[]> cache;
    private int capacity;

    public LRUCache(int capacity) {
        cache = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        for(int i=0; i<cache.size(); i++) {
            if(cache.get(i)[0] == key) {
                int[] tmp = cache.remove(i);
                int result = tmp[1];
                cache.add(tmp);
                return result;
            }
        }
        return -1;
    }
    
    public void put(int key, int value) {
        for(int i=0; i<cache.size(); i++) {
            if(cache.get(i)[0] == key) {
                int[] tmp = cache.remove(i);
                tmp[1] = value;
                cache.add(tmp);
                return;
            }
        }
        if(cache.size() == capacity) {
            cache.remove(0);
        }

        cache.add(new int[] {key, value});
    }
}
