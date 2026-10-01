package h;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.q0;
import androidx.fragment.app.z0;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;
import o.p3;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends c.j implements k {
    public boolean S;
    public boolean T;
    public d0 V;
    public final s5.c Q = new s5.c(3, new androidx.fragment.app.c0(this));
    public final androidx.lifecycle.u R = new androidx.lifecycle.u(this);
    public boolean U = true;

    public j() {
        ((o.r) this.f1654y.f2439y).f("android:support:lifecycle", new androidx.fragment.app.z(this, 0));
        final int i = 0;
        h(new s0.a(this) { // from class: androidx.fragment.app.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h.j f972b;

            {
                this.f972b = this;
            }

            @Override // s0.a
            public final void accept(Object obj) {
                switch (i) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        this.f972b.Q.E();
                        break;
                    default:
                        this.f972b.Q.E();
                        break;
                }
            }
        });
        final int i10 = 1;
        this.G.add(new s0.a(this) { // from class: androidx.fragment.app.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h.j f972b;

            {
                this.f972b = this;
            }

            @Override // s0.a
            public final void accept(Object obj) {
                switch (i10) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        this.f972b.Q.E();
                        break;
                    default:
                        this.f972b.Q.E();
                        break;
                }
            }
        });
        i(new androidx.fragment.app.b0(this, 0));
        ((o.r) this.f1654y.f2439y).f("androidx:appcompat", new h(this));
        i(new i(this));
    }

    public static boolean p(q0 q0Var) {
        boolean zP = false;
        for (androidx.fragment.app.y yVar : q0Var.f1070c.r()) {
            if (yVar != null) {
                androidx.fragment.app.c0 c0Var = yVar.O;
                if ((c0Var == null ? null : c0Var.B) != null) {
                    zP |= p(yVar.i());
                }
                z0 z0Var = yVar.f1145l0;
                androidx.lifecycle.n nVar = androidx.lifecycle.n.f1220y;
                if (z0Var != null) {
                    z0Var.g();
                    if (z0Var.f1169z.f1238c.compareTo(nVar) >= 0) {
                        yVar.f1145l0.f1169z.g();
                        zP = true;
                    }
                }
                if (yVar.f1144k0.f1238c.compareTo(nVar) >= 0) {
                    yVar.f1144k0.g();
                    zP = true;
                }
            }
        }
        return zP;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        d0 d0Var = (d0) m();
        d0Var.x();
        ((ViewGroup) d0Var.W.findViewById(R.id.content)).addView(view, layoutParams);
        d0Var.H.a(d0Var.G.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.j.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        com.bumptech.glide.f fVarN = n();
        if (getWindow().hasFeature(0)) {
            if (fVarN == null || !fVarN.e()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // h0.e, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        com.bumptech.glide.f fVarN = n();
        if (keyCode == 82 && fVarN != null && fVarN.F(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.j.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        d0 d0Var = (d0) m();
        d0Var.x();
        return d0Var.G.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        d0 d0Var = (d0) m();
        if (d0Var.K == null) {
            d0Var.C();
            com.bumptech.glide.f fVar = d0Var.J;
            d0Var.K = new m.h(fVar != null ? fVar.z() : d0Var.F);
        }
        return d0Var.K;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = p3.f9268a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m().b();
    }

    public final q m() {
        if (this.V == null) {
            o oVar = q.f5983v;
            this.V = new d0(this, null, this, this);
        }
        return this.V;
    }

    public final com.bumptech.glide.f n() {
        d0 d0Var = (d0) m();
        d0Var.C();
        return d0Var.J;
    }

    public final q0 o() {
        return ((androidx.fragment.app.c0) this.Q.f11492w).A;
    }

    @Override // c.j, android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        this.Q.E();
        super.onActivityResult(i, i10, intent);
    }

    @Override // c.j, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException {
        super.onConfigurationChanged(configuration);
        d0 d0Var = (d0) m();
        if (d0Var.f5869b0 && d0Var.V) {
            d0Var.C();
            com.bumptech.glide.f fVar = d0Var.J;
            if (fVar != null) {
                fVar.C();
            }
        }
        o.s sVarA = o.s.a();
        Context context = d0Var.F;
        synchronized (sVarA) {
            sVarA.f9293a.l(context);
        }
        d0Var.f5881n0 = new Configuration(d0Var.F.getResources().getConfiguration());
        d0Var.m(false, false);
    }

    @Override // c.j, h0.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.R.d(androidx.lifecycle.m.ON_CREATE);
        q0 q0Var = ((androidx.fragment.app.c0) this.Q.f11492w).A;
        q0Var.E = false;
        q0Var.F = false;
        q0Var.L.i = false;
        q0Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((androidx.fragment.app.c0) this.Q.f11492w).A.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        q();
        m().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // c.j, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentA;
        if (!r(i, menuItem)) {
            com.bumptech.glide.f fVarN = n();
            if (menuItem.getItemId() != 16908332 || fVarN == null || (fVarN.t() & 4) == 0 || (intentA = h0.c.a(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentA)) {
                navigateUpTo(intentA);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentA2 = h0.c.a(this);
            if (intentA2 == null) {
                intentA2 = h0.c.a(this);
            }
            if (intentA2 != null) {
                ComponentName component = intentA2.getComponent();
                if (component == null) {
                    component = intentA2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentB = h0.c.b(this, component);
                    while (intentB != null) {
                        arrayList.add(size, intentB);
                        intentB = h0.c.b(this, intentB.getComponent());
                    }
                    arrayList.add(intentA2);
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e7);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.T = false;
        ((androidx.fragment.app.c0) this.Q.f11492w).A.t(5);
        this.R.d(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((d0) m()).x();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        s();
        d0 d0Var = (d0) m();
        d0Var.C();
        com.bumptech.glide.f fVar = d0Var.J;
        if (fVar != null) {
            fVar.P(true);
        }
    }

    @Override // c.j, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.Q.E();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        s5.c cVar = this.Q;
        cVar.E();
        super.onResume();
        this.T = true;
        ((androidx.fragment.app.c0) cVar.f11492w).A.y(true);
    }

    @Override // android.app.Activity
    public final void onStart() throws IllegalAccessException {
        t();
        ((d0) m()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.Q.E();
    }

    @Override // android.app.Activity
    public final void onStop() {
        u();
        d0 d0Var = (d0) m();
        d0Var.C();
        com.bumptech.glide.f fVar = d0Var.J;
        if (fVar != null) {
            fVar.P(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        com.bumptech.glide.f fVarN = n();
        if (getWindow().hasFeature(0)) {
            if (fVarN == null || !fVarN.G()) {
                super.openOptionsMenu();
            }
        }
    }

    public final void q() {
        super.onDestroy();
        ((androidx.fragment.app.c0) this.Q.f11492w).A.k();
        this.R.d(androidx.lifecycle.m.ON_DESTROY);
    }

    public final boolean r(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((androidx.fragment.app.c0) this.Q.f11492w).A.i();
        }
        return false;
    }

    public final void s() {
        super.onPostResume();
        this.R.d(androidx.lifecycle.m.ON_RESUME);
        q0 q0Var = ((androidx.fragment.app.c0) this.Q.f11492w).A;
        q0Var.E = false;
        q0Var.F = false;
        q0Var.L.i = false;
        q0Var.t(7);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        k();
        m().h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((d0) m()).f5882p0 = i;
    }

    public final void t() {
        s5.c cVar = this.Q;
        cVar.E();
        androidx.fragment.app.c0 c0Var = (androidx.fragment.app.c0) cVar.f11492w;
        super.onStart();
        this.U = false;
        if (!this.S) {
            this.S = true;
            q0 q0Var = c0Var.A;
            q0Var.E = false;
            q0Var.F = false;
            q0Var.L.i = false;
            q0Var.t(4);
        }
        c0Var.A.y(true);
        this.R.d(androidx.lifecycle.m.ON_START);
        q0 q0Var2 = c0Var.A;
        q0Var2.E = false;
        q0Var2.F = false;
        q0Var2.L.i = false;
        q0Var2.t(5);
    }

    public final void u() {
        super.onStop();
        this.U = true;
        while (p(o())) {
        }
        q0 q0Var = ((androidx.fragment.app.c0) this.Q.f11492w).A;
        q0Var.F = true;
        q0Var.L.i = true;
        q0Var.t(4);
        this.R.d(androidx.lifecycle.m.ON_STOP);
    }

    @Override // c.j, android.app.Activity
    public void setContentView(View view) {
        k();
        m().i(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        m().j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((androidx.fragment.app.c0) this.Q.f11492w).A.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
