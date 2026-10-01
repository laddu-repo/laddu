package h;

import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.decoder.DecoderInputBuffer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import k8.k2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5853b;

    public /* synthetic */ c() {
        this.f5852a = 0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        l2.e eVar = null;
        switch (this.f5852a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f5853b).get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 1:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                Object obj2 = pair.second;
                int i10 = message.what;
                if (i10 == 1) {
                    h2.c cVar = (h2.c) this.f5853b;
                    k2 k2Var = cVar.f6060c;
                    if (obj == cVar.f6079x) {
                        if (cVar.f6070o == 2 || cVar.j()) {
                            cVar.f6079x = null;
                            if (obj2 instanceof Exception) {
                                k2Var.A((Exception) obj2, false);
                                return;
                            }
                            try {
                                cVar.f6059b.g((byte[]) obj2);
                                k2Var.f7603x = null;
                                HashSet hashSet = (HashSet) k2Var.f7602w;
                                y9.f0 f0VarM = y9.f0.m(hashSet);
                                hashSet.clear();
                                y9.c0 c0VarListIterator = f0VarM.listIterator(0);
                                while (c0VarListIterator.hasNext()) {
                                    h2.c cVar2 = (h2.c) c0VarListIterator.next();
                                    if (cVar2.m()) {
                                        cVar2.i(true);
                                    }
                                }
                                return;
                            } catch (Exception e7) {
                                k2Var.A(e7, true);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                if (i10 != 2) {
                    return;
                }
                h2.c cVar3 = (h2.c) this.f5853b;
                if (obj == cVar3.f6078w && cVar3.j()) {
                    cVar3.f6078w = null;
                    if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                        cVar3.l((Throwable) obj2, false);
                        return;
                    }
                    try {
                        byte[] bArrE = cVar3.f6059b.e(cVar3.f6076u, (byte[]) obj2);
                        if (cVar3.f6077v != null && bArrE != null && bArrE.length != 0) {
                            cVar3.f6077v = bArrE;
                        }
                        cVar3.f6070o = 4;
                        cVar3.h(new d2.e(22));
                        return;
                    } catch (Exception e10) {
                        e = e10;
                        cVar3.l(e, true);
                        return;
                    } catch (NoSuchMethodError e11) {
                        e = e11;
                        cVar3.l(e, true);
                        return;
                    }
                }
                return;
            case 2:
                byte[] bArr = (byte[]) message.obj;
                if (bArr == null) {
                    return;
                }
                ArrayList arrayList = ((h2.f) this.f5853b).G;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    h2.c cVar4 = (h2.c) obj3;
                    cVar4.o();
                    if (Arrays.equals(cVar4.f6076u, bArr)) {
                        if (message.what == 2 && cVar4.f6070o == 4) {
                            int i12 = w1.b0.f13686a;
                            cVar4.i(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                l2.f fVar = (l2.f) this.f5853b;
                int i13 = message.what;
                if (i13 == 1) {
                    l2.e eVar2 = (l2.e) message.obj;
                    try {
                        fVar.f8074a.queueInputBuffer(eVar2.f8067a, 0, eVar2.f8068b, eVar2.f8070d, eVar2.f8071e);
                        break;
                    } catch (RuntimeException e12) {
                        AtomicReference atomicReference = fVar.f8077d;
                        while (!atomicReference.compareAndSet(null, e12) && atomicReference.get() == null) {
                        }
                    }
                    eVar = eVar2;
                } else if (i13 == 2) {
                    l2.e eVar3 = (l2.e) message.obj;
                    int i14 = eVar3.f8067a;
                    MediaCodec.CryptoInfo cryptoInfo = eVar3.f8069c;
                    long j8 = eVar3.f8070d;
                    int i15 = eVar3.f8071e;
                    try {
                        synchronized (l2.f.f8073h) {
                            fVar.f8074a.queueSecureInputBuffer(i14, 0, cryptoInfo, j8, i15);
                            break;
                        }
                    } catch (RuntimeException e13) {
                        AtomicReference atomicReference2 = fVar.f8077d;
                        while (!atomicReference2.compareAndSet(null, e13) && atomicReference2.get() == null) {
                        }
                    }
                    eVar = eVar3;
                } else if (i13 == 3) {
                    fVar.f8078e.e();
                } else if (i13 != 4) {
                    AtomicReference atomicReference3 = fVar.f8077d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        fVar.f8074a.setParameters((Bundle) message.obj);
                        break;
                    } catch (RuntimeException e14) {
                        AtomicReference atomicReference4 = fVar.f8077d;
                        while (!atomicReference4.compareAndSet(null, e14) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (eVar != null) {
                    l2.f.f(eVar);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Looper looper, int i) {
        super(looper);
        this.f5852a = i;
        this.f5853b = obj;
    }
}
