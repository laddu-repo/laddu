package v4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public interface c extends AutoCloseable {
    void K(int i, String str);

    boolean P();

    boolean Z();

    void e(int i);

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    void h();

    boolean isNull(int i);

    String n(int i);

    void o(long j8);

    void reset();
}
