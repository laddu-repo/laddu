package u3;

import ef.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w1.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j {
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f12824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f12825k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f12829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f12830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f12835u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte f12836v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12838x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f12839y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f12822z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f12823h = new t();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f12827m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f12828n = new b(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12837w = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f12826l = 16000000;

    public c(int i, String str) {
        this.i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f12825k = 0;
            this.f12824j = 0;
        } else if (i == 2) {
            this.f12825k = 1;
            this.f12824j = 0;
        } else if (i == 3) {
            this.f12825k = 0;
            this.f12824j = 1;
        } else if (i != 4) {
            w1.a.C("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f12825k = 0;
            this.f12824j = 0;
        } else {
            this.f12825k = 1;
            this.f12824j = 1;
        }
        h(0);
        g();
        this.f12838x = true;
        this.f12839y = -9223372036854775807L;
    }

    @Override // u3.j
    public final l b() {
        List list = this.f12829o;
        this.f12830p = list;
        list.getClass();
        return new l(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // u3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(u3.h r15) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.c.c(u3.h):void");
    }

    @Override // u3.j, a2.e
    /* JADX INFO: renamed from: d */
    public final t3.j dequeueOutputBuffer() {
        t3.j jVar;
        t3.j jVarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (jVarDequeueOutputBuffer != null) {
            return jVarDequeueOutputBuffer;
        }
        long j8 = this.f12826l;
        if (j8 == -9223372036854775807L) {
            return null;
        }
        long j9 = this.f12839y;
        if (j9 == -9223372036854775807L || this.f12887e - j9 < j8 || (jVar = (t3.j) this.f12884b.pollFirst()) == null) {
            return null;
        }
        this.f12829o = Collections.EMPTY_LIST;
        this.f12839y = -9223372036854775807L;
        l lVarB = b();
        long j10 = this.f12887e;
        jVar.timeUs = j10;
        jVar.f12210v = lVarB;
        jVar.f12211w = j10;
        return jVar;
    }

    @Override // u3.j
    public final boolean e() {
        return this.f12829o != this.f12830p;
    }

    public final ArrayList f() {
        ArrayList arrayList = this.f12827m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            v1.b bVarC = ((b) arrayList.get(i)).c(Integer.MIN_VALUE);
            arrayList2.add(bVarC);
            if (bVarC != null) {
                iMin = Math.min(iMin, bVarC.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            v1.b bVarC2 = (v1.b) arrayList2.get(i10);
            if (bVarC2 != null) {
                if (bVarC2.i != iMin) {
                    bVarC2 = ((b) arrayList.get(i10)).c(iMin);
                    bVarC2.getClass();
                }
                arrayList3.add(bVarC2);
            }
        }
        return arrayList3;
    }

    @Override // u3.j, a2.e
    public final void flush() {
        super.flush();
        this.f12829o = null;
        this.f12830p = null;
        h(0);
        this.f12832r = 4;
        this.f12828n.f12821h = 4;
        g();
        this.f12833s = false;
        this.f12834t = false;
        this.f12835u = (byte) 0;
        this.f12836v = (byte) 0;
        this.f12837w = 0;
        this.f12838x = true;
        this.f12839y = -9223372036854775807L;
    }

    public final void g() {
        b bVar = this.f12828n;
        bVar.f12820g = this.f12831q;
        bVar.f12815a.clear();
        bVar.f12816b.clear();
        bVar.f12817c.setLength(0);
        bVar.f12818d = 15;
        bVar.f12819e = 0;
        bVar.f = 0;
        ArrayList arrayList = this.f12827m;
        arrayList.clear();
        arrayList.add(this.f12828n);
    }

    public final void h(int i) {
        int i10 = this.f12831q;
        if (i10 == i) {
            return;
        }
        this.f12831q = i;
        if (i != 3) {
            g();
            if (i10 == 3 || i == 1 || i == 0) {
                this.f12829o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f12827m;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i11)).f12820g = i;
            i11++;
        }
    }

    @Override // u3.j, a2.e
    public final void release() {
    }
}
