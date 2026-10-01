package androidx.fragment.app;

import android.os.Bundle;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.j f981b;

    public /* synthetic */ b0(h.j jVar, int i) {
        this.f980a = i;
        this.f981b = jVar;
    }

    @Override // d.a
    public final void a(c.j jVar) {
        switch (this.f980a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                c0 c0Var = (c0) this.f981b.Q.f11492w;
                c0Var.A.b(c0Var, c0Var, null);
                return;
            default:
                de.i.e(jVar, "it");
                h.j jVar2 = this.f981b;
                Bundle bundleC = ((o.r) jVar2.f1654y.f2439y).c("android:support:activity-result");
                if (bundleC != null) {
                    c.i iVar = jVar2.D;
                    LinkedHashMap linkedHashMap = iVar.f1646b;
                    LinkedHashMap linkedHashMap2 = iVar.f1645a;
                    Bundle bundle = iVar.f1650g;
                    ArrayList<Integer> integerArrayList = bundleC.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        iVar.f1648d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = bundleC.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle.containsKey(str)) {
                                continue;
                            } else {
                                if ((linkedHashMap2 instanceof ee.a) && !(linkedHashMap2 instanceof ee.b)) {
                                    de.s.e(linkedHashMap2, "kotlin.collections.MutableMap");
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        de.i.d(num2, "get(...)");
                        int iIntValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        de.i.d(str2, "get(...)");
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                        iVar.f1646b.put(str3, Integer.valueOf(iIntValue));
                    }
                    return;
                }
                return;
        }
    }
}
