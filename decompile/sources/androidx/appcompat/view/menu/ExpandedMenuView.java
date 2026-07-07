package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import n9.j;
import o.k;
import o.l;
import o.n;
import o.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements k, z, AdapterView.OnItemClickListener {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f743y = {R.attr.background, R.attr.divider};

    /* renamed from: x, reason: collision with root package name */
    public l f744x;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        j E = j.E(context, attributeSet, f743y, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) E.f9356z;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(E.v(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(E.v(1));
        }
        E.G();
    }

    @Override // o.z
    public final void b(l lVar) {
        this.f744x = lVar;
    }

    @Override // o.k
    public final boolean c(n nVar) {
        return this.f744x.q(nVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i6, long j) {
        c((n) getAdapter().getItem(i6));
    }
}
