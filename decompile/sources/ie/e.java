package ie;

import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e extends AbstractList implements List, we.c {
    public abstract int a();

    public abstract Object b(int i6);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i6) {
        return b(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
