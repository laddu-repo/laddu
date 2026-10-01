package androidx.media3.decoder.ffmpeg;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f1039a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1040b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1042d;

    public e(String[] strArr, int i6) {
        this.f1042d = i6;
        this.f1039a = strArr;
    }

    public final synchronized boolean a() {
        if (this.f1040b) {
            return this.f1041c;
        }
        this.f1040b = true;
        try {
            for (String str : this.f1039a) {
                switch (this.f1042d) {
                    case 0:
                        System.loadLibrary(str);
                        break;
                    default:
                        System.loadLibrary(str);
                        break;
                }
            }
            this.f1041c = true;
        } catch (UnsatisfiedLinkError unused) {
            u1.a.p("LibraryLoader", "Failed to load " + Arrays.toString(this.f1039a));
        }
        return this.f1041c;
    }
}
