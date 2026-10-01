package i4;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: d, reason: collision with root package name */
    public static final db.c1 f6487d = db.k0.o(40010);

    /* renamed from: e, reason: collision with root package name */
    public static final db.c1 f6488e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f6489f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f6490g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f6491h;

    /* renamed from: a, reason: collision with root package name */
    public final int f6492a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6493b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f6494c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        db.r.c(7, objArr);
        f6488e = db.k0.h(7, objArr);
        String str = u1.a0.f12750a;
        f6489f = Integer.toString(0, 36);
        f6490g = Integer.toString(1, 36);
        f6491h = Integer.toString(2, 36);
    }

    public o1(int i6) {
        u1.c.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i6 != 0);
        this.f6492a = i6;
        this.f6493b = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f6494c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        if (this.f6492a != o1Var.f6492a || !TextUtils.equals(this.f6493b, o1Var.f6493b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f6493b, Integer.valueOf(this.f6492a));
    }

    public o1(String str, Bundle bundle) {
        this.f6492a = 0;
        this.f6493b = str;
        bundle.getClass();
        this.f6494c = new Bundle(bundle);
    }
}
