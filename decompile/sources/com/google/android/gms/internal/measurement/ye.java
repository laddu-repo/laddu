package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3260c;

    public ye(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.f3258a = new HashMap();
        this.f3259b = new HashMap();
        this.f3260c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            of ofVar = (of) it.next();
            if (TextUtils.isEmpty(ofVar.e())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                of ofVar2 = (of) this.f3258a.put(ofVar.e(), ofVar);
                if (ofVar2 != null) {
                    String canonicalName = ofVar2.getClass().getCanonicalName();
                    String canonicalName2 = ofVar.getClass().getCanonicalName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length());
                    sb2.append("Cannot override Backend ");
                    sb2.append(canonicalName);
                    sb2.append(" with ");
                    sb2.append(canonicalName2);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw d0.d.g(it2);
        }
        this.f3260c.addAll(list);
    }

    public final Object a(Uri uri, xe xeVar) {
        return xeVar.a(b(uri));
    }

    public final we b(Uri uri) {
        List listL;
        y9.b0 b0VarJ = y9.f0.j();
        y9.b0 b0VarJ2 = y9.f0.j();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            listL = y9.z0.f14637z;
        } else {
            String strSubstring = encodedFragment.substring(10);
            p9.d dVarB = p9.d.b("+".charAt(0));
            p9.d dVar = new p9.d((pa.a) dVarB.f10441e, true, (x9.b) dVarB.f10440d, Integer.MAX_VALUE);
            strSubstring.getClass();
            listL = y9.f0.l(new md.b(dVar, strSubstring));
        }
        int size = listL.size();
        for (int i = 0; i < size; i++) {
            String str = (String) listL.get(i);
            Matcher matcher = lf.f2867a.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
            b0VarJ2.a(matcher.group(1));
        }
        y9.z0 z0VarG = b0VarJ2.g();
        if (z0VarG.f14639y > 0) {
            String str2 = (String) z0VarG.get(0);
            if (this.f3259b.get(str2) != null) {
                throw new ClassCastException();
            }
            String strValueOf = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(str2.length() + 40 + strValueOf.length());
            sb2.append("Requested transform isn't registered: ");
            sb2.append(str2);
            sb2.append(": ");
            sb2.append(strValueOf);
            throw new a6.c(sb2.toString());
        }
        y9.f0 f0VarT = b0VarJ.g().t();
        we weVar = new we();
        String scheme = uri.getScheme();
        of ofVar = (of) this.f3258a.get(scheme);
        if (ofVar == null) {
            throw new a6.c(d0.d.k("Requested backend isn't registered: ", scheme));
        }
        weVar.f3201a = ofVar;
        weVar.f3203c = this.f3260c;
        weVar.f3202b = f0VarT;
        if (!f0VarT.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = f0VarT.listIterator(f0VarT.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous() != null) {
                        throw new ClassCastException();
                    }
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        weVar.f3204d = uri;
        we weVar2 = new we();
        weVar2.f3201a = weVar.f3201a;
        weVar2.f3202b = weVar.f3202b;
        weVar2.f3203c = weVar.f3203c;
        weVar2.f3204d = weVar.f3204d;
        return weVar2;
    }
}
