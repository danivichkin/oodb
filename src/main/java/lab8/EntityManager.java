package lab8;

public interface EntityManager {
    //Save Object in DB
    void persist(Object var);

    //Update data in DB by selected Object
    <T> T merge(T var);

    //Delete Object in DB
    void remove(Object var);

    //Get Object by key
    <T> T find(Class<T> var1, Object var2);

    //Refresh
    void refresh(Object var);
}
