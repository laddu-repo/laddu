package xb;

import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements ub.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f14705f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final ub.c f14706g = new ub.c("key", r4.a.s(r4.a.r(e.class, new a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final ub.c f14707h = new ub.c("value", r4.a.s(r4.a.r(e.class, new a(2))));

    /* renamed from: i, reason: collision with root package name */
    public static final wb.a f14708i = new wb.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f14709a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14710b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f14711c;

    /* renamed from: d, reason: collision with root package name */
    public final ub.d f14712d;

    /* renamed from: e, reason: collision with root package name */
    public final h f14713e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ub.d dVar) {
        this.f14709a = byteArrayOutputStream;
        this.f14710b = hashMap;
        this.f14711c = hashMap2;
        this.f14712d = dVar;
    }

    public static int g(ub.c cVar) {
        e eVar = (e) ((Annotation) cVar.f13068b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f14701a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // ub.e
    public final ub.e a(ub.c cVar, long j) {
        if (j == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f13068b.get(e.class));
        if (eVar != null) {
            h(((a) eVar).f14701a << 3);
            i(j);
            return this;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // ub.e
    public final ub.e b(ub.c cVar, int i6) {
        d(cVar, i6, true);
        return this;
    }

    @Override // ub.e
    public final ub.e c(ub.c cVar, Object obj) {
        e(cVar, obj, true);
        return this;
    }

    public final void d(ub.c cVar, int i6, boolean z10) {
        if (z10 && i6 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f13068b.get(e.class));
        if (eVar != null) {
            h(((a) eVar).f14701a << 3);
            h(i6);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void e(ub.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    h((g(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f14705f);
                    h(bytes.length);
                    this.f14709a.write(bytes);
                    return;
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    e(cVar, it.next(), false);
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    f(f14708i, cVar, (Map.Entry) it2.next(), false);
                }
                return;
            }
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (!z10 || doubleValue != 0.0d) {
                    h((g(cVar) << 3) | 1);
                    this.f14709a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    h((g(cVar) << 3) | 5);
                    this.f14709a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    e eVar = (e) ((Annotation) cVar.f13068b.get(e.class));
                    if (eVar != null) {
                        h(((a) eVar).f14701a << 3);
                        i(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
                return;
            }
            if (obj instanceof Boolean) {
                d(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z10 && bArr.length == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                h(bArr.length);
                this.f14709a.write(bArr);
                return;
            }
            ub.d dVar = (ub.d) this.f14710b.get(obj.getClass());
            if (dVar != null) {
                f(dVar, cVar, obj, z10);
                return;
            }
            ub.f fVar = (ub.f) this.f14711c.get(obj.getClass());
            if (fVar != null) {
                h hVar = this.f14713e;
                hVar.f14715a = false;
                hVar.f14717c = cVar;
                hVar.f14716b = z10;
                fVar.a(obj, hVar);
                return;
            }
            if (obj instanceof c) {
                d(cVar, ((c) obj).getNumber(), true);
            } else if (obj instanceof Enum) {
                d(cVar, ((Enum) obj).ordinal(), true);
            } else {
                f(this.f14712d, cVar, obj, z10);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, xb.b] */
    public final void f(ub.d dVar, ub.c cVar, Object obj, boolean z10) {
        ?? outputStream = new OutputStream();
        outputStream.f14702x = 0L;
        try {
            OutputStream outputStream2 = this.f14709a;
            this.f14709a = outputStream;
            try {
                dVar.a(obj, this);
                this.f14709a = outputStream2;
                long j = outputStream.f14702x;
                outputStream.close();
                if (z10 && j == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(j);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f14709a = outputStream2;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                outputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i6) {
        while ((i6 & (-128)) != 0) {
            this.f14709a.write((i6 & 127) | 128);
            i6 >>>= 7;
        }
        this.f14709a.write(i6 & 127);
    }

    public final void i(long j) {
        while (((-128) & j) != 0) {
            this.f14709a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f14709a.write(((int) j) & 127);
    }
}
