package aa;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import j2.z;
import java.util.Comparator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Comparator {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f646x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f647y;

    public /* synthetic */ e(Object obj, int i6) {
        this.f646x = i6;
        this.f647y = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f646x) {
            case 0:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f647y;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.L).compareTo(Boolean.valueOf(materialButton2.L));
                if (compareTo == 0) {
                    int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                    if (compareTo2 == 0) {
                        return Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
                    }
                    return compareTo2;
                }
                return compareTo;
            default:
                z zVar = (z) this.f647y;
                return zVar.a(obj2) - zVar.a(obj);
        }
    }
}
