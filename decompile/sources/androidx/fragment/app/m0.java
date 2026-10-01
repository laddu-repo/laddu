package androidx.fragment.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends p4.v {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1052j;

    public /* synthetic */ m0(int i) {
        this.f1052j = i;
    }

    @Override // p4.v
    public a9.g C(h.j jVar, Object obj) {
        switch (this.f1052j) {
            case 1:
                String[] strArr = (String[]) obj;
                de.i.e(strArr, "input");
                if (strArr.length == 0) {
                    return new a9.g(15, pd.q.f10552v);
                }
                for (String str : strArr) {
                    if (i0.d.a(jVar, str) != 0) {
                        return null;
                    }
                }
                int iR = pd.s.R(strArr.length);
                if (iR < 16) {
                    iR = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iR);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new a9.g(15, linkedHashMap);
            case 2:
                String str3 = (String) obj;
                de.i.e(str3, "input");
                if (i0.d.a(jVar, str3) == 0) {
                    return new a9.g(15, Boolean.TRUE);
                }
                return null;
            default:
                return super.C(jVar, obj);
        }
    }

    @Override // p4.v
    public final Object L(Intent intent, int i) {
        switch (this.f1052j) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new e.a(intent, i);
            case 1:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i10 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i10 == 0));
                        }
                        ArrayList arrayListE0 = pd.i.e0(stringArrayExtra);
                        Iterator it = arrayListE0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(pd.l.C(arrayListE0, 10), pd.l.C(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new od.f(it.next(), it2.next()));
                        }
                        return pd.s.S(arrayList2);
                    }
                }
                return pd.q.f10552v;
            case 2:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z2 = false;
                if (intArrayExtra2 != null) {
                    int length = intArrayExtra2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            if (intArrayExtra2[i11] == 0) {
                                z2 = true;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z2);
            default:
                return new e.a(intent, i);
        }
    }

    @Override // p4.v
    public final Intent t(h.j jVar, Object obj) {
        Bundle bundleExtra;
        switch (this.f1052j) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                e.h hVar = (e.h) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = hVar.f4540w;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        hVar = new e.h(hVar.f4539v, null, hVar.f4541x, hVar.f4542y);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
                if (q0.I(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) obj;
                de.i.e(strArr, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                de.i.d(intentPutExtra, "putExtra(...)");
                return intentPutExtra;
            case 2:
                String str = (String) obj;
                de.i.e(str, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                de.i.d(intentPutExtra2, "putExtra(...)");
                return intentPutExtra2;
            default:
                Intent intent3 = (Intent) obj;
                de.i.e(intent3, "input");
                return intent3;
        }
    }
}
