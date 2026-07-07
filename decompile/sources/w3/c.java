package w3;

import a2.a2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import u1.t;
import v3.j;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: i, reason: collision with root package name */
    public final int f13740i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f13741k;

    /* renamed from: o, reason: collision with root package name */
    public List f13745o;

    /* renamed from: p, reason: collision with root package name */
    public List f13746p;

    /* renamed from: q, reason: collision with root package name */
    public int f13747q;

    /* renamed from: r, reason: collision with root package name */
    public int f13748r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13749t;

    /* renamed from: u, reason: collision with root package name */
    public byte f13750u;

    /* renamed from: v, reason: collision with root package name */
    public byte f13751v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13753x;

    /* renamed from: y, reason: collision with root package name */
    public long f13754y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f13738z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, WebSocketProtocol.PAYLOAD_SHORT, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h, reason: collision with root package name */
    public final t f13739h = new t();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f13743m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public b f13744n = new b(0, 4);

    /* renamed from: w, reason: collision with root package name */
    public int f13752w = 0;

    /* renamed from: l, reason: collision with root package name */
    public final long f13742l = 16000000;

    public c(String str, int i6) {
        int i10;
        if ("application/x-mp4-cea-608".equals(str)) {
            i10 = 2;
        } else {
            i10 = 3;
        }
        this.f13740i = i10;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        u1.a.p("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f13741k = 0;
                        this.j = 0;
                    } else {
                        this.f13741k = 1;
                        this.j = 1;
                    }
                } else {
                    this.f13741k = 0;
                    this.j = 1;
                }
            } else {
                this.f13741k = 1;
                this.j = 0;
            }
        } else {
            this.f13741k = 0;
            this.j = 0;
        }
        m(0);
        l();
        this.f13753x = true;
        this.f13754y = -9223372036854775807L;
    }

    @Override // w3.i, y1.e
    public final void flush() {
        super.flush();
        this.f13745o = null;
        this.f13746p = null;
        m(0);
        this.f13748r = 4;
        this.f13744n.f13737h = 4;
        l();
        this.s = false;
        this.f13749t = false;
        this.f13750u = (byte) 0;
        this.f13751v = (byte) 0;
        this.f13752w = 0;
        this.f13753x = true;
        this.f13754y = -9223372036854775807L;
    }

    @Override // w3.i
    public final a2 g() {
        List list = this.f13745o;
        this.f13746p = list;
        list.getClass();
        return new a2(list, 28);
    }

    @Override // y1.e
    public final String getName() {
        return "Cea608Decoder";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x01c5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // w3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(w3.g r15) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.c.h(w3.g):void");
    }

    @Override // w3.i, y1.e
    /* renamed from: i */
    public final j d() {
        j jVar;
        j d10 = super.d();
        if (d10 != null) {
            return d10;
        }
        long j = this.f13742l;
        if (j != -9223372036854775807L) {
            long j10 = this.f13754y;
            if (j10 != -9223372036854775807L && this.f13796e - j10 >= j && (jVar = (j) this.f13793b.pollFirst()) != null) {
                this.f13745o = Collections.EMPTY_LIST;
                this.f13754y = -9223372036854775807L;
                a2 g10 = g();
                long j11 = this.f13796e;
                jVar.timeUs = j11;
                jVar.f13280x = g10;
                jVar.f13281y = j11;
                return jVar;
            }
            return null;
        }
        return null;
    }

    @Override // w3.i
    public final boolean j() {
        if (this.f13745o != this.f13746p) {
            return true;
        }
        return false;
    }

    public final ArrayList k() {
        ArrayList arrayList = this.f13743m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i6 = 2;
        for (int i10 = 0; i10 < size; i10++) {
            t1.b c10 = ((b) arrayList.get(i10)).c(Integer.MIN_VALUE);
            arrayList2.add(c10);
            if (c10 != null) {
                i6 = Math.min(i6, c10.f12466i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            t1.b bVar = (t1.b) arrayList2.get(i11);
            if (bVar != null) {
                if (bVar.f12466i != i6) {
                    bVar = ((b) arrayList.get(i11)).c(i6);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void l() {
        b bVar = this.f13744n;
        bVar.f13736g = this.f13747q;
        bVar.f13730a.clear();
        bVar.f13731b.clear();
        bVar.f13732c.setLength(0);
        bVar.f13733d = 15;
        bVar.f13734e = 0;
        bVar.f13735f = 0;
        ArrayList arrayList = this.f13743m;
        arrayList.clear();
        arrayList.add(this.f13744n);
    }

    public final void m(int i6) {
        int i10 = this.f13747q;
        if (i10 != i6) {
            this.f13747q = i6;
            if (i6 == 3) {
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f13743m;
                    if (i11 < arrayList.size()) {
                        ((b) arrayList.get(i11)).f13736g = i6;
                        i11++;
                    } else {
                        return;
                    }
                }
            } else {
                l();
                if (i10 != 3 && i6 != 1 && i6 != 0) {
                    return;
                }
                this.f13745o = Collections.EMPTY_LIST;
            }
        }
    }

    @Override // w3.i, y1.e
    public final void a() {
    }
}
