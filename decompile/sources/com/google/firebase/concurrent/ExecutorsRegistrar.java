package com.google.firebase.concurrent;

import a8.c;
import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import ic.j;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import pb.a;
import pb.d;
import qb.b;
import qb.l;
import qb.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final l f2832a = new l(new j(4));

    /* renamed from: b, reason: collision with root package name */
    public static final l f2833b = new l(new j(5));

    /* renamed from: c, reason: collision with root package name */
    public static final l f2834c = new l(new j(6));

    /* renamed from: d, reason: collision with root package name */
    public static final l f2835d = new l(new j(7));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        p pVar = new p(a.class, ScheduledExecutorService.class);
        p[] pVarArr = {new p(a.class, ExecutorService.class), new p(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            c.d(pVar2, "Null interface");
        }
        Collections.addAll(hashSet, pVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new o5.p(16), hashSet3);
        p pVar3 = new p(pb.b.class, ScheduledExecutorService.class);
        p[] pVarArr2 = {new p(pb.b.class, ExecutorService.class), new p(pb.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(pVar3);
        for (p pVar4 : pVarArr2) {
            c.d(pVar4, "Null interface");
        }
        Collections.addAll(hashSet4, pVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new o5.p(17), hashSet6);
        p pVar5 = new p(pb.c.class, ScheduledExecutorService.class);
        p[] pVarArr3 = {new p(pb.c.class, ExecutorService.class), new p(pb.c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(pVar5);
        for (p pVar6 : pVarArr3) {
            c.d(pVar6, "Null interface");
        }
        Collections.addAll(hashSet7, pVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new o5.p(18), hashSet9);
        qb.a b10 = b.b(new p(d.class, Executor.class));
        b10.f11152g = new o5.p(19);
        return Arrays.asList(bVar, bVar2, bVar3, b10.b());
    }
}
