package ad;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.j1;
import com.google.android.gms.internal.measurement.j5;
import j4.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import s8.l;
import w8.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f678g = new b();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f679h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static Handler f680i = null;
    public static final a j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f681k = new a(1);

    /* renamed from: f, reason: collision with root package name */
    public long f687f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f682a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f683b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final c f685d = new c();

    /* renamed from: c, reason: collision with root package name */
    public final l f684c = new l(28);

    /* renamed from: e, reason: collision with root package name */
    public final b0 f686e = new b0(new j1(2));

    public static void b() {
        if (f680i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f680i = handler;
            handler.post(j);
            f680i.postDelayed(f681k, 200L);
        }
    }

    public final void a(View view, e eVar, JSONObject jSONObject, boolean z10) {
        char c10;
        String str;
        if (j5.a(view) == null) {
            c cVar = this.f685d;
            boolean z11 = true;
            if (cVar.f691d.contains(view)) {
                c10 = 1;
            } else if (cVar.f696i) {
                c10 = 2;
            } else {
                c10 = 3;
            }
            if (c10 != 3) {
                JSONObject b10 = eVar.b(view);
                zc.b.c(jSONObject, b10);
                HashMap hashMap = cVar.f688a;
                if (hashMap.size() == 0) {
                    str = null;
                } else {
                    String str2 = (String) hashMap.get(view);
                    if (str2 != null) {
                        hashMap.remove(view);
                    }
                    str = str2;
                }
                boolean z12 = false;
                if (str != null) {
                    try {
                        b10.put("adSessionId", str);
                    } catch (JSONException e10) {
                        Log.e("OMIDLIB", "Error with setting ad session id", e10);
                    }
                    WeakHashMap weakHashMap = cVar.f695h;
                    if (weakHashMap.containsKey(view)) {
                        weakHashMap.put(view, Boolean.TRUE);
                    } else {
                        z12 = true;
                    }
                    try {
                        b10.put("hasWindowFocus", Boolean.valueOf(z12));
                    } catch (JSONException e11) {
                        Log.e("OMIDLIB", "Error with setting has window focus", e11);
                    }
                    cVar.f696i = true;
                    return;
                }
                r4.a.t(cVar.f689b.get(view));
                if (c10 != 1) {
                    z11 = false;
                }
                eVar.getClass();
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (z11) {
                        HashMap hashMap2 = new HashMap();
                        for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                            View childAt = viewGroup.getChildAt(i6);
                            ArrayList arrayList = (ArrayList) hashMap2.get(Float.valueOf(childAt.getZ()));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                hashMap2.put(Float.valueOf(childAt.getZ()), arrayList);
                            }
                            arrayList.add(childAt);
                        }
                        ArrayList arrayList2 = new ArrayList(hashMap2.keySet());
                        Collections.sort(arrayList2);
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            ArrayList arrayList3 = (ArrayList) hashMap2.get((Float) obj);
                            int size2 = arrayList3.size();
                            int i11 = 0;
                            while (i11 < size2) {
                                Object obj2 = arrayList3.get(i11);
                                i11++;
                                a((View) obj2, eVar, b10, z10);
                            }
                        }
                        return;
                    }
                    for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                        a(viewGroup.getChildAt(i12), eVar, b10, z10);
                    }
                }
            }
        }
    }
}
