package ug;

import bf.d;
import cf.m;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f13140a = new ConcurrentHashMap();

    public static final String a(d dVar) {
        k.e(dVar, "<this>");
        ConcurrentHashMap concurrentHashMap = f13140a;
        String str = (String) concurrentHashMap.get(dVar);
        if (str == null) {
            String name = m.r(dVar).getName();
            concurrentHashMap.put(dVar, name);
            return name;
        }
        return str;
    }
}
