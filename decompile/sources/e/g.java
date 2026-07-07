package e;

import androidx.media3.decoder.DecoderInputBuffer;
import c.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p4.v;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f4536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f4538d;

    public /* synthetic */ g(i iVar, String str, v vVar, int i) {
        this.f4535a = i;
        this.f4536b = iVar;
        this.f4537c = str;
        this.f4538d = vVar;
    }

    @Override // e.c
    public final void a(Object obj) {
        switch (this.f4535a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                i iVar = this.f4536b;
                ArrayList arrayList = iVar.f1648d;
                LinkedHashMap linkedHashMap = iVar.f1646b;
                String str = this.f4537c;
                Object obj2 = linkedHashMap.get(str);
                v vVar = this.f4538d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + vVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    iVar.b(iIntValue, vVar, obj);
                    return;
                } catch (Exception e7) {
                    arrayList.remove(str);
                    throw e7;
                }
            default:
                i iVar2 = this.f4536b;
                ArrayList arrayList2 = iVar2.f1648d;
                LinkedHashMap linkedHashMap2 = iVar2.f1646b;
                String str2 = this.f4537c;
                Object obj3 = linkedHashMap2.get(str2);
                v vVar2 = this.f4538d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + vVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    iVar2.b(iIntValue2, vVar2, obj);
                    return;
                } catch (Exception e10) {
                    arrayList2.remove(str2);
                    throw e10;
                }
        }
    }

    public void b() {
        this.f4536b.f(this.f4537c);
    }
}
