package o5;

import android.view.ViewGroup;
import com.playfy.tv.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9994a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f9995b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f9996c;

    /* JADX WARN: Type inference failed for: r0v0, types: [o5.r, o5.a] */
    static {
        ?? rVar = new r();
        rVar.Z = new ArrayList();
        rVar.f9935c0 = false;
        rVar.f9936d0 = 0;
        rVar.f9933a0 = false;
        rVar.K(new h(2));
        rVar.K(new r());
        rVar.K(new h(1));
        f9994a = rVar;
        f9995b = new ThreadLocal();
        f9996c = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener, o5.u] */
    public static void a(ViewGroup viewGroup, r rVar) {
        ArrayList arrayList = f9996c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (rVar == null) {
                rVar = f9994a;
            }
            r clone = rVar.clone();
            ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = arrayList2.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList2.get(i6);
                    i6++;
                    ((r) obj).w(viewGroup);
                }
            }
            clone.g(viewGroup, true);
            if (viewGroup.getTag(R.id.transition_current_scene) == null) {
                viewGroup.setTag(R.id.transition_current_scene, null);
                ?? obj2 = new Object();
                obj2.f9992x = clone;
                obj2.f9993y = viewGroup;
                viewGroup.addOnAttachStateChangeListener(obj2);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(obj2);
                return;
            }
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [v.l, java.lang.Object, v.e] */
    public static v.e b() {
        v.e eVar;
        ThreadLocal threadLocal = f9995b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (v.e) weakReference.get()) != null) {
            return eVar;
        }
        ?? lVar = new v.l(0);
        threadLocal.set(new WeakReference(lVar));
        return lVar;
    }
}
