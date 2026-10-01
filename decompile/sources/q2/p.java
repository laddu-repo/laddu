package q2;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p implements w8.d {
    public final Object A;
    public Object B;
    public Object C;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10924x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f10925y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f10926z;

    public p(v8.d dVar, u8.a aVar, v8.a aVar2) {
        this.C = dVar;
        this.A = null;
        this.B = null;
        this.f10924x = false;
        this.f10925y = aVar;
        this.f10926z = aVar2;
    }

    @Override // w8.d
    public void a(t8.b bVar) {
        ((v8.d) this.C).J.post(new rb.i(this, bVar, 12, false));
    }

    public cb.l b(int i6) {
        cb.l lVar;
        cb.l lVar2;
        HashMap hashMap = (HashMap) this.f10926z;
        cb.l lVar3 = (cb.l) hashMap.get(Integer.valueOf(i6));
        if (lVar3 != null) {
            return lVar3;
        }
        final w1.g gVar = (w1.g) this.B;
        gVar.getClass();
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            final int i10 = 3;
                            lVar2 = new cb.l() { // from class: q2.o
                                @Override // cb.l
                                public final Object get() {
                                    switch (i10) {
                                        case 0:
                                            return q.e((Class) this, gVar);
                                        case 1:
                                            return q.e((Class) this, gVar);
                                        case 2:
                                            return q.e((Class) this, gVar);
                                        default:
                                            return new t0(gVar, (y2.m) ((p) this).f10925y);
                                    }
                                }
                            };
                        } else {
                            throw new IllegalArgumentException(h8.c.i(i6, "Unrecognized contentType: "));
                        }
                    } else {
                        lVar2 = new a2.e(RtspMediaSource$Factory.class.asSubclass(b0.class), 3);
                    }
                    hashMap.put(Integer.valueOf(i6), lVar2);
                    return lVar2;
                }
                final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(b0.class);
                final int i11 = 2;
                lVar = new cb.l() { // from class: q2.o
                    @Override // cb.l
                    public final Object get() {
                        switch (i11) {
                            case 0:
                                return q.e((Class) asSubclass, gVar);
                            case 1:
                                return q.e((Class) asSubclass, gVar);
                            case 2:
                                return q.e((Class) asSubclass, gVar);
                            default:
                                return new t0(gVar, (y2.m) ((p) asSubclass).f10925y);
                        }
                    }
                };
            } else {
                final Class asSubclass2 = SsMediaSource$Factory.class.asSubclass(b0.class);
                final int i12 = 1;
                lVar = new cb.l() { // from class: q2.o
                    @Override // cb.l
                    public final Object get() {
                        switch (i12) {
                            case 0:
                                return q.e((Class) asSubclass2, gVar);
                            case 1:
                                return q.e((Class) asSubclass2, gVar);
                            case 2:
                                return q.e((Class) asSubclass2, gVar);
                            default:
                                return new t0(gVar, (y2.m) ((p) asSubclass2).f10925y);
                        }
                    }
                };
            }
        } else {
            final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(b0.class);
            final int i13 = 0;
            lVar = new cb.l() { // from class: q2.o
                @Override // cb.l
                public final Object get() {
                    switch (i13) {
                        case 0:
                            return q.e((Class) asSubclass3, gVar);
                        case 1:
                            return q.e((Class) asSubclass3, gVar);
                        case 2:
                            return q.e((Class) asSubclass3, gVar);
                        default:
                            return new t0(gVar, (y2.m) ((p) asSubclass3).f10925y);
                    }
                }
            };
        }
        lVar2 = lVar;
        hashMap.put(Integer.valueOf(i6), lVar2);
        return lVar2;
    }

    public void c(t8.b bVar) {
        v8.j jVar = (v8.j) ((v8.d) this.C).G.get((v8.a) this.f10926z);
        if (jVar != null) {
            w8.x.c(jVar.f13462o.J);
            u8.a aVar = jVar.f13454f;
            aVar.d("onSignInFailed for " + aVar.getClass().getName() + " with " + String.valueOf(bVar));
            jVar.n(bVar, null);
        }
    }

    public p(y2.m mVar, p.l lVar) {
        this.f10925y = mVar;
        this.C = lVar;
        this.f10926z = new HashMap();
        this.A = new HashMap();
        this.f10924x = true;
    }
}
