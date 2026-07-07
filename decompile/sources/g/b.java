package g;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import f.i;
import i0.f;
import ie.l;
import ie.s;
import ie.w;
import j1.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.k;
import u5.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5273a;

    public /* synthetic */ b(int i6) {
        this.f5273a = i6;
    }

    @Override // g.a
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f5273a) {
            case 0:
                String[] input = (String[]) obj;
                k.e(input, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
                k.d(putExtra, "putExtra(...)");
                return putExtra;
            case 1:
                String input2 = (String) obj;
                k.e(input2, "input");
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input2});
                k.d(putExtra2, "putExtra(...)");
                return putExtra2;
            case 2:
                Intent input3 = (Intent) obj;
                k.e(input3, "input");
                return input3;
            default:
                i iVar = (i) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = iVar.f4608y;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        iVar = new i(iVar.f4607x, null, iVar.f4609z, iVar.A);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar);
                if (p0.L(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
        }
    }

    @Override // g.a
    public r b(Context context, Object obj) {
        switch (this.f5273a) {
            case 0:
                String[] input = (String[]) obj;
                k.e(input, "input");
                if (input.length == 0) {
                    return new r(s.f6847x, 7);
                }
                for (String str : input) {
                    if (f.a(context, str) != 0) {
                        return null;
                    }
                }
                int w10 = w.w(input.length);
                if (w10 < 16) {
                    w10 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(w10);
                for (String str2 : input) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new r(linkedHashMap, 7);
            case 1:
                String input2 = (String) obj;
                k.e(input2, "input");
                if (f.a(context, input2) == 0) {
                    return new r(Boolean.TRUE, 7);
                }
                return null;
            default:
                return super.b(context, obj);
        }
    }

    @Override // g.a
    public final Object c(int i6, Intent intent) {
        boolean z10;
        switch (this.f5273a) {
            case 0:
                if (i6 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i10 : intArrayExtra) {
                            if (i10 == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            arrayList.add(Boolean.valueOf(z10));
                        }
                        ArrayList k02 = ie.i.k0(stringArrayExtra);
                        Iterator it = k02.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(l.x(k02, 10), l.x(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new he.i(it.next(), it2.next()));
                        }
                        return w.C(arrayList2);
                    }
                }
                return s.f6847x;
            case 1:
                if (intent != null && i6 == -1) {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z11 = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                if (intArrayExtra2[i11] == 0) {
                                    z11 = true;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z11);
                }
                return Boolean.FALSE;
            case 2:
                return new f.a(i6, intent);
            default:
                return new f.a(i6, intent);
        }
    }
}
