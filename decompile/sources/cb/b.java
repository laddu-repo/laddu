package cb;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b implements h {
    public abstract boolean a(char c10);

    @Override // cb.h
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
