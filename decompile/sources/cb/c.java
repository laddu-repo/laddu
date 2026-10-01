package cb;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: x, reason: collision with root package name */
    public final char f2004x;

    public c(char c10) {
        this.f2004x = c10;
    }

    @Override // cb.b
    public final boolean a(char c10) {
        if (c10 == this.f2004x) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c10 = this.f2004x;
        for (int i6 = 0; i6 < 4; i6++) {
            cArr[5 - i6] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }
}
