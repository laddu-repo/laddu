package c;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f1662a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1663b = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static u1.c f1664c;

    public static final void a(h.j jVar) {
        ac.r rVar = new ac.r(1);
        c0 c0Var = new c0(0, 0, rVar);
        ac.r rVar2 = new ac.r(1);
        c0 c0Var2 = new c0(f1662a, f1663b, rVar2);
        View decorView = jVar.getWindow().getDecorView();
        de.i.d(decorView, "getDecorView(...)");
        Resources resources = decorView.getResources();
        de.i.d(resources, "getResources(...)");
        boolean zBooleanValue = ((Boolean) rVar.a(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        de.i.d(resources2, "getResources(...)");
        boolean zBooleanValue2 = ((Boolean) rVar2.a(resources2)).booleanValue();
        u1.c sVar = f1664c;
        if (sVar == null) {
            int i = Build.VERSION.SDK_INT;
            sVar = i >= 35 ? new s() : i >= 30 ? new r() : i >= 29 ? new q() : i >= 28 ? new p() : i >= 26 ? new o() : new n();
            f1664c = sVar;
        }
        u1.c cVar = sVar;
        Window window = jVar.getWindow();
        de.i.d(window, "getWindow(...)");
        cVar.G(c0Var, c0Var2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = jVar.getWindow();
        de.i.d(window2, "getWindow(...)");
        cVar.a(window2);
    }
}
