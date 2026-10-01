package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class vb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p6 f3162a;

    static {
        Object qVar;
        ((i) d.f2554a).getClass();
        AtomicReference atomicReference = m.f;
        String strReplace = "Phlogger";
        if (atomicReference.get() != null) {
            o oVar = (o) atomicReference.get();
            qVar = new q(strReplace, oVar.f2938a, oVar.f2939b, oVar.f2940c);
        } else {
            int i = 7;
            while (true) {
                if (i >= 0) {
                    char cCharAt = "Phlogger".charAt(i);
                    if (cCharAt != '$') {
                        if (cCharAt == '.') {
                            break;
                        } else {
                            i--;
                        }
                    } else {
                        strReplace = "Phlogger".replace('$', '.');
                        break;
                    }
                } else {
                    break;
                }
            }
            m mVar = new m(strReplace);
            if (m.f2875c || m.f2876d) {
                mVar.f2880b = new p(strReplace);
            } else if (m.f2877e) {
                o oVar2 = q.f2997h;
                mVar.f2880b = new q(strReplace, Level.OFF, oVar2.f2939b, oVar2.f2940c);
            } else {
                mVar.f2880b = null;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = k.f2810a;
            concurrentLinkedQueue.offer(mVar);
            qVar = mVar;
            if (atomicReference.get() != null) {
                while (true) {
                    m mVar2 = (m) concurrentLinkedQueue.poll();
                    if (mVar2 == null) {
                        break;
                    }
                    o oVar3 = (o) atomicReference.get();
                    mVar2.f2880b = new q((String) mVar2.f3188a, oVar3.f2938a, oVar3.f2939b, oVar3.f2940c);
                }
                m.m();
                qVar = mVar;
            }
        }
        f3162a = new p6(2, qVar);
    }
}
