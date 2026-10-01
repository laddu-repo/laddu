package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.i;
import com.playfy.tv.R;
import e9.f;
import he.a;
import he.m;
import j1.y;
import kotlin.jvm.internal.k;
import l4.l0;
import l4.x;
import n4.j;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class NavHostFragment extends y {
    public View A0;
    public int B0;
    public boolean C0;

    /* renamed from: z0, reason: collision with root package name */
    public final m f1108z0 = a.d(new i(this, 12));

    @Override // j1.y
    public final void B(View view, Bundle bundle) {
        k.e(view, "view");
        if (view instanceof ViewGroup) {
            view.setTag(R.id.nav_controller_view_tag, N());
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getParent() != null) {
                Object parent = viewGroup.getParent();
                k.c(parent, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) parent;
                this.A0 = view2;
                if (view2.getId() == this.W) {
                    View view3 = this.A0;
                    k.b(view3);
                    view3.setTag(R.id.nav_controller_view_tag, N());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }

    public final x N() {
        return (x) this.f1108z0.getValue();
    }

    @Override // j1.y
    public final void r(Context context) {
        k.e(context, "context");
        super.r(context);
        if (this.C0) {
            j1.a aVar = new j1.a(g());
            aVar.j(this);
            aVar.e();
        }
    }

    @Override // j1.y
    public final void s(Bundle bundle) {
        N();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.C0 = true;
            j1.a aVar = new j1.a(g());
            aVar.j(this);
            aVar.e();
        }
        super.s(bundle);
    }

    @Override // j1.y
    public final View t(LayoutInflater inflater, ViewGroup viewGroup) {
        k.e(inflater, "inflater");
        Context context = inflater.getContext();
        k.d(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i6 = this.W;
        if (i6 == 0 || i6 == -1) {
            i6 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i6);
        return fragmentContainerView;
    }

    @Override // j1.y
    public final void u() {
        this.f7022e0 = true;
        View view = this.A0;
        if (view != null && f.d(view) == N()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.A0 = null;
    }

    @Override // j1.y
    public final void x(Context context, AttributeSet attrs, Bundle bundle) {
        k.e(context, "context");
        k.e(attrs, "attrs");
        super.x(context, attrs, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, l0.f8159b);
        k.d(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.B0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attrs, j.f9061c);
        k.d(obtainStyledAttributes2, "obtainStyledAttributes(...)");
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.C0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // j1.y
    public final void y(Bundle bundle) {
        if (this.C0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }
}
