package c;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class l extends Dialog implements androidx.lifecycle.s, u4.d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.lifecycle.u f1658v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.bumptech.glide.manager.t f1659w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final od.j f1660x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final od.j f1661y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, int i) {
        super(context, i);
        de.i.e(context, "context");
        this.f1659w = new com.bumptech.glide.manager.t(this);
        final int i10 = 0;
        this.f1660x = new od.j(new ce.a(this) { // from class: c.k

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ l f1657w;

            {
                this.f1657w = this;
            }

            @Override // ce.a
            public final Object b() {
                switch (i10) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        h4.a aVar = new h4.a();
                        this.f1657w.c().b().f1679c.b(aVar);
                        return aVar;
                    default:
                        return new a0(new androidx.emoji2.text.v(4, this.f1657w));
                }
            }
        });
        final int i11 = 1;
        this.f1661y = new od.j(new ce.a(this) { // from class: c.k

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ l f1657w;

            {
                this.f1657w = this;
            }

            @Override // ce.a
            public final Object b() {
                switch (i11) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        h4.a aVar = new h4.a();
                        this.f1657w.c().b().f1679c.b(aVar);
                        return aVar;
                    default:
                        return new a0(new androidx.emoji2.text.v(4, this.f1657w));
                }
            }
        });
    }

    public static void b(l lVar) {
        super.onBackPressed();
    }

    @Override // u4.d
    public final o.r a() {
        return (o.r) this.f1659w.f2439y;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        de.i.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    public final a0 c() {
        return (a0) this.f1661y.getValue();
    }

    public final void d() {
        Window window = getWindow();
        de.i.b(window);
        View decorView = window.getDecorView();
        de.i.d(decorView, "getDecorView(...)");
        decorView.setTag(q1.a.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        de.i.b(window2);
        View decorView2 = window2.getDecorView();
        de.i.d(decorView2, "getDecorView(...)");
        decorView2.setTag(b0.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        de.i.b(window3);
        View decorView3 = window3.getDecorView();
        de.i.d(decorView3, "getDecorView(...)");
        decorView3.setTag(u4.a.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        de.i.b(window4);
        View decorView4 = window4.getDecorView();
        de.i.d(decorView4, "getDecorView(...)");
        decorView4.setTag(h4.j.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // androidx.lifecycle.s
    public final androidx.lifecycle.u f() {
        androidx.lifecycle.u uVar = this.f1658v;
        if (uVar != null) {
            return uVar;
        }
        androidx.lifecycle.u uVar2 = new androidx.lifecycle.u(this);
        this.f1658v = uVar2;
        return uVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((h4.a) this.f1660x.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            a0 a0VarC = c();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            de.i.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            a0VarC.c(onBackInvokedDispatcher);
        }
        this.f1659w.f(bundle);
        androidx.lifecycle.u uVar = this.f1658v;
        if (uVar == null) {
            uVar = new androidx.lifecycle.u(this);
            this.f1658v = uVar;
        }
        uVar.d(androidx.lifecycle.m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        de.i.d(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.f1659w.g(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.u uVar = this.f1658v;
        if (uVar == null) {
            uVar = new androidx.lifecycle.u(this);
            this.f1658v = uVar;
        }
        uVar.d(androidx.lifecycle.m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.u uVar = this.f1658v;
        if (uVar == null) {
            uVar = new androidx.lifecycle.u(this);
            this.f1658v = uVar;
        }
        uVar.d(androidx.lifecycle.m.ON_DESTROY);
        this.f1658v = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        de.i.e(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        de.i.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
