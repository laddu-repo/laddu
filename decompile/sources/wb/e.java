package wb;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ub.f;
import ub.g;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements ub.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14270a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f14271b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f14272c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f14273d;

    /* renamed from: e, reason: collision with root package name */
    public final ub.d f14274e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14275f;

    public e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, a aVar, boolean z10) {
        this.f14271b = new JsonWriter(bufferedWriter);
        this.f14272c = hashMap;
        this.f14273d = hashMap2;
        this.f14274e = aVar;
        this.f14275f = z10;
    }

    @Override // ub.e
    public final ub.e a(ub.c cVar, long j) {
        String str = cVar.f13067a;
        h();
        JsonWriter jsonWriter = this.f14271b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j);
        return this;
    }

    @Override // ub.e
    public final ub.e b(ub.c cVar, int i6) {
        String str = cVar.f13067a;
        h();
        JsonWriter jsonWriter = this.f14271b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i6);
        return this;
    }

    @Override // ub.e
    public final ub.e c(ub.c cVar, Object obj) {
        g(obj, cVar.f13067a);
        return this;
    }

    @Override // ub.g
    public final g d(String str) {
        h();
        this.f14271b.value(str);
        return this;
    }

    @Override // ub.g
    public final g e(boolean z10) {
        h();
        this.f14271b.value(z10);
        return this;
    }

    public final e f(Object obj) {
        JsonWriter jsonWriter = this.f14271b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i6 = 0;
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                h();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i6 < length) {
                    jsonWriter.value(r7[i6]);
                    i6++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i6 < length2) {
                    long j = jArr[i6];
                    h();
                    jsonWriter.value(j);
                    i6++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i6 < length3) {
                    jsonWriter.value(dArr[i6]);
                    i6++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i6 < length4) {
                    jsonWriter.value(zArr[i6]);
                    i6++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i6 < length5) {
                    f(numberArr[i6]);
                    i6++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i6 < length6) {
                    f(objArr[i6]);
                    i6++;
                }
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            jsonWriter.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(it.next());
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    g(entry.getValue(), (String) key);
                } catch (ClassCastException e10) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                }
            }
            jsonWriter.endObject();
            return this;
        }
        ub.d dVar = (ub.d) this.f14272c.get(obj.getClass());
        if (dVar != null) {
            jsonWriter.beginObject();
            dVar.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        f fVar = (f) this.f14273d.get(obj.getClass());
        if (fVar != null) {
            fVar.a(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            String name = ((Enum) obj).name();
            h();
            jsonWriter.value(name);
            return this;
        }
        jsonWriter.beginObject();
        this.f14274e.a(obj, this);
        jsonWriter.endObject();
        return this;
    }

    public final e g(Object obj, String str) {
        boolean z10 = this.f14275f;
        JsonWriter jsonWriter = this.f14271b;
        if (z10) {
            if (obj == null) {
                return this;
            }
            h();
            jsonWriter.name(str);
            f(obj);
            return this;
        }
        h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        f(obj);
        return this;
    }

    public final void h() {
        if (this.f14270a) {
        } else {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
