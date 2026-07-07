package j6;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d extends j implements l {

    /* renamed from: x, reason: collision with root package name */
    public static final d f7238x = new j(1, k6.e.class, "findRootView", "findRootView(Landroid/app/Activity;)Landroid/view/View;", 1);

    @Override // ve.l
    public final Object invoke(Object obj) {
        Activity p02 = (Activity) obj;
        k.e(p02, "p0");
        ViewGroup viewGroup = (ViewGroup) p02.findViewById(R.id.content);
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            if (childCount != 0) {
                if (childCount == 1) {
                    View childAt = viewGroup.getChildAt(0);
                    k.d(childAt, "contentView.getChildAt(0)");
                    return childAt;
                }
                throw new IllegalStateException("More than one child view found in the Activity content view");
            }
            throw new IllegalStateException("Content view has no children. Provide a root view explicitly");
        }
        throw new IllegalStateException("Activity has no content view");
    }
}
