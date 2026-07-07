package nd;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import com.playfy.tv.ui.fragments.SettingsFragment;
import gf.o0;
import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 extends ne.j implements ve.p {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9684x;

    /* renamed from: y, reason: collision with root package name */
    public int f9685y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f9686z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(SettingsFragment settingsFragment, le.c cVar, int i6) {
        super(2, cVar);
        this.f9684x = i6;
        this.f9686z = settingsFragment;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f9684x) {
            case 0:
                return new d0(this.f9686z, cVar, 0);
            default:
                return new d0(this.f9686z, cVar, 1);
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        gf.c0 c0Var = (gf.c0) obj;
        le.c cVar = (le.c) obj2;
        switch (this.f9684x) {
            case 0:
                return ((d0) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            default:
                return ((d0) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.jvm.internal.w] */
    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.f9684x;
        me.a aVar = me.a.f8833x;
        he.y yVar = he.y.f6101a;
        int i10 = 1;
        switch (i6) {
            case 0:
                int i11 = this.f9685y;
                le.c cVar = null;
                SettingsFragment settingsFragment = this.f9686z;
                if (i11 != 0) {
                    if (i11 == 1) {
                        he.a.f(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    he.a.f(obj);
                    of.e eVar = o0.f5693a;
                    n6.d dVar = new n6.d(settingsFragment, cVar, i10);
                    this.f9685y = 1;
                    obj = gf.f0.J(eVar, dVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                List list = (List) obj;
                gd.c cVar2 = settingsFragment.A0;
                if (cVar2 != null) {
                    cVar2.i(list);
                    return yVar;
                }
                kotlin.jvm.internal.k.k("adapter");
                throw null;
            default:
                int i12 = this.f9685y;
                try {
                    if (i12 != 0) {
                        if (i12 == 1) {
                            he.a.f(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        he.a.f(obj);
                        SettingsFragment settingsFragment2 = this.f9686z;
                        ApplicationInfo applicationInfo = settingsFragment2.F().getApplicationInfo();
                        kotlin.jvm.internal.k.d(applicationInfo, "getApplicationInfo(...)");
                        String str = applicationInfo.sourceDir;
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("*/*");
                        File file = new File(str);
                        ?? obj2 = new Object();
                        File file2 = new File(settingsFragment2.F().getCacheDir() + "/ExtractedApk");
                        obj2.f8055x = file2;
                        if (file2.isDirectory() || ((File) obj2.f8055x).mkdirs()) {
                            File file3 = new File(((File) obj2.f8055x).getPath() + "/" + cf.m.p(settingsFragment2.F()));
                            obj2.f8055x = file3;
                            if (file3.exists() || ((File) obj2.f8055x).createNewFile()) {
                                se.h.p(file, (File) obj2.f8055x);
                                of.e eVar2 = o0.f5693a;
                                hf.d dVar2 = mf.o.f8875a;
                                e0 e0Var = new e0(intent, settingsFragment2, applicationInfo, obj2, null);
                                this.f9685y = 1;
                                if (gf.f0.J(dVar2, e0Var, this) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return yVar;
        }
    }
}
