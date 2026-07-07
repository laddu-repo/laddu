package kb;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f7804g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f7805h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public final String f7806a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7807b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7808c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f7809d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7810e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7811f;

    public b(String str, String str2, String str3, Date date, long j, long j10) {
        this.f7806a = str;
        this.f7807b = str2;
        this.f7808c = str3;
        this.f7809d = date;
        this.f7810e = j;
        this.f7811f = j10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nb.a, java.lang.Object] */
    public final nb.a a() {
        ?? obj = new Object();
        obj.f9573a = "frc";
        obj.f9584m = this.f7809d.getTime();
        obj.f9574b = this.f7806a;
        obj.f9575c = this.f7807b;
        String str = this.f7808c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        obj.f9576d = str;
        obj.f9577e = this.f7810e;
        obj.j = this.f7811f;
        return obj;
    }
}
