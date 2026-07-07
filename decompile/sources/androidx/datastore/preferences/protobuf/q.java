package androidx.datastore.preferences.protobuf;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f835c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f836a = w0.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f837b;

    static {
        new q(0);
    }

    public q() {
    }

    public static void b(l lVar, p1 p1Var, int i, Object obj) {
        if (p1Var == p1.f831y) {
            lVar.t0(i, 3);
            ((a) obj).b(lVar);
            lVar.t0(i, 4);
        }
        lVar.t0(i, p1Var.f834w);
        switch (p1Var.ordinal()) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                lVar.n0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                lVar.l0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                lVar.x0(((Long) obj).longValue());
                break;
            case 3:
                lVar.x0(((Long) obj).longValue());
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                lVar.p0(((Integer) obj).intValue());
                break;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                lVar.n0(((Long) obj).longValue());
                break;
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                lVar.l0(((Integer) obj).intValue());
                break;
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                lVar.f0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof g)) {
                    lVar.s0((String) obj);
                } else {
                    lVar.j0((g) obj);
                }
                break;
            case 9:
                ((a) obj).b(lVar);
                break;
            case 10:
                a aVar = (a) obj;
                lVar.getClass();
                lVar.v0(((v) aVar).a(null));
                aVar.b(lVar);
                break;
            case 11:
                if (!(obj instanceof g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    lVar.v0(length);
                    lVar.g0(bArr, 0, length);
                } else {
                    lVar.j0((g) obj);
                }
                break;
            case 12:
                lVar.v0(((Integer) obj).intValue());
                break;
            case 13:
                lVar.p0(((Integer) obj).intValue());
                break;
            case 14:
                lVar.l0(((Integer) obj).intValue());
                break;
            case 15:
                lVar.n0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                lVar.v0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                lVar.x0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f837b) {
            return;
        }
        w0 w0Var = this.f836a;
        int size = w0Var.f865v.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = w0Var.c(i);
            if (entryC.getValue() instanceof v) {
                v vVar = (v) entryC.getValue();
                vVar.getClass();
                r0 r0Var = r0.f848c;
                r0Var.getClass();
                r0Var.a(vVar.getClass()).d(vVar);
                vVar.h();
            }
        }
        if (!w0Var.f867x) {
            if (w0Var.f865v.size() > 0) {
                w0Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = w0Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!w0Var.f867x) {
            w0Var.f866w = w0Var.f866w.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(w0Var.f866w);
            w0Var.f869z = w0Var.f869z.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(w0Var.f869z);
            w0Var.f867x = true;
        }
        this.f837b = true;
    }

    public final Object clone() {
        q qVar = new q();
        w0 w0Var = this.f836a;
        if (w0Var.f865v.size() > 0) {
            Map.Entry entryC = w0Var.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = w0Var.d().iterator();
        if (!it.hasNext()) {
            return qVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.f836a.equals(((q) obj).f836a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f836a.hashCode();
    }

    public q(int i) {
        a();
        a();
    }
}
