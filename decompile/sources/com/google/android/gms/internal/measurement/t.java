package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2425a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2426b;

    public /* synthetic */ t(Object obj, Object obj2) {
        this.f2425a = obj;
        this.f2426b = obj2;
    }

    public Object a() {
        Uri uri;
        ContentProviderClient acquireUnstableContentProviderClient;
        String str;
        j4 j4Var = (j4) this.f2425a;
        String str2 = (String) this.f2426b;
        Context context = (Context) j4Var.f2311z;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        p.q3 q3Var = y3.f2525a;
        if (contentResolver != null) {
            synchronized (q3Var) {
                try {
                    if (((HashMap) q3Var.f10363y) == null) {
                        ((AtomicBoolean) q3Var.f10362x).set(false);
                        q3Var.f10363y = new HashMap(16, 1.0f);
                        q3Var.D = new Object();
                        contentResolver.registerContentObserver(z3.f2543a, true, new b4(q3Var));
                    } else if (((AtomicBoolean) q3Var.f10362x).getAndSet(false)) {
                        ((HashMap) q3Var.f10363y).clear();
                        ((HashMap) q3Var.f10364z).clear();
                        ((HashMap) q3Var.A).clear();
                        ((HashMap) q3Var.B).clear();
                        ((HashMap) q3Var.C).clear();
                        q3Var.D = new Object();
                    }
                    Object obj = q3Var.D;
                    String str3 = null;
                    if (((HashMap) q3Var.f10363y).containsKey(str2)) {
                        String str4 = (String) ((HashMap) q3Var.f10363y).get(str2);
                        if (str4 != null) {
                            str3 = str4;
                        }
                        return str3;
                    }
                    try {
                        uri = z3.f2543a;
                        acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                        try {
                        } finally {
                            acquireUnstableContentProviderClient.release();
                        }
                    } catch (c4 unused) {
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str2}, null);
                            try {
                                if (query != null) {
                                    if (query.moveToFirst()) {
                                        str = query.getString(1);
                                        query.close();
                                    } else {
                                        query.close();
                                        str = null;
                                    }
                                    if (str != null && str.equals(null)) {
                                        str = null;
                                    }
                                    synchronized (q3Var) {
                                        try {
                                            if (obj == q3Var.D) {
                                                ((HashMap) q3Var.f10363y).put(str2, str);
                                            }
                                        } finally {
                                        }
                                    }
                                    if (str == null) {
                                        return null;
                                    }
                                    return str;
                                }
                                throw new Exception("ContentProvider query returned null cursor");
                            } finally {
                            }
                        } catch (RemoteException e10) {
                            throw new Exception("ContentProvider query failed", e10);
                        }
                    } else {
                        throw new Exception("Unable to acquire ContentProviderClient");
                    }
                } finally {
                }
            }
        } else {
            q3Var.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
    }

    public void b(s sVar) {
        ArrayList arrayList = sVar.f2412a;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((HashMap) this.f2425a).put(Integer.valueOf(((w) obj).f2506x).toString(), sVar);
        }
    }

    public n c(ic.s sVar, n nVar) {
        s sVar2;
        a8.a.G(sVar);
        if (nVar instanceof o) {
            o oVar = (o) nVar;
            ArrayList arrayList = oVar.f2369y;
            String str = oVar.f2368x;
            HashMap hashMap = (HashMap) this.f2425a;
            if (hashMap.containsKey(str)) {
                sVar2 = (s) hashMap.get(str);
            } else {
                sVar2 = (s) this.f2426b;
            }
            return sVar2.a(str, sVar, arrayList);
        }
        return nVar;
    }

    public void d(ic.s sVar, androidx.lifecycle.j1 j1Var) {
        int i6;
        a5 a5Var = new a5(j1Var);
        TreeMap treeMap = (TreeMap) this.f2425a;
        for (Integer num : treeMap.keySet()) {
            b clone = ((b) j1Var.f950z).clone();
            n i10 = ((m) treeMap.get(num)).i(sVar, Collections.singletonList(a5Var));
            if (i10 instanceof g) {
                i6 = a8.a.C(((g) i10).f2213x.doubleValue());
            } else {
                i6 = -1;
            }
            if (i6 == 2 || i6 == -1) {
                j1Var.f950z = clone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f2426b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            n i11 = ((m) treeMap2.get((Integer) it.next())).i(sVar, Collections.singletonList(a5Var));
            if (i11 instanceof g) {
                a8.a.C(((g) i11).f2213x.doubleValue());
            }
        }
    }

    public t(int i6) {
        switch (i6) {
            case 3:
                this.f2425a = new TreeMap();
                this.f2426b = new TreeMap();
                return;
            default:
                this.f2425a = new HashMap();
                this.f2426b = new s(6);
                s sVar = new s(0);
                w wVar = w.BITWISE_AND;
                ArrayList arrayList = sVar.f2412a;
                arrayList.add(wVar);
                arrayList.add(w.BITWISE_LEFT_SHIFT);
                arrayList.add(w.BITWISE_NOT);
                arrayList.add(w.BITWISE_OR);
                arrayList.add(w.BITWISE_RIGHT_SHIFT);
                arrayList.add(w.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(w.BITWISE_XOR);
                b(sVar);
                s sVar2 = new s(1);
                w wVar2 = w.EQUALS;
                ArrayList arrayList2 = sVar2.f2412a;
                arrayList2.add(wVar2);
                arrayList2.add(w.GREATER_THAN);
                arrayList2.add(w.GREATER_THAN_EQUALS);
                arrayList2.add(w.IDENTITY_EQUALS);
                arrayList2.add(w.IDENTITY_NOT_EQUALS);
                arrayList2.add(w.LESS_THAN);
                arrayList2.add(w.LESS_THAN_EQUALS);
                arrayList2.add(w.NOT_EQUALS);
                b(sVar2);
                s sVar3 = new s(2);
                w wVar3 = w.APPLY;
                ArrayList arrayList3 = sVar3.f2412a;
                arrayList3.add(wVar3);
                arrayList3.add(w.BLOCK);
                arrayList3.add(w.BREAK);
                arrayList3.add(w.CASE);
                arrayList3.add(w.DEFAULT);
                arrayList3.add(w.CONTINUE);
                arrayList3.add(w.DEFINE_FUNCTION);
                arrayList3.add(w.FN);
                arrayList3.add(w.IF);
                arrayList3.add(w.QUOTE);
                arrayList3.add(w.RETURN);
                arrayList3.add(w.SWITCH);
                arrayList3.add(w.TERNARY);
                b(sVar3);
                s sVar4 = new s(3);
                w wVar4 = w.AND;
                ArrayList arrayList4 = sVar4.f2412a;
                arrayList4.add(wVar4);
                arrayList4.add(w.NOT);
                arrayList4.add(w.OR);
                b(sVar4);
                s sVar5 = new s(4);
                w wVar5 = w.FOR_IN;
                ArrayList arrayList5 = sVar5.f2412a;
                arrayList5.add(wVar5);
                arrayList5.add(w.FOR_IN_CONST);
                arrayList5.add(w.FOR_IN_LET);
                arrayList5.add(w.FOR_LET);
                arrayList5.add(w.FOR_OF);
                arrayList5.add(w.FOR_OF_CONST);
                arrayList5.add(w.FOR_OF_LET);
                arrayList5.add(w.WHILE);
                b(sVar5);
                s sVar6 = new s(5);
                w wVar6 = w.ADD;
                ArrayList arrayList6 = sVar6.f2412a;
                arrayList6.add(wVar6);
                arrayList6.add(w.DIVIDE);
                arrayList6.add(w.MODULUS);
                arrayList6.add(w.MULTIPLY);
                arrayList6.add(w.NEGATE);
                arrayList6.add(w.POST_DECREMENT);
                arrayList6.add(w.POST_INCREMENT);
                arrayList6.add(w.PRE_DECREMENT);
                arrayList6.add(w.PRE_INCREMENT);
                arrayList6.add(w.SUBTRACT);
                b(sVar6);
                s sVar7 = new s(7);
                w wVar7 = w.ASSIGN;
                ArrayList arrayList7 = sVar7.f2412a;
                arrayList7.add(wVar7);
                arrayList7.add(w.CONST);
                arrayList7.add(w.CREATE_ARRAY);
                arrayList7.add(w.CREATE_OBJECT);
                arrayList7.add(w.EXPRESSION_LIST);
                arrayList7.add(w.GET);
                arrayList7.add(w.GET_INDEX);
                arrayList7.add(w.GET_PROPERTY);
                arrayList7.add(w.NULL);
                arrayList7.add(w.SET_PROPERTY);
                arrayList7.add(w.TYPEOF);
                arrayList7.add(w.UNDEFINED);
                arrayList7.add(w.VAR);
                b(sVar7);
                return;
        }
    }
}
