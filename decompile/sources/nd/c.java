package nd;

import com.playfy.tv.activities.MainActivity;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements he.c {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9680x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i6, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i6, obj, cls, str, str2, i10);
        this.f9680x = i11;
    }

    public final void a(Object obj, Integer num, List list, Boolean bool, Integer num2) {
        switch (this.f9680x) {
            case 0:
                String p02 = (String) obj;
                int intValue = num.intValue();
                boolean booleanValue = bool.booleanValue();
                int intValue2 = num2.intValue();
                kotlin.jvm.internal.k.e(p02, "p0");
                MainActivity.W((MainActivity) this.receiver, p02, intValue, list, booleanValue, intValue2);
                return;
            case 1:
                String p03 = (String) obj;
                int intValue3 = num.intValue();
                boolean booleanValue2 = bool.booleanValue();
                int intValue4 = num2.intValue();
                kotlin.jvm.internal.k.e(p03, "p0");
                MainActivity.W((MainActivity) this.receiver, p03, intValue3, list, booleanValue2, intValue4);
                return;
            default:
                String p04 = (String) obj;
                int intValue5 = num.intValue();
                boolean booleanValue3 = bool.booleanValue();
                int intValue6 = num2.intValue();
                kotlin.jvm.internal.k.e(p04, "p0");
                MainActivity.W((MainActivity) this.receiver, p04, intValue5, list, booleanValue3, intValue6);
                return;
        }
    }
}
