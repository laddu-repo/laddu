package com.playfy.tv.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import ca.a;
import com.playfy.tv.R;
import j2.h;
import java.util.WeakHashMap;
import kotlin.jvm.internal.k;
import w4.s0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OverlayInsetsLayout extends FrameLayout {
    public static final /* synthetic */ int A = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f3377x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3378y;

    /* renamed from: z, reason: collision with root package name */
    public final WeakHashMap f3379z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayInsetsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k.e(context, "context");
        this.f3379z = new WeakHashMap();
        addOnLayoutChangeListener(new a(this, 4));
    }

    public final void a(View view) {
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            s0 layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof GridLayoutManager) ? !(layoutManager instanceof LinearLayoutManager) ? !(layoutManager instanceof StaggeredGridLayoutManager) || ((StaggeredGridLayoutManager) layoutManager).f1153t == 1 : ((LinearLayoutManager) layoutManager).f1109p == 1 : ((GridLayoutManager) layoutManager).f1109p == 1) {
                recyclerView.setClipToPadding(false);
                b(view);
            }
        } else if (!(view instanceof ScrollView) && !(view instanceof NestedScrollView) && !(view instanceof ListView)) {
            if (view.getId() == R.id.error_ly) {
                b(view);
            }
        } else {
            ((ViewGroup) view).setClipToPadding(false);
            b(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = viewGroup.getChildAt(i6);
                k.d(childAt, "getChildAt(...)");
                a(childAt);
            }
        }
    }

    public final void b(View view) {
        WeakHashMap weakHashMap = this.f3379z;
        Object obj = weakHashMap.get(view);
        if (obj == null) {
            obj = Integer.valueOf(view.getPaddingBottom());
            weakHashMap.put(view, obj);
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), ((Integer) obj).intValue() + this.f3377x);
    }

    public final void setBottomOverlayHeight(int i6) {
        if (this.f3377x != i6) {
            this.f3377x = i6;
            if (this.f3378y) {
                return;
            }
            this.f3378y = true;
            post(new h(this, 5));
        }
    }
}
