public interface Subject {
    // rather passing the direct object we can make use of interface and pass instances in runtime.
    void register(Observer o);
    void unregister(Observer o);
    void notifyAllDisplays();
}
