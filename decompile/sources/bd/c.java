package bd;

import android.text.TextUtils;
import j4.b0;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;
import uc.j;
import wc.g;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f1661c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f1662d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1664f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b0 b0Var, HashSet hashSet, JSONObject jSONObject, long j, int i6) {
        super(b0Var);
        this.f1664f = i6;
        this.f1661c = new HashSet(hashSet);
        this.f1662d = jSONObject;
        this.f1663e = j;
    }

    @Override // bd.a
    /* renamed from: a */
    public final void onPostExecute(String str) {
        wc.c cVar;
        int i6 = this.f1664f;
        g gVar = g.f14287a;
        long j = this.f1663e;
        HashSet hashSet = this.f1661c;
        switch (i6) {
            case 0:
                wc.c cVar2 = wc.c.f14279c;
                if (cVar2 != null) {
                    for (j jVar : Collections.unmodifiableCollection(cVar2.f14280a)) {
                        if (hashSet.contains(jVar.f13101h)) {
                            yc.a aVar = jVar.f13098e;
                            if (j >= aVar.f15051e && aVar.f15050d != 3) {
                                aVar.f15050d = 3;
                                gVar.a(aVar.e(), "setNativeViewHierarchy", str, aVar.f15047a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                return;
            default:
                if (!TextUtils.isEmpty(str) && (cVar = wc.c.f14279c) != null) {
                    for (j jVar2 : Collections.unmodifiableCollection(cVar.f14280a)) {
                        if (hashSet.contains(jVar2.f13101h)) {
                            yc.a aVar2 = jVar2.f13098e;
                            if (j >= aVar2.f15051e) {
                                aVar2.f15050d = 2;
                                gVar.a(aVar2.e(), "setNativeViewHierarchy", str, aVar2.f15047a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                return;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f1664f) {
            case 0:
                return this.f1662d.toString();
            default:
                b0 b0Var = this.f1660b;
                JSONObject jSONObject = (JSONObject) b0Var.f7158x;
                JSONObject jSONObject2 = this.f1662d;
                if (zc.b.e(jSONObject2, jSONObject)) {
                    return null;
                }
                b0Var.f7158x = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // bd.a, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f1664f) {
            case 0:
                onPostExecute((String) obj);
                return;
            default:
                onPostExecute((String) obj);
                return;
        }
    }
}
