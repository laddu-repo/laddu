package t0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.playfy.tv.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f12390d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f12391a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f12392b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f12393c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f12391a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a10 = a(viewGroup.getChildAt(childCount));
                    if (a10 != null) {
                        return a10;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                throw h8.c.h(size, arrayList);
            }
            return null;
        }
        return null;
    }
}
