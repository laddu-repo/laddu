package r0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f11240e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f11241a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11242b;

    /* renamed from: c, reason: collision with root package name */
    public int f11243c;

    /* renamed from: d, reason: collision with root package name */
    public char f11244d;

    static {
        for (int i6 = 0; i6 < 1792; i6++) {
            f11240e[i6] = Character.getDirectionality(i6);
        }
    }

    public a(CharSequence charSequence) {
        this.f11241a = charSequence;
        this.f11242b = charSequence.length();
    }

    public final byte a() {
        int i6 = this.f11243c - 1;
        CharSequence charSequence = this.f11241a;
        char charAt = charSequence.charAt(i6);
        this.f11244d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f11243c);
            this.f11243c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f11243c--;
        char c10 = this.f11244d;
        if (c10 < 1792) {
            return f11240e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
