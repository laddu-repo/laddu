package y9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Iterator {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final m0 f14585v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ m0[] f14586w;

    static {
        m0 m0Var = new m0("INSTANCE", 0);
        f14585v = m0Var;
        f14586w = new m0[]{m0Var};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f14586w.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        p4.v.q("no calls to next() since the last call to remove()", false);
    }
}
