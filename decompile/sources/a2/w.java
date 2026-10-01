package a2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements u1.l, u1.g, t0.s, u0.m {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f455x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f456y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f457z;

    public /* synthetic */ w(int i6, int i10, Object obj) {
        this.f455x = i10;
        this.f457z = obj;
        this.f456y = i6;
    }

    @Override // u0.m
    public boolean a(View view) {
        String str;
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f457z;
        int i6 = this.f456y;
        if (i6 != 1 && i6 != 2) {
            WeakReference weakReference = sideSheetBehavior.f2734p;
            if (weakReference != null && weakReference.get() != null) {
                View view2 = (View) sideSheetBehavior.f2734p.get();
                o0 o0Var = new o0(i6, 5, sideSheetBehavior);
                ViewParent parent = view2.getParent();
                if (parent != null && parent.isLayoutRequested() && view2.isAttachedToWindow()) {
                    view2.post(o0Var);
                    return true;
                }
                o0Var.run();
                return true;
            }
            sideSheetBehavior.s(i6);
            return true;
        }
        StringBuilder sb2 = new StringBuilder("STATE_");
        if (i6 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(r4.a.o(sb2, str, " should not be set externally."));
    }

    @Override // u1.g
    public void accept(Object obj) {
        i4.m mVar;
        i4.m mVar2;
        i4.s sVar = (i4.s) this.f457z;
        int i6 = this.f456y;
        try {
            mVar2 = (i4.m) ((hb.x) obj).get();
            u1.c.e(mVar2, "LibraryResult must not be null");
        } catch (InterruptedException e10) {
            e = e10;
            u1.a.q("MediaSessionStub", "Library operation failed", e);
            String str = i4.m.f6452d;
            i4.q1 q1Var = new i4.q1(-1, "no error message provided", Bundle.EMPTY);
            mVar = new i4.m(q1Var.f6514a, SystemClock.elapsedRealtime(), q1Var);
            mVar2 = mVar;
            i4.r rVar = sVar.f6542d;
            u1.c.h(rVar);
            rVar.e(i6, mVar2);
        } catch (CancellationException e11) {
            u1.a.q("MediaSessionStub", "Library operation cancelled", e11);
            String str2 = i4.m.f6452d;
            i4.q1 q1Var2 = new i4.q1(1, "no error message provided", Bundle.EMPTY);
            mVar = new i4.m(q1Var2.f6514a, SystemClock.elapsedRealtime(), q1Var2);
            mVar2 = mVar;
            i4.r rVar2 = sVar.f6542d;
            u1.c.h(rVar2);
            rVar2.e(i6, mVar2);
        } catch (ExecutionException e12) {
            e = e12;
            u1.a.q("MediaSessionStub", "Library operation failed", e);
            String str3 = i4.m.f6452d;
            i4.q1 q1Var3 = new i4.q1(-1, "no error message provided", Bundle.EMPTY);
            mVar = new i4.m(q1Var3.f6514a, SystemClock.elapsedRealtime(), q1Var3);
            mVar2 = mVar;
            i4.r rVar22 = sVar.f6542d;
            u1.c.h(rVar22);
            rVar22.e(i6, mVar2);
        }
        try {
            i4.r rVar222 = sVar.f6542d;
            u1.c.h(rVar222);
            rVar222.e(i6, mVar2);
        } catch (RemoteException e13) {
            u1.a.q("MediaSessionStub", "Failed to send result to browser " + sVar, e13);
        }
    }

    @Override // u1.l
    public void invoke(Object obj) {
        switch (this.f455x) {
            case 0:
                ((r1.s0) obj).h(((s1) this.f457z).f394a, this.f456y);
                return;
            default:
                r1.s0 s0Var = (r1.s0) obj;
                s0Var.A(this.f456y, (r1.e0) this.f457z);
                return;
        }
    }

    @Override // t0.s
    public t0.w1 v(View view, t0.w1 w1Var) {
        View view2 = (View) this.f457z;
        kotlin.jvm.internal.k.e(view, "<unused var>");
        t0.t1 t1Var = w1Var.f12417a;
        int max = Math.max(t1Var.f(8).f8065d, t1Var.f(519).f8065d);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = this.f456y + max;
            view2.setLayoutParams(layoutParams2);
            return w1Var;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }
}
