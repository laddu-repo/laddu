package h4;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import c.x;
import sb.p;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f6145a;

    public i(h hVar) {
        this.f6145a = hVar;
    }

    public final void onBackCancelled() {
        h hVar = this.f6145a;
        p pVar = hVar.f6126a;
        if (pVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!hVar.f6127b) {
            pVar.g(hVar, null);
        }
        e eVar = (e) pVar.f11743x;
        eVar.getClass();
        if (hVar.equals(eVar.f6134h) && -1 == eVar.f6133g) {
            x xVarC = eVar.f;
            if (xVarC == null) {
                xVarC = eVar.c(-1);
            }
            eVar.f = null;
            eVar.f6133g = 0;
            eVar.f6134h = null;
            if (xVarC != null) {
                xVarC.f1675d.getClass();
            }
            pe.x xVar = eVar.f6128a;
            xVar.getClass();
            xVar.P(null, f.f6140a);
        }
        hVar.f6127b = false;
    }

    public final void onBackInvoked() {
        this.f6145a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        de.i.e(backEvent, "backEvent");
        b bVarC = z7.b.c(backEvent);
        h hVar = this.f6145a;
        p pVar = hVar.f6126a;
        if (pVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (hVar.f6127b) {
            e eVar = (e) pVar.f11743x;
            eVar.getClass();
            if (hVar.equals(eVar.f6134h) && -1 == eVar.f6133g) {
                x xVarC = eVar.f;
                if (xVarC == null) {
                    xVarC = eVar.c(-1);
                }
                if (xVarC != null) {
                    xVarC.f1675d.getClass();
                }
                pe.x xVar = eVar.f6128a;
                g gVar = new g(bVarC);
                xVar.getClass();
                xVar.P(null, gVar);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        de.i.e(backEvent, "backEvent");
        b bVarC = z7.b.c(backEvent);
        h hVar = this.f6145a;
        p pVar = hVar.f6126a;
        if (pVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (hVar.f6127b) {
            return;
        }
        pVar.g(hVar, bVarC);
        hVar.f6127b = true;
    }
}
