package l5;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8180a;

    public c(int i) {
        switch (i) {
            case 1:
                this.f8180a = new ArrayList();
                break;
            default:
                this.f8180a = new ArrayList();
                break;
        }
    }

    public void a(Path path) {
        ArrayList arrayList = this.f8180a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            Matrix matrix = v5.i.f13208a;
            if (uVar != null && !uVar.f8288a) {
                v5.i.a(path, uVar.f8291d.l() / 100.0f, uVar.f8292e.l() / 100.0f, uVar.f.l() / 360.0f);
            }
        }
    }

    public synchronized a6.l b(Class cls) {
        int size = this.f8180a.size();
        for (int i = 0; i < size; i++) {
            q6.d dVar = (q6.d) this.f8180a.get(i);
            if (dVar.f10889a.isAssignableFrom(cls)) {
                return dVar.f10890b;
            }
        }
        return null;
    }
}
