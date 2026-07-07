package w1;

import java.io.IOException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class j extends IOException {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f13537y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int f13538x;

    public j(int i6) {
        this.f13538x = i6;
    }

    public j(Exception exc, int i6) {
        super(exc);
        this.f13538x = i6;
    }

    public j(String str, int i6) {
        super(str);
        this.f13538x = i6;
    }

    public j(String str, Exception exc, int i6) {
        super(str, exc);
        this.f13538x = i6;
    }
}
