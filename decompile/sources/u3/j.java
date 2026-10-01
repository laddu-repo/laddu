package u3;

import ef.l;
import java.util.ArrayDeque;
import w1.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class j implements t3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f12883a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f12884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f12885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f12886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12887e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12888g;

    public j() {
        for (int i = 0; i < 10; i++) {
            this.f12883a.add(new h(1));
        }
        this.f12884b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.f12884b;
            pa.a aVar = new pa.a(13, this);
            i iVar = new i();
            iVar.f12882x = aVar;
            arrayDeque.add(iVar);
        }
        this.f12885c = new ArrayDeque();
        this.f12888g = -9223372036854775807L;
    }

    @Override // t3.e
    public final void a(long j8) {
        this.f12887e = j8;
    }

    public abstract l b();

    public abstract void c(h hVar);

    @Override // a2.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public t3.j dequeueOutputBuffer() {
        ArrayDeque arrayDeque = this.f12884b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f12885c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            h hVar = (h) arrayDeque2.peek();
            int i = b0.f13686a;
            if (hVar.timeUs > this.f12887e) {
                return null;
            }
            h hVar2 = (h) arrayDeque2.poll();
            boolean zIsEndOfStream = hVar2.isEndOfStream();
            ArrayDeque arrayDeque3 = this.f12883a;
            if (zIsEndOfStream) {
                t3.j jVar = (t3.j) arrayDeque.pollFirst();
                jVar.addFlag(4);
                hVar2.clear();
                arrayDeque3.add(hVar2);
                return jVar;
            }
            c(hVar2);
            if (e()) {
                l lVarB = b();
                t3.j jVar2 = (t3.j) arrayDeque.pollFirst();
                long j8 = hVar2.timeUs;
                jVar2.timeUs = j8;
                jVar2.f12210v = lVarB;
                jVar2.f12211w = j8;
                hVar2.clear();
                arrayDeque3.add(hVar2);
                return jVar2;
            }
            hVar2.clear();
            arrayDeque3.add(hVar2);
        }
    }

    @Override // a2.e
    public final Object dequeueInputBuffer() {
        w1.a.j(this.f12886d == null);
        ArrayDeque arrayDeque = this.f12883a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        h hVar = (h) arrayDeque.pollFirst();
        this.f12886d = hVar;
        return hVar;
    }

    public abstract boolean e();

    @Override // a2.e
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.f12887e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f12885c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f12883a;
            if (zIsEmpty) {
                break;
            }
            h hVar = (h) arrayDeque2.poll();
            int i = b0.f13686a;
            hVar.clear();
            arrayDeque.add(hVar);
        }
        h hVar2 = this.f12886d;
        if (hVar2 != null) {
            hVar2.clear();
            arrayDeque.add(hVar2);
            this.f12886d = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // a2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void queueInputBuffer(java.lang.Object r7) {
        /*
            r6 = this;
            t3.i r7 = (t3.i) r7
            u3.h r0 = r6.f12886d
            if (r7 != r0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            w1.a.d(r0)
            u3.h r7 = (u3.h) r7
            boolean r0 = r7.isEndOfStream()
            if (r0 != 0) goto L34
            long r0 = r7.timeUs
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L34
            long r2 = r6.f12888g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L34
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L34
            r7.clear()
            java.util.ArrayDeque r0 = r6.f12883a
            r0.add(r7)
            goto L42
        L34:
            long r0 = r6.f
            r2 = 1
            long r2 = r2 + r0
            r6.f = r2
            r7.f12881w = r0
            java.util.ArrayDeque r0 = r6.f12885c
            r0.add(r7)
        L42:
            r7 = 0
            r6.f12886d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.j.queueInputBuffer(java.lang.Object):void");
    }

    @Override // a2.e
    public final void setOutputStartTimeUs(long j8) {
        this.f12888g = j8;
    }

    @Override // a2.e
    public void release() {
    }
}
