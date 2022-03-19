package cache;

public interface Cache {
    void put (String letter, String formattedResult);

    String get(String sourceString);

    boolean contains(String sourceString);
}

