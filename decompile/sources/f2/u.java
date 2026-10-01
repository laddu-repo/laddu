package f2;

import android.os.Build;
import java.util.UUID;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u implements y1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f4684c;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f4685a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4686b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f4684c = z10;
            }
        }
        z10 = false;
        f4684c = z10;
    }

    public u(UUID uuid, byte[] bArr) {
        this.f4685a = uuid;
        this.f4686b = bArr;
    }
}
