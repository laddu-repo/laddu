package d;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3482a = Color.argb(230, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    public static final int f3483b = Color.argb(128, 27, 27, 27);

    /* renamed from: c, reason: collision with root package name */
    public static t f3484c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, d.t] */
    public static void a(i.j jVar, p0 p0Var, int i6) {
        p0 p0Var2;
        if ((i6 & 1) != 0) {
            p0Var2 = new p0(0, 0, 0, new cf.p(1));
        } else {
            p0Var2 = p0Var;
        }
        cf.p pVar = new cf.p(1);
        p0 p0Var3 = new p0(f3482a, f3483b, 0, pVar);
        View decorView = jVar.getWindow().getDecorView();
        kotlin.jvm.internal.k.d(decorView, "getDecorView(...)");
        ve.l lVar = p0Var2.f3478d;
        Resources resources = decorView.getResources();
        kotlin.jvm.internal.k.d(resources, "getResources(...)");
        boolean booleanValue = ((Boolean) lVar.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        kotlin.jvm.internal.k.d(resources2, "getResources(...)");
        boolean booleanValue2 = ((Boolean) pVar.invoke(resources2)).booleanValue();
        t tVar = f3484c;
        t tVar2 = tVar;
        if (tVar == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                tVar2 = new Object();
            } else if (i10 >= 29) {
                tVar2 = new Object();
            } else if (i10 >= 28) {
                tVar2 = new Object();
            } else if (i10 >= 26) {
                tVar2 = new Object();
            } else if (i10 >= 23) {
                tVar2 = new Object();
            } else {
                ?? obj = new Object();
                f3484c = obj;
                tVar2 = obj;
            }
        }
        t tVar3 = tVar2;
        Window window = jVar.getWindow();
        kotlin.jvm.internal.k.d(window, "getWindow(...)");
        tVar3.s(p0Var2, p0Var3, window, decorView, booleanValue, booleanValue2);
        Window window2 = jVar.getWindow();
        kotlin.jvm.internal.k.d(window2, "getWindow(...)");
        tVar3.a(window2);
    }
}
