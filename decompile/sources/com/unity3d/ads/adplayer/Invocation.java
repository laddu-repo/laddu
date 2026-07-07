package com.unity3d.ads.adplayer;

import gf.f0;
import gf.i0;
import gf.p;
import gf.q;
import he.y;
import kotlin.jvm.internal.k;
import le.c;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Invocation {
    private final p _isHandled;
    private final p completableDeferred;
    private final String location;
    private final Object[] parameters;

    public Invocation(String location, Object[] parameters) {
        k.e(location, "location");
        k.e(parameters, "parameters");
        this.location = location;
        this.parameters = parameters;
        this._isHandled = f0.a();
        this.completableDeferred = f0.a();
    }

    public static /* synthetic */ Object handle$default(Invocation invocation, l lVar, c cVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            lVar = new Invocation$handle$2(null);
        }
        return invocation.handle(lVar, cVar);
    }

    public final String getLocation() {
        return this.location;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }

    public final Object getResult(c cVar) {
        return ((q) this.completableDeferred).p(cVar);
    }

    public final Object handle(l lVar, c cVar) {
        q qVar = (q) this._isHandled;
        y yVar = y.f6101a;
        qVar.K(yVar);
        f0.w(f0.b(cVar.getContext()), null, new Invocation$handle$3(lVar, this, null), 3);
        return yVar;
    }

    public final i0 isHandled() {
        return this._isHandled;
    }
}
