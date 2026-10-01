package l4;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends g0 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8113r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i6, boolean z10) {
        super(z10);
        this.f8113r = i6;
    }

    @Override // l4.g0
    public final Object a(String key, Bundle bundle) {
        switch (this.f8113r) {
            case 0:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                if (!bundle.containsKey(key) || a8.i.p(key, bundle)) {
                    return null;
                }
                boolean z10 = bundle.getBoolean(key, false);
                if (!z10 && bundle.getBoolean(key, true)) {
                    android.support.v4.media.session.b.m(key);
                    throw null;
                }
                return Boolean.valueOf(z10);
            case 1:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                float f3 = bundle.getFloat(key, Float.MIN_VALUE);
                if (f3 == Float.MIN_VALUE && bundle.getFloat(key, Float.MAX_VALUE) == Float.MAX_VALUE) {
                    android.support.v4.media.session.b.m(key);
                    throw null;
                }
                return Float.valueOf(f3);
            case 2:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                return Integer.valueOf(a8.i.m(key, bundle));
            case 3:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                long j = bundle.getLong(key, Long.MIN_VALUE);
                if (j == Long.MIN_VALUE && bundle.getLong(key, Long.MAX_VALUE) == Long.MAX_VALUE) {
                    android.support.v4.media.session.b.m(key);
                    throw null;
                }
                return Long.valueOf(j);
            case 4:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                return Integer.valueOf(a8.i.m(key, bundle));
            default:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                if (!bundle.containsKey(key) || a8.i.p(key, bundle)) {
                    return null;
                }
                String string = bundle.getString(key);
                if (string != null) {
                    return string;
                }
                android.support.v4.media.session.b.m(key);
                throw null;
        }
    }

    @Override // l4.g0
    public final String b() {
        switch (this.f8113r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // l4.g0
    public final Object d(String value) {
        boolean z10;
        int parseInt;
        String str;
        long parseLong;
        int parseInt2;
        switch (this.f8113r) {
            case 0:
                kotlin.jvm.internal.k.e(value, "value");
                if (value.equals("true")) {
                    z10 = true;
                } else if (value.equals("false")) {
                    z10 = false;
                } else {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                return Boolean.valueOf(z10);
            case 1:
                kotlin.jvm.internal.k.e(value, "value");
                return Float.valueOf(Float.parseFloat(value));
            case 2:
                kotlin.jvm.internal.k.e(value, "value");
                if (df.u.H(value, "0x", false)) {
                    String substring = value.substring(2);
                    kotlin.jvm.internal.k.d(substring, "substring(...)");
                    a.a.g(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(value);
                }
                return Integer.valueOf(parseInt);
            case 3:
                kotlin.jvm.internal.k.e(value, "value");
                if (df.u.z(value, "L", false)) {
                    str = value.substring(0, value.length() - 1);
                    kotlin.jvm.internal.k.d(str, "substring(...)");
                } else {
                    str = value;
                }
                if (df.u.H(value, "0x", false)) {
                    String substring2 = str.substring(2);
                    kotlin.jvm.internal.k.d(substring2, "substring(...)");
                    a.a.g(16);
                    parseLong = Long.parseLong(substring2, 16);
                } else {
                    parseLong = Long.parseLong(str);
                }
                return Long.valueOf(parseLong);
            case 4:
                kotlin.jvm.internal.k.e(value, "value");
                if (df.u.H(value, "0x", false)) {
                    String substring3 = value.substring(2);
                    kotlin.jvm.internal.k.d(substring3, "substring(...)");
                    a.a.g(16);
                    parseInt2 = Integer.parseInt(substring3, 16);
                } else {
                    parseInt2 = Integer.parseInt(value);
                }
                return Integer.valueOf(parseInt2);
            default:
                kotlin.jvm.internal.k.e(value, "value");
                if (value.equals("null")) {
                    return null;
                }
                return value;
        }
    }

    @Override // l4.g0
    public final void e(Bundle bundle, String key, Object obj) {
        switch (this.f8113r) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                kotlin.jvm.internal.k.e(key, "key");
                bundle.putBoolean(key, booleanValue);
                return;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                kotlin.jvm.internal.k.e(key, "key");
                bundle.putFloat(key, floatValue);
                return;
            case 2:
                int intValue = ((Number) obj).intValue();
                kotlin.jvm.internal.k.e(key, "key");
                bundle.putInt(key, intValue);
                return;
            case 3:
                long longValue = ((Number) obj).longValue();
                kotlin.jvm.internal.k.e(key, "key");
                bundle.putLong(key, longValue);
                return;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                kotlin.jvm.internal.k.e(key, "key");
                bundle.putInt(key, intValue2);
                return;
            default:
                String str = (String) obj;
                kotlin.jvm.internal.k.e(key, "key");
                if (str != null) {
                    c9.a.n(key, str, bundle);
                    return;
                } else {
                    c9.a.l(key, bundle);
                    return;
                }
        }
    }

    @Override // l4.g0
    public String f(Object obj) {
        switch (this.f8113r) {
            case 5:
                String s = (String) obj;
                if (s != null) {
                    kotlin.jvm.internal.k.e(s, "s");
                    String encode = Uri.encode(s, null);
                    kotlin.jvm.internal.k.d(encode, "encode(...)");
                    return encode;
                }
                return "null";
            default:
                return super.f(obj);
        }
    }
}
