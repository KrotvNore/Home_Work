package hmn2;

//  Lock
class Lock {
    private String key;

    public Lock(String key) {
        this.key = key;
    }

    public boolean unlock(String providedKey) {
        return key.equals(providedKey);
    }
}
