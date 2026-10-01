package d;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.playfy.tv.R;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class r extends Dialog implements androidx.lifecycle.f0, e5.g {

    /* renamed from: x, reason: collision with root package name */
    public androidx.lifecycle.h0 f3479x;

    /* renamed from: y, reason: collision with root package name */
    public final e5.f f3480y;

    /* renamed from: z, reason: collision with root package name */
    public final n0 f3481z;

    public r(Context context, int i6) {
        super(context, i6);
        this.f3480y = new e5.f(new f5.b(this, new androidx.lifecycle.i(this, 3)));
        this.f3481z = new n0(new a2.a(this, 17));
    }

    public static void a(r rVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.k.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        kotlin.jvm.internal.k.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.k.d(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.k.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.k.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.k.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.k.d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.f0
    public final androidx.lifecycle.y getLifecycle() {
        androidx.lifecycle.h0 h0Var = this.f3479x;
        if (h0Var == null) {
            androidx.lifecycle.h0 h0Var2 = new androidx.lifecycle.h0(this);
            this.f3479x = h0Var2;
            return h0Var2;
        }
        return h0Var;
    }

    @Override // e5.g
    public final e5.e getSavedStateRegistry() {
        return this.f3480y.f4357b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f3481z.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.k.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            n0 n0Var = this.f3481z;
            n0Var.f3466e = onBackInvokedDispatcher;
            n0Var.e(n0Var.f3468g);
        }
        this.f3480y.b(bundle);
        androidx.lifecycle.h0 h0Var = this.f3479x;
        if (h0Var == null) {
            h0Var = new androidx.lifecycle.h0(this);
            this.f3479x = h0Var;
        }
        h0Var.f(androidx.lifecycle.w.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.k.d(onSaveInstanceState, "onSaveInstanceState(...)");
        this.f3480y.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.h0 h0Var = this.f3479x;
        if (h0Var == null) {
            h0Var = new androidx.lifecycle.h0(this);
            this.f3479x = h0Var;
        }
        h0Var.f(androidx.lifecycle.w.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.h0 h0Var = this.f3479x;
        if (h0Var == null) {
            h0Var = new androidx.lifecycle.h0(this);
            this.f3479x = h0Var;
        }
        h0Var.f(androidx.lifecycle.w.ON_DESTROY);
        this.f3479x = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i6) {
        b();
        super.setContentView(i6);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.k.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.k.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
