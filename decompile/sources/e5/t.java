package e5;

import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f4834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f4835c;

    static {
        a aVar = new a();
        aVar.V = new ArrayList();
        aVar.Y = false;
        aVar.Z = 0;
        aVar.W = false;
        aVar.I(new h(2));
        aVar.I(new f());
        aVar.I(new h(1));
        f4833a = aVar;
        f4834b = new ThreadLocal();
        f4835c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, p pVar) {
        ArrayList arrayList = f4835c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (pVar == null) {
            pVar = f4833a;
        }
        p pVarClone = pVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((p) obj).w(frameLayout);
            }
        }
        pVarClone.h(frameLayout, true);
        if (frameLayout.getTag(j.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(j.transition_current_scene, null);
        s sVar = new s();
        sVar.f4831v = pVarClone;
        sVar.f4832w = frameLayout;
        frameLayout.addOnAttachStateChangeListener(sVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(sVar);
    }

    public static v.e b() {
        v.e eVar;
        ThreadLocal threadLocal = f4834b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (v.e) weakReference.get()) != null) {
            return eVar;
        }
        v.e eVar2 = new v.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }
}
