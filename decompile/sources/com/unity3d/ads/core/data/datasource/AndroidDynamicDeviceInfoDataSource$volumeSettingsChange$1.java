package com.unity3d.ads.core.data.datasource;

import a8.b;
import android.database.ContentObserver;
import android.provider.Settings;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import he.y;
import jf.v;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import le.c;
import ne.e;
import ne.j;
import ve.a;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1", f = "AndroidDynamicDeviceInfoDataSource.kt", l = {610}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 extends j implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements a {
        final /* synthetic */ AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 $contentObserver;
        final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1) {
            super(0);
            this.this$0 = androidDynamicDeviceInfoDataSource;
            this.$contentObserver = androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1;
        }

        @Override // ve.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m31invoke();
            return y.f6101a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m31invoke() {
            this.this$0.getContext().getContentResolver().unregisterContentObserver(this.$contentObserver);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, c cVar) {
        super(2, cVar);
        this.this$0 = androidDynamicDeviceInfoDataSource;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this.this$0, cVar);
        androidDynamicDeviceInfoDataSource$volumeSettingsChange$1.L$0 = obj;
        return androidDynamicDeviceInfoDataSource$volumeSettingsChange$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1, android.database.ContentObserver] */
    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        double streamVolume;
        boolean z10;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            final v vVar = (v) this.L$0;
            final ?? obj2 = new Object();
            streamVolume = this.this$0.getStreamVolume(3);
            obj2.f8052x = streamVolume;
            a8.a.v(vVar, new VolumeSettingsChange.VolumeChange(streamVolume));
            final ?? obj3 = new Object();
            int ringerMode = this.this$0.getRingerMode();
            obj3.f8053x = ringerMode;
            if (ringerMode == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            a8.a.v(vVar, new VolumeSettingsChange.MuteChange(z10));
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource = this.this$0;
            ?? r32 = new ContentObserver() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(null);
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean z11) {
                    double streamVolume2;
                    boolean z12;
                    super.onChange(z11);
                    streamVolume2 = AndroidDynamicDeviceInfoDataSource.this.getStreamVolume(3);
                    t tVar = obj2;
                    if (streamVolume2 != tVar.f8052x) {
                        tVar.f8052x = streamVolume2;
                        a8.a.v(vVar, new VolumeSettingsChange.VolumeChange(streamVolume2));
                    }
                    int ringerMode2 = AndroidDynamicDeviceInfoDataSource.this.getRingerMode();
                    u uVar = obj3;
                    if (ringerMode2 != uVar.f8053x) {
                        uVar.f8053x = ringerMode2;
                        v vVar2 = vVar;
                        if (ringerMode2 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        a8.a.v(vVar2, new VolumeSettingsChange.MuteChange(z12));
                    }
                }
            };
            this.this$0.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, r32);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, r32);
            this.label = 1;
            Object b10 = b.b(vVar, anonymousClass1, this);
            me.a aVar = me.a.f8833x;
            if (b10 == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }

    @Override // ve.p
    public final Object invoke(v vVar, c cVar) {
        return ((AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1) create(vVar, cVar)).invokeSuspend(y.f6101a);
    }
}
