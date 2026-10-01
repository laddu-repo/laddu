package kotlin.jvm.internal;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final y f8056a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    static {
        ?? r02 = 0;
        try {
            r02 = (y) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r02 == 0) {
            r02 = new Object();
        }
        f8056a = r02;
    }

    public static e a(Class cls) {
        f8056a.getClass();
        return new e(cls);
    }

    public static a0 b(bf.r rVar) {
        e a10 = a(List.class);
        List singletonList = Collections.singletonList(rVar);
        f8056a.getClass();
        return new a0(a10, singletonList);
    }

    public static a0 c(Class cls) {
        e a10 = a(cls);
        List list = Collections.EMPTY_LIST;
        f8056a.getClass();
        return new a0(a10, list);
    }
}
