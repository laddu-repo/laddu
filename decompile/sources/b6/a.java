package b6;

import android.os.Build;
import e6.i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1474e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c6.d dVar, int i6) {
        super(dVar);
        this.f1474e = i6;
    }

    @Override // b6.c
    public final boolean a(i iVar) {
        switch (this.f1474e) {
            case 0:
                return iVar.j.f13307b;
            case 1:
                return iVar.j.f13309d;
            case 2:
                if (iVar.j.f13306a == 2) {
                    return true;
                }
                return false;
            case 3:
                int i6 = iVar.j.f13306a;
                if (i6 != 3 && (Build.VERSION.SDK_INT < 30 || i6 != 6)) {
                    return false;
                }
                return true;
            default:
                return iVar.j.f13310e;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // b6.c
    public final boolean b(Object obj) {
        boolean booleanValue;
        switch (this.f1474e) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
            case 2:
                a6.a aVar = (a6.a) obj;
                if (Build.VERSION.SDK_INT >= 26) {
                    if (!aVar.f579a || !aVar.f580b) {
                        return true;
                    }
                    return false;
                }
                return true ^ aVar.f579a;
            case 3:
                a6.a aVar2 = (a6.a) obj;
                if (aVar2.f579a && !aVar2.f581c) {
                    return false;
                }
                return true;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
        }
    }
}
