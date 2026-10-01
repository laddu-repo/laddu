package md;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import m5.m;
import y9.c0;
import y9.f0;
import y9.p;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements p5.e, q2.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f8644v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f8645w;

    public c(ArrayList arrayList) {
        this.f8644v = 2;
        this.f8645w = arrayList;
    }

    @Override // q2.a
    public f0 a(long j8) {
        int iJ = j(j8);
        if (iJ == 0) {
            c0 c0Var = f0.f14553w;
            return z0.f14637z;
        }
        t3.a aVar = (t3.a) this.f8645w.get(iJ - 1);
        long j9 = aVar.f12194d;
        if (j9 == -9223372036854775807L || j8 < j9) {
            return aVar.f12191a;
        }
        c0 c0Var2 = f0.f14553w;
        return z0.f14637z;
    }

    @Override // q2.a
    public long b(long j8) {
        ArrayList arrayList = this.f8645w;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j8 < ((t3.a) arrayList.get(0)).f12192b) {
            return ((t3.a) arrayList.get(0)).f12192b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            t3.a aVar = (t3.a) arrayList.get(i);
            long j9 = aVar.f12192b;
            long j10 = aVar.f12192b;
            if (j8 < j9) {
                long j11 = ((t3.a) arrayList.get(i - 1)).f12194d;
                return (j11 == -9223372036854775807L || j11 <= j8 || j11 >= j10) ? j10 : j11;
            }
        }
        long j12 = ((t3.a) p.l(arrayList)).f12194d;
        if (j12 == -9223372036854775807L || j8 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // q2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(t3.a r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f12192b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            w1.a.d(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.f12194d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.util.ArrayList r3 = r9.f8645w
            int r4 = r3.size()
            int r4 = r4 - r6
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r7 = r3.get(r4)
            t3.a r7 = (t3.a) r7
            long r7 = r7.f12192b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            int r4 = r4 + r6
            r3.add(r4, r10)
            return r2
        L3e:
            java.lang.Object r7 = r3.get(r4)
            t3.a r7 = (t3.a) r7
            long r7 = r7.f12192b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4b
            r2 = r5
        L4b:
            int r4 = r4 + (-1)
            goto L2b
        L4e:
            r3.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: md.c.c(t3.a, long):boolean");
    }

    @Override // q2.a
    public void clear() {
        switch (this.f8644v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ArrayList arrayList = this.f8645w;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (obj != null) {
                        throw new ClassCastException();
                    }
                    try {
                        throw null;
                    } catch (Exception e7) {
                        k.f8671d.log(Level.WARNING, "could not delete file ", (Throwable) e7);
                    }
                }
                arrayList.clear();
                return;
            default:
                this.f8645w.clear();
                return;
        }
    }

    @Override // q2.a
    public long d(long j8) {
        ArrayList arrayList = this.f8645w;
        if (arrayList.isEmpty() || j8 < ((t3.a) arrayList.get(0)).f12192b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j9 = ((t3.a) arrayList.get(i)).f12192b;
            if (j8 == j9) {
                return j9;
            }
            if (j8 < j9) {
                t3.a aVar = (t3.a) arrayList.get(i - 1);
                long j10 = aVar.f12194d;
                return (j10 == -9223372036854775807L || j10 > j8) ? aVar.f12192b : j10;
            }
        }
        t3.a aVar2 = (t3.a) p.l(arrayList);
        long j11 = aVar2.f12194d;
        return (j11 == -9223372036854775807L || j8 < j11) ? aVar2.f12192b : j11;
    }

    @Override // q2.a
    public void e(long j8) {
        int iJ = j(j8);
        if (iJ == 0) {
            return;
        }
        ArrayList arrayList = this.f8645w;
        long j9 = ((t3.a) arrayList.get(iJ - 1)).f12194d;
        if (j9 == -9223372036854775807L || j9 >= j8) {
            iJ--;
        }
        arrayList.subList(0, iJ).clear();
    }

    @Override // p5.e
    public m5.e f() {
        ArrayList arrayList = this.f8645w;
        return ((w5.a) arrayList.get(0)).c() ? new m5.j(1, arrayList) : new m(arrayList);
    }

    public synchronized o6.a g(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return o6.c.f9961w;
        }
        ArrayList arrayList = this.f8645w;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o6.b bVar = (o6.b) obj;
            if (bVar.f9958a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f9959b)) {
                return bVar.f9960c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @Override // p5.e
    public List h() {
        return this.f8645w;
    }

    @Override // p5.e
    public boolean i() {
        ArrayList arrayList = this.f8645w;
        return arrayList.size() == 1 && ((w5.a) arrayList.get(0)).c();
    }

    public int j(long j8) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8645w;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j8 < ((t3.a) arrayList.get(i)).f12192b) {
                return i;
            }
            i++;
        }
    }

    public synchronized ArrayList k(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        ArrayList arrayList2 = this.f8645w;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            o6.b bVar = (o6.b) obj;
            if ((bVar.f9958a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f9959b)) && !arrayList.contains(bVar.f9959b)) {
                arrayList.add(bVar.f9959b);
            }
        }
        return arrayList;
    }

    public c(int i) {
        this.f8644v = i;
        switch (i) {
            case 1:
                this.f8645w = new ArrayList();
                break;
            case 2:
            default:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f8645w = new ArrayList();
                break;
            case 3:
                this.f8645w = new ArrayList();
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                this.f8645w = new ArrayList();
                break;
        }
    }
}
