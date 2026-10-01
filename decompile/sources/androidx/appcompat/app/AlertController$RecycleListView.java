package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import h.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: x, reason: collision with root package name */
    public final int f741x;

    /* renamed from: y, reason: collision with root package name */
    public final int f742y;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f5750u);
        this.f742y = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f741x = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
