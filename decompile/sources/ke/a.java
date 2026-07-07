package ke;

import java.util.Comparator;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: y, reason: collision with root package name */
    public static final a f7908y = new a(0);

    /* renamed from: z, reason: collision with root package name */
    public static final a f7909z = new a(1);

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7910x;

    public /* synthetic */ a(int i6) {
        this.f7910x = i6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7910x) {
            case 0:
                Comparable a10 = (Comparable) obj;
                Comparable b10 = (Comparable) obj2;
                k.e(a10, "a");
                k.e(b10, "b");
                return a10.compareTo(b10);
            default:
                Comparable a11 = (Comparable) obj;
                Comparable b11 = (Comparable) obj2;
                k.e(a11, "a");
                k.e(b11, "b");
                return b11.compareTo(a11);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f7910x) {
            case 0:
                return f7909z;
            default:
                return f7908y;
        }
    }
}
