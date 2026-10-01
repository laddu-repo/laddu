package u2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f12789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f12790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12792d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12794g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12796j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12800n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12793e = 0;
    public long f = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12795h = -9223372036854775807L;
    public long i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f12797k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w1.v f12798l = w1.v.f13744a;

    public w(Context context, k kVar, long j8) {
        this.f12789a = kVar;
        this.f12791c = j8;
        this.f12790b = new a0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(long r27, long r29, long r31, long r33, boolean r35, boolean r36, q3.a r37) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.w.a(long, long, long, long, boolean, boolean, q3.a):int");
    }

    public final boolean b(boolean z2) {
        if (z2 && (this.f12793e == 3 || (!this.f12799m && this.f12800n))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        this.f12798l.getClass();
        if (SystemClock.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z2) {
        long jElapsedRealtime;
        this.f12796j = z2;
        long j8 = this.f12791c;
        if (j8 > 0) {
            this.f12798l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j8;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.i = jElapsedRealtime;
    }

    public final void d() {
        this.f12792d = true;
        this.f12798l.getClass();
        this.f12794g = w1.b0.M(SystemClock.elapsedRealtime());
        a0 a0Var = this.f12790b;
        a0Var.f12673d = true;
        a0Var.f12680m = 0L;
        a0Var.f12683p = -1L;
        a0Var.f12681n = -1L;
        y yVar = a0Var.f12671b;
        if (yVar != null) {
            DisplayManager displayManager = yVar.f12805a;
            z zVar = a0Var.f12672c;
            zVar.getClass();
            zVar.f12809w.sendEmptyMessage(2);
            displayManager.registerDisplayListener(yVar, w1.b0.m(null));
            a0.a(yVar.f12806b, displayManager.getDisplay(0));
        }
        a0Var.d(false);
    }

    public final void e() {
        this.f12792d = false;
        this.i = -9223372036854775807L;
        a0 a0Var = this.f12790b;
        a0Var.f12673d = false;
        y yVar = a0Var.f12671b;
        if (yVar != null) {
            yVar.f12805a.unregisterDisplayListener(yVar);
            z zVar = a0Var.f12672c;
            zVar.getClass();
            zVar.f12809w.sendEmptyMessage(3);
        }
        a0Var.b();
    }

    public final void f(int i) {
        if (i == 0) {
            this.f12793e = 1;
        } else if (i == 1) {
            this.f12793e = 0;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            this.f12793e = Math.min(this.f12793e, 2);
        }
    }

    public final void g(float f) {
        a0 a0Var = this.f12790b;
        a0Var.f = f;
        e eVar = a0Var.f12670a;
        eVar.f12712a.c();
        eVar.f12713b.c();
        eVar.f12714c = false;
        eVar.f12715d = -9223372036854775807L;
        eVar.f12716e = 0;
        a0Var.c();
    }

    public final void h(Surface surface) {
        this.f12799m = surface != null;
        this.f12800n = false;
        a0 a0Var = this.f12790b;
        if (a0Var.f12674e != surface) {
            a0Var.b();
            a0Var.f12674e = surface;
            a0Var.d(true);
        }
        this.f12793e = Math.min(this.f12793e, 1);
    }

    public final void i(float f) {
        w1.a.d(f > 0.0f);
        if (f == this.f12797k) {
            return;
        }
        this.f12797k = f;
        a0 a0Var = this.f12790b;
        a0Var.i = f;
        a0Var.f12680m = 0L;
        a0Var.f12683p = -1L;
        a0Var.f12681n = -1L;
        a0Var.d(false);
    }
}
