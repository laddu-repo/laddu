package db;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r0 implements Iterator {

    /* renamed from: x, reason: collision with root package name */
    public static final r0 f4036x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ r0[] f4037y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [db.r0, java.lang.Enum] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f4036x = r02;
        f4037y = new r0[]{r02};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f4037y.clone();
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
        jb.b.i("no calls to next() since the last call to remove()", false);
    }
}
