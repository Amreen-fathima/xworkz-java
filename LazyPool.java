class LazyPool {

    int poolId;
    String poolName;
    int depth;

    LazyPool(int poolId, String poolName, int depth) {
        this.poolId = poolId;
        this.poolName = poolName;
        this.depth = depth;
    }

    void displayDetails() {
        System.out.println(poolId);
        System.out.println(poolName);
        System.out.println(depth);
    }
}