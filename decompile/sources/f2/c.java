package f2;

import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import db.i0;
import db.k0;
import j4.b0;
import j4.d0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4639a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4640b;

    public /* synthetic */ c() {
        this.f4639a = 2;
    }

    private final void a(Message message) {
        j2.g gVar = (j2.g) this.f4640b;
        int i6 = message.what;
        j2.f fVar = null;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        AtomicReference atomicReference = gVar.f7068d;
                        IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                        while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                        }
                    } else {
                        try {
                            gVar.f7065a.setParameters((Bundle) message.obj);
                        } catch (RuntimeException e10) {
                            AtomicReference atomicReference2 = gVar.f7068d;
                            while (!atomicReference2.compareAndSet(null, e10) && atomicReference2.get() == null) {
                            }
                        }
                    }
                } else {
                    gVar.f7069e.e();
                }
            } else {
                j2.f fVar2 = (j2.f) message.obj;
                int i10 = fVar2.f7058a;
                MediaCodec.CryptoInfo cryptoInfo = fVar2.f7060c;
                long j = fVar2.f7061d;
                int i11 = fVar2.f7062e;
                try {
                    synchronized (j2.g.f7064h) {
                        gVar.f7065a.queueSecureInputBuffer(i10, 0, cryptoInfo, j, i11);
                    }
                } catch (RuntimeException e11) {
                    AtomicReference atomicReference3 = gVar.f7068d;
                    while (!atomicReference3.compareAndSet(null, e11) && atomicReference3.get() == null) {
                    }
                }
                fVar = fVar2;
            }
        } else {
            j2.f fVar3 = (j2.f) message.obj;
            try {
                gVar.f7065a.queueInputBuffer(fVar3.f7058a, 0, fVar3.f7059b, fVar3.f7061d, fVar3.f7062e);
            } catch (RuntimeException e12) {
                AtomicReference atomicReference4 = gVar.f7068d;
                while (!atomicReference4.compareAndSet(null, e12) && atomicReference4.get() == null) {
                }
            }
            fVar = fVar3;
        }
        if (fVar != null) {
            j2.g.f(fVar);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        j4.u uVar;
        j4.s sVar;
        c cVar;
        int i6 = 4;
        switch (this.f4639a) {
            case 0:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                Object obj2 = pair.second;
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 == 2) {
                        d dVar = (d) this.f4640b;
                        if (obj == dVar.f4661w && dVar.i()) {
                            dVar.f4661w = null;
                            if (!(obj2 instanceof Exception) && !(obj2 instanceof NoSuchMethodError)) {
                                try {
                                    byte[] m9 = dVar.f4642b.m(dVar.f4659u, (byte[]) obj2);
                                    if (dVar.f4660v != null && m9 != null && m9.length != 0) {
                                        dVar.f4660v = m9;
                                    }
                                    dVar.f4654o = 4;
                                    dVar.g(new com.unity3d.ads.adplayer.b(i6));
                                    return;
                                } catch (Exception e10) {
                                    e = e10;
                                    dVar.k(e, true);
                                    return;
                                } catch (NoSuchMethodError e11) {
                                    e = e11;
                                    dVar.k(e, true);
                                    return;
                                }
                            }
                            dVar.k((Throwable) obj2, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                d dVar2 = (d) this.f4640b;
                b0 b0Var = dVar2.f4643c;
                if (obj == dVar2.f4662x) {
                    if (dVar2.f4654o == 2 || dVar2.i()) {
                        dVar2.f4662x = null;
                        if (obj2 instanceof Exception) {
                            b0Var.x((Exception) obj2, false);
                            return;
                        }
                        try {
                            dVar2.f4642b.n((byte[]) obj2);
                            b0Var.f7159y = null;
                            HashSet hashSet = (HashSet) b0Var.f7158x;
                            k0 k8 = k0.k(hashSet);
                            hashSet.clear();
                            i0 listIterator = k8.listIterator(0);
                            while (listIterator.hasNext()) {
                                d dVar3 = (d) listIterator.next();
                                if (dVar3.l()) {
                                    dVar3.h(true);
                                }
                            }
                            return;
                        } catch (Exception e12) {
                            b0Var.x(e12, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                byte[] bArr = (byte[]) message.obj;
                if (bArr != null) {
                    ArrayList arrayList = ((g) this.f4640b).I;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        d dVar4 = (d) obj3;
                        dVar4.n();
                        if (Arrays.equals(dVar4.f4659u, bArr)) {
                            if (message.what == 2 && dVar4.f4654o == 4) {
                                String str = u1.a0.f12750a;
                                dVar4.h(false);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                int i12 = message.what;
                if (i12 != -3 && i12 != -2 && i12 != -1) {
                    if (i12 == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        return;
                    }
                    return;
                }
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f4640b).get(), message.what);
                return;
            case 3:
                i4.s sVar2 = (i4.s) message.obj;
                ic.s sVar3 = (ic.s) this.f4640b;
                if (sVar3.s(sVar2)) {
                    i4.r rVar = sVar2.f6542d;
                    u1.c.h(rVar);
                    rVar.onDisconnected();
                    sVar3.y(sVar2);
                    return;
                }
                return;
            case 4:
                a(message);
                return;
            default:
                if (message.what == 1) {
                    synchronized (((j4.s) this.f4640b).f7201a) {
                        uVar = (j4.u) ((j4.s) this.f4640b).f7204d.get();
                        sVar = (j4.s) this.f4640b;
                        cVar = sVar.f7205e;
                    }
                    if (uVar != null && sVar == uVar.b() && cVar != null) {
                        uVar.d((d0) message.obj);
                        ((j4.s) this.f4640b).a(uVar, cVar);
                        uVar.d(null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Looper looper, int i6) {
        super(looper);
        this.f4639a = i6;
        this.f4640b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Looper looper, ic.s sVar) {
        super(looper);
        this.f4639a = 3;
        this.f4640b = sVar;
    }
}
