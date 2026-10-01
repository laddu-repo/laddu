package u6;

import android.graphics.Bitmap;
import df.t;
import df.u;
import java.util.Date;
import okhttp3.Headers;
import okhttp3.Request;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Request f12935a;

    /* renamed from: b, reason: collision with root package name */
    public final b f12936b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f12937c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12938d;

    /* renamed from: e, reason: collision with root package name */
    public final Date f12939e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12940f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f12941g;

    /* renamed from: h, reason: collision with root package name */
    public final long f12942h;

    /* renamed from: i, reason: collision with root package name */
    public final long f12943i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final int f12944k;

    public d(Request request, b bVar) {
        int i6;
        this.f12935a = request;
        this.f12936b = bVar;
        this.f12944k = -1;
        if (bVar != null) {
            this.f12942h = bVar.f12931c;
            this.f12943i = bVar.f12932d;
            Headers headers = bVar.f12934f;
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                String name = headers.name(i10);
                if (u.A(name, "Date", true)) {
                    this.f12937c = headers.getDate("Date");
                    this.f12938d = headers.value(i10);
                } else if (u.A(name, "Expires", true)) {
                    this.f12941g = headers.getDate("Expires");
                } else if (u.A(name, "Last-Modified", true)) {
                    this.f12939e = headers.getDate("Last-Modified");
                    this.f12940f = headers.value(i10);
                } else if (u.A(name, "ETag", true)) {
                    this.j = headers.value(i10);
                } else if (u.A(name, "Age", true)) {
                    String value = headers.value(i10);
                    Bitmap.Config[] configArr = a7.f.f595a;
                    Long x10 = t.x(value);
                    if (x10 != null) {
                        long longValue = x10.longValue();
                        if (longValue > 2147483647L) {
                            i6 = Integer.MAX_VALUE;
                        } else if (longValue < 0) {
                            i6 = 0;
                        } else {
                            i6 = (int) longValue;
                        }
                    } else {
                        i6 = -1;
                    }
                    this.f12944k = i6;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
    
        if (r9 > r16) goto L51;
     */
    /* JADX WARN: Type inference failed for: r4v0, types: [he.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final u6.e a() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.d.a():u6.e");
    }
}
