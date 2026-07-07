package ib;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f implements fb.e {
    public static final Charset f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fb.c f6590g = new fb.c("key", j4.a.q(j4.a.p(e.class, new a(1))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final fb.c f6591h = new fb.c("value", j4.a.q(j4.a.p(e.class, new a(2))));
    public static final hb.a i = new hb.a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f6592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f6593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f6594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fb.d f6595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f6596e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, fb.d dVar) {
        this.f6592a = byteArrayOutputStream;
        this.f6593b = map;
        this.f6594c = map2;
        this.f6595d = dVar;
    }

    public static int j(fb.c cVar) {
        e eVar = (e) ((Annotation) cVar.f5356b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f6586b;
        }
        throw new fb.b("Field has no @Protobuf config");
    }

    @Override // fb.e
    public final fb.e a(fb.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    @Override // fb.e
    public final fb.e b(fb.c cVar, boolean z2) {
        e(cVar, z2 ? 1 : 0, true);
        return this;
    }

    public final void c(fb.c cVar, double d10, boolean z2) throws IOException {
        if (z2 && d10 == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f6592a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d10).array());
    }

    @Override // fb.e
    public final fb.e d(fb.c cVar, double d10) throws IOException {
        c(cVar, d10, true);
        return this;
    }

    public final void e(fb.c cVar, int i10, boolean z2) {
        if (z2 && i10 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f5356b.get(e.class));
        if (eVar == null) {
            throw new fb.b("Field has no @Protobuf config");
        }
        k(((a) eVar).f6586b << 3);
        k(i10);
    }

    @Override // fb.e
    public final fb.e f(fb.c cVar, int i10) {
        e(cVar, i10, true);
        return this;
    }

    @Override // fb.e
    public final fb.e g(fb.c cVar, long j8) throws IOException {
        if (j8 == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f5356b.get(e.class));
        if (eVar == null) {
            throw new fb.b("Field has no @Protobuf config");
        }
        k(((a) eVar).f6586b << 3);
        l(j8);
        return this;
    }

    public final void h(fb.c cVar, Object obj, boolean z2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z2 && charSequence.length() == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            k(bytes.length);
            this.f6592a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            c(cVar, ((Double) obj).doubleValue(), z2);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z2 && fFloatValue == 0.0f) {
                return;
            }
            k((j(cVar) << 3) | 5);
            this.f6592a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z2 && jLongValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.f5356b.get(e.class));
            if (eVar == null) {
                throw new fb.b("Field has no @Protobuf config");
            }
            k(((a) eVar).f6586b << 3);
            l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            e(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z2);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z2 && bArr.length == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            k(bArr.length);
            this.f6592a.write(bArr);
            return;
        }
        fb.d dVar = (fb.d) this.f6593b.get(obj.getClass());
        if (dVar != null) {
            i(dVar, cVar, obj, z2);
            return;
        }
        fb.f fVar = (fb.f) this.f6594c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f6596e;
            hVar.f6598a = false;
            hVar.f6600c = cVar;
            hVar.f6599b = z2;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            e(cVar, ((c) obj).a(), true);
        } else if (obj instanceof Enum) {
            e(cVar, ((Enum) obj).ordinal(), true);
        } else {
            i(this.f6595d, cVar, obj, z2);
        }
    }

    public final void i(fb.d dVar, fb.c cVar, Object obj, boolean z2) throws IOException {
        b bVar = new b();
        bVar.f6587v = 0L;
        try {
            OutputStream outputStream = this.f6592a;
            this.f6592a = bVar;
            try {
                dVar.a(obj, this);
                this.f6592a = outputStream;
                long j8 = bVar.f6587v;
                bVar.close();
                if (z2 && j8 == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                l(j8);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f6592a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f6592a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f6592a.write(i10 & 127);
    }

    public final void l(long j8) throws IOException {
        while (((-128) & j8) != 0) {
            this.f6592a.write((((int) j8) & 127) | 128);
            j8 >>>= 7;
        }
        this.f6592a.write(((int) j8) & 127);
    }
}
