package yf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final ie.h f15062a;

    /* renamed from: b, reason: collision with root package name */
    public int f15063b;

    public d(int i6) {
        switch (i6) {
            case 1:
                this.f15062a = new ie.h();
                return;
            default:
                this.f15062a = new ie.h();
                return;
        }
    }

    public void a(char[] array) {
        kotlin.jvm.internal.k.e(array, "array");
        synchronized (this) {
            int i6 = this.f15063b;
            if (array.length + i6 < b.f15060a) {
                this.f15063b = i6 + array.length;
                this.f15062a.addLast(array);
            }
        }
    }

    public char[] b(int i6) {
        char[] cArr;
        Object removeLast;
        synchronized (this) {
            ie.h hVar = this.f15062a;
            cArr = null;
            if (hVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = hVar.removeLast();
            }
            char[] cArr2 = (char[]) removeLast;
            if (cArr2 != null) {
                this.f15063b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            return new char[i6];
        }
        return cArr;
    }
}
