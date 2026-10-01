package f;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f4597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4598c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g.a f4599d;

    public /* synthetic */ g(h hVar, String str, g.a aVar, int i6) {
        this.f4596a = i6;
        this.f4597b = hVar;
        this.f4598c = str;
        this.f4599d = aVar;
    }

    @Override // f.c
    public final void a(Object obj) {
        switch (this.f4596a) {
            case 0:
                h hVar = this.f4597b;
                ArrayList arrayList = hVar.f4603d;
                LinkedHashMap linkedHashMap = hVar.f4601b;
                String str = this.f4598c;
                Object obj2 = linkedHashMap.get(str);
                g.a aVar = this.f4599d;
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    arrayList.add(str);
                    try {
                        hVar.b(intValue, aVar, obj);
                        return;
                    } catch (Exception e10) {
                        arrayList.remove(str);
                        throw e10;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            default:
                h hVar2 = this.f4597b;
                ArrayList arrayList2 = hVar2.f4603d;
                LinkedHashMap linkedHashMap2 = hVar2.f4601b;
                String str2 = this.f4598c;
                Object obj3 = linkedHashMap2.get(str2);
                g.a aVar2 = this.f4599d;
                if (obj3 != null) {
                    int intValue2 = ((Number) obj3).intValue();
                    arrayList2.add(str2);
                    try {
                        hVar2.b(intValue2, aVar2, obj);
                        return;
                    } catch (Exception e11) {
                        arrayList2.remove(str2);
                        throw e11;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
    }

    public void b() {
        this.f4597b.f(this.f4598c);
    }
}
