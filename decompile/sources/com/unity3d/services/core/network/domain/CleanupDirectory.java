package com.unity3d.services.core.network.domain;

import a8.c;
import cf.f;
import cf.g;
import cf.i;
import cf.l;
import ie.j;
import ie.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CleanupDirectory {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, le.c, cf.k] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    public final void invoke(File directory, int i6, long j) {
        ?? r13;
        k.e(directory, "directory");
        if (directory.exists() && directory.isDirectory()) {
            g L = l.L(new i(directory, se.g.f12304x), CleanupDirectory$invoke$cachedFiles$1.INSTANCE);
            f fVar = new f(L);
            long j10 = 0;
            long j11 = 0;
            while (fVar.hasNext()) {
                j11 += ((File) fVar.next()).length();
            }
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            f fVar2 = new f(L);
            while (fVar2.hasNext()) {
                Object next = fVar2.next();
                if (((File) next).lastModified() + j < currentTimeMillis) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                j10 += ((File) obj).length();
            }
            long j12 = j11 - j10;
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                ((File) obj2).delete();
            }
            long j13 = i6 * 1048576;
            if (j12 > j13) {
                i iVar = new i(1, j.C(arrayList2), new Comparator() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return a8.g.d(Long.valueOf(((File) t10).lastModified()), Long.valueOf(((File) t11).lastModified()));
                    }
                });
                he.i iVar2 = new he.i(Long.valueOf(j12), r.f6846x);
                CleanupDirectory$invoke$additionalFiles$2 operation = CleanupDirectory$invoke$additionalFiles$2.INSTANCE;
                k.e(operation, "operation");
                he.i iVar3 = null;
                cf.r rVar = new cf.r(iVar2, iVar, operation, null);
                ?? obj3 = new Object();
                obj3.A = c.e(obj3, obj3, rVar);
                while (true) {
                    if (!obj3.hasNext()) {
                        break;
                    }
                    ?? next2 = obj3.next();
                    if (((Number) ((he.i) next2).f6076x).longValue() <= j13) {
                        iVar3 = next2;
                        break;
                    }
                }
                he.i iVar4 = iVar3;
                if (iVar4 != null && (r13 = (List) iVar4.f6077y) != 0) {
                    arrayList2 = r13;
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Directory does not exist or is not a directory: " + directory).toString());
    }
}
