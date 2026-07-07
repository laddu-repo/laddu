package com.unity3d.ads.core.data.repository;

import cf.f;
import cf.i;
import gf.c0;
import he.a;
import he.y;
import java.io.File;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ne.j;
import se.g;
import ve.l;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidCacheRepository$getCacheSize$2 extends j implements p {
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.j implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, File.class, "isFile", "isFile()Z", 0);
        }

        @Override // ve.l
        public final Boolean invoke(File p02) {
            k.e(p02, "p0");
            return Boolean.valueOf(p02.isFile());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$getCacheSize$2(AndroidCacheRepository androidCacheRepository, c cVar) {
        super(2, cVar);
        this.this$0 = androidCacheRepository;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidCacheRepository$getCacheSize$2(this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidCacheRepository$getCacheSize$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        File file;
        if (this.label == 0) {
            a.f(obj);
            file = this.this$0.cacheDir;
            k.e(file, "<this>");
            f fVar = new f(cf.l.L(new i(file, g.f12304x), AnonymousClass1.INSTANCE));
            long j = 0;
            while (fVar.hasNext()) {
                j += ((File) fVar.next()).length();
            }
            return new Long(j);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
