package b4;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import androidx.lifecycle.j1;
import cf.p;
import cf.t;
import com.google.android.gms.internal.measurement.k4;
import com.unity3d.services.UnityAdsConstants;
import e1.m;
import h0.c0;
import he.i;
import ie.w;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kf.f1;
import kf.r0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import l4.s;
import l4.u;
import l4.v;
import n9.j;
import okhttp3.HttpUrl;
import s8.l;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements v3.d, i8.b {
    public final Object A;
    public Object B;

    /* renamed from: x, reason: collision with root package name */
    public final Object f1469x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f1470y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f1471z;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f1471z = obj;
        this.A = obj2;
        this.B = obj3;
        this.f1469x = obj4;
        this.f1470y = obj5;
    }

    public static h g(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        h hVar = new h(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) hVar.f1469x)) {
            try {
                ((ArrayDeque) hVar.f1469x).clear();
                String string = ((SharedPreferences) hVar.f1471z).getString((String) hVar.A, HttpUrl.FRAGMENT_ENCODE_SET);
                if (!TextUtils.isEmpty(string) && string.contains((String) hVar.B)) {
                    String[] split = string.split((String) hVar.B, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) hVar.f1469x).add(str);
                        }
                    }
                    return hVar;
                }
                return hVar;
            } finally {
            }
        }
    }

    public void a(p6.f fVar, Class cls) {
        ((ArrayList) this.f1469x).add(new i(fVar, cls));
    }

    public void b(s6.a aVar, Class cls) {
        ((ArrayList) this.A).add(new i(aVar, cls));
    }

    @Override // v3.d
    public int c(long j) {
        long[] jArr = (long[]) this.A;
        int a10 = a0.a(jArr, j, false);
        if (a10 < jArr.length) {
            return a10;
        }
        return -1;
    }

    public boolean d(String str) {
        boolean add;
        if (!TextUtils.isEmpty(str) && !str.contains((String) this.B)) {
            synchronized (((ArrayDeque) this.f1469x)) {
                add = ((ArrayDeque) this.f1469x).add(str);
                if (add) {
                    ((ScheduledThreadPoolExecutor) this.f1470y).execute(new a2.a(this, 26));
                }
            }
            return add;
        }
        return false;
    }

    @Override // v3.d
    public long e(int i6) {
        return ((long[]) this.A)[i6];
    }

    public void f() {
        ArrayList arrayList;
        ua.f fVar = (ua.f) this.f1471z;
        fVar.r("Create eager instances ...");
        long b10 = ef.i.b();
        j jVar = (j) this.f1469x;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) jVar.A;
        int i6 = 0;
        lg.d[] dVarArr = (lg.d[]) concurrentHashMap.values().toArray(new lg.d[0]);
        Object[] elements = Arrays.copyOf(dVarArr, dVarArr.length);
        k.e(elements, "elements");
        if (elements.length == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(new ie.g(elements, true));
        }
        concurrentHashMap.clear();
        h hVar = (h) jVar.f9355y;
        h hVar2 = new h((ua.f) hVar.f1471z, ((rg.b) hVar.B).f11958d, x.a(lg.c.class), (pg.a) null);
        int size = arrayList.size();
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((lg.d) obj).b(hVar2);
        }
        long a10 = ef.k.a(b10);
        StringBuilder sb2 = new StringBuilder("Created eager instances in ");
        int i10 = ef.a.A;
        sb2.append(ef.a.h(a10, ef.c.MICROSECONDS) / 1000.0d);
        sb2.append(" ms");
        fVar.r(sb2.toString());
    }

    @Override // ge.a
    public Object get() {
        return new l8.a((Executor) ((ge.a) this.f1471z).get(), (h8.e) ((ge.a) this.A).get(), (j1) ((j1) this.B).get(), (n8.d) ((ge.a) this.f1469x).get(), (o8.c) ((ge.a) this.f1470y).get());
    }

    public c0 h() {
        ArrayList arrayList = (ArrayList) this.f1470y;
        Intent intent = (Intent) this.B;
        v vVar = (v) this.f1469x;
        if (vVar != null) {
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                int size = arrayList.size();
                u uVar = null;
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    s sVar = (s) obj;
                    int i10 = sVar.f8189a;
                    Bundle bundle = sVar.f8190b;
                    u i11 = i(i10);
                    if (i11 != null) {
                        for (int i12 : i11.b(uVar)) {
                            arrayList2.add(Integer.valueOf(i12));
                            arrayList3.add(bundle);
                        }
                        uVar = i11;
                    } else {
                        int i13 = u.C;
                        throw new IllegalArgumentException("Navigation destination " + k4.j((m) this.A, i10) + " cannot be found in the navigation graph " + vVar);
                    }
                }
                intent.putExtra("android-support-nav:controller:deepLinkIds", ie.j.Y(arrayList2));
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                c0 c0Var = new c0((Context) this.f1471z);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(c0Var.f5764y.getPackageManager());
                }
                if (component != null) {
                    c0Var.a(component);
                }
                ArrayList arrayList4 = c0Var.f5763x;
                arrayList4.add(intent2);
                int size2 = arrayList4.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    Intent intent3 = (Intent) arrayList4.get(i14);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                }
                return c0Var;
            }
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        throw new IllegalStateException("You must call setGraph() before constructing the deep link");
    }

    public u i(int i6) {
        ie.h hVar = new ie.h();
        v vVar = (v) this.f1469x;
        k.b(vVar);
        hVar.addLast(vVar);
        while (!hVar.isEmpty()) {
            u uVar = (u) hVar.removeFirst();
            if (uVar.f8195y.f9924a == i6) {
                return uVar;
            }
            if (uVar instanceof v) {
                Iterator it = ((v) uVar).iterator();
                while (true) {
                    o4.k kVar = (o4.k) it;
                    if (kVar.hasNext()) {
                        hVar.addLast((u) kVar.next());
                    }
                }
            }
        }
        return null;
    }

    public void j(List list, boolean z10) {
        Object obj;
        LinkedHashSet<ng.a> linkedHashSet = new LinkedHashSet();
        ie.h hVar = new ie.h(new df.i(list));
        while (!hVar.isEmpty()) {
            ng.a aVar = (ng.a) hVar.removeLast();
            if (linkedHashSet.add(aVar)) {
                ArrayList arrayList = aVar.f9740e;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    ng.a aVar2 = (ng.a) obj2;
                    if (!linkedHashSet.contains(aVar2)) {
                        hVar.addLast(aVar2);
                    }
                }
            }
        }
        j jVar = (j) this.f1469x;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) jVar.A;
        for (ng.a aVar3 : linkedHashSet) {
            for (Map.Entry entry : aVar3.f9738c.entrySet()) {
                String mapping = (String) entry.getKey();
                lg.b factory = (lg.b) entry.getValue();
                ua.f fVar = (ua.f) ((h) jVar.f9355y).f1471z;
                k.e(mapping, "mapping");
                k.e(factory, "factory");
                jg.a aVar4 = factory.f8401a;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) jVar.f9356z;
                if (((lg.b) concurrentHashMap2.get(mapping)) != null) {
                    if (z10) {
                        String msg = "(+) override index '" + mapping + "' -> '" + aVar4 + '\'';
                        fVar.getClass();
                        k.e(msg, "msg");
                        fVar.t(mg.a.f8889z, msg);
                        Iterator it = concurrentHashMap.values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((lg.d) obj).f8401a.equals(aVar4)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        if (((lg.d) obj) != null) {
                            concurrentHashMap.remove(Integer.valueOf(aVar4.hashCode()));
                        }
                    } else {
                        String msg2 = "Already existing definition for " + aVar4 + " at " + mapping;
                        k.e(msg2, "msg");
                        throw new Exception(msg2);
                    }
                }
                fVar.r("(+) index '" + mapping + "' -> '" + aVar4 + '\'');
                concurrentHashMap2.put(mapping, factory);
            }
            for (lg.d dVar : aVar3.f9737b) {
                concurrentHashMap.put(Integer.valueOf(dVar.f8401a.hashCode()), dVar);
            }
        }
        rg.b bVar = (rg.b) this.B;
        bVar.getClass();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            bVar.f11956b.addAll(((ng.a) it2.next()).f9739d);
        }
    }

    public String k() {
        String str;
        synchronized (((ArrayDeque) this.f1469x)) {
            str = (String) ((ArrayDeque) this.f1469x).peek();
        }
        return str;
    }

    public boolean l(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.f1469x)) {
            remove = ((ArrayDeque) this.f1469x).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.f1470y).execute(new a2.a(this, 26));
            }
        }
        return remove;
    }

    public void m(Object obj, String key) {
        k.e(key, "key");
        ((LinkedHashMap) this.f1471z).put(key, obj);
        r0 r0Var = (r0) ((LinkedHashMap) this.B).get(key);
        if (r0Var != null) {
            ((f1) r0Var).g(obj);
        }
        r0 r0Var2 = (r0) ((LinkedHashMap) this.f1469x).get(key);
        if (r0Var2 != null) {
            ((f1) r0Var2).g(obj);
        }
    }

    public void n() {
        ArrayList arrayList = (ArrayList) this.f1470y;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            int i10 = ((s) obj).f8189a;
            if (i(i10) == null) {
                int i11 = u.C;
                StringBuilder q9 = r4.a.q("Navigation destination ", k4.j((m) this.A, i10), " cannot be found in the navigation graph ");
                q9.append((v) this.f1469x);
                throw new IllegalArgumentException(q9.toString());
            }
        }
    }

    @Override // v3.d
    public List p(long j) {
        c cVar = (c) this.f1471z;
        Map map = (Map) this.B;
        HashMap hashMap = (HashMap) this.f1469x;
        HashMap hashMap2 = (HashMap) this.f1470y;
        ArrayList arrayList = new ArrayList();
        cVar.g(j, cVar.f1430h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j, false, cVar.f1430h, treeMap);
        cVar.h(j, map, hashMap, cVar.f1430h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                f fVar = (f) hashMap.get(pair.first);
                fVar.getClass();
                arrayList2.add(new t1.b(null, null, null, decodeByteArray, fVar.f1443c, 0, fVar.f1445e, fVar.f1442b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f1446f, fVar.f1447g, false, -16777216, fVar.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            f fVar2 = (f) hashMap.get(entry.getKey());
            fVar2.getClass();
            t1.a aVar = (t1.a) entry.getValue();
            CharSequence charSequence = aVar.f12434a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar2 : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f3 = fVar2.f1443c;
            int i18 = fVar2.f1444d;
            aVar.f12438e = f3;
            aVar.f12439f = i18;
            aVar.f12440g = fVar2.f1445e;
            aVar.f12441h = fVar2.f1442b;
            aVar.f12444l = fVar2.f1446f;
            float f10 = fVar2.f1449i;
            int i19 = fVar2.f1448h;
            aVar.f12443k = f10;
            aVar.j = i19;
            aVar.f12448p = fVar2.j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // v3.d
    public int s() {
        return ((long[]) this.A).length;
    }

    public h(Map initialState) {
        k.e(initialState, "initialState");
        this.f1471z = w.E(initialState);
        this.A = new LinkedHashMap();
        this.B = new LinkedHashMap();
        this.f1469x = new LinkedHashMap();
        this.f1470y = new d.i(this, 3);
    }

    public h(ua.f logger, tg.a scope, kotlin.jvm.internal.e eVar, pg.a aVar) {
        k.e(logger, "logger");
        k.e(scope, "scope");
        this.f1471z = logger;
        this.A = scope;
        this.B = eVar;
        this.f1469x = aVar;
        this.f1470y = "t:'" + ug.a.a(eVar) + "' - q:'null'";
    }

    public h(Drawable.Callback callback) {
        this.f1471z = new e2.u();
        this.f1469x = new HashMap();
        this.f1470y = new HashMap();
        this.B = ".ttf";
        if (!(callback instanceof View)) {
            n7.c.b("LottieDrawable must be inside of a view for images to work.");
            this.A = null;
        } else {
            this.A = ((View) callback).getContext().getAssets();
        }
    }

    public h(c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f1471z = cVar;
        this.f1469x = hashMap2;
        this.f1470y = hashMap3;
        this.B = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i6 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i6] = ((Long) it.next()).longValue();
            i6++;
        }
        this.A = jArr;
    }

    public h() {
        this.f1471z = new ua.f(19);
        this.A = new l(this);
        this.B = new rg.b(this);
        this.f1469x = new j(this);
        new ConcurrentHashMap();
        new HashMap();
        this.f1470y = new rg.a(0);
    }

    public h(l4.x xVar) {
        Intent launchIntentForPackage;
        Context context = xVar.f8198a;
        this.f1471z = context;
        this.A = new m(context, 1);
        cf.f fVar = new cf.f(new cf.g(new t(cf.l.M(new p(16), context), new p(17), 1), false, new p(0)));
        Activity activity = (Activity) (!fVar.hasNext() ? null : fVar.next());
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.B = launchIntentForPackage;
        this.f1470y = new ArrayList();
        this.f1469x = xVar.f8199b.g();
    }

    public h(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f1469x = new ArrayDeque();
        this.f1471z = sharedPreferences;
        this.A = "topic_operation_queue";
        this.B = ",";
        this.f1470y = scheduledThreadPoolExecutor;
    }

    public h(l6.b bVar) {
        this.f1471z = ie.j.a0(bVar.f8221a);
        this.A = ie.j.a0(bVar.f8222b);
        this.B = ie.j.a0(bVar.f8223c);
        this.f1469x = ie.j.a0(bVar.f8224d);
        this.f1470y = ie.j.a0(bVar.f8225e);
    }
}
