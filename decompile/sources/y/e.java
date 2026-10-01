package y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14794a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};

    public static /* synthetic */ boolean a(int i6, int i10) {
        if (i6 != 0) {
            if (i6 == i10) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public static StringBuilder b(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static /* synthetic */ int c(int i6) {
        if (i6 != 0) {
            return i6 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] d(int i6) {
        int[] iArr = new int[i6];
        System.arraycopy(f14794a, 0, iArr, 0, i6);
        return iArr;
    }
}
