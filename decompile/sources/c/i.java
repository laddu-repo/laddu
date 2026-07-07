package c;

import ac.j0;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import c.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import p4.v;
import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1645a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1646b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1647c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1648d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1649e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f1650g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h.j f1651h;

    public i(h.j jVar) {
        this.f1651h = jVar;
    }

    public final boolean a(int i, int i10, Intent intent) {
        String str = (String) this.f1645a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        e.e eVar = (e.e) this.f1649e.get(str);
        if ((eVar != null ? eVar.f4531a : null) != null) {
            ArrayList arrayList = this.f1648d;
            if (arrayList.contains(str)) {
                eVar.f4531a.i(eVar.f4532b.L(intent, i10));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.f1650g.putParcelable(str, new e.a(intent, i10));
        return true;
    }

    public final void b(int i, p4.v vVar, Object obj) {
        Bundle bundleExtra;
        int i10;
        h.j jVar = this.f1651h;
        a9.g gVarC = vVar.C(jVar, obj);
        if (gVarC != null) {
            new Handler(Looper.getMainLooper()).post(new h(this, i, gVarC, 0));
            return;
        }
        Intent intentT = vVar.t(jVar, obj);
        if (intentT.getExtras() != null) {
            Bundle extras = intentT.getExtras();
            de.i.b(extras);
            if (extras.getClassLoader() == null) {
                intentT.setExtrasClassLoader(jVar.getClassLoader());
            }
        }
        if (intentT.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentT.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentT.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentT.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentT.getAction())) {
                jVar.startActivityForResult(intentT, i, bundle);
                return;
            }
            e.h hVar = (e.h) intentT.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                de.i.b(hVar);
                i10 = i;
            } catch (IntentSender.SendIntentException e7) {
                e = e7;
                i10 = i;
            }
            try {
                jVar.startIntentSenderForResult(hVar.f4539v, i10, hVar.f4540w, hVar.f4541x, hVar.f4542y, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                new Handler(Looper.getMainLooper()).post(new h(this, i10, e, 1));
                return;
            }
        }
        String[] stringArrayExtra = intentT.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
            if (TextUtils.isEmpty(stringArrayExtra[i11])) {
                throw new IllegalArgumentException(j4.a.n(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i11], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i11));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < stringArrayExtra.length; i13++) {
                if (!hashSet.contains(Integer.valueOf(i13))) {
                    strArr[i12] = stringArrayExtra[i13];
                    i12++;
                }
            }
        }
        jVar.requestPermissions(stringArrayExtra, i);
    }

    public final e.g c(final String str, androidx.lifecycle.s sVar, final p4.v vVar, final e.b bVar) {
        de.i.e(str, "key");
        androidx.lifecycle.u uVarF = sVar.f();
        if (uVarF.f1238c.compareTo(androidx.lifecycle.n.f1220y) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + sVar + " is attempting to register while current state is " + uVarF.f1238c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.f1647c;
        e.f fVar = (e.f) linkedHashMap.get(str);
        if (fVar == null) {
            fVar = new e.f(uVarF);
        }
        androidx.lifecycle.q qVar = new androidx.lifecycle.q() { // from class: e.d
            @Override // androidx.lifecycle.q
            public final void a(s sVar2, m mVar) {
                i iVar = this.f4527v;
                LinkedHashMap linkedHashMap2 = iVar.f1649e;
                m mVar2 = m.ON_START;
                String str2 = str;
                if (mVar2 != mVar) {
                    if (m.ON_STOP == mVar) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (m.ON_DESTROY == mVar) {
                            iVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = iVar.f1650g;
                LinkedHashMap linkedHashMap3 = iVar.f;
                b bVar2 = bVar;
                v vVar2 = vVar;
                linkedHashMap2.put(str2, new e(bVar2, vVar2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    bVar2.i(obj);
                }
                a aVar = (a) t1.f(str2, bundle);
                if (aVar != null) {
                    bundle.remove(str2);
                    bVar2.i(vVar2.L(aVar.f4526w, aVar.f4525v));
                }
            }
        };
        fVar.f4533a.a(qVar);
        fVar.f4534b.add(qVar);
        linkedHashMap.put(str, fVar);
        return new e.g(this, str, vVar, 0);
    }

    public final e.g d(String str, p4.v vVar, e.b bVar) {
        de.i.e(str, "key");
        e(str);
        this.f1649e.put(str, new e.e(bVar, vVar));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            bVar.i(obj);
        }
        Bundle bundle = this.f1650g;
        e.a aVar = (e.a) t1.f(str, bundle);
        if (aVar != null) {
            bundle.remove(str);
            bVar.i(vVar.L(aVar.f4526w, aVar.f4525v));
        }
        return new e.g(this, str, vVar, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f1646b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        j0 j0Var = new j0(3);
        for (Number number : new je.a(new je.d(j0Var, new ac.t(2, j0Var), 0))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f1645a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        de.i.e(str, "key");
        if (!this.f1648d.contains(str) && (num = (Integer) this.f1646b.remove(str)) != null) {
            this.f1645a.remove(num);
        }
        this.f1649e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f1650g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((e.a) t1.f(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f1647c;
        e.f fVar = (e.f) linkedHashMap2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.f4534b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                fVar.f4533a.f((androidx.lifecycle.q) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
